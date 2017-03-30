package projekt_2;

public class Main {
	/*
Zaprojektować klasę Osoba z polami opisującymi nazwisko i wiek. 
Klasa powinna być wyposażona w konstruktory, metody ustalające/pobierające dane osoby oraz metodę toString() zwracającą informacje o danej osobie. 
Następnie, zdefiniować klasę Student rozszerzającą klasę Osoba z dodatkowym polem opisującym numer grupy, do której należy student.
 Klasę Student wyposażyć w potrzebne konstruktory i metody, które korzystają, tam gdzie jest to możliwe, z konstruktorów oraz metod nadklasy. 
 Każdy student powinien mieć swój unikalny numer, nadany automatycznie przy jego tworzeniu.

	
	*/
	public static void main(String[] args) {

		Osoba o1 = new Osoba("Andrzej", "Fonfara",21);
		System.out.println(o1);
		
		System.out.println(o1.getImie());
		o1.setWiek(24);
		o1.setImie("Andrew");
		System.out.println(o1);
		Student s1 = new Student(o1, 18);
		System.out.println(s1);
		s1.setNrGrupy(20);
		System.out.println(s1);
		System.out.println("ID "+s1.getImie()+" "+s1.getNazwisko()+" wynosi: "+s1.idStudenta);
		Osoba o2 = new Osoba("Marian","Kowalski", 21);
		System.out.println(o2);
		Student s2 = new Student(o2, 118);
		System.out.println("ID "+s2.getImie()+" "+s2.getNazwisko()+" wynosi: "+s2.idStudenta);
	}

}
