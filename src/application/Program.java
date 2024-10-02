package application;


import operacoesBasicasList.ListaTarefa;
import operacoesBasicasSet.ConjuntoConvidados;
import ordenacaoList.OrdenacaoPessoa;
import pesquisaList.CatalagoLivros;

public class Program {

	public static void main(String[] args) {
		
		ConjuntoConvidados cjc = new ConjuntoConvidados();
		
		System.out.println("Existem " + cjc.contarConvidados() + " convidado(s) dentro do SET de convidados."  );
		
		cjc.addConvidado("Daniel", 123);
		cjc.addConvidado("Luke", 1234);
		cjc.addConvidado("Mel", 1234);
		cjc.addConvidado("Júlia", 1235);
		
		cjc.mostrarConvidados();
		System.out.println("Existem " + cjc.contarConvidados() + " convidado(s) dentro do SET de convidados."  );
		cjc.removeConvidado(1235);
		System.out.println("Existem " + cjc.contarConvidados() + " convidado(s) dentro do SET de convidados."  );
		cjc.addConvidado("e", 123);
		System.out.println("Existem " + cjc.contarConvidados() + " convidado(s) dentro do SET de convidados."  );
	}

}
