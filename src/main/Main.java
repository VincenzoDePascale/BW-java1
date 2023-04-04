package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;
public class Main {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BW-java1");
	static EntityManager em = emf.createEntityManager();
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
