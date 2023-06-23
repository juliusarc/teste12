package com.algaworks.analog.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.analog.domain.model.Cliente;
import com.algaworks.analog.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
public class ClienteController {

	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@GetMapping("/clientes")
	public List<Cliente> Listar () {
			return clienteRepository.findAll();
	}
}
