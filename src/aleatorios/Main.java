package aleatorios;



public class Main {
	
	private static final int AMOSTRA = 100;

	public static void main(String[] args) {
		
		GeraAleatorios g1 = new GeraAleatorios();
		LeituraDados l1 = new LeituraDados();
		
		g1.armazenaDados(AMOSTRA);
		l1.leDados();
		System.out.println(l1.calculaMedia());
	}

}
