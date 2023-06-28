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
	public void deposit(int nu){
		bal=bal+nu;
	}
	public void withdraw(int am){
		if(bal-am>=0){
			bal=bal-am;
		}
		else{
			System.out.println("Insufficienbt funds");
		}
	}
	
}
		
				