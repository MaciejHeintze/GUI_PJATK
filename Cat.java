
public class Cat implements Animal {
	
	private double catMass;
	
	
	public Cat(double catMass)
	{
		this.catMass=catMass;
	}
	
	public void makeSound(){
		System.out.println("Miau miau");
	}
	
	public String eat(){
		catMass+=0.2;
		return "Cat is eating";
	}

	public Cat animalMultiply(double mass, int age){
		if(age>1){
		Cat kitten = new Cat(mass);
		return kitten;
		}else{
			return null;
		}
	}
	
	public double grow(double mass){
		catMass+=mass;
		return catMass;
	}
	
	public String toString(){
		return "Cat weighs: "+catMass+" kg.";
	}
	

}
