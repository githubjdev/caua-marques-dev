package caua.dev.composicao;

public class MainPagamento {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("alex");
		pessoa.setIdade(38);
		
		Venda venda = new Venda();
		venda.setId(1L);
		venda.setDescricao("Promoção de natal");
		venda.setPessoa(pessoa);
		venda.setFormaPagamento(FormaPagamento.PIX);
		
		
		System.out.println("Cod: Forma de pagamento: " + venda.getFormaPagamento().getCodigo());
		System.out.println("Nome: Forma de pagamento: " + venda.getFormaPagamento().name());
		System.out.println("Pessoa: " + venda.getPessoa().getNome());
		
	}

}
