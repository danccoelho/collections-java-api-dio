package operacoesBasicasSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<Convidado>();
	}
	
	public void addConvidado(String nome, int codigoConvidado) {
		convidadoSet.add(new Convidado(nome, codigoConvidado));
	}
	
	public void removeConvidado(int codigoConvidado) {
		Convidado convidadoParaRemover = null;
		for(Convidado c: convidadoSet) {
			if(c.getCodigoConvidado() == codigoConvidado) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void mostrarConvidados() {
		System.out.println(convidadoSet);
	}

	
	
	
	
}
