package com.testeunitario.testeunitario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeunitario.testeunitario.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel,Long>{
	

}
