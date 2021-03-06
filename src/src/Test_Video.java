import java.io.IOException;

import processing.video.*;
import processing.core.PApplet;
//import processing.core.PShape;
import processing.core.PVector;

public class Test_Video extends PApplet {

	
	Movie myMovie;


	
	public void setup() {
		myMovie = new Movie(this, "test.mov");
		myMovie.loop();
	}
	
	public void settings () {
		size(800,800);

	}
	
	public void draw() {
	  tint(255, 20);
	  image(myMovie, mouseX, mouseY);
	}
	
	// Called every time a new frame is available to read
	public void movieEvent(Movie m) {
	  m.read();
	}
	
	public static void main(String[] args) 
	{
		PApplet.main(Test_Video.class.getName());
	}	
}
