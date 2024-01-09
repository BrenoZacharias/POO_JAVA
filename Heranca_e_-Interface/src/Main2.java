
public class Main2 {

	public static void main(String[] args) {
		Aviao ticoTico = new Aviao();
		Aviao b737 = new Aviao();
		
		ticoTico.totalLugares=2;
		imprimirVoar(ticoTico);
		b737.totalLugares = 250;
		imprimirVoar(b737);
		

	}
	private static void imprimirVoar(Voar v1) {
		v1.decolar();
		v1.pousar();
		
	}

}
