/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author WyattCampbell
 */
class CharacterEnviroment extends Environment {
    
   private ButterStotch buttersBig, buttersSmall, buttersXBig;
    
    

    public CharacterEnviroment() {
        
        
        
        buttersBig = new ButterStotch(400, 100, 500, 350);
        buttersSmall = new ButterStotch(750, 100, 250, 175);
//        buttersXBig = new ButterStotch(600, 50, 750, 525 );

        
         logo = ResourceTools.loadImageFromResource("character/ButtersStotch.png");

        this.setBackground(Color.white);
    
    }
    
   
  
 Image logo;
    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
//        if (buttersSmall != null) {
//            buttersSmall.setX(e.getX());
//            buttersSmall.setY(e.getY());
//        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        
        
        graphics.drawImage(logo, 100, 200, this);
        

        if (buttersBig != null) {
            graphics.setColor(Color.black);
            buttersBig.draw(graphics);
        }
       
        if (buttersSmall != null) {
            graphics.setColor(Color.black);
            buttersSmall.draw(graphics);
        }
        
        if (buttersXBig != null) {
            graphics.setColor(Color.black);
            buttersXBig.draw(graphics);
        }
    }
    
}
