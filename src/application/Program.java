package application;


import operacoesBasicasList.ListaTarefa;
import operacoesBasicasSet.ConjuntoConvidados;
import ordenacaoList.OrdenacaoPessoa;
import pesquisaList.CatalagoLivros;
import pesquisaSet.AgendaContatos;

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
		System.out.println();
		
		AgendaContatos ac = new AgendaContatos();
		
		ac.exibirContato();
		ac.addContato("Camila", 123456);
		ac.addContato("Camila", 654);
		ac.addContato("Camila Calvacante", 22);
		ac.addContato("Camila Aa", 17945);	
		ac.addContato("Davi", 22);
		ac.exibirContato();
		
		System.out.println(ac.pesquisarNome("Camila"));
		System.out.println("Novo " + ac.atualizarNumeroContato("Davi", 11111));
	}

}
