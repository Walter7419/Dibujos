package ejem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class BMO {
	
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
        drawHorizontalLine(7, 17, 5, Color.black);
        drawHorizontalLine(7, 17, 6, militar);
        drawVerticalLine(6,19,6, Color.black);
        drawHorizontalLine(15, 15, 14, morado );
        drawVerticalLine(7,19,7, militar);
        drawHorizontalLine(7, 17, 20, Color.black);
        drawHorizontalLine(8, 17, 19, militar);
        drawVerticalLine(6,19,17, militar);
        drawHorizontalLine(8, 16, 7, agua);
        drawHorizontalLine(8, 16, 8, agua);
        drawHorizontalLine(8, 16, 11, agua);
        drawHorizontalLine(8, 16, 12, agua);
        drawVerticalLine(6,19,18, Color.black);
        drawHorizontalLine(8, 16, 13, militar);
        drawHorizontalLine(8, 16, 15, militar);
        drawHorizontalLine(10, 16, 16, militar);
        drawHorizontalLine(10, 14, 9, agua);
        drawHorizontalLine(8, 10, 10, agua);
        drawHorizontalLine(14, 16, 10, agua);
        drawHorizontalLine(8, 8, 9, agua);
        drawHorizontalLine(16, 16, 9, agua);
        drawHorizontalLine(9, 9, 9, Color.black);
        drawHorizontalLine(15, 15, 9, Color.black);       
        drawHorizontalLine(11, 13, 10, Color.black);
        drawHorizontalLine(8, 12, 14, Color.black);
        drawHorizontalLine(16, 16, 14, militar);
        drawHorizontalLine(8, 8, 16, militar);
        drawHorizontalLine(11, 12, 17, militar);
        drawHorizontalLine(14, 14, 17, militar);
        drawHorizontalLine(16, 16, 17, militar);
        drawHorizontalLine(8, 8, 18, militar);
        drawHorizontalLine(16, 16, 14, militar);
        drawHorizontalLine(10, 13, 18, militar);
        drawHorizontalLine(15, 16, 18, militar);
        drawHorizontalLine(8, 10, 17, Color.yellow);
        drawHorizontalLine(9, 9, 16, Color.yellow);
        drawHorizontalLine(14, 14, 18, Color.red);
        drawHorizontalLine(13, 13, 17, Color.blue);
        drawHorizontalLine(13, 14, 14, militar);
        drawHorizontalLine(9, 9, 18, Color.yellow);
        drawHorizontalLine(15, 15, 17, Color.green);
  
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("BMO.jpg"));
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