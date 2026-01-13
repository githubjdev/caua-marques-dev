package caua.dev.composicao;

public class Pedido {

	private String id;
	private String status;
	private Double valor;

	public Pedido(String id, String status, double valor) {
		super();
		this.id = id;
		this.status = status;
		this.valor = valor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", status=" + status + ", valor=" + valor + "]";
	}

}
