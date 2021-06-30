package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		// INSERIR DADOS
		// Quando não é uma simples consulta no BD, é necessário dar um getTransaction e
		// begin
		/*
		 * Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com"); Pessoa
		 * p2 = new Pessoa(null, "Joaquim da Silva", "joaquim@gmail.com"); Pessoa p3 =
		 * new Pessoa(null, "Ana Maria", "ana@gmail.com"); em.getTransaction().begin();
		 * em.persist(p1); em.persist(p2); em.persist(p3); em.getTransaction().commit();
		 * System.out.println("Done!");
		 * 
		 * em.close(); emf.close();
		 */

		// BUSCAR DADOS
		/*
		 * Pessoa p = em.find(Pessoa.class, 2); System.out.println(p);
		 * 
		 * System.out.println("Done!"); em.close(); emf.close();
		 */

		// REMOVER DADOS
		// Quando não é uma simples consulta no BD, é necessário dar um getTransaction e
		// begin
		// OBS: só é possível remover dados monitorados
		em.getTransaction().begin();
		Pessoa p = em.find(Pessoa.class, 2);
		
		em.remove(p);
		
		em.getTransaction().commit();
		
		System.out.println("Done!");
		em.close();
		emf.close();

	}

}
