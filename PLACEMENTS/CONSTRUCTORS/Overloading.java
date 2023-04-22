class Parent{
	private String name;
	private int age;

	public Parent(String name){
		this.name = name;
		this.age = 30;
	}

	public Parent(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void printDetails(){
		System.out.println("Name: "+this.name+"\n"+"Age : "+this.age);
	}
}

public class Overloading{
	public static void main(String[] args){
		Parent parent1 = new Parent("Akansha");
		Parent parent2 = new Parent("Aditya", 40);

		parent1.printDetails();
		parent2.printDetails();
	}
}