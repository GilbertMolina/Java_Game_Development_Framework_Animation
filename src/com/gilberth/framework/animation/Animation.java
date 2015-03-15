package com.gilberth.framework.animation;

import java.awt.Graphics;

/**
 *
 * @author Gilberth Molina
 */
public class Animation {
    
    private Frame[] frames;
    private double[] frameEndTimes;
    private int currentFrameIndex;
    
    private double totalDuration = 0, currentTime = 0;
    
    public Animation(Frame... frames){
        this.frames = frames;
        frameEndTimes = new double[frames.length];
        
        for (int i = 0; i < frames.length; i++) {
            Frame f = frames[i];
            totalDuration += f.getDuration();
            frameEndTimes[i] = totalDuration;
        }
    }
    
    public synchronized void update(float increment){
        currentTime += increment;
        if (currentTime > totalDuration) {
            wrapAnimation();
        }
        while (currentTime > frameEndTimes[currentFrameIndex]) {            
            currentFrameIndex++;
        }
    }
    
    public synchronized void wrapAnimation(){
        currentFrameIndex = 0;
        currentTime %= totalDuration;
    }
    
    public synchronized void render(Graphics g, int x, int y){
        g.drawImage(frames[currentFrameIndex].getImage(), x, y, null);
    }
    
    public synchronized void render(Graphics g, int x, int y, int width, int height){
        g.drawImage(frames[currentFrameIndex].getImage(), x, y, width, height, null);
    }
    
}
