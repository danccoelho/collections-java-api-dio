package application;


import operacoesBasicas.ListaTarefa;

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
	}

}
