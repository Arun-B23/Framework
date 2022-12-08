package Prgm;

class Pasw
{
	private String atmpin="1234";
	public String Get()
	{
		return atmpin;
	}
	public void Set(String atmpin)
	{
		this.atmpin=atmpin;
	}
}
public class MainPasw {
	public static void main(String[]args)
	{
		Pasw s=new Pasw();
		System.out.println(s.Get());
		s.Set("8338");
		System.out.println(s.Get());
	}

}
