package com.gilberth.framework.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import com.gilberth.game.state.State;

/**
 *
 * @author Gilberth
 */
public class InputHandler implements KeyListener, MouseListener{
    
    private State currentState;

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //No implementado.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        currentState.onKeyPress(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        currentState.onKeyRelease(e);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        currentState.onClick(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //No implementado.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //No implementado.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //No implementado.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //No implementado.
    }
    
}
