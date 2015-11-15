package cidade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeDados {
	
	private static final String EOL = System.getProperty("line.separator");
	private static final int EXPECTATIVA = 100;
	private List<Cidadao> pessoas;

	public LeDados() {
		this.pessoas = new ArrayList<Cidadao>();
	}
	
	public void leArquivo() throws NumberFormatException, IOException{
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("pessoas.txt")));
			String line = "";
			
			while((line = reader.readLine() ) != null){
				List<String> atividades = new ArrayList<String>();
				String[] pedacos = line.split(",");
				for (int i = 2; i < pedacos.length; i ++){
					atividades.add(pedacos[i]);
				}
				Cidadao pessoa = new Cidadao(pedacos[0], Integer.valueOf(pedacos[1]), atividades);
				this.pessoas.add(pessoa);
			}
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String listaCidadaos(){
		String retorno = "";
		for (Cidadao pessoa: this.pessoas){
			retorno = retorno + pessoa.toString() + EOL;
		}
		return retorno;
	}

	public List<Cidadao> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Cidadao> pessoas) {
		this.pessoas = pessoas;
	}

	public String defineExpectativa(Cidadao pessoa){
		String retorno = pessoa.getNome() + " ainda deve viver uns ";
		int total = 0;
		int ev = 100 - pessoa.getIdade();
		
		if (pessoa.getAtividades().size() == 0){
			total = (int) (pessoa.getIdade() + (0.5 * ev));
		}else{
			total = (int) ((0.05 * pessoa.getAtividades().size( ) * ev) + ev + pessoa.getIdade());
		}
		int aindaFalta = total - pessoa.getIdade();
		
		retorno = retorno + aindaFalta + " anos (Total: " + total + " anos);";
		return retorno;
	}
}
