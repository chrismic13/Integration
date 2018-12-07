package Integration;

public class Dog extends Animal{
	//this class inherits info from the animal class
	//that is why it "extends"
	
	private String breed;
	
	public Dog(int age, int legs, String breed){
		//this constructor uses the super keyword to
		//construct this dog using the animal class
		//so code does not have to be repeated.
		super(age, legs);
		this.breed = breed;
	}
	
	public void setBreed(String breed){
		this.breed = breed;
	}
	
	public String getBreed(){
		return breed;
	}
	//this method overrides the get info method from the 
	//Animal class using polymorphism the program knows 
	//to use this one instead of the one in the animal
	//class when it is used on a dog.
	@Override
	public void getInfo(){
		System.out.println("The dog has "+this.getLegs()+" legs"
				+ " and is "+this.getAge()+" years old! The "
						+ "dog is a "+breed+" breed.");
	}

}
