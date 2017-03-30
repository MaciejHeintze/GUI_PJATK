package projekt_2;

import java.util.Random;

public class Student extends Osoba{
	
	int nrGrupy, idStudenta;
	Random generator = new Random();
	
	public Student(Osoba osoba, int nrGrupy){
		super(osoba.imie,osoba.nazwisko,osoba.wiek);
		this.nrGrupy=nrGrupy;
		idStudenta = generator.nextInt(100000);
	}
	public int getNrGrupy(){
		return nrGrupy;
	}
	
	public void setNrGrupy(int nrGrupy){
		this.nrGrupy=nrGrupy;
	}
	public String toString(){
		return super.toString()+"i należy do grupy nr: "+this.nrGrupy;
	}
	
	
	
	

}
