
public class Dog implements Animal, AnimalType{
	

	private double dogMass;
	private String type;
	
	public Dog(double dogMass)
	{
		this.dogMass=dogMass;
	}
	
	public void makeSound(){
		System.out.println("How How!");
	}
	
	public String eat(){
		dogMass+=0.2;
		return "Dog is eating";
	}
	
	public Dog animalMultiply(double mass, int age){
		if(age>1){
		Dog puppy = new Dog(mass);
		return puppy;
		}else{
			return null;
		}
	}
	
	public double grow(double mass){
		dogMass+=mass;
		return dogMass;
	}
	
	public void setType(){
		if(dogMass>4){
			type = "Big dog";
		}else{
			type = "Small dog";
		}
	}
	
	public void show(){
		System.out.println("Dog type: "+type);
	}
	
	public String toString(){
		return "Dog weighs: "+dogMass+" kg. ";
	}
	
	
	
	

}
