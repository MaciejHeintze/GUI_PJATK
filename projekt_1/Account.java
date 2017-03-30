package projekt_1;

public class Account {

	double stanKonta;
	double limit;
	Person klient;
	static double stopaProcentowa;
	
	public Account(Person klient)
	{
		limit=0;
		stanKonta=0;
		this.klient=klient;
	}
	
	public void setDebit(double limitDebetu){
		this.limit=limitDebetu;
	}
	
	public double deposit(double x)
	{
		return stanKonta+=x;
	}
	public void withdraw(double x)
	{
		if(stanKonta-x>limit){
		 stanKonta-=x;
	}else{
		System.out.println("Brak środków");
	}
	}
	public void transfer(Account x, double value)
	{
		if(stanKonta-value>limit){
			x.deposit(value);
			stanKonta-=value;
		}else{
			System.out.println("Nie można zrobić przelewu: BRAK ŚRODKÓW");
		}
	}
	public static void setInterest(double x)
	{
		stopaProcentowa=x;
	}
	public double addInterest()
	{
		return stanKonta+=(stanKonta*(stopaProcentowa/100));
	}
	public String toString(){
		return klient+", stan konta: "+stanKonta;
	}
}
