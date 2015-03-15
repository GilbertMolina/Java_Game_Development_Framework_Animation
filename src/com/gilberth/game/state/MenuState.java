package com.gilberth.game.state;

import com.gilberth.game.main.Resources;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Gilberth
 */
public class MenuState extends State{

    @Override
    public void init() {
        System.out.println("Entered MenuState");
    }

    @Override
    public void update(float delta) {
        //No implementado.
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.welcome, 0, 0, null);
    }

    @Override
    public void onClick(MouseEvent e) {
        //No implementado.
    }

    @Override
    public void onKeyPress(KeyEvent e) {
        //No implementado.
    }

    @Override
    public void onKeyRelease(KeyEvent e) {
        //No implementado.
    }
    
}
