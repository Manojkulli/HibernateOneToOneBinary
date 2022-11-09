package com.ty.Binaryone2one.controler;

import com.ty.Binaryone2one.dao.Persondao;
import com.ty.Binaryone2one.dto.Adhar;
import com.ty.Binaryone2one.dto.Person;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person=new Person();
		person.setName("Tharun");
		person.setAge(23);
		person.setAddress("Banglore");
		
		Adhar adhar=new Adhar();
		adhar.setName("Tharun");
		adhar.setAdharNo(1234121789);
		adhar.setPerson(person);
		person.setAdhar(adhar);
		
		Persondao dao=new Persondao();
		dao.savePerson(person);
		
		Person p1=dao.fetch(1);
		System.out.println(p1);
		
		System.out.println(dao.fetchAd(1));
		
	}
}
