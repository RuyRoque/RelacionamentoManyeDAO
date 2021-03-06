import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory;
	private EntityManager manager;
	
	//cria a factory quando eu acesso a classe
	static{
		factory = Persistence.createEntityManagerFactory("relacionamentomany");
	}
	
	//cria e retorna um entity manager
	public EntityManager criarEntityManager(){
		if(manager == null){
			manager = factory.createEntityManager();
			return manager;
		}else{
			return manager;
		}		
	}
	
	public void abrirTransacao(){
		manager.getTransaction().begin();
	}
	
	public void commitarTransacao(){
		manager.getTransaction().commit();
	}
	
	public void fecharManager(){
		manager.close();
	}
	
	public void fecharFactory(){
		factory.close();
	}


}
