package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Contato;

public class ContatoDAO {

	public static void incluirContato(Contato contato) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.taking.contatos");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(contato);

		em.getTransaction().commit();
	}

	public static Contato obterContatoPorID(int id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.taking.contatos");
		EntityManager em = emf.createEntityManager();

		Contato contatoRecuperado = em.find(Contato.class, id);

		// pega o objeto que recuperei desvinculado do entityManager
		em.detach(contatoRecuperado);

		return contatoRecuperado;
	}

	public static void atualizarContato(Contato contatoAlterado) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.taking.contatos");
		EntityManager em = emf.createEntityManager();

		Contato contatoBD = obterContatoPorID(contatoAlterado.getId());
		contatoBD.setNome(contatoAlterado.getNome());
		contatoBD.setNumero(contatoAlterado.getNumero());

		em.getTransaction().begin();
		em.merge(contatoBD);
		em.getTransaction().commit();
	}
	
	public static void excluirContato(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.taking.contatos");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Contato contato = em.find(Contato.class, id);
		em.remove(contato);
		em.getTransaction().commit();
	}

}
