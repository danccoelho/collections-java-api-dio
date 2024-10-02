package application;


import operacoesBasicas.ListaTarefa;
import ordenacao.OrdenacaoPessoa;
import pesquisa.CatalagoLivros;

public class Program {

	public static void main(String[] args) {
		
		ListaTarefa listTarefa = new ListaTarefa(); 
		
		System.out.println("Número de Tarefas: " + listTarefa.obterNumeroTotalTarefas());
		
		listTarefa.addTarefa("tarefa 1");
		listTarefa.addTarefa("tarefa 2");
		listTarefa.addTarefa("tarefa 3");
		listTarefa.addTarefa("tarefa 4");
		System.out.println("Número de Tarefas: " + listTarefa.obterNumeroTotalTarefas());
		
		listTarefa.removeTarefa("tarefa 1");
		System.out.println("Número de Tarefas: " + listTarefa.obterNumeroTotalTarefas());
		
		listTarefa.obterDescricao();
		
		CatalagoLivros catLivro = new CatalagoLivros();
		
		catLivro.addLivro("livro 01", "Autor 01", 2001);
		catLivro.addLivro("livro 02", "Autor 02", 2002);
		catLivro.addLivro("livro 03", "Autor 03", 2003);
		catLivro.addLivro("livro 04", "Autor 04", 2004);
		
		System.out.println(catLivro.buscarPorAutor("Autor 03"));
		System.out.println(catLivro.buscarPorIntervalo(2003, 2004));
		System.out.println(catLivro.pesquisaPorTitulo("Livro 01"));
		
		OrdenacaoPessoa ordPessoa = new OrdenacaoPessoa();
		
		ordPessoa.addPesosa("Nome 01", 20, 1.87);
		ordPessoa.addPesosa("Nome 02", 45, 1.86);
		ordPessoa.addPesosa("Nome 03", 25, 1.85);
		ordPessoa.addPesosa("Nome 04", 33, 1.84);
		
		System.out.println(ordPessoa.ordenarPorIdade());
		System.out.println(ordPessoa.ordenarPorAltura());
	}

}
