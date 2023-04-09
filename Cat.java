package ejem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Cat {
	
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
        drawHorizontalLine(6, 6, 1, Color.BLUE);
        drawHorizontalLine(12, 12, 1, Color.BLUE);
        drawHorizontalLine(5,5, 2, Color.BLUE);
        drawHorizontalLine(11, 11, 2, Color.BLUE);
        drawHorizontalLine(5, 5, 3, Color.BLUE);
        drawVerticalLine(4, 5, 4, Color.BLUE);
        drawVerticalLine(6, 8, 3, Color.BLUE);
        drawVerticalLine(9, 12, 2, Color.BLUE);
        drawVerticalLine(13, 19, 1, Color.BLUE);
        drawVerticalLine(20, 20, 2, Color.BLUE);
        drawVerticalLine(21, 21, 3, Color.BLUE);
        drawVerticalLine(22, 22, 5, Color.BLUE);
        drawVerticalLine(22, 22, 11, Color.BLUE);
        drawVerticalLine(16, 16, 20, Color.BLUE);
        drawVerticalLine(15, 15, 21, Color.BLUE);
        drawVerticalLine(17, 18, 21, Color.BLUE);
        drawVerticalLine(1, 1, 7, Color.black);
        drawVerticalLine(2, 3, 6, Color.black);
        drawVerticalLine(4, 5, 5, Color.black);
        drawVerticalLine(6, 8, 3, Color.black);
        drawVerticalLine(9, 12, 3, Color.black);
        drawVerticalLine(20, 20, 2, Color.black);
        drawVerticalLine(18, 22, 6, Color.black);
        drawHorizontalLine(4, 5, 21, Color.black);
        drawVerticalLine(18, 22, 6, Color.black);
        drawVerticalLine(7, 7, 7, Color.black);
        drawVerticalLine(2, 2, 8, Color.black);
        drawVerticalLine(19, 22, 8, Color.black);
        drawVerticalLine(22, 22, 7, Color.black);
        drawVerticalLine(21, 21, 9, Color.black);
        drawVerticalLine(8, 8, 9, Color.black);
        drawHorizontalLine(9, 11, 3, Color.black);
        drawHorizontalLine(10, 10, 7, Color.black);
        drawHorizontalLine(11, 11, 8, Color.black);
        drawHorizontalLine(9, 11, 21, Color.black);
        drawVerticalLine(19, 22, 12, Color.black);
        drawVerticalLine(2, 2, 12, Color.black);
        drawVerticalLine(1, 1, 13, Color.black);
        drawVerticalLine(7, 7, 13, Color.black);
        drawVerticalLine(22, 22, 13, Color.black);
        drawVerticalLine(2, 3, 14, Color.black);
        drawVerticalLine(18, 22, 14, Color.black);
        drawVerticalLine(4, 5, 15, Color.black);
        drawVerticalLine(21, 21, 15, Color.black);
        drawHorizontalLine(15, 22, 21, Color.black);
        drawVerticalLine(6, 8, 16, Color.black);
        drawVerticalLine(9, 12, 17, Color.black);
        drawVerticalLine(20, 20, 17, Color.black);
        drawVerticalLine(13, 19, 18, Color.black);
        drawHorizontalLine(19, 21, 19, Color.black);
        drawHorizontalLine(22, 23, 15, Color.black);
        drawVerticalLine(16, 16, 20, Color.black);
        drawVerticalLine(17, 18, 22, Color.black);
        drawVerticalLine(20, 20, 23, Color.black);
        drawVerticalLine(16, 19, 24, Color.black);
        drawVerticalLine(1, 1, 8, Color.PINK);
        drawVerticalLine(2, 2, 9, Color.PINK);
        drawVerticalLine(1, 1, 14, Color.PINK);
        drawVerticalLine(2, 3, 15, Color.PINK);
        drawVerticalLine(4, 5, 16, Color.PINK);
        drawVerticalLine(6, 8, 17, Color.PINK);
        drawVerticalLine(9, 12, 18, Color.PINK);
        drawVerticalLine(13, 18, 19, Color.PINK);
        drawVerticalLine(22, 22, 9, Color.PINK);
        drawVerticalLine(22, 22, 15, Color.PINK);
        drawVerticalLine(15, 15, 24, Color.PINK);
        drawVerticalLine(21, 21, 23, Color.PINK);
        drawVerticalLine(20, 20, 24, Color.PINK);
        drawVerticalLine(16, 19, 25, Color.PINK);
        drawVerticalLine(8, 8, 6, Color.ORANGE);
        drawVerticalLine(8, 8, 14, Color.ORANGE);
        drawHorizontalLine(6, 6, 4, Color.gray);
        drawHorizontalLine(5, 5, 6, Color.GRAY);
        drawHorizontalLine(4, 4, 9, Color.gray);
        drawHorizontalLine(4, 4, 10, Color.gray);
        drawHorizontalLine(3, 4, 13, Color.gray);
        drawHorizontalLine(3, 3, 14, Color.gray);
        drawHorizontalLine(3, 4, 16, Color.gray);
        drawHorizontalLine(3, 3, 19, Color.gray);
        drawHorizontalLine(4, 4, 20, Color.gray);
        drawHorizontalLine(8, 8, 3, Color.gray);
        drawHorizontalLine(6, 6, 4, Color.gray);
        drawHorizontalLine(9, 11, 4, Color.gray);
        drawHorizontalLine(12, 12, 3, Color.gray);
        drawHorizontalLine(14, 14, 4, Color.gray);
        drawHorizontalLine(15, 15, 6, Color.gray);
        drawHorizontalLine(16, 16, 9, Color.gray);
        drawHorizontalLine(16, 16, 10, Color.gray);
        drawHorizontalLine(16, 17, 13, Color.gray);
        drawHorizontalLine(17, 17, 14, Color.gray);
        drawHorizontalLine(16, 17, 16, Color.gray);
        drawHorizontalLine(17, 17, 17, Color.gray);
        drawHorizontalLine(17, 17, 19, Color.gray);
        drawHorizontalLine(16, 16, 20, Color.gray);
        drawHorizontalLine(21, 21, 20, Color.gray);
        drawHorizontalLine(23, 23, 17, Color.gray);
        drawVerticalLine(13, 19, 2, Color.black);
        drawVerticalLine(6, 8, 4, Color.black);
        drawVerticalLine(6, 8, 3, Color.blue);
        drawVerticalLine(16, 19, 25, Color.pink);
        drawVerticalLine(13, 19, 2, Color.black);
        drawVerticalLine(20, 20, 3, Color.black);
        drawVerticalLine(20, 20, 2, Color.blue);
        drawVerticalLine(16, 16, 20, Color.blue);
        drawVerticalLine(16, 16, 21, Color.black);







        







        




































        

        



        



















        

        








 

        












        
        
  
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("Cat.jpg"));
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