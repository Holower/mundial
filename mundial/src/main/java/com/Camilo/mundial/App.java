package com.Camilo.mundial;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.Camilo.mundial.model.Equipo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory sessionFactory;
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Equipo equipo = new Equipo("Coño", "Teta");
		session.beginTransaction();
		session.save(equipo);
		session.getTransaction().commit();
	}
}
