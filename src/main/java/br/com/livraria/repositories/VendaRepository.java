package br.com.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.entities.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{

}
