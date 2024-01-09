
public class Main {

	public static void main(String[] args) {
		
		//Vivo v1 = new Vivo();
		Mamifero m1 = new Mamifero();
		m1.pulmao = 3;
		m1.cor = "Branco";
		imprimir(m1);
		
		Monotremado morcego = new Monotremado();
		morcego.cor = "rosa";
		morcego.tamAsa = 3;
		morcego.pulmao = 2;
		
		imprimirVoar(morcego);
				
		Peixe p1 = new Peixe();
		p1.guelras = 5;
		p1.cor = "Vermelho Dourado";
		//imprimir(p1);
		
		AvesVoadora urubu = new AvesVoadora();
		urubu.cor = "branco e preto";
		urubu.tipoPata = false;
		urubu.larguraAsa = 5;
		//System.out.println("Peixe cor= " + p1.cor);
		imprimirVoar(urubu);
		
		Ave pato = new Ave();
		pato.cor = "cinza";
		imprimir (pato);
		//System.out.println("Pato cor= " + pato.cor);
		
		Esquilo e1 = new Esquilo();
		e1.cor= "marrom";
		e1.pulmao =2;
		imprimirPousam(e1);
		
	}

private static void imprimirPousam(Pousagem x1) {
		x1.pousar();
		
	}

//	private static void imprimirVoarUrubu(AvesVoadora urubu) {
//		urubu.decolar();
//		urubu.pousar();
//		
//	}
	
	

	private static void imprimirVoar(Voar v1) {
		v1.decolar();
		v1.pousar();
		
	}

	private static void imprimir(Vivo x) {
		System.out.println(x.equals("Ave") + " cor = " + x.cor);		
	}
//	private static void imprimirPeixe(Peixe p1) {
//		System.out.println("Peixe cor = " + p1.cor);
//		
//	}
//	private static void imprimirAve(Ave p1) {
//		System.out.println("Ave cor = " + p1.cor);
//		
//	}

}
