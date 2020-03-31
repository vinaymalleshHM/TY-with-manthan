
public abstract class Pen {

	int cost;


	void open() {

		System.out.println("I am open() method");
	}



	void close() {


		System.out.println("I am close() method");
	}


	abstract void write();

	abstract void color();

}
