package zadaca4;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> footBallClubs = new ArrayList<>();
		
		footBallClubs.add("FK Pobeda");
		footBallClubs.add("FK Vardar");
		footBallClubs.add("FK Pelister");
		
		footBallClubs.remove(1);
		
		System.out.println("Goleminata na listata e:" +footBallClubs.size());

	}

}
