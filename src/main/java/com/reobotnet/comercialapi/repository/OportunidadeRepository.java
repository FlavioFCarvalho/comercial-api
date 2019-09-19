package com.reobotnet.comercialapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reobotnet.comercialapi.model.Oportunidade;

public interface OportunidadeRepository extends JpaRepository<Oportunidade, Long>{
 Optional<Oportunidade> findByDescricaoAndNomeProspecto(String descricao, String nomeProspecto);
 }
