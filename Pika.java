package ejem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Pika {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 1000;
    private static int height = 1000;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 30;
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
    static Color brown		= new Color(121,43,15);
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
        drawHorizontalLine(2, 4, 3, Color.black);
        drawHorizontalLine(2, 6, 4, Color.black);
        drawHorizontalLine(2, 3, 5, Color.black);
        drawVerticalLine(6, 6, 3, Color.black);
        drawVerticalLine(7, 7, 4, Color.black);
        drawVerticalLine(8, 8, 5, Color.black);
        drawVerticalLine(9, 10, 6, Color.black);
        drawVerticalLine(11, 16, 5, Color.black);
        drawVerticalLine(5, 5, 6, Color.black);
        drawVerticalLine(6, 6, 7, Color.black);
        drawVerticalLine(8, 8, 7, Color.black);
        drawVerticalLine(6, 6, 18, Color.black);
        drawVerticalLine(5, 5, 19, Color.black);
        drawVerticalLine(8, 8, 18, Color.black);
        drawVerticalLine(8, 8, 20, Color.black);
        drawVerticalLine(7, 7, 21, Color.black);
        drawVerticalLine(6, 6, 22, Color.black);
        drawVerticalLine(12, 12, 9, Color.black);
        drawVerticalLine(12, 12, 15, Color.black);
        drawVerticalLine(17, 18, 11, Color.black);
        drawVerticalLine(17, 18, 14, Color.black);
        drawVerticalLine(17, 19, 7, Color.black);
        drawVerticalLine(18, 19, 14, Color.black);
        drawVerticalLine(20, 20, 8, Color.black);
        drawVerticalLine(20, 20, 17, Color.black);
        drawHorizontalLine(8, 9, 7, Color.black);
        drawHorizontalLine(10, 15, 6, Color.black);
        drawHorizontalLine(16, 17, 7, Color.black);
        drawHorizontalLine(21, 23, 3, Color.black);
        drawHorizontalLine(20, 23, 4, Color.black);
        drawHorizontalLine(22, 23, 5, Color.black);
        drawHorizontalLine(9, 16, 16, Color.black);
        drawHorizontalLine(6, 9, 17, Color.black);
        drawHorizontalLine(17, 19, 17, Color.black);
        drawHorizontalLine(9, 16, 21, Color.black);
        drawVerticalLine(11, 12, 10, Color.black);
        drawVerticalLine(11, 12, 16, Color.black);
        drawVerticalLine(9, 10, 19, Color.black);
        drawVerticalLine(20, 20, 8, Color.black);
        drawVerticalLine(11, 16, 20, Color.black);
        drawVerticalLine(18, 19, 18, Color.black);
        drawVerticalLine(19, 20, 14, Color.white);
        drawVerticalLine(17, 17, 9, Color.white);
        drawVerticalLine(14, 15, 7, Color.red);
        drawVerticalLine(14, 15, 8, Color.red);
        drawVerticalLine(14, 15, 17, Color.red);
        drawVerticalLine(14, 15, 18, Color.red);
        drawVerticalLine(5, 6, 4, Color.yellow);
        drawVerticalLine(5, 7, 5, Color.yellow);
        drawVerticalLine(6, 8, 6, Color.yellow);
        drawVerticalLine(7, 7, 7, Color.yellow);
        drawVerticalLine(11, 16, 6, Color.yellow);
        drawVerticalLine(9, 13, 7, Color.yellow);
        drawVerticalLine(8, 10, 9, Color.yellow);
        drawVerticalLine(13, 15, 9, Color.yellow);
        drawVerticalLine(7, 10, 10, Color.yellow);
        drawVerticalLine(13, 15, 10, Color.yellow);
        drawVerticalLine(7, 15, 11, Color.yellow);
        drawVerticalLine(7, 13, 12, Color.yellow);
        drawVerticalLine(7, 13, 13, Color.yellow);
        drawVerticalLine(7, 15, 14, Color.yellow);
        drawVerticalLine(7, 10, 15, Color.yellow);
        drawVerticalLine(13, 15, 15, Color.yellow);
        drawVerticalLine(8, 10, 16, Color.yellow);
        drawVerticalLine(13, 15, 16, Color.yellow);
        drawVerticalLine(8, 13, 17, Color.yellow);
        drawVerticalLine(9, 13, 18, Color.yellow);
        drawVerticalLine(11, 16, 19, Color.yellow);
        drawVerticalLine(7, 7, 18, Color.yellow);
        drawVerticalLine(6, 8, 19, Color.yellow);
        drawVerticalLine(5, 7, 20, Color.yellow);
        drawHorizontalLine(7, 8, 16, Color.yellow);
        drawHorizontalLine(7, 8, 16, Color.yellow);
        drawHorizontalLine(17, 18, 16, Color.yellow);
        drawVerticalLine(8, 13, 8, Color.yellow);
        drawVerticalLine(5, 6, 21, Color.yellow);
        drawHorizontalLine(12, 13, 15, Color.yellow);
        drawHorizontalLine(12, 13, 14, Color.black);






















      
        










  





































        


        

        
  
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("Pika.jpg"));
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