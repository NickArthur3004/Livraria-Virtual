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
@Table(name = "tb_livro_impresso")
public class Impresso extends Livro{
	
	private Float frete;
	
	private Integer estoque;
	
	@JsonIgnore
	@OneToMany
	private List<Venda> vendas = new ArrayList<>();
	

	public Impresso() {
		super();
	}

	public Impresso(Long id, String titulo, String autores, String editora, Float preco, Float frete,
			Integer estoque) {
		super(id, titulo, autores, editora, preco);
		this.frete = frete;
		this.estoque = estoque;
	}

	public Float getFrete() {
		return frete;
	}

	public void setFrete(Float frete) {
		this.frete = frete;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	
	

	public List<Venda> getVendas() {
		return vendas;
	}

	public Integer atualizarEstoque() {
		return estoque -= 1;
	}
	

	@Override
	public String toString() {
		return "Impresso [frete=" + frete + ", estoque=" + estoque + "]";
	}
	
	

}
