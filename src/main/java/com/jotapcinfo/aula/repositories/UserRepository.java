package com.jotapcinfo.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jotapcinfo.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}