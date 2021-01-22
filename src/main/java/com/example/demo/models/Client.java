package com.example.demo.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
	
	private String nom;
	private int age;
	private List<Compte> comptes = new ArrayList<>();
	

	public Client() {
		super();
	}
	//Compte[] comptes
	public Client( String nom, int age, List<Compte> comptes ) {
		this.nom = nom;
		this.age = age;
		this.comptes = comptes;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", age=" + age + ", comptes=" + comptes +"]";
	}
	
	

	public void ajouterCompte(Compte unCompte) {
		
		
		//add.comptes(unCompte);
		

	}

	public Compte getCompte(int numeroCompte) {
		Compte compte = new Compte();
		compte.setId(numeroCompte);
		return compte;
	}
	
	
		
	
	

}
