package ejem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Parrot {
	
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
        drawVerticalLine(5, 9, 0, Color.black);
        drawVerticalLine(4, 10, 1, Color.black);
        drawVerticalLine(4, 11, 2, Color.black);
        drawVerticalLine(5, 8, 3, Color.black);
        drawVerticalLine(6, 7, 4, Color.black);
        drawVerticalLine(2, 4, 5, Color.black);
        drawVerticalLine(7, 10, 5, Color.black);
        drawVerticalLine(10, 10, 4, Color.black);
        drawVerticalLine(2, 2, 6, Color.black);
        drawVerticalLine(4, 4, 6, Color.black);
        drawVerticalLine(8, 10, 6, Color.black);
        drawVerticalLine(3, 4, 7, Color.black);
        drawVerticalLine(11, 11, 7, Color.black);
        drawVerticalLine(10, 11, 8, Color.black);
        drawVerticalLine(9, 11, 9, Color.black);
        drawVerticalLine(6, 10, 10, Color.black);
        drawVerticalLine(6, 6, 11, Color.black);
        drawVerticalLine(5, 9, 1, Color.BLACK);
        drawVerticalLine(2, 3, 2, Color.green);
        drawVerticalLine(1, 2, 3, Color.green);
        drawVerticalLine(3, 3, 1, Color.green);
        drawVerticalLine(3, 3, 1, Color.green);
        drawVerticalLine(2, 2, 4, Color.green);

        drawVerticalLine(13, 15, 6, Color.yellow);
        drawVerticalLine(12, 15, 7, Color.yellow);
        drawVerticalLine(12, 15, 8, Color.yellow);
        drawVerticalLine(15, 15, 9, Color.yellow);
        drawVerticalLine(12, 14, 9, Color.red);
        drawVerticalLine(11, 15, 10, Color.red);
        drawVerticalLine(7, 13, 11, Color.red);
        drawVerticalLine(9, 11, 12, Color.red);
        drawVerticalLine(5, 15, 14, morado);
        drawVerticalLine(4, 15, 13, morado);
        drawVerticalLine(12, 15, 12, morado);
        drawVerticalLine(3, 8, 12, morado);
        drawVerticalLine(2, 5, 11, morado);
        drawVerticalLine(14, 15, 11, morado);
        drawVerticalLine(2, 3, 10, morado);
        drawVerticalLine(1, 3, 9, morado);
        drawVerticalLine(1, 2, 8, morado);
        drawVerticalLine(1, 1, 7, morado);
        drawVerticalLine(1, 1, 6, morado);
        drawHorizontalLine(3, 5, 1, Color.green);
        drawVerticalLine(6, 6, 2, white);
        

















        


   


        













   

        
        
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("Parrot.jpg"));
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