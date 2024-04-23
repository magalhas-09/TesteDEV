import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("local");
		EntityManager em = emf.createEntityManager();
		
		 List<Endereco> lista = em.createQuery("FROM Endereco", Endereco.class).getResultList();
		 
		 for (Endereco item : lista) { 
			 System.out.println(item); 
		}
		 Pessoa pessoa = new Pessoa(null, null, null, null);
		 Endereco end = new Endereco(0, null, null, null, null, null, pessoa);
		 end.setDescricao("Victor");
		  
		 em.getTransaction().begin(); 
		 em.persist(end); 
		 em.getTransaction().commit();
				 
		 em.close();
		 emf.close();

	}

}
