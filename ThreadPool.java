import java.util.*;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
class Sample implements Runnable{
	String msg;
	public Sample(String s){
		this.msg=s;
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+" (Start) message = "+msg);  
        	processmessage(); 
        	System.out.println(Thread.currentThread().getName()+" (End)");
	}
	private void processmessage() {  
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
    }  
}
public class ThreadPool{
	public static void main(String args[]){
		ExecutorService ex=Executors.newFixedThreadPool(10);
		Sample s=new Sample("msg");
		for(int i=0;i<10;i++)
			ex.execute(s);
		ex.shutdown();
		
	}
}
