package ordenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

	List<Pessoa> pessoaList;

	public OrdenacaoPessoa() {
		
		this.pessoaList = new ArrayList<Pessoa>();
	}
	
	
	public void addPesosa(String nome, int idade, double altura2) {
		pessoaList.add(new Pessoa(nome, idade, altura2));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorIdade);
		return pessoaPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}
	

	
	
}
