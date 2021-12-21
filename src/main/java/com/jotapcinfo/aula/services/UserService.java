package com.jotapcinfo.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jotapcinfo.aula.dto.UserDTO;
import com.jotapcinfo.aula.entities.User;
import com.jotapcinfo.aula.repositories.UserRepository;

@Service // Registrando como um componente do sistema
public class UserService {

	@Autowired // Resolvendo a dependência e entregando o Objeto para uso (Injeção de dependência)
	private UserRepository repository;

	@Transactional(readOnly = true) // Garantindo o fechamento de transação com Transactional
	public UserDTO findById(Long id) {

		User entity = repository.findById(id).get();
		UserDTO dto = new UserDTO(entity);
		return dto;
	}
}