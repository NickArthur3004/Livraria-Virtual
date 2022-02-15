package br.com.livraria.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@Entity
@Table(name = "tb_livro_eletronico")
public class Eletronico extends Livro{
	
	private Integer tamanho;
	
	@JsonIgnore
	@OneToMany
	private List<Venda> vendas = new ArrayList<>();

	public Eletronico() {
		super();
	}

	public Eletronico(Long id, String titulo, String autores, String editora, Float preco, Integer tamanho) {
		super(id, titulo, autores, editora, preco);
		this.tamanho = tamanho;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	
	

	public List<Venda> getVendas() {
		return vendas;
	}

	@Override
	public String toString() {
		return "Eletronico [tamanho=" + tamanho + "]";
	}

}
