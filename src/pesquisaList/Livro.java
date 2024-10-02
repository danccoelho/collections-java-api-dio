package pesquisaList;

public class Livro {
	
	private String titiulo;
	private String autor;
	private int anoPublicacao;
	
	public Livro(String titiulo, String autor, int anoPublicacao) {
		this.titiulo = titiulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitiulo() {
		return titiulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	@Override
	public String toString() {
		return "Livro [titiulo=" + titiulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
	}
	
	
	
	

}
