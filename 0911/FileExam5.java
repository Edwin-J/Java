import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class FileExam5 {

	public static void main(String[] args) throws Exception {

		File file = new File("duke1.jpg");
		BufferedImage img = ImageIO.read(file);
		
		for (int x = 0; x < img.getWidth(); x++)
			
			for (int y = 0; y < img.getHeight(); y++) {
				
				Color c = new Color( img.getRGB(x, y) );
				int avg = (c.getRed() + c.getBlue() + c.getGreen()) / 3;
				
				Color avgC = new Color(avg, avg, avg);
				img.setRGB(x, y, avgC.getRGB());
				
			}
		
		File gray = new File("gray.jpg");
		ImageIO.write(img, "jpg", gray);

	}

}
