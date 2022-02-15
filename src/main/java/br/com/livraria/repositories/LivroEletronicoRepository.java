package br.com.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.entities.Eletronico;

public interface LivroEletronicoRepository extends JpaRepository<Eletronico, Long>{

}
