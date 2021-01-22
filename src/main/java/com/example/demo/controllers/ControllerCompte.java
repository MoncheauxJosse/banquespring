package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Client;
import com.example.demo.models.Compte;

@RestController
@RequestMapping("compte")
public class ControllerCompte {

	
	List<Compte> comptes = new ArrayList<>();
	
	// Voir la liste avec get (localhost:8080/compte)
	@GetMapping
	public List<Compte> findAll(){
		
		return this.comptes;
	}
	
	// Voir le client avec get (localhost:8080/compte/{id})
	@GetMapping("/{id}")
	public Compte findbyid(@PathVariable int id) {
		return this.comptes.get(id);
	}
	
	
	//creer un save un compte
	@PostMapping
	public Compte save(@RequestBody Compte compte) {
		this.comptes.add(compte);
		return compte;
	}
	
	//Modifier le solde du compte
	@PutMapping("/{id}")
	public Compte update(@PathVariable int id ,@RequestBody Compte compte) {
		Compte nvCompte = findbyid(id);
		nvCompte.setSolde(compte.getSolde());
		
		return nvCompte;
	}
	
	//Supprimer un compte
	@DeleteMapping("/{id}")
	public Compte delete(@PathVariable int id) {
		
		return this.comptes.remove(id);
	}
	
}
