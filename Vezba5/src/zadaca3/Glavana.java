package zadaca3;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


public class Glavana {

	public static void main(String[] args) {
		List<String> fakulteti = new ArrayList<>();
				
		fakulteti.add("FIKT");
		fakulteti.add("FINKI");
		fakulteti.add("Praven");
		
		Collections.sort(fakulteti);
		System.out.println("Elementite na listata se: " +fakulteti);
		

	}

}
