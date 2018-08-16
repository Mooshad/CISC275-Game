import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

import java.awt.event.*;
import javax.swing.*;

public class OverallGame extends JPanel{
	
	/**
	 * 
	 */
	
	GameState gameState;
	JFrame screen;
	final static int frameWidth = 1000;
    final static int frameHeight = 1000;
    private Collection<Handler> handlerCollection;
    private static final long serialVersionUID = 1L;
    /*
     * ImageBank contains a set of Sprite Set
     * SpriteSets contains a list of all Image Sets for a GameObject
     * Image Sets contains a list of Images for an animation of a GameObject
     *
     */
    
    public OverallGame(GameState gameState)
    {
    	super();
    	this.setBackground(Color.GRAY);
    	this.setOpaque(true);
    	this.setFocusable(true);
    	
    	this.screen = new JFrame("Super Team 6");
		this.screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.screen.setSize(frameWidth, frameHeight);
		this.screen.getContentPane().add(this);
		this.screen.setVisible(true);
		
		this.gameState = gameState;	
		
		this.handlerCollection = new LinkedList<Handler>();
		
    }
	
	public void update()
	{

		gameState.update();
		screen.repaint();
	}
	
	
	public void add(Handler handler)
	{
		handlerCollection.add(handler);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for (Handler handler : handlerCollection )
		{
			handler.paint(g);
		}			
	}
	
	public JFrame getScreen() {
		return screen;
	}

	public void setScreen(JFrame screen) {
		this.screen = screen;
	}
	
	public GameState getGameState() {
		return gameState;
	}

	public void setGameState(GameState gameState) {
		this.gameState = gameState;
	}
	
	public Collection<Handler> getHandlerCollection() {
		return handlerCollection;
	}

	


}
