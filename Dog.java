package ejem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Dog {
	
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
        drawHorizontalLine(5, 9, 1, Color.black);
        drawHorizontalLine(4, 4, 2, Color.black);
        drawHorizontalLine(3, 3, 3, Color.black);
        drawHorizontalLine(2, 2, 4, Color.black);
        drawHorizontalLine(10, 10, 2, Color.black);
        drawHorizontalLine(11, 11, 3, Color.black);
        drawHorizontalLine(12, 14, 4, Color.black);
        drawHorizontalLine(2, 3, 5, Color.black);
        drawHorizontalLine(5, 5, 5, Color.black);
        drawHorizontalLine(10, 10, 5, Color.black);
        drawHorizontalLine(15, 15, 5, Color.black);
        drawVerticalLine(6, 10, 1, Color.black);
        drawVerticalLine(7, 11, 2, Color.black);
        drawVerticalLine(6, 12, 3, Color.black);
        drawVerticalLine(6, 10, 4, Color.black);
        drawVerticalLine(6, 10, 6, Color.black);
        drawVerticalLine(6, 6, 10, Color.black);
        drawVerticalLine(6, 8, 16, Color.black);
        drawVerticalLine(6, 7, 17, Color.black);
        drawVerticalLine(9, 9, 15, Color.black);
        drawVerticalLine(12, 12, 4, Color.black);
        drawVerticalLine(11, 11, 5, Color.black);
        drawVerticalLine(11, 11, 7, Color.black);
        drawVerticalLine(13, 15, 7, Color.black);
        drawVerticalLine(16, 17, 6, Color.black);
        drawVerticalLine(20, 20, 5, Color.black);
        drawVerticalLine(23, 23, 6, Color.black);
        drawVerticalLine(14, 17, 9, Color.black);
        drawVerticalLine(13, 13, 11, Color.black);
        drawVerticalLine(14, 15, 12, Color.black);
        drawVerticalLine(16, 18, 13, Color.black);
        drawVerticalLine(19, 19, 12, Color.black);
        drawVerticalLine(20, 20, 11, Color.black);
        drawVerticalLine(21, 21, 10, Color.black);
        drawVerticalLine(23, 23, 13, Color.black);
        drawHorizontalLine(10, 10, 5, Color.black);
        drawHorizontalLine(10, 12, 11, Color.black);
        drawHorizontalLine(7, 8, 18, Color.black);
        drawHorizontalLine(6, 7, 19, Color.black);
        drawHorizontalLine(6, 8, 21, Color.black);
        drawHorizontalLine(6, 6, 23, Color.black);
        drawHorizontalLine(6, 13, 24, Color.black);
        drawHorizontalLine(8, 10, 12, Color.red);
        drawHorizontalLine(7, 7, 22, Color.black);
        drawHorizontalLine(11, 12, 22, Color.black);

















        





        





        















 
        
  
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("Dog.jpg"));
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