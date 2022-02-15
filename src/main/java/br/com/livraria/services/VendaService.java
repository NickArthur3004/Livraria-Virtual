package br.com.livraria.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.livraria.entities.Venda;
import br.com.livraria.repositories.LivroImpressoRepository;
import br.com.livraria.repositories.VendaRepository;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository vendaRepository;
	
	@Autowired
	private LivroImpressoRepository livroRepository;
	
	@Transactional
	public Venda addVenda(Venda venda) {
		
		int v = venda.getNumero();
		v += 1;
		venda.setNumero(v);
		return vendaRepository.save(venda);
	}
	
	@Transactional
	public List<Venda> findAll() {
		List<Venda> result = vendaRepository.findAll();
		return result;
	}
	
	

}
