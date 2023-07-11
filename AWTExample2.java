// importing Java AWT class  
import java.awt.*;    
  
// class AWTExample2 directly creates instance of Frame class  
class AWTExample2 extends Frame{    
  
   // initializing using constructor  
   AWTExample2() {  
  
      // creating a Frame  
      //Frame f = new Frame();  
  
      // creating a Label  
      Label l1 = new Label("Employee id:");   
	Label l2 = new Label("Employee Name");
	Label l3 = new Label("salary:");
	
      // creating a Button  
      Button b = new Button("Submit");  
  
      // creating a TextField  
      TextField t = new TextField();  
  
      // setting position of above components in the frame  
      l1.setBounds(20, 80, 80, 30); 
	l2.setBounds(20, 120, 80, 30); 
	l3.setBounds(20, 160, 80, 30);  
      t.setBounds(120, 80, 80, 30);  
      b.setBounds(150, 100, 80, 30);  
  
      // adding components into frame    
      add(b);  
      add(l1);  
	add(l2);  
	add(l3);  
      add(t);  
  
      // frame size 300 width and 300 height    
      setSize(400,300);  
  
      // setting the title of frame  
      setTitle("Employee info");   
          
      // no layout  
      setLayout(null);   
  
      // setting visibility of frame  
      setVisible(true);  
	
}    
  
// main method  
public static void main(String args[]) {   
  
// creating instance of Frame class   
AWTExample2 awt_obj = new AWTExample2();    
  
}  
  
}    