package module3;
import processing.core.*;

public class myPApplet extends PApplet {
	
	private String URL = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Abdel_Fattah_el-Sisi_September_2017.jpg/450px-Abdel_Fattah_el-Sisi_September_2017.jpg?20171013123751";
	private PImage backgroundImg;
	
	public void setup() {
		size(450,600);
		background(0,255,255);
		stroke(255,255,0);
		backgroundImg = loadImage(URL,"jpg");
		//resize images because images today have high resolution
		backgroundImg.resize(0,height); //0,height
		image(backgroundImg,0,0);
	}
	
    public void draw() {
    	
//    	int[] color = sunColorSec(hour());
//    	fill(color[0],color[1],color[2]);
//    	ellipse(width/4,height/5,width/5,height/5);
    }
    
    public int[] sunColorSec(int hours) {
    	int[] rgb = new int[3];
    	//Scale the brightness of the yellow based on the seconds.
    	//30 seconds is black, 0 seconds is bright yellow.
    	
    	int numOfHours = hours * 3600;
    	float diffFrom86400 = Math.abs(30 - numOfHours);
    	float ratio = diffFrom86400/86000;
    	
    	rgb[0] = (int)(255 * ratio);
    	rgb[1] = (int)(255 * ratio);
    	rgb[2] = 0;
    	
    	return rgb;
    }
}
