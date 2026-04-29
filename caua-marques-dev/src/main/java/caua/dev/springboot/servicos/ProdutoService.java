package caua.dev.springboot.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import caua.dev.springboot.model.Produto;
import caua.dev.springboot.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> buscarPorNome(String nome){
		return produtoRepository.buscarPorNome(nome.toLowerCase());
	}

	public boolean existe(Long id) {
		return produtoRepository.existsById(id);
	}

	public Produto salvar(Produto produto) {
		return produtoRepository.saveAndFlush(produto);
	}

	public List<Produto> listarTodos() {
		return produtoRepository.findAll();
	}
	
	public void excluir(Long id) {
		produtoRepository.deleteById(id);
	}

	public Produto buscarId(Long id) {
		return produtoRepository.findById(id).get();
	}
	
	public Optional<Produto> buscarIdOptional(Long id) {
		return produtoRepository.findById(id);
	}
	
	
	public List<Produto> listaPaginada(int page, int size){
		return produtoRepository.findAll(PageRequest.of(page, size, Sort.by("nome"))).getContent();
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
