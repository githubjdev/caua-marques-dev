package caua.dev.collections;

import java.util.Objects;

public class Produto {

	String nome;
	String categoria;
	String marca;
	boolean ativoProd;
	double valorProd;
	double estoqueProd;
	
	
	

	public Produto(String nome, String categoria, boolean ativoProd, double valor) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.ativoProd = ativoProd;
		this.valorProd = valor;
	}

	public Produto(String nome, String categoria) {
		super();
		this.nome = nome;
		this.categoria = categoria;
	}

	public Produto(String nome, String marca, boolean ativoProd, double valorProd, double estoqueProd) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.ativoProd = ativoProd;
		this.valorProd = valorProd;
		this.estoqueProd = estoqueProd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean getAtivoProd() {
		return ativoProd;
	}

	public void setAtivoProd(boolean ativoProd) {
		this.ativoProd = ativoProd;
	}

	public double getValorProd() {
		return valorProd;
	}

	public void setValorProd(double valorProd) {
		this.valorProd = valorProd;
	}

	public double getEstoqueProd() {
		return estoqueProd;
	}

	public void setEstoqueProd(double estoqueProd) {
		this.estoqueProd = estoqueProd;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", categoria=" + categoria + ", marca=" + marca + ", ativoProd=" + ativoProd
				+ ", valorProd=" + valorProd + ", estoqueProd=" + estoqueProd + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ativoProd, categoria, estoqueProd, marca, nome, valorProd);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return ativoProd == other.ativoProd && Objects.equals(categoria, other.categoria)
				&& Double.doubleToLongBits(estoqueProd) == Double.doubleToLongBits(other.estoqueProd)
				&& Objects.equals(marca, other.marca) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(valorProd) == Double.doubleToLongBits(other.valorProd);
	}

}
