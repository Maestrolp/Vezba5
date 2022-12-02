package zadaca14_9;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<Fakultet> fakulteti = new ArrayList<Fakultet>();
		
		fakulteti.add(new Fakultet ("FIKT", 5, 400));
		fakulteti.add(new Fakultet ("fakultet2", 6, 500));
		fakulteti.add(new Fakultet ("fakultet3", 3, 200));
		fakulteti.add(new Fakultet ("fakultet4", 1, 50));
		fakulteti.add(new Fakultet ("fakultet5", 2, 250));
		
		for (int i=0; i < fakulteti.size(); i++) {
		System.out.println("Fakultet:"+fakulteti.get(i).getName());
		System.out.println("Broj na smerovi:"+fakulteti.get(i).getBrSmerovi());
		System.out.println("Broj na studenti:"+fakulteti.get(i).getBrSmerovi());
		System.out.println();
		}
	}

}
