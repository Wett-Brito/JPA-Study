package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		
		Usuario usuario =  em.find(Usuario.class, 4L);
		
		em.detach(usuario); // Tirar do modo gerenciado, impedindo de atualizar o BD sem o comando merge
		
		usuario.setNome("Jaqueline");
		usuario.setEmail("jaqueline@gmail.com");
		
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
		
	}
	
}
