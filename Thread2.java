class Account{  
    double balance=10000;     
    public synchronized void withdraw(int amount){  
   		System.out.println("Going to withdraw...");    
		if(balance<amount){  
			System.out.println("No Funds; waiting for the deposit...");  
	       try{
				wait();
	       }catch(Exception e){
	       }  
       }  
       balance-=amount;  
       System.out.println("withdraw completed..1."+balance);  
     }  
	
    public synchronized void deposit(int amount){  
		System.out.println("Going to deposit...");  
		balance+=amount;  
		System.out.println("deposit completed... "+balance); 
		
		notify();  
    }  
}  
class Thread2{  
    public static void main(String args[]){  
		final Account act=new Account();
		Thread t1=new Thread(){  
	      public void run(){
		 		act.withdraw(15000);
	      }  
		};
		
		Thread t2=new Thread(){  
	      public void run(){
				act.deposit(10000);
	      }  
		};
		t1.start(); 
		
		t2.start();
		
    }
}
