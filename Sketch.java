import processing.core.PApplet;


public class Sketch extends PApplet {
	
  int xSize = 600;
  int ySize = 600;

  public void settings() {
    size(xSize, ySize);
  }

  //stuff is relative to (400, 400)
  float xSizeRatio = (float)xSize/(float)400.00;
  float ySizeRatio = (float)ySize/(float)400.00;


  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {

    //System.out.println(xSize + " " + ySize + " " + xSizeRatio + " " + ySizeRatio
    stroke(128);
    line(150*xSizeRatio, 25*ySizeRatio, 270*xSizeRatio, 350*ySizeRatio);  

    stroke(255);
    line(50*xSizeRatio, 125*ySizeRatio, 70*xSizeRatio, 50*ySizeRatio);  
  }
  
}