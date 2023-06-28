class Thread1 extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(i);
			try{
			sleep(1000);
			}catch(Exception e){
			System.out.println(e.getMessage());}
		}
	}
}
class ThreadDemo{
	public static void main(String args[]){
		Thread1 t1=new Thread1();
		Thread1 t2=new Thread1();
		t1.start();
		
		try{
			t1.join();
			}catch(Exception e){
			System.out.println(e.getMessage());}
		t2.start();
		try{
			t2.join();
			}catch(Exception e){
			System.out.println(e.getMessage());}
		
		System.out.println("Hello WOrld");
		
	}
}