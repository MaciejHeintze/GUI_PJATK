package projekt_1;

/*Napisać program symulujący operacje na prostych kontach bankowych.
Każde konto (obiekt klasy Account) ma właściciela (obiekt klasy Person), stan konta, limit debetu. 
Dostępne są cztery operacje na koncie: wpłata, wypłata, przelew oraz obliczenie stanu konta po dodaniu odsetek, w skali rocznej.
Aktualna stopa procentowa - wspólna dla wszystkich kont jest ustalona statycznie w klasie Account. 
Proszę skorzystać z klasy Test(Uwaga nie wolno dokonwywać w niej żadnych zmian). 
 */

public class Test {
	 public static void main(String[] args)
	    {
	            Person klient1 = new Person("prg1"), klient2 = new Person("wpr");
	            Account  acc1 = new Account(klient1), acc2 = new Account(klient2);

	            acc1.setDebit(0); 
	            acc2.setDebit(-100);
	        
	            acc1.deposit(500);
	            acc2.deposit(900);
	         
	            acc2.withdraw(300);
	            acc1.transfer(acc2, 200);
	        
	            System.out.println(acc1);
	            System.out.println(acc2);
	        
	            acc2.transfer(acc1, 950);
	         
	        
	            Account.setInterest(2);
	            acc1.addInterest();
	            acc2.addInterest();
	         
	            System.out.println(acc1);
	            System.out.println(acc2);
	    }

}
