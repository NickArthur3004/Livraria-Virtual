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

@Entity
@Table(name = "tb_venda")
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer numVendas = 1;
	
	private Integer numero = numVendas;
	
	private String cliente;
	
	private Float valor;
	
	@ManyToOne
	 @JoinColumn(name = "livro_impresso_id")
	private Impresso impresso;
	
	@ManyToOne
	 @JoinColumn(name = "livro_eletronico_id")
	private Eletronico eletronico;

	public Venda() {
		super();
	}
	
	

	public Venda(String cliente, Float valor, Eletronico eletronico) {
		super();
		this.cliente = cliente;
		this.valor = valor;
		this.eletronico = eletronico;
	}



	public Venda(String cliente, Float valor, Impresso impresso) {
		super();
		this.cliente = cliente;
		this.valor = valor;
		this.impresso = impresso;
	}



	public Venda(Long id, String cliente, Float valor, Impresso impresso,Eletronico eletronico) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.valor = valor;
		this.impresso = impresso;
		this.eletronico = eletronico;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumVendas() {
		return numVendas;
	}

	public void setNumVendas(Integer numVendas) {
		this.numVendas = numVendas;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Impresso getImpresso() {
		return impresso;
	}

	public void setImpresso(Impresso impresso) {
		this.impresso = impresso;
	}

	public Eletronico getEletronico() {
		return eletronico;
	}

	public void setEletronico(Eletronico eletronico) {
		this.eletronico = eletronico;
	}
	
}
