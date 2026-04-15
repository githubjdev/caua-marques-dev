package caua.dev.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import caua.dev.springboot.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	
}
