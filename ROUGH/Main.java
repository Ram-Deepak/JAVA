class Hello{
	private static void print(){
		System.out.println("Static method");
	}

	public void print1(){
		Hello.print(); // private methods/attributes can be accessed only within the class that it exists
		System.out.println("Public method");
	}
}

public class Main{
	public static void main(String args[]){
		Hello h = new Hello();
		h.print1();
	}
}