class TestAccount{
	public static void main(String args[]){
		Account acc=new Account(10,"satish",50000);
		acc.deposit(40000);
		System.out.println(acc.getbal());
		acc.withdraw(20000);
		System.out.println(acc.getbal());
		System.out.println(acc.getno());
		System.out.println(acc.getname());
	}
}