package Prgm;

class Gol
{
	private String Gold="100grm";
	public String Get() 
	{
		return Gold;
	}
	public void Set(String Gold)
	{
		this.Gold=Gold;
	}
}
public class Maingold {
	public static void main(String[]args)
	{
		Gol s= new Gol();
		String z=s.Get();
		System.out.println("First gold savings "+z);
		s.Set("200grm");
		String m=s.Get();
		System.out.println("Second gold savings "+m);
	}

}
