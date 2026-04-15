package caua.dev.springboot.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import caua.dev.springboot.model.Produto;
import caua.dev.springboot.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public Produto salvar(Produto produto) {
		return produtoRepository.saveAndFlush(produto);
	}

	public Boolean alertaEstoque(Long idProduto) {
		Produto produto = produtoRepository.findById(idProduto).get();

		if (produto.alertaEstoqueBaixo()) {
			/* e-mail, tabela no banco, disparar um pedido de compra..... */

			return true;
		} else {
			return false;
		}
	}

}
