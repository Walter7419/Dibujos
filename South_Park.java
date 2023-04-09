package ejem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class South_Park {
	
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
        drawHorizontalLine(2, 18, 13, Color.black);
        drawHorizontalLine(2, 18, 14, Color.black);
        drawHorizontalLine(3, 17, 15, Color.black);
        drawHorizontalLine(2, 18, 16, Color.black);
        drawHorizontalLine(1, 19, 17, Color.black);
        drawHorizontalLine(0, 20, 18, Color.black);
        drawHorizontalLine(0, 20, 19, Color.black);
        drawHorizontalLine(0, 20, 20, Color.black);
        drawHorizontalLine(1, 19, 21, Color.black);
        drawHorizontalLine(3, 17, 22, Color.black);
        drawHorizontalLine(2, 18, 23, Color.black);
        drawHorizontalLine(8, 12, 3, Color.YELLOW);
        drawHorizontalLine(6, 7, 4, Color.CYAN);
        drawHorizontalLine(13, 14, 4, Color.CYAN);
        drawHorizontalLine(4, 16, 5, Color.CYAN);
        drawHorizontalLine(3, 6, 6, Color.CYAN);
        drawHorizontalLine(14, 17, 6, Color.CYAN);
        drawHorizontalLine(3, 3, 7, Color.CYAN);
        drawHorizontalLine(17, 17, 7, Color.CYAN);
        drawHorizontalLine(7, 13, 6, Color.YELLOW);
        drawHorizontalLine(4, 6, 7, Color.YELLOW);
        drawHorizontalLine(14, 16, 7, Color.YELLOW);
        drawHorizontalLine(2, 3, 8, Color.YELLOW);
        drawHorizontalLine(17, 18, 8, Color.YELLOW);
        drawHorizontalLine(7, 9, 8, Color.white);
        drawHorizontalLine(10, 10, 8, piel);
        drawHorizontalLine(11, 13, 8, Color.white);
        drawHorizontalLine(6, 14, 9, Color.white);
        drawHorizontalLine(4, 5, 9, piel);
        drawHorizontalLine(15, 16, 9, piel);
        drawHorizontalLine(5, 15, 10, Color.white);
        drawHorizontalLine(9, 9, 10, Color.black);
        drawHorizontalLine(11, 11, 10, Color.black);
        drawHorizontalLine(2, 4, 10, piel);
        drawHorizontalLine(2, 4, 11, piel);
        drawHorizontalLine(2, 4, 12, piel);
        drawHorizontalLine(16, 18, 10, piel);
        drawHorizontalLine(16, 18, 11, piel);
        drawHorizontalLine(16, 18, 12, piel);
        drawHorizontalLine(5, 15, 11, Color.white);
        drawHorizontalLine(5, 15, 12, Color.white);
        drawHorizontalLine(3, 17, 13, piel);
        drawHorizontalLine(6, 9, 13, Color.white);
        drawHorizontalLine(11, 14, 13, Color.white);
        drawHorizontalLine(3, 17, 14, piel);
        drawHorizontalLine(4, 16, 15, piel);
        drawHorizontalLine(6, 14, 16, piel);
        drawHorizontalLine(2, 5, 17, red);
        drawHorizontalLine(15, 18, 17, red);
        drawHorizontalLine(1, 3, 18, red);
        drawHorizontalLine(5, 9, 18, red);
        drawHorizontalLine(11, 15, 18, red);
        drawHorizontalLine(17, 19, 18, red);
        drawHorizontalLine(1, 2, 19, Color.YELLOW);
        drawHorizontalLine(4, 9, 19, red);
        drawHorizontalLine(11, 16, 19, red);
        drawHorizontalLine(18, 19, 19, Color.YELLOW);
        drawHorizontalLine(1, 2, 20, Color.YELLOW);
        drawHorizontalLine(4, 9, 20, red);
        drawHorizontalLine(11, 16, 20, red);
        drawHorizontalLine(18, 19, 20, Color.YELLOW);
        drawHorizontalLine(6, 9, 21, red);
        drawHorizontalLine(11, 14, 21, red);
        drawHorizontalLine(4, 5, 22, brown);
        drawHorizontalLine(15, 16, 22, brown);
        









    
        
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