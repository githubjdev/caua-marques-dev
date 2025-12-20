package caua.dev.composicao;

public enum FormaPagamento {

	PIX("1"), BOLETO("2"), CARTAO("3");

	private String codigo;

	private FormaPagamento(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

}
