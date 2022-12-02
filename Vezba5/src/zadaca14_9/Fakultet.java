package zadaca14_9;

public class Fakultet {
	private String ime;
	private int brSmerovi;
	private int vkpStudenti;
	
	Fakultet (String ime, int brSmerovi, int vkpStudenti)
	{
		this.ime = ime;
		this.brSmerovi = brSmerovi;
		this.vkpStudenti = vkpStudenti;
	}
	
	public String getName () {return ime;}
	public int getBrSmerovi () {return brSmerovi;}
	public int getVkpStudenti () { return vkpStudenti;}

}
