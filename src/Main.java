

public class Main {
	
	public static void main(String[] args) {
		
		GeraAleatorios g1 = new GeraAleatorios();
		LeituraDados l1 = new LeituraDados();
		
		g1.armazenaDados();
		l1.leDados();
		System.out.println(l1.calculaMedia());
	}

}
