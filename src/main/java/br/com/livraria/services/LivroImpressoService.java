package br.com.livraria.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.livraria.entities.Eletronico;
import br.com.livraria.entities.Impresso;
import br.com.livraria.repositories.LivroEletronicoRepository;
import br.com.livraria.repositories.LivroImpressoRepository;

@Service
public class LivroImpressoService {
	
	@Autowired
	private LivroImpressoRepository repository;
	
	@Transactional
	public Impresso addLivroImpresso(Impresso impresso) {
		Impresso imp = new Impresso();
		imp.atualizarEstoque();
		return repository.save(impresso);
	}

	@Transactional
	public List<Impresso> findAll() {
		List<Impresso> result = repository.findAll();
		return result;
	}
}
