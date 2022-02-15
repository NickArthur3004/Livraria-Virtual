package br.com.livraria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.livraria.entities.Eletronico;
import br.com.livraria.entities.Impresso;

import br.com.livraria.entities.Livro;
import br.com.livraria.entities.Venda;
import br.com.livraria.repositories.LivroEletronicoRepository;
import br.com.livraria.repositories.LivroImpressoRepository;
import br.com.livraria.repositories.VendaRepository;
import br.com.livraria.services.LivroService;
import br.com.livraria.services.VendaService;

@RestController
@RequestMapping(value = "/livrariaVirtual")
public class LivrariaVirtualController {
	
	@Autowired
	private LivroService ls;
	
	@Autowired
	private VendaService vs;
	
	@Autowired
	private LivroImpressoRepository lis;
	
	@Autowired
	private LivroEletronicoRepository ler;
	
	@Autowired
	private VendaRepository vr;
	
	@PostMapping(value = "/cadastrarLivroEletronico")
	@ResponseStatus(HttpStatus.CREATED)
	public Eletronico Add(@RequestBody Eletronico eletronico) {
		return ler.save(eletronico);
	}
	
	
	@PostMapping(value = "/cadastrarLivroImpresso")
	@ResponseStatus(HttpStatus.CREATED)
	public Impresso AddImpresso(@RequestBody Impresso impresso) {
		return lis.save(impresso);
	}
	

	@PostMapping(value = "/venda")
	@ResponseStatus(HttpStatus.CREATED)
	public Venda AddVenda(@RequestBody Venda venda) {
		return vs.addVenda(venda);
	}
	
	@GetMapping(value = "/vendas")
	public ResponseEntity<List<Venda>> findAllVenda(){
		List<Venda> list = vr.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value = "/livrosImpressos")
	public ResponseEntity<List<Impresso>> findAllImpressos(){
		List<Impresso> list = lis.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/livrosEletronicos")
	public List<Eletronico> findAllEletronicos(){
		return ler.findAll();
	}
	
	@GetMapping(value = "/livros")
	public List<Livro> findAllLivro(){
		return ls.findAll();
	}

}
