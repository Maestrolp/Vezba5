package zadaca16_11;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Prirodni");
		l1.add("Celi");
		l1.add("Decimalni");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("Decimalni");
		l2.add("Realni");
		
		l1.retainAll(l2);
		
		System.out.println(l1);

	}

}
