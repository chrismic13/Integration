package Integration;

public class Animal {
	
	private int age;
	private int legs;
	
	public Animal(){
		age = 0;
		legs = 0;
	}
	
	public Animal(int age, int legs){
		this.age = age;
		this.legs = legs;
	}
	
	public int getAge(){
		return age;
	}
	public int getLegs(){
		return legs;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setLegs(int legs){
		this.legs = legs;
	}
	//this method is overridden in the dog class
	public void getInfo(){
		System.out.println("The animal has "+legs+" legs and is "+age+" years old!");
	}

}
