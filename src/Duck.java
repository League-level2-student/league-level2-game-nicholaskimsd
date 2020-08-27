import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Duck extends GameObject
{
	Duck(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 1;
		if (needImage) {
		    loadImage ("86-865289_mallard-duck-clipart-mallard-duck-in-flight.jpg");
		    
		}
	}
void update(){
	y+=speed;
	super.update();
}
void draw(Graphics g) {
  
   
    if (gotImage) {
    	g.drawImage(image, x, y, width, height, null);
    } else {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
    }
}

public static BufferedImage image;
public static boolean needImage = true;
public static boolean gotImage = false;	

void loadImage(String imageFile) {
    if (needImage) {
        try {
            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
	    gotImage = true;
        } catch (Exception e) {
            
        }
        needImage = false;
    }
}
}

}
