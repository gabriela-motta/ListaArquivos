package aleatorios;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class GeraAleatorios {

	public GeraAleatorios() {

	}

	public double gera() {
		return 1 + (Math.random() * 100);
	}

	public void armazenaDados(int n) {
		try {
			File arquivoSaida = new File("saida_q1.dat");
			FileOutputStream fluxo = new FileOutputStream(arquivoSaida);
			DataOutputStream stream = new DataOutputStream(fluxo);

			int i = 0;
			while(i < n){
				stream.writeDouble(gera());
				i++;
			}
	
			stream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
