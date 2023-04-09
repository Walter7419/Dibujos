package ejem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Finn {
	
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
    static Color brown		= new Color(121,43,15);
    static Color rosa		= new Color(121,43,15);

    
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
        drawVerticalLine(11, 15, 5, Color.black);
        drawVerticalLine(4, 17, 6, Color.black);
        drawVerticalLine(3, 18, 7, Color.black);
        drawVerticalLine(3, 18, 8, Color.black);
        drawVerticalLine(4, 18, 9, Color.black);
        drawVerticalLine(4, 17, 10, Color.black);
        drawVerticalLine(4, 17, 11, Color.black);
        drawVerticalLine(4, 17, 12, Color.black);
        drawVerticalLine(4, 17, 13, Color.black);
        drawVerticalLine(4, 17, 14, Color.black);
        drawVerticalLine(4, 18, 15, Color.black);
        drawVerticalLine(3, 18, 16, Color.black);
        drawVerticalLine(3, 18, 17, Color.black);
        drawVerticalLine(4, 17, 18, Color.black);
        drawVerticalLine(11, 14, 19, Color.black);
        drawVerticalLine(12, 14, 6, piel);
        drawVerticalLine(12, 14, 18, piel);
        drawVerticalLine(4, 10, 7, Color.WHITE);
        drawVerticalLine(4, 11, 8, Color.WHITE);
        drawVerticalLine(5, 11, 9, Color.WHITE);
        drawVerticalLine(5, 11, 10, Color.WHITE);
        drawVerticalLine(5, 11, 11, Color.WHITE);
        drawVerticalLine(5, 11, 12, Color.WHITE);
        drawVerticalLine(5, 11, 13, Color.WHITE);
        drawVerticalLine(5, 11, 14, Color.WHITE);
        drawVerticalLine(5, 11, 15, Color.WHITE);
        drawVerticalLine(4, 11, 16, Color.WHITE);
        drawVerticalLine(4, 10, 17, Color.WHITE);
        drawHorizontalLine(9, 15,6, piel);
        drawHorizontalLine(8, 16,7, piel);
        drawHorizontalLine(8, 16,8, piel);
        drawHorizontalLine(8, 16,9, piel);
        drawHorizontalLine(9, 15,10, piel);
        drawHorizontalLine(9, 9,8, Color.BLACK);
        drawHorizontalLine(15, 15,8, Color.BLACK);
        drawHorizontalLine(11, 13,9, Color.BLACK);
        drawHorizontalLine(7, 17,11, Color.CYAN);
        drawHorizontalLine(7, 17,12, Color.CYAN);
        drawHorizontalLine(7, 17,13, Color.CYAN);
        drawHorizontalLine(7, 17,14, Color.CYAN);
        drawHorizontalLine(7, 17,15, Color.BLUE);
        drawHorizontalLine(7, 17,16, Color.BLUE);
        drawHorizontalLine(7, 9,17, Color.BLUE);
        drawHorizontalLine(15, 17,17, Color.BLUE);
        drawVerticalLine(11, 13, 17, Color.GREEN);
        drawVerticalLine(11, 13, 7, Color.GREEN);
        drawVerticalLine(11, 11, 6, Color.GREEN);
        drawVerticalLine(11, 11, 18, Color.GREEN);




        





        









    
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("Finn.jpg"));
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