package projekt_4;

public class Sklep {

	private double roznica, wydatek, zarobek;
	private double ileKupionych, ileSprzedanych;
	private static double cenaHurtowa;
	private static double cenaDetaliczna;
	private static int numer=0;
	private int nr;
	
	public Sklep(){
		numer++;
		nr = numer;
	}
	
	public static void setCenaHurtowa(double x){
		cenaHurtowa = x;
	}
	
	public static void setCenaDetaliczna(double x){
		cenaDetaliczna=x;
	}

	public void kupno(double x){
		ileKupionych = x;
		roznica +=x;
	}
	
	public void sprzedaż(double x){
		ileSprzedanych=x;
		roznica -=x;
	}
	public double ileWydano(){
		wydatek = cenaHurtowa*ileKupionych;
		return wydatek;
	}
	public double ileZarobiono(){
		zarobek = cenaDetaliczna*ileSprzedanych;
		return zarobek;
	}
	public double roznica(){
		return ileKupionych-ileSprzedanych;
	}
	
	public String toString(){
	
		return "Sklep nr " + nr+" aktualny stan jablek "+ ileKupionych+" kg";
	}
	
	public String wynik(){
		
		String wynik =  "Sklep nr " + nr + " aktualny stan jablek " + roznica +  "kg\nWydatki:" + wydatek + "\nDochody:" + zarobek + "\nZyski:";
		return wynik;
	}
	
}
