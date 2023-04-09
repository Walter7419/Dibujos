package ejem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Perico {
	
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
        drawHorizontalLine(6, 9, 0, Color.black);
        drawHorizontalLine(4, 5, 1, Color.black);
        drawHorizontalLine(3, 3, 2, Color.black);
        drawHorizontalLine(4, 5, 1, Color.black);
        drawHorizontalLine(10, 11, 1, Color.black);
        drawHorizontalLine(12, 12, 2, Color.black);
        drawHorizontalLine(6, 9, 6, Color.black);
        drawHorizontalLine(6, 9, 7, Color.black);
        drawHorizontalLine(6, 9, 8, Color.black);
        drawHorizontalLine(6, 9, 9, Color.black);
        drawHorizontalLine(6, 9, 10, Color.black);
        drawHorizontalLine(7, 8, 11, Color.black);
        drawHorizontalLine(4, 4, 7, Color.black);
        drawHorizontalLine(11, 11, 7, Color.black);
        drawHorizontalLine(3, 3, 11, Color.black);
        drawHorizontalLine(2, 2, 12, Color.black);
        drawHorizontalLine(2, 2, 17, Color.black);
        drawHorizontalLine(4, 6, 11, Color.black);
        drawHorizontalLine(7, 8, 16, Color.black);
        drawHorizontalLine(9, 11, 17, Color.black);
        drawHorizontalLine(12, 12, 11, Color.black);
        drawHorizontalLine(5, 5, 20, Color.black);
        drawHorizontalLine(6, 6, 21, Color.black);
        drawHorizontalLine(9, 9, 21, Color.black);
        drawHorizontalLine(10, 10, 20, Color.black);
        drawHorizontalLine(13, 13, 17, Color.black);
        drawHorizontalLine(13, 13, 12, Color.black);
        
        drawVerticalLine(5,8,1, Color.black);
        drawVerticalLine(3,4,2, Color.black);
        drawVerticalLine(9,10,2, Color.black);
        drawVerticalLine(13,16,1, Color.black);
        drawVerticalLine(16,16,3, Color.black);
        drawVerticalLine(3,4,13, Color.black);
        drawVerticalLine(5,8,14, Color.black);
        drawVerticalLine(13,16,14, Color.black);
        drawVerticalLine(9,10,13, Color.black);
        drawVerticalLine(22,24,7, Color.black);
        drawVerticalLine(22,24,8, Color.black);
        drawHorizontalLine(6, 9, 1, Color.red);
        drawHorizontalLine(4, 11, 2, Color.red);
        drawHorizontalLine(3, 12, 3, Color.red);
        drawHorizontalLine(3, 12, 4, Color.red);
        drawHorizontalLine(5, 10, 5, Color.red);
        drawHorizontalLine(2, 2, 5, Color.red);
        drawHorizontalLine(13, 13, 5, Color.red);
        drawHorizontalLine(2, 2, 8, Color.red);
        drawHorizontalLine(13, 13, 8, Color.red);
        drawHorizontalLine(3, 4, 9, Color.red);
        drawHorizontalLine(11, 12, 9, Color.red);
        drawHorizontalLine(3, 5, 10, Color.red);
        drawHorizontalLine(10, 12, 10, Color.red);
        drawHorizontalLine(4, 6, 11, Color.red);
        drawHorizontalLine(9, 11, 11, Color.red);
        drawHorizontalLine(4, 11, 12, Color.red);
        drawHorizontalLine(4, 11, 13, Color.red);
        drawHorizontalLine(4, 11, 14, Color.red);
        drawHorizontalLine(4, 11, 15, Color.red);
        drawHorizontalLine(4, 6, 16, Color.red);
        drawHorizontalLine(9, 11, 16, Color.red);
        drawHorizontalLine(6, 9, 20, Color.red);
        drawHorizontalLine(7, 8, 21, Color.red);
        drawHorizontalLine(0, 15, 19, brown);
        drawHorizontalLine(0, 15, 18, brown);
        drawHorizontalLine(0, 1, 17, brown);
        drawHorizontalLine(3, 3, 17, brown);
        drawHorizontalLine(7, 8, 17, brown);
        drawHorizontalLine(12, 12, 17, brown);
        drawHorizontalLine(14, 15, 17, brown);
        drawHorizontalLine(4, 6, 17, Color.black);
        drawHorizontalLine(12, 12, 16, Color.black);
        drawVerticalLine(12,13,3, Color.yellow);
        drawVerticalLine(12,13,12, Color.yellow);
        drawVerticalLine(13,16,2, morado);
        drawVerticalLine(14,15,3, morado);
        drawVerticalLine(14,16,12, morado);
        drawVerticalLine(13,16,13, morado);
        drawVerticalLine(16,16,12, Color.black);





 


















        









        








 
        
  
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("Perico.jpg"));
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