import java.util.*;
class Book{
	private String title;
	private String author;
	 public Book (String title, String author)
	 {
  		this.title = title;
  		this.author = author;
	}
	public void setTitle(String title)
	{
  		this.title = title;
 	}
 
 	public void setAuthor(String author)
 	{
  		this.author = author;
 	}
 
 	public String getTitle()
 	{
  		return title;
 	}
 	public String getAuthor()
 	{
  		return author;
 	}
	public String display()
	{
		return (title+"  "+author);
	}
}
class libraryhashmap{
	public static void main(String args[])
	{
		 Book b1=new Book("aa","aaa");
		Book b2=new Book("bb","bbb");
		Book b3=new Book("cc","ccc");
		HashMap <String,HashMap<String,Book>> library=new HashMap<>();
		HashMap <String,Book> sub1=new HashMap<>();
		sub1.put("s1",b1);
		sub1.put("s2",b2);
		sub1.put("s3",b3);
		library.put("CSE",sub1);
		Book b4=new Book("aa","aaa");
		Book b5=new Book("bb","bbb");
		Book b6=new Book("cc","ccc");
		
		HashMap <String,Book> sub2=new HashMap<>();
		sub2.put("s1",b4);
		sub2.put("s2",b5);
		sub2.put("s3",b6);
		library.put("ECE",sub2);
		 Book b7=new Book("aa","aaa");
		Book b8=new Book("bb","bbb");
		Book b9=new Book("cc","ccc");
	
		HashMap <String,Book> sub3=new HashMap<>();
		sub3.put("s1",b7);
		sub3.put("s2",b8);
		sub3.put("s3",b9);
		library.put("IT",sub3);
		for(String s:library.keySet())
		{
			System.out.println(s+"::");
			for(String s1:library.get(s).keySet())
			{
				System.out.println(s1+":"+library.get(s).get(s1).display());
			}
		}
		
	}
}
			
		