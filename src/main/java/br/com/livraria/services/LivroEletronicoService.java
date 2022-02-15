package br.com.livraria.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.livraria.entities.Eletronico;
import br.com.livraria.repositories.LivroEletronicoRepository;

@Service
public class LivroEletronicoService {
	
	private LivroEletronicoRepository repository;
	
	@Transactional
	public Eletronico addLivroEletronico(Eletronico eletronico) {
		return repository.save(eletronico);
	}
	
	@Transactional
	public List<Eletronico> findAll() {
		List<Eletronico> result = repository.findAll();
		return result;
	}

}
