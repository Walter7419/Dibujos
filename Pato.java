package ejem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Pato {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 1000;
    private static int height = 1000;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    static Color white 		= Color.white;
    static Color blue  		= Color.blue;
    static Color red   		= Color.red;
    static Color darkBlue 	= new Color(5,56,100);
    static Color softBlue 	= new Color(113,168,221);
    static Color darkOrange = new Color(212,60,54);
    static Color softOrange = new Color(252,109,3);
    static Color piel		= new Color(238,190,118);
    static Color brown		= new Color(224,130,66);
    static Color rosa		= new Color(121,43,15);
    static Color militar	= new Color(82,187,157);
    static Color agua		= new Color(200,253,217);
    static Color morado		= new Color(127,0,177);



    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    // Definimos la matriz de colores    
    private final static Color[][] PIXELS = {
        {white, white, 	white, 	white, 	white},
        {white, blue, 	blue, 	blue, 	white},
        {white, blue,	red,	blue, 	white},
        {white, blue, 	blue, 	blue, 	white},
        {white, white, 	white, 	white, 	white}
    };
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);     
        drawHorizontalLine(9, 17, 0, Color.black);
        drawHorizontalLine(9, 17, 1, Color.black);
        drawHorizontalLine(9, 17, 2, Color.black);
        drawHorizontalLine(9, 17, 3, Color.black);
        drawHorizontalLine(9, 17, 4, Color.black);
        drawHorizontalLine(9, 17, 5, Color.black);
        drawHorizontalLine(7, 19, 6, Color.black);
        drawHorizontalLine(7, 19, 7, Color.black);
        drawHorizontalLine(1, 3, 16, Color.black);
        drawHorizontalLine(6, 7, 13, Color.black);
        drawHorizontalLine(4, 5, 18, Color.black);
        drawHorizontalLine(3, 6, 21, Color.black);
        drawHorizontalLine(6, 7, 19, Color.black);
        drawHorizontalLine(5, 14, 22, Color.black);
        drawHorizontalLine(5, 7, 23, Color.black);
        drawHorizontalLine(12, 14, 23, Color.black);
        drawHorizontalLine(15, 16, 21, Color.black);
        drawHorizontalLine(17, 17, 20, Color.black);
        drawHorizontalLine(11, 12, 11, Color.black);
        drawHorizontalLine(11, 12, 12, Color.black);
        drawHorizontalLine(12, 13, 15, Color.black);
        drawHorizontalLine(15, 16, 15, Color.black);
        drawHorizontalLine(12, 16, 16, Color.black);
        drawHorizontalLine(12, 13, 17, Color.black);
        drawHorizontalLine(15, 16, 17, Color.black);
        drawVerticalLine(9, 12, 8, Color.black);
        drawVerticalLine(8, 9, 17, Color.black);
        drawVerticalLine(11, 12, 17, Color.black);
        drawVerticalLine(10, 13, 18, Color.black);
        drawVerticalLine(16, 19, 18, Color.black);
        drawVerticalLine(14, 14, 7, Color.black);
        drawVerticalLine(17, 18, 0, Color.black);
        drawVerticalLine(19, 19, 1, Color.black);
        drawVerticalLine(20, 20, 2, Color.black);
        drawVerticalLine(15, 15, 4, Color.black);
        drawVerticalLine(14, 14, 5, Color.black);
        drawVerticalLine(8, 8, 9, Color.black);
        drawVerticalLine(14, 14, 17, Color.black);
        drawHorizontalLine(13, 16, 12, Color.red);
        drawHorizontalLine(14, 17, 13, Color.red);
        drawHorizontalLine(10, 10, 8, brown);
        drawHorizontalLine(1, 3, 17, brown);
        drawHorizontalLine(1, 2, 18, brown);
        drawHorizontalLine(8, 8, 17, brown);
        drawHorizontalLine(7, 7, 18, brown);
        drawHorizontalLine(13, 13, 13, brown);
        drawHorizontalLine(14, 16, 14, brown);
        drawHorizontalLine(14, 14, 15, brown);
        drawHorizontalLine(14, 14, 17, brown);
        drawHorizontalLine(12, 17, 18, brown);
        drawHorizontalLine(11, 17, 19, brown);
        drawHorizontalLine(9, 16, 20, brown);
        drawHorizontalLine(8, 14, 21, brown);
        drawHorizontalLine(1, 3, 17, brown);
        drawVerticalLine(9, 10, 9, brown);
        drawVerticalLine(16, 17, 17, brown);
        drawHorizontalLine(11, 16, 8, Color.yellow);
        drawHorizontalLine(10, 16, 9, Color.yellow);
        drawHorizontalLine(10, 17, 10, Color.yellow);
        drawHorizontalLine(9, 10, 11, Color.yellow);
        drawHorizontalLine(13, 16, 11, Color.yellow);
        drawHorizontalLine(9, 10, 12, Color.yellow);
        drawHorizontalLine(9, 12, 13, Color.yellow);
        drawHorizontalLine(10, 13, 14, Color.yellow);
        drawHorizontalLine(6, 8, 14, Color.yellow);
        drawHorizontalLine(5, 9, 15, Color.yellow);
        drawHorizontalLine(10, 10, 15, Color.yellow);
        drawHorizontalLine(4, 10, 16, Color.yellow);
        drawHorizontalLine(4, 8, 17, Color.yellow);
        drawHorizontalLine(10, 11, 17, Color.yellow);
        drawHorizontalLine(3, 3, 18, Color.yellow);
        drawHorizontalLine(6, 7, 18, Color.yellow);
        drawHorizontalLine(9, 11, 18, Color.yellow);
        drawHorizontalLine(2, 5, 19, Color.yellow);
        drawHorizontalLine(8, 10, 19, Color.yellow);
        drawHorizontalLine(3, 8, 20, Color.yellow);
        drawHorizontalLine(6, 7, 21, Color.yellow);
        drawHorizontalLine(11, 11, 15, Color.yellow);
        drawHorizontalLine(10, 10, 15, Color.white);
        drawHorizontalLine(9, 9, 17, brown);
        drawHorizontalLine(8, 8, 18, brown);

        














































   

        








        





        






   





 


















        









        








 
        
  
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("Pato.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void drawVerticalLine(int a, int b, int x, Color c){
   	    g.setColor(c);
    	for(int i=a;i<=b;i++){
    		 putPixel(x, i, c);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
    	g.setColor(c);
        for(int i=a;i<=b;i++){
        	 putPixel(i, y, c);
        }
    }
    
    private static void putPixel(int x, int y, Color c){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
    
    private static void drawSquareGrid(int size, Color c) {
    	g.setColor(c);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) { 
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    private static void drawBackground(int size, Color c) {
    	g.setColor(c);
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }    
    
    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }
}