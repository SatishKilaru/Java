import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.TextField.*;
class TextFieldEx implements ActionListener{
	TextField t1, t2, t3;    
    Button b1, b2;
	TextFieldEx(){
	Frame f=new Frame("Satish");
	Button b1=new Button("+");
	Button b2=new Button("-");
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	 t1.setBounds(50, 50, 150, 20);        
        t2.setBounds(50, 100, 150, 20);    
       
        t3.setBounds(50, 150, 150, 20);  
        t3.setEditable(false);     
        b1.setBounds(50, 200, 50, 50);      
        b2.setBounds(120,200,50,50);    
	  b1.addActionListener(this);    
        b2.addActionListener(this);   
	f.add(t1);  
        f.add(t2);  
        f.add(t3);  
        f.add(b1);  
        f.add(b2);  
	f.setSize(300,300);    
        f.setLayout(null);    
        f.setVisible(true);   
	}
	public void actionPerformed(ActionEvent e){
		 String s1 = t1.getText();    
        	String s2 = t2.getText();    
        	int a = Integer.parseInt(s1);    
        	int b = Integer.parseInt(s2);    
        	int c = 0;   
		if(e.getSource()==b1){
			c=a+b;
		}
		else if(e.getSource()==b2){
			c=a-b;
		}
		String s=String.valueOf(c);
		t3.setText(s);
	}
	public static void main(String args[]){
		new TextFieldEx();
	}
}
	
