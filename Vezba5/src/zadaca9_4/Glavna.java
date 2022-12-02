package zadaca9_4;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Glavna {

	public static void main(String[] args) {
		List<Integer> celi = new ArrayList<>();
		
		celi.add(4);
		celi.add(7);
		celi.add(33);
		celi.add(30);
		celi.add(99);
		
		Collections.sort(celi);
		
		System.out.println("Sortirani elementite: " +celi);
		

	}

}
