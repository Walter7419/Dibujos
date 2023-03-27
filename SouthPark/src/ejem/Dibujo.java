package ejem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Dibujo {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 1000;
    private static int height = 1000;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 35;
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
        drawHorizontalLine(8, 12, 2, Color.black);
        drawHorizontalLine(6, 14, 3, Color.black);
        drawHorizontalLine(4, 16, 4, Color.black);
        drawHorizontalLine(3, 17, 5, Color.black);
        drawHorizontalLine(2, 18, 6, Color.black);
        drawHorizontalLine(2, 18, 7, Color.black);
        drawHorizontalLine(1, 19, 8, Color.black);
        drawHorizontalLine(1, 19, 9, Color.black);
        drawHorizontalLine(1, 19, 10, Color.black);
        drawHorizontalLine(1, 19, 11, Color.black);
        drawHorizontalLine(1, 19, 12, Color.black);
        drawHorizontalLine(1, 19, 13, Color.black);
        drawHorizontalLine(2, 18, 14, Color.black);
        drawHorizontalLine(2, 18, 15, Color.black);
        drawHorizontalLine(3, 17, 16, Color.black);
        drawHorizontalLine(2, 18, 17, Color.black);
        drawHorizontalLine(1, 19, 18, Color.black);
        drawHorizontalLine(0, 20, 19, Color.black);
        drawHorizontalLine(0, 20, 20, Color.black);
        drawHorizontalLine(0, 20, 20, Color.black);
        drawHorizontalLine(0, 20, 20, Color.black);



    
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("South_Park.jpg"));
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