package zadaca2;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> iminja = new ArrayList<>();
		
		iminja.add("Ana");
		iminja.add("Maja");
		iminja.add("Emilija");
		
		System.out.println("Elementite na listata se: " +iminja);
		
		iminja.add(0, "Angela");
		
		System.out.println("Vtortiot element vo listat e: " +iminja.get(1));
		System.out.println("Pecatenje so for:");
		for (int i=0; i < iminja.size(); i++)
			System.out.println(iminja.get(i));

	}

}
