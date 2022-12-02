package zadaca7_2;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> drzavi = new ArrayList<>();
		
		drzavi.add("Makedonija");
		drzavi.add("Srbija");
		drzavi.add("Crna-Gora");
		// to-do ako se vneseni tri drzavi da se dodadat uste dve, vo sp
		//sprotivno da se ispecatat so pomos na SIZE OF
		System.out.println("Goleminata na listata e:" +drzavi.size());
		
		if(drzavi.size() == 3) 
		{
			drzavi.add("Slovenija");
			drzavi.add("Hrvatsla");
			System.out.println("Elementite od listata: "+drzavi);
		}
		else
		{
			System.out.println("Elementite od listata: "+drzavi);
		}
				

	}

}
