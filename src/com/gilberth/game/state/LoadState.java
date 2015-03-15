package com.gilberth.game.state;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import com.gilberth.game.main.Resources;

/**
 *
 * @author Gilberth
 */
public class LoadState extends State{

    @Override
    public void init() {
        Resources.load();
        System.out.println("Loaded Successfully");
    }

    @Override
    public void update(float delta) {
        setCurrentState(new MenuState());
    }

    @Override
    public void render(Graphics g) {
        //No implementado.
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
