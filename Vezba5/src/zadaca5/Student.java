package zadaca5;

public class Student {
	private String name;
	private String lastName;
	private int index;
	
	public String getName () {return name;}
	public String getLastName () {return lastName;}
	public int getIndex () { return index;}
	
	public void setName(String ime) {this.name = ime;}
	public void setLastName(String prezime) {this.lastName = prezime;}
	public void setIndex (int index) {this.index = index;}
	
	public Student(String ime, String prezime, int index) {
		this.name = ime;
		this.lastName = prezime;
		this.index = index;
	}
	}


