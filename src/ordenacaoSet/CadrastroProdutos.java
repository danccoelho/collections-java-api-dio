package ordenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadrastroProdutos {

	
	private Set<Produto> produtoSet;

	public CadrastroProdutos() {
		super();
		this.produtoSet = new HashSet<Produto>();
	}
	
	public void addProduto(long codigo, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(codigo, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutoNome(){
		Set<Produto> productPorNome = new TreeSet<>(produtoSet);
		return productPorNome;
	}

	public Set<Produto> exibirProdutoPreco	(){
		Set<Produto> productPorPreco = new TreeSet<Produto>(new ComparatorPorPreco());
		productPorPreco.addAll(produtoSet);
		return productPorPreco;	
	}
}
