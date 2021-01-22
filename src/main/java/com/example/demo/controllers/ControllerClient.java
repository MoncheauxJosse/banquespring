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



@RestController
@RequestMapping("clients")
public class ControllerClient {

	
	private List<Client> clients = new ArrayList<>();
	
	// Voir la liste avec get (localhost:8080)
	@GetMapping
	public List<Client> findAll(){
		
		return this.clients;
	}
	
	// Voir le client avec get (localhost:8080/{id})
	@GetMapping("/{id}")
	public Client findbyid(@PathVariable int id) {
		return this.clients.get(id);
	}
	
	@PostMapping
	public Client save(@RequestBody Client client) {
		this.clients.add(client);
		return client;
	}
	@PutMapping("/{id}")
	public Client update(@PathVariable int id ,@RequestBody Client client) {
		Client nvClient = findbyid(id);
		nvClient.setNom(client.getNom());
		nvClient.setAge(client.getAge());
		return nvClient;
	}
	
	@DeleteMapping("/{id}")
	public Client delete(@PathVariable int id) {
		
		return this.clients.remove(id);
	}
}
