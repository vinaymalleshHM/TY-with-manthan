
public class TestI 
{
	public static void main(String[] args)
	{ 
		
		System.out.println("*****************Third Gen Mobile***************");
		ThirdGen t = new ThirdGen();
		t.call();
		t.mesg();
		t.radio();
		t.camera();
		
		
		
		System.out.println("*****************Second Gen Mobile***************");
		SecondGen s = new SecondGen();
		s.call();
		s.mesg();
		s.radio();
		
		
		
		
		System.out.println("*****************First Gen Mobile***************");
		FirstGen f = new FirstGen();
		f.call();
		f.mesg();
		
	}
}
