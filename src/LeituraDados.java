import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class LeituraDados {
	
	private ArrayList<Double> lista;

	public LeituraDados() {
		this.lista = new ArrayList<>();
	}

	public void leDados() {
		try {
			FileInputStream streamEntrada = new FileInputStream("saida_q1.dat");
			DataInputStream streamInput = new DataInputStream(
					streamEntrada);
			
			String retorno = "Amostra lida:";
			
			while (streamInput.available() > 0) {
				Double dadoLido = streamInput.readDouble();
				lista.add(dadoLido);
				retorno = retorno + " " + dadoLido;
			}
			
			System.out.println(retorno);
			streamInput.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String calculaMedia(){
		double soma = 0;
		for (Double d: lista){
			soma = soma + (double)d;
		}
		double media = soma / lista.size();
		return "A média dos dados é: " + media;
	}
}
