
public class Main {

	public static void main(String[] args) {

		Animal dog = new Dog(10);
		Animal cat = new Cat(3);
		
		System.out.print("Dog make sound: ");
		dog.makeSound();
		System.out.print("Cat make sound: ");
		cat.makeSound();
		
		System.out.println(dog.toString()+"\n"+cat.toString());
		
		((Dog)dog).setType();
		((Dog)dog).show();
		
		System.out.println(dog.eat()+"\n"+cat.eat());
		
		System.out.println("After meal: "+dog.toString()+"\n"+cat.toString());
		
		System.out.println("New puppy: "+dog.animalMultiply(0.7,3));
		System.out.println("New kitten: "+cat.animalMultiply(0.3,1));
		
		dog.grow(4);
		cat.grow(1);
		
		System.out.println("1 year later: "+"\n"+dog.toString()+"\n"+cat.toString());
		

	}

}
