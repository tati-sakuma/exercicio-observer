package observer;

public class Namorada implements ChegadaAniversarianteObserver{

	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		System.out.println("Bora apagar as luzes...");
		System.out.println("Vamos fazer silêncio...");
		System.out.println("SURPRESAAA!!!");
	}

}
