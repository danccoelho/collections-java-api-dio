package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	private List<Tarefa> tarefaList;

	public ListaTarefa() {

		this.tarefaList = new ArrayList<Tarefa>();
	}

	public void addTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));

	}

	public void removeTarefa(String descricao) {
		List<Tarefa> tarefaParaRemover = new ArrayList<Tarefa>();
		for (Tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover.add(t);
			}
		}

		tarefaList.removeAll(tarefaParaRemover);
	}

	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}

	public void obterDescricao() {
		System.out.println(tarefaList);
	}

	
	
	
}
