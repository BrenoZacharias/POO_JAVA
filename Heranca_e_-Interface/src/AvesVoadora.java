
public class AvesVoadora extends Ave implements Voar{
	int larguraAsa;
	int alturaAsa;
	@Override
	public void decolar() {
		System.out.println("Decolando Ave");
		
	}
	@Override
	public void pousar() {
		System.out.println("Pousando Ave");
		
	}
	
	

}
