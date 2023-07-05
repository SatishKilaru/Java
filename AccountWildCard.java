import java.util.*;
class Account{
	int no;
	String name;
	int bal;
	Account(int n,String s,int b){
		no=n;
		name=s;
		bal=b;
	}
	public int getno(){
		return no;
	}
	public String getname(){
		return name;
	}
	public int getbal(){
		return bal;
	}
	
}
class SavingsAccount extends Account{
	public SavingsAccount(int n,String s,int b){
		super(n,s,b);
	}
	public void calInterest(){
		System.out.println("SavingsAccount");
	}
}
class CurrentAccount extends Account{
	public CurrentAccount(int n,String s,int b){
		super(n,s,b);
	}
	public void calInterest(){
		System.out.println("CurrentAccount");
	}
}
class RecurrentAccount extends Account{
	public RecurrentAccount(int n,String s,int b){
		super(n,s,b);
	}
	public void calInterest(){
		System.out.println("RecurrentAccount");
	}
}
class CalInterest{
	public void calInterest(List<? extends Account> list)
	{
		for(Account a:list)
		{
			if(a instanceof SavingsAccount)
			{
				SavingsAccount s=(SavingsAccount)a;
				s.calInterest();
			}
			else if(a instanceof CurrentAccount)
			{
				CurrentAccount c=(CurrentAccount)a;
				c.calInterest();
			}
			else if(a instanceof RecurrentAccount)
			{
				RecurrentAccount r=(RecurrentAccount)a;
				r.calInterest();
			}
		}
	}
}
class AccountWildCard{
	public static void main(String args[]){
		SavingsAccount s1=new SavingsAccount(1,"s1",1);
		SavingsAccount s2=new SavingsAccount(2,"s2",2);
		CurrentAccount c1=new CurrentAccount(1,"c1",1);
		RecurrentAccount r1=new RecurrentAccount(1,"r1",1);
		ArrayList<Account> arr=new ArrayList<>();
		arr.addAll(Arrays.asList(s1,s2,c1,r1));
		CalInterest cc=new CalInterest();
		cc.calInterest(arr);
	}
}




			
			















