package projekt_4;
/* Firma "Apple" prowadzi kilka sklepów z jabłkami :-).
Wszystkie sklepy kupują jabłka po tej samej cenie hurtowej i sprzedają jabłka po tej samej cenie detalicznej.
Stworzyć klasę Sklep, reprezentującą jeden sklep w taki sposób, aby następujący program Test wyprowadził na konsoli wynik:

Sklepy: 
Sklep nr 1 aktualny stan jabłek 100.0 kg
Sklep nr 2 aktualny stan jabłek 200.0 kg
Sklep nr 3 aktualny stan jabłek 300.0 kg

Sklep nr 1 aktualny stan jabłek 5.0 kg
Wydatki: 150.0
Dochody: 285.0
Zysk   : 135.0

Sklep nr 2 aktualny stan jabłek 100.0 kg
Wydatki: 300.0
Dochody: 300.0
Zysk   : 0.0

Sklep nr 3 aktualny stan jabłek 50.0 kg
Wydatki: 450.0
Dochody: 750.0
Zysk   : 300.0
*/

public class Test {
// metoda podajZyski w klasie test
	static String podajZyski(Sklep sklep){
        double zyski =  sklep.ileZarobiono()-sklep.ileWydano();
        String wynik = sklep.wynik() + zyski + '\n';
        return wynik;
    }
 

	 public static void main(String[] args) {
	    
	    Sklep.setCenaHurtowa(1.5);
	    Sklep.setCenaDetaliczna(3);
	    Sklep sklep1 = new Sklep();
	    Sklep sklep2 = new Sklep();
	    Sklep sklep3 = new Sklep();
	    sklep1.kupno(100);
	    sklep2.kupno(200);
	    sklep3.kupno(300);
	    System.out.println("Sklepy: \n" + sklep1 + '\n' + sklep2 + '\n' + sklep3 + '\n');
	    sklep1.sprzedaż(95);
	    sklep2.sprzedaż(100);
	    sklep3.sprzedaż(250);
	    
	    
	    podajZyski(sklep1);      // uwaga: to jest wywołanie metody z klasy Test, 
	    podajZyski(sklep2);      // którą to metodę też trzeba napisać    
	    podajZyski(sklep3); 
	    
	    System.out.println("Sklepy: \n" + podajZyski(sklep1) + '\n' + podajZyski(sklep2) + '\n' + podajZyski(sklep3) + "\n\n");

	  }
	

	}