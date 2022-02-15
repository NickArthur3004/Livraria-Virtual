package br.com.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.entities.Impresso;

public interface LivroImpressoRepository extends JpaRepository<Impresso, Long>{

}
