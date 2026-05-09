package caua.dev.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "produto")
@SequenceGenerator(name = "produto_seq", sequenceName = "produto_seq", allocationSize = 1, initialValue = 1)
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq")
	private Long id;

	@NotNull(message = "Nome não pode ser nulo")
	@NotBlank(message = "Nome obrigatório")
	@Column(nullable = false)
	private String nome;

	@Min(value = 1, message = "Valor mínimo é R$ 1.00")
	@Column(nullable = false)
	private Double preco;

	@Min(value = 10, message = "Quantidade míniuma de estoque é 10")
	@Column(nullable = false)
	private Double quantidade;

	private boolean ativo;	

	@JoinColumn(name = "categoria_id", 
			nullable = false, 
			foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "categoria_fk"))
	@ManyToOne
	private Categoria categoria;

	@Transient /* Para não gerar coluna na tabela */
	public boolean alertaEstoqueBaixo() {
		return quantidade.intValue() < 10;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public boolean getAtivo() {
		return ativo;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

}
