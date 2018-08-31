package Tests;

import java.util.Iterator;

import org.hibernate.AnnotationException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

import Model.Banco;

public class demo2 {
	   private static SessionFactory factory; 
	public static void main(String[] args) {
			      
			      try {
			         factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Banco.class).buildSessionFactory();
			      } catch (Throwable ex) { 
			         System.err.println("Failed to create sessionFactory object." + ex);
			         throw new ExceptionInInitializerError(ex); 
			      }
			      
			      demo2 ME = new demo2();
		
		ME.Buscarbancos();
		
		
		
	}
	private void Buscarbancos() {
		
		
		 Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         List banco = (List) session.createQuery("FROM banco").list(); 
	         for (Iterator iterator = ((java.util.List) banco).iterator(); iterator.hasNext();){
	            Banco banco1 = (Banco) iterator.next(); 
	            System.out.print("Nombre: " + banco1.getNombre_banco()); 
	            System.out.print("Direccion: " + banco1.getDireccion()); 
	            System.out.println("Telefono: " + banco1.getTelefono()); 
	         }
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
		
		
	}

}