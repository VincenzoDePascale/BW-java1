package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import utenti.Utente;

public class Main {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BW-java1");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Utente utente1 = new Utente();
		
		
		
	}

}
