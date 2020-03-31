
public class TestB {
	
	public static void main(String[] args) {
		
		Pen p = new Marker();
		p.cost=100;
		p.open();
		p.close();
		p.write();
		p.color();
		
		System.out.println("cost is "+p.cost );
	}
	
	
}
