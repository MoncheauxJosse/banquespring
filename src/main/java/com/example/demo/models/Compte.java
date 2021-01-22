package com.example.demo.models;

//bug
public class Compte {

	private int id;
	private double solde;

	public Compte() {
		super();
	}

	public Compte(int id) {
		super();
		this.id = id;
	}

	public Compte(int id, double solde) {
		super();
		this.id = id;
		this.solde = solde;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", solde=" + solde + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(solde) != Double.doubleToLongBits(other.solde))
			return false;
		return true;
	}

	public void ajouter(double unMontant) {
		
		solde = +unMontant;
	}

	public void retirer(double unMontant) {

		solde = -unMontant;

	}

}