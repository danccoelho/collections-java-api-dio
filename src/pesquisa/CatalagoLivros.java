package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

	
	private List<Livro> listLivro = new ArrayList<Livro>();

	public CatalagoLivros() {
		this.listLivro = new ArrayList<Livro>();
	}
	
	
	public void addLivro(String titulo, String autor, int anoPublicacao) {
		
		listLivro.add(new Livro(titulo, autor, anoPublicacao));	
	}
	
	public List<Livro> buscarPorAutor(String autor){
		List<Livro> listaPorAutor = new ArrayList<Livro>();
		if(!listLivro.isEmpty()) {
			for(Livro l: listLivro) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					listaPorAutor.add(l);
				}
			}
		}
		return listaPorAutor;
	}
	
	public List<Livro> buscarPorIntervalo(int anoInicial, int anoFinal){
		List<Livro> listaPorIntervalo = new ArrayList<Livro>();
		if(!listLivro.isEmpty()) {
			for(Livro l: listLivro) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					listaPorIntervalo.add(l);
				}
			}
		}
		return listaPorIntervalo;
	}
	
	public Livro pesquisaPorTitulo(String titulo) {
		Livro livroTitulo = null;
		if(!listLivro.isEmpty()	) {
			for(Livro l: listLivro) {
				if(l.getTitiulo().equalsIgnoreCase(titulo)) {
					livroTitulo= l;
					break;
				}
			}
		}
		return livroTitulo;
	}
	
	
	
}
