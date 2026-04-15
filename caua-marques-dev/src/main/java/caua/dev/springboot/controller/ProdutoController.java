package caua.dev.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
