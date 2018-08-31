package Tests;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;

import Model.Banco;


public class Buscar{

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Banco.class).buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			// start a transaction
			session.beginTransaction();
			
			
			//Consulta
			List<Banco> theBanks = session.createQuery("from Banco").list();
			Gson g = new Gson();
			
			
			
			//Display
			for(Banco tempBanco: theBanks) {
				System.out.println(tempBanco);
			}
			
			
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Banco> theBanks) {
		for (Banco banco : theBanks) {
		
		}
	}

}