import java.io.*;
import java.nio.*;
import java.util.Scanner;
class FileRead{
	public static void main(String args[]) throws Exception{
		File file=new File("C:\\Users\\satish.ki\\Documents\\sample.txt");	
		BufferedReader br=new BufferedReader(new FileReader(file));
		int l=0;
		int w=0;
		String line;
		while((line=br.readLine())!=null){
			System.out.println("ss");
			l=l+1;
			String words[]=line.split("\\s");
			w=w+words.length;
		}
		System.out.println(l+" "+w);
	}
}