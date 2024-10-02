package ordenacao;

import java.util.Comparator;

public class ComparatorPorAltura implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		return Double.compare(p1.getAltura2(), p2.getAltura2());
	}

}
