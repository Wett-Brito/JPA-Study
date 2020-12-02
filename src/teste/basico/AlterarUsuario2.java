package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		
		usuario.setNome("Fernando Henrique Cardozo");
		usuario.setEmail("presidenteAntigo@pres.com.br");
		
		
		// Sem o merge que deveria efetivar o update mas continua funcionando
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
