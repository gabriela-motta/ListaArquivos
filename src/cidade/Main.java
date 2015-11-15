package cidade;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			LeDados ld1 = new LeDados();
			ld1.leArquivo();
			System.out.println(ld1.listaCidadaos());
			
			for(Cidadao pessoa: ld1.getPessoas()){
				System.out.println(ld1.defineExpectativa(pessoa));
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
