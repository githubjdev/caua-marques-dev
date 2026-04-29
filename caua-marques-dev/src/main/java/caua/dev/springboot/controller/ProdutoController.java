package caua.dev.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import caua.dev.springboot.model.Produto;
import caua.dev.springboot.servicos.ProdutoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping("/teste")
	public ResponseEntity<String> teste() {
		return ResponseEntity.ok("Testando meu primeiro controller de produto");
	}

	@PostMapping("/salvar")
	public ResponseEntity<Produto> salvar(@RequestBody  @Valid Produto produto) {
		
		Produto produtoSalvo = produtoService.salvar(produto);
		return ResponseEntity.ok(produtoSalvo);
	}
	
	
	@PutMapping("/atualizar")
	public ResponseEntity<Produto> atualizar(@RequestBody  @Valid Produto produto) throws Exception {
		
		if (produto.getId() <= 0) {
			return ResponseEntity.badRequest().build();
		}
		
		if (!produtoService.existe(produto.getId())) {
			throw new Exception("Produto com ID: " + produto.getId() + " não existe para ser atualizado.");
		}
		
		Produto produtoSalvo = produtoService.salvar(produto);
		return ResponseEntity.ok(produtoSalvo);
	}
	
	@GetMapping("/listarTodos")
	public ResponseEntity<List<Produto>> listarTodos() {
		return ResponseEntity.ok(produtoService.listarTodos());
	}
	
	@GetMapping("/buscarId/{id}")
	public ResponseEntity<Produto> buscarId(@PathVariable(name = "id") Long id) {

		if (id <= 0) {
			return ResponseEntity.badRequest().build();
		}

		return ResponseEntity.ok(produtoService.buscarId(id));

	}
	
	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<String> excluir(@PathVariable(name = "id") Long id) throws Exception{
		
		if (id <= 0) {
			return ResponseEntity.badRequest().build();
		}
		
		
		if (!produtoService.existe(id)) {
			throw new Exception("Produto com ID: " + id + " não existe para ser removido.");
		}
		
		produtoService.excluir(id);
		
		return ResponseEntity.ok("Excluido com sucesso");
		
	}
	
	@GetMapping("/buscarPorNome/{nome}")
	public ResponseEntity<List<Produto>> buscarPorNome(@PathVariable(name = "nome") String nome){
		
		List<Produto> produtos = produtoService.buscarPorNome(nome);
		
		if (produtos.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(produtos);
	}
	
	
	
	@GetMapping("/alertaestoque/{idproduto}")
	public ResponseEntity<String> alertaEstoque(@PathVariable(value = "idproduto") Long idproduto){
		
		Boolean msg = produtoService.alertaEstoque(idproduto);
		String texto = "";
		
		if (msg) {
			texto = "Alerta de compra emitido para o produto: " + idproduto;
		}else {
			texto = "Produto ainda tem estoque alto e não foi emitido alerta";
		}
		
		return ResponseEntity.ok(texto);
	}

}
