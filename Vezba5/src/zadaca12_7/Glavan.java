package zadaca12_7;
import java.util.ArrayList;
import java.util.List;

public class Glavan {

	public static void main(String[] args) {
		
		List<String> mail = new ArrayList<>();
		
		for (int i=1; i < 21; i++)
		{
			mail.add("mail"+(int)i+"@yahoo.com");

		}
		System.out.println(mail);
		
	}

}
