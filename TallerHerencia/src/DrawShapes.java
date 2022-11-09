
import java.awt.*; 
import java.applet.*; 
 
public class DrawShapes extends Applet  { 
	
    Font font;     
    Color redColor; 
    Color blueColor;    
    Color backgroundColor;    
    
    
	public void setRedColor(Color negro) {
		this.redColor = negro;
	}
	public void setBlueColor(Color white) {
		this.blueColor = white;
	}
	public void setBackgroundColor(Color grey) {
		this.backgroundColor = grey;
	}
	
	
	public void init() { 
       
    }
    public void stop() { 
    	
    }
  
    
    public void paint(Graphics graph) { 
      
       graph.setFont(font);        
        graph.drawString("Draw Shapes",90,20); 
 
        
        graph.fillRect(115,115,90,90); 
 
        
        graph.setColor(Color.CYAN); 
 
      
        graph.drawRect(50,50,50,50); 
          
       
        graph.fillRect(50,50,60,60); 
    } 
} 
