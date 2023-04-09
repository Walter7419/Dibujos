package ejem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Charmander {
	
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
        drawHorizontalLine(6, 9, 1, Color.orange);
        drawVerticalLine(0,17,0, Color.black);
        drawVerticalLine(0,17,1, Color.black);
        drawVerticalLine(5,7,2, Color.black);
        drawVerticalLine(4,4,3, Color.black);
        drawVerticalLine(8,8,3, Color.black);
        drawVerticalLine(2,3,4, Color.black);
        drawVerticalLine(1,1,5, Color.black);
        drawHorizontalLine(4, 5, 9, Color.black);
        drawHorizontalLine(6, 9, 0, Color.black);
        drawHorizontalLine(6, 8, 10, Color.black);
        drawHorizontalLine(6, 6, 13, Color.black);
        drawHorizontalLine(7, 8, 6, Color.black);
        drawHorizontalLine(7, 8, 7, Color.black);
        drawHorizontalLine(8, 8, 5, Color.black);
        drawHorizontalLine(7, 9, 14, Color.black);
        drawVerticalLine(11,12,7, Color.black);
        drawVerticalLine(13,13,8, Color.black);
        drawVerticalLine(1,1,10, Color.black);
        drawVerticalLine(2,3,11, Color.black);
        drawVerticalLine(4,5,12, Color.black);
        drawVerticalLine(6,7,13, Color.black);      
        drawVerticalLine(8,8,14, Color.black);
        drawVerticalLine(9,10,15, Color.black);
        drawVerticalLine(15,14,16, Color.black);
        drawVerticalLine(11,11,10, Color.black);
        drawVerticalLine(10,10,11, Color.black);
        drawVerticalLine(16,16,11, Color.black);
        drawHorizontalLine(10, 12, 15, Color.black);
        drawHorizontalLine(11, 12, 12, Color.black);
        drawHorizontalLine(14, 15, 15, Color.black);
        drawHorizontalLine(15, 16, 14, Color.black);
        drawHorizontalLine(16, 17, 13, Color.black);
        drawHorizontalLine(10, 12, 16, Color.black);
        drawVerticalLine(12,12,18, Color.black);
        drawVerticalLine(10,11,19, Color.black);
        drawVerticalLine(9,9,17, Color.black);
        drawVerticalLine(4,6,17, Color.black);
        drawVerticalLine(1,3,18, Color.black);
        drawVerticalLine(7,8,18, Color.black);
        drawVerticalLine(0,0,19, Color.black);
        drawVerticalLine(1,1,20, Color.black);
        drawVerticalLine(2,3,21, Color.black);
        drawVerticalLine(7,9,20, Color.black);
        drawVerticalLine(7,7,21, Color.black);
        drawVerticalLine(0,17,23, Color.black);     
        drawVerticalLine(10,14,16, Color.black);
        drawVerticalLine(0,17,24, Color.black);
        drawVerticalLine(4,6,22, Color.black);
        drawHorizontalLine(12, 15, 17, Color.black);
        drawHorizontalLine(15, 15, 16, Color.black);
        drawHorizontalLine(12, 12, 16, Color.white);
        drawVerticalLine(11,12,8, Color.yellow);
        drawVerticalLine(11,13,9, Color.yellow);    
        drawVerticalLine(12,14,10, Color.yellow);
        drawVerticalLine(13,14,11, Color.yellow);
        drawVerticalLine(6,7,19, Color.yellow);
        drawVerticalLine(5,6,20, Color.yellow);
        drawVerticalLine(4,6,18, Color.red);
        drawVerticalLine(1,5,19, Color.red);
        drawVerticalLine(2,4,20, Color.red);
        drawVerticalLine(4,6,21, Color.red);
        drawHorizontalLine(5, 10, 2, Color.orange);
        drawHorizontalLine(5, 10, 3, Color.orange);      
        drawHorizontalLine(4, 11, 4, Color.orange);
        drawHorizontalLine(3, 6, 5, Color.orange);
        drawHorizontalLine(9, 11, 5, Color.orange);
        drawHorizontalLine(3, 6, 6, Color.orange);
        drawHorizontalLine(3, 6, 7, Color.orange);
        drawHorizontalLine(9, 12, 7, Color.orange);
        drawHorizontalLine(4, 13, 8, Color.orange);
        drawHorizontalLine(6, 14, 9, Color.orange);
        drawHorizontalLine(9, 10, 10, Color.orange);
        drawHorizontalLine(11, 15, 11, Color.orange);
        drawHorizontalLine(12, 14, 10, Color.orange);
        drawHorizontalLine(13, 15, 12, Color.orange);
        drawHorizontalLine(12, 15, 13, Color.orange);
        drawHorizontalLine(12, 15, 14, Color.orange);
        drawHorizontalLine(13, 13, 15, Color.orange);
        drawHorizontalLine(13, 13, 16, Color.orange);
        drawVerticalLine(10,12,17, Color.orange);
        drawVerticalLine(9,11,18, Color.orange);
        drawVerticalLine(8,9,19, Color.orange);
        drawHorizontalLine(9, 12, 6, Color.orange);


















        





        





        

        






        
     

        











        











        









        

        









        
        
        
        
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("Charmander.jpg"));
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