package com.ty.Binaryone2one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.Binaryone2one.dto.Adhar;
import com.ty.Binaryone2one.dto.Person;

public class Persondao {

	public void savePerson(Person person){
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manoj");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(person.getAdhar());
		entityTransaction.commit();
	}
	
	public Person fetch(int id){
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manoj");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Person person=entityManager.find(Person.class, id);
		return person;
	}
	
	public Adhar fetchAd(int id){
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manoj");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Adhar adhar=entityManager.find(Adhar.class, id);
		return adhar;
	}
}
