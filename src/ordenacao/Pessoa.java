package ordenacao;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private int idade;
	private double altura2;
	
	public Pessoa(String nome, int idade, double altura2) {
		this.nome = nome;
		this.idade = idade;
		this.altura2 = altura2;
		
		
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getAltura2() {
		return altura2;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura2 + "]";
	}
	
	
	@Override
	public int compareTo(Pessoa p) {
		
		return Integer.compare(idade, p.idade); 
	}
	
	
	
	
}
