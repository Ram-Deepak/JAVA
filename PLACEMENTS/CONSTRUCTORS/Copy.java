class Parent{
	private String name;
	private int age;

	public Parent(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void printDetails(){
		System.out.println(this.name + " " + this.age);
	}
}