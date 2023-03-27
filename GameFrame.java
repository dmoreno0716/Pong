import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;



public class GameFrame extends JFrame{
	
	GamePanel panel;
	

	GameFrame(Color _backgroundColor, Color _playerOneColor, Color _playerTwoColor){ // what holds minimize button, enlarge and quit buttons
		
		panel = new GamePanel(_playerOneColor, _playerTwoColor);
		this.add(panel);
		this.setTitle("Pong");
		this.setResizable(false);
		this.setBackground(_backgroundColor);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack(); 
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}
	
}
