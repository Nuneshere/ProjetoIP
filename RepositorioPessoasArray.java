public class RepositorioPessoasArray implements RepositorioPessoa {

	private Pessoa[] pessoas;
	private int indice;

	public RepositorioPessoasArray(int tamanho) {
		this.pessoas = new Pessoa[tamanho];
	}

	@Override
	public void inserir(Pessoa pessoa) {
		pessoas[indice] = pessoa;
		indice++;
	}

	@Override
	public Pessoa procurar(Pessoa pessoa) {
		for (int i = 0; i < indice; i++) {
			if (pessoas[i].getID() == pessoa.getID()) {
				return pessoas[i];
			}
		}
		return null;
	}

	@Override
	public void remover(Pessoa pessoa) {
		Pessoa p = procurar(pessoa);
		if (p != null) {
			p = pessoas[indice - 1];
			pessoas[indice - 1] = null;
			indice--;
		}
	}

	@Override
	public void atualizar(Pessoa pessoa) {
		Pessoa p = procurar(pessoa);
		if (p != null) {
			p = pessoa;
		}
	}
}