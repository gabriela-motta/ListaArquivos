package cidade;

import java.util.ArrayList;
import java.util.List;

public class Cidadao {
	
	private String nome;
	private int idade;
	private List<String> atividades;

	public Cidadao(String nome, int idade, List<String> atividades) {
		this.nome = nome;
		this.idade = idade;
		this.atividades = new ArrayList<String>();
		this.atividades = atividades;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<String> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<String> atividades) {
		this.atividades = atividades;
	}

	public String toString(){
		String retorno = this.nome + ", " + this.idade + " anos. Atividade(s):";
		for (String atividade: this.atividades){
			retorno = retorno + " " + atividade + ",";
		}
		return retorno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cidadao){
			Cidadao novo = (Cidadao) obj;
			return this.getNome().equals(novo.getNome());
		}
		return false;
	}

	
}
