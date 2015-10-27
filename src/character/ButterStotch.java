/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author WyattCampbell
 */
public class ButterStotch {
    
    public void draw(Graphics graphics){
        graphics.drawRect(x, y, width, height);
        
//       AffineTransform
        
//        Rotate Format
//        Graphics2D g2d = (Graphics2D) graphics;
//        g2d.rotate(Math.toRadians(45));
//        g2d.fillOval(x-100, y+200, width/6, height/6);
//        g2d.rotate(Math.toRadians(-45));
        
//        Body
        graphics.setColor(new Color(85,209,168));
        graphics.fillRect(x + (width * 1/4), y + (height * 1/2), width/2, height/3);
        graphics.fillRect(x + (width * 1/4), y + (height * 3/5), width/2, height/10);
        
//        shirt
        graphics.setColor(Color.black);
        graphics.fillRect(x + (width * 49/100), y + (height * 1/2), width/75, height/3);
        
//        Left Arm need to rotate rectangles
//        graphics.setColor(new Color(85,209,168));
//        graphics.fillOval(x + (width * 1/9), y + (height * 1/3), width/10, height/10);
//        graphics.fillRect(x + x/2 + x/56, y + y + y + y, width/10, height/10);
//        graphics.fillRect(x + x/2 , y + y + y + y + y/3, width/10, height/10);
        
//        Right Arm need to rotate rectangles
//        graphics.setColor(new Color(85,209,168));
//        graphics.fillOval(x + x/10 , y + y + y + y + y/4, width/10, height/10);
//        graphics.fillRect(x + x/10, y + y + y + y, width/10, height/10);
//        graphics.fillRect(x+ x/9 , y + y + y + y + y/3, width/10, height/10);
        
//        Hands
        graphics.setColor(new Color(255,218,185));
        graphics.fillOval(x + (width * 35/100), y + (height * 4/6), height/11, height/11);
        graphics.fillOval(x + (width * 52/100), y + (height * 4/6), height/11, height/11);
        
//        Fingers
        graphics.setColor(new Color(255,218,185));
        graphics.fillOval(x+ (width * 36/100), y + (height *4/6), height/30, height/30);
        graphics.fillOval(x+ (width * 60/100), y + (height *4/6), height/30, height/30);
        graphics.setColor(new Color(0,0,0, 50));
        graphics.drawOval(x+ (width * 36/100), y + (height *4/6), height/30, height/30);
        graphics.drawOval(x+ (width * 60/100), y + (height *4/6), height/30, height/30);

        
        
//        Head
        graphics.setColor(new Color(255,218,185));
        graphics.fillOval(x+ (width * 1/8), y + (height * 3/20), height/2, height/2);
        
//        Eyes
        graphics.setColor(Color.white);
        graphics.fillOval(x + (width * 5/16), y + (height * 5/16), width/6, height/6);
        graphics.fillOval(x + (width * 7/16), y + (height * 5/16), width/6, height/6);
        graphics.setColor(Color.black);
        graphics.fillOval(x+ (width * 6/16), y + (height * 6/16), height/50, height/50);
        graphics.fillOval(x + (width * 8/16), y + (height * 6/16), height/50, height/50);
        
//        Eyebrows
        
        graphics.setColor(Color.black);
        graphics.fillRect(x + (width * 10/32), y + (height * 9/32), width/8, height/100);
        graphics.fillRect(x + (width * 16/32), y + (height * 9/32), width/8, height/100);
        
//        Mouth
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 13/32), y + (height * 34/64), width/10, height/20);
        graphics.setColor(new Color(255,218,185));
        graphics.fillRect(x + (width * 13/32), y + (height * 36/64) , width/5, height/20);
        
//        Hair
        int[] xS = new int[4];
        xS[0] = x + (width * 3/16);
        xS[1] = x + (width * 5/16);
        xS[2] = x + (width * 3/12);
        xS[3] = x + (width * 6/12);
        
        int[] yS = new int[4];
        yS[0] = y + (height * 1/9);
        yS[1] = y + (height * 2/9);
        yS[2] = y + (height * 3/9);
        yS[3] = y + (height * 2/9);
//      Hair 2 
       int[] xS2 = new int[4];
       xS2[0] = x + (width * 12/16);
       xS2[1] = x + (width * 11/16);
       xS2[2] = x + (width * 8/12);
       xS2[3] = x + (width * 6/12);
       
       int[] yS2 = new int[4];
       yS2[0] = y + (height * 1/9);
       yS2[1] = y + (height * 2/9);
       yS2[2] = y + (height * 3/9);
       yS2[3] = y + (height * 2/9); 
       
       int[] xS3 = new int[4];
       xS3[0] = x + (width * 1/2);
       xS3[1] = x + (width * 14/16);
       xS3[2] = x + (width * 8/12);
       xS3[3] = x + (width * 4/12);
       
       int[] yS3 = new int[4];
       yS3[0] = y + (height * 1/9);
       yS3[1] = y + (height * 2/9);
       yS3[2] = y + (height * 2/9);
       yS3[3] = y + (height * 2/9);
       
       int[] xS4 = new int[4];
       xS4[0] = x + (width * 12/16);
       xS4[1] = x + (width * 8/16);
       xS4[2] = x + (width * 8/12);
       xS4[3] = x + (width * 6/12);
       
       int[] yS4 = new int[4];
       yS4[0] = y + (height * 1/18);
       yS4[1] = y + (height * 2/18);
       yS4[2] = y + (height * 3/18);
       yS4[3] = y + (height * 2/9); 
       
       int[] xS5 = new int[4];
       xS5[0] = x + (width * 3/16);
       xS5[1] = x + (width * 10/16);
       xS5[2] = x + (width * 3/9);
       xS5[3] = x + (width * 6/12);
       
       int[] yS5 = new int[4];
       yS5[0] = y + (height * 1/18);
       yS5[1] = y + (height * 3/18);
       yS5[2] = y + (height * 2/18);
       yS5[3] = y + (height * 2/9); 
       
        
       graphics.setColor(Color.yellow);
        graphics.fillPolygon(xS, yS, 4);
        graphics.fillPolygon(xS2, yS2, 4);
        graphics.fillPolygon(xS3, yS3, 4);
        graphics.fillPolygon(xS4, yS4, 4);
        graphics.fillPolygon(xS5, yS5, 4);
        graphics.fillRect(x + (width * 6/18), y + (height * 7/64), width/5, height/12);
        
//        Pants
        graphics.setColor(new Color(20,72,50));
        graphics.fillRect(x + (width * 1/4), y + (height * 4/5), width/2, height/16);
        
//        Shoes
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 7/32), y + (height * 67/80), width/4, height/20);
        graphics.setColor(new Color(32,32,32));
        graphics.drawOval(x + (width * 7/32), y + (height * 67/80), width/4, height/20);
       
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 16/32), y + (height * 67/80), width/4, height/20);
        graphics.setColor(new Color(32,32,32));
        graphics.drawOval(x + (width * 16/32), y + (height * 67/80), width/4, height/20);
        
        
    }
    
    private Grid grid;
    private static final int ROWS = 10;
    private static final int Columns = 10;
    
    private boolean design = false;
    
    public ButterStotch(int x, int y, int height, int width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;

        
    }
    
    
    private int x;
    private int y;
    private int height;
    private int width;

    /**
     * @return the design
     */
    public boolean isDesign() {
        return design;
    }

    /**
     * @param design the design to set
     */
    public void setDesign(boolean design) {
        this.design = design;
    }


  
    
}
