import processing.core.PApplet;

public class Main extends PApplet {
	
	private int x = 30;
	
	// The argument passed to main must match the class name
	public static void main(String[] args) {
		PApplet.main("Main");
	}
		
	// method used only for setting the size of the window
	public void settings(){
		size(500, 300);
	}
		
	// identical use to setup in Processing IDE except for size()
	public void setup(){
		circle(x, height/2, 30);
	}
		
	// identical use to draw in Pr0cessing IDE
	public void draw(){
		background(200);
		circle(x, height/2, 30);
		x++;
	}
}
