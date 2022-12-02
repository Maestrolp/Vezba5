package zadaca8_2;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> smerovi = new ArrayList<>();
		
		smerovi.add("INKI");
		smerovi.add("IKT");
		smerovi.add("Tret smer");
		smerovi.add("cetvrt smer");
		
		smerovi.add(2, "Dodaden na tretata pozicija");
		
		System.out.println("Elementite na listata se: " +smerovi);


	}

}
