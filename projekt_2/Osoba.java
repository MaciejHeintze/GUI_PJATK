package projekt_2;

public class Osoba{
	
	String imie,nazwisko;
	int wiek;
	
	public Osoba(String imie, String nazwisko, int wiek){
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.wiek=wiek;
	}
	
	public String getImie(){
		return imie;
	}
	public void setImie(String imie){
		this.imie=imie;
	}

	public String getNazwisko(){
		return nazwisko;
	}
	public void setNazwisko(String nazwisko){
		this.nazwisko=nazwisko;
	}
	public int getWiek(){
		return wiek;
	}
	public void setWiek(int wiek){
		this.wiek=wiek;
	}
	public String toString(){
		return imie+" "+nazwisko+" ma "+wiek+" lat ";
	}
}