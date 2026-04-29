package caua.dev.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import caua.dev.springboot.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
        
	@Query("SELECT p FROM Produto p WHERE LOWER(p.nome) LIKE %:nome% and p.ativo = true")
	public List<Produto> buscarPorNome(@Param("nome") String nome);
	    
}
