package Tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.Banco;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create session factory
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Banco.class).buildSessionFactory();
		
//Crea sesionn
		
		Session session = factory.getCurrentSession();
		
		try {
			//Instrucciones
			
			//SE CREA EL OBJETO BANCO
			System.out.println("Creando usuario.....");
			Banco fernando = new Banco("FernandoBank","Maturin","R-1234","042412345","f.rodulfo@pacific-logging.com");
			Banco esdras = new Banco("EsdrasBank","Maturin","R-32123","042412345","e.malave@pacific-logging.com");
			Banco anderson = new Banco("AndersonBank","Maturin","R-45323","04242452351","a.anderson@pacific-logging.com");
			Banco hermes = new Banco("HermesBank","Maturin","R-45323","04232351","h.allen@pacific-logging.com");
			Banco alejandra = new Banco("AlejandraBank","Maturin","R-42233","042123","a.belisario@pacific-logging.com");
			
			//COMIENZA LA TRANSACCION
			System.out.println("COMENZANDO TRANSACCION!!!!");
			session.beginTransaction();
			
			//GUARDA BANCO EN LA BASE DE DATOS
			System.out.println("guardando en la base de datos");
			session.save(fernando);
			session.save(esdras);
			session.save(anderson);
			session.save(hermes);
			session.save(alejandra);
			
			//SE MANDA A LA BASE DE DATOS
			session.getTransaction().commit();
			System.out.println("Todo bien todo correcto y yo que me alegro");
		}
		
		finally {
			factory.close();
		}
		
		
	}

}
