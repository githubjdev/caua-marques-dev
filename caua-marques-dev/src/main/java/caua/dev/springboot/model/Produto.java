package caua.dev.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull(message = "Nome não pode ser nulo")
	@NotBlank(message = "Nome obrigatório")
	@Column(nullable = false)
	private String nome;

	@Min(value = 1, message = "Valor mínimo é R$ 1.00")
	@Column(nullable = false)
	private String preco;

	@Min(value = 10, message = "Quantidade míniuma de estoque é 10")
	@Column(nullable = false)
	private String quantidade;

	
	@Transient /*Para não gerar coluna na tabela*/
	public boolean alertaEstoqueBaixo() {
		return Integer.parseInt(quantidade) < 10;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

}
