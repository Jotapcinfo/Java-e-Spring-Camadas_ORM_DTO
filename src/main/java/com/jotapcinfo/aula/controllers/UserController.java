package com.jotapcinfo.aula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jotapcinfo.aula.dto.UserDTO;
import com.jotapcinfo.aula.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired // Injeção automática pelo framework
	private UserService service;

	@GetMapping(value = "/{id}") // (PathVariable) para casamento entre id que chega na requisição com id do argumento do método
	public UserDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
}