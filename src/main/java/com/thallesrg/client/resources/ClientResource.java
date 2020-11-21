package com.thallesrg.client.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thallesrg.client.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Thalles", "426.741.628.13", 250.00, Instant.parse("1999-10-14T20:30:50Z"), 25));
		list.add(new Client(2L, "Maria", "426.741.628.13", 250.00, Instant.parse("1999-10-14T20:30:50Z"), 25));
		list.add(new Client(3L, "João", "426.741.628.13", 250.00, Instant.parse("1999-10-14T20:30:50Z"), 25));
		return ResponseEntity.ok().body(list);
	}

}
