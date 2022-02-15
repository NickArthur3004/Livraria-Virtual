package br.com.livraria.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.livraria.entities.Eletronico;
import br.com.livraria.entities.Impresso;
import br.com.livraria.entities.Livro;
import br.com.livraria.repositories.LivroEletronicoRepository;
import br.com.livraria.repositories.LivroImpressoRepository;
import br.com.livraria.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;
	
	@Autowired
	private LivroImpressoRepository lir;
	
	@Autowired
	private LivroEletronicoRepository lier;
	
	
	@Transactional
	public Livro addLivro(Livro livro) {
			return repository.save(livro);
	}
	
	@Transactional
	public List<Livro> findAll() {
		List<Livro> result = repository.findAll();
		return result;
	}
}
