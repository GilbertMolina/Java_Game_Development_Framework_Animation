package com.gilberth.game.main;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Gilberth
 */
public class Resources {
    
    public static BufferedImage welcome, iconImage;
    
    public static void load(){
        welcome = loadImage("welcome.png");
        iconImage = loadImage("iconImage.png");
    }
    
    private static AudioClip loadSound(String filename){
        URL fileURL = Resources.class.getResource("/resources/" + filename);
        return Applet.newAudioClip(fileURL);
    }
    
    private static BufferedImage loadImage(String filename){
        BufferedImage img = null;
        try {
            img = ImageIO.read(Resources.class.getResourceAsStream("/resources/" + filename));
        } catch (Exception e) {
            System.out.println("Error while reading: " + filename);
            e.printStackTrace();
        }
        return img;
    }
    
}
