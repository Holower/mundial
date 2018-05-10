package com.Camilo.mundial;

import org.hibernate.SessionFactory;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.Camilo.mundial.model.Equipo;
import com.Camilo.mundial.model.Jugador;
import com.Camilo.mundial.model.JugadorPK;

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
		Jugador jugador=new Jugador();
		
		Equipo equipo = session.find(Equipo.class, 2);
		
		
		JugadorPK jpk=new JugadorPK();
		jpk.setId(equipo.getId());
		jpk.setNumero(12);
		jugador.setId(jpk);
		jugador.setEmail("Hola@hotmail.com");
		jugador.setEquipo(equipo);
		jugador.setNombre("coñomadre");
		jugador.setPosicion("demarica");
		jugador.setFechanacimineto(new Date());
		session.beginTransaction();
		session.save(equipo);
		session.save(jugador);
		session.getTransaction().commit();
		
	}
}
