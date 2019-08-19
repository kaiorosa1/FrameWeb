package web.media.project.service;

import java.util.List;
import java.util.Optional;

import web.media.project.model.Produto;

public interface ProdutoService {

	public Optional<Produto> findProdutoById(Long id);

	public List<Produto> findAllProdutos();

	public Produto saveProduto(Produto produto);

	public void deleteProduto(Produto produto);

}