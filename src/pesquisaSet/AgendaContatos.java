package pesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatoSet;

	public AgendaContatos() {
		super();
		this.contatoSet = new HashSet<Contato>();
	}

	public void addContato(String name, int numero) {
		contatoSet.add(new Contato(name, numero));
	}
	
	public void exibirContato() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarNome(String nome){
		Set<Contato> contatoPorNome = new HashSet<Contato>();
		for(Contato c:contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatoPorNome.add(c);
			}
		}
		return contatoPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizar = null;
		for(Contato c: contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizar = c;
				break;
			}
		}
		return contatoAtualizar;	
	}
}
