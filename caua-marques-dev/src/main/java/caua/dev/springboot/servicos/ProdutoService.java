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

}
