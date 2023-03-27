import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button, button2, button3, button4, button5, button6, button7, button8, submit,
			back1, back2, back3, back4;
	JLabel label, label2, select, background;
	
	Color backgroundColor = Color.black;
	Color playerOneColor = Color.red;
	Color playerTwoColor = Color.blue;
	
	
	
	MyFrame(){
		
		//ImageIcon icon2 = new ImageIcon("sadeyes.png");
		//labeltwo = new JLabel();
		//labeltwo.setIcon(icon2);
		//label.setVisible(false);
		
		//ImageIcon icon = new ImageIcon("hearteyes.png");
		
		
		// button 1, player 1 buttons(1-4)
		 
		label = new JLabel(); // textbox that says "P1 COLOR"
		label.setBounds(75, -100, 125, 250);
		label.setFont(new Font("Ariel", Font.ITALIC, 20));
		label.setText("P1 COLOR:");
		//label.setVisible(false);
		
		
		
		button = new JButton();
		button.setBounds(40, 165, 100, 100);
		
		button.addActionListener(this);
		//button.setText("I'm a button");
		button.setFocusable(false);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-5);
		button.setOpaque(true);
		//button.setBorderPainted(false);
		button.setBackground(Color.red);
		button.setForeground(Color.cyan);
		button.setBorder(BorderFactory.createEmptyBorder());
		

		
		//button 2
		
		
		button2 = new JButton();
		button2.setBounds(40, 50, 100, 100);
		button2.addActionListener(this);
		//button2.setText("I'm button 2");
		button2.setFocusable(false);
		button2.setHorizontalTextPosition(JButton.LEFT);
		button2.setVerticalTextPosition(JButton.CENTER);
		button2.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button2.setIconTextGap(-5);
		button2.setOpaque(true);
		button2.setBackground(Color.yellow);
		button2.setForeground(Color.orange);
		//button2.setBorder(BorderFactory.createEmptyBorder());
		
		
		//button 3
		
		button3 = new JButton();
		button3.setBounds(150, 50, 100, 100);
		button3.addActionListener(this);
		//button3.setText("I'm button 3");
		button3.setFocusable(false);
		button3.setHorizontalTextPosition(JButton.LEFT);
		button3.setVerticalTextPosition(JButton.CENTER);
		button3.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button3.setIconTextGap(-5);
		button3.setOpaque(true);
		button3.setBackground(Color.blue);
		button3.setForeground(Color.orange);
		
		
		//button 4
		
		button4 = new JButton();
		button4.setBounds(150, 165, 100, 100);
		button4.addActionListener(this);
		//button4.setText("I'm button 4");
		button4.setFocusable(false);
		button4.setHorizontalTextPosition(JButton.LEFT);
		button4.setVerticalTextPosition(JButton.CENTER);
		button4.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button4.setIconTextGap(-5);
		button4.setOpaque(true);
		button4.setBackground(Color.green);
		button4.setForeground(Color.orange);
		
		//button 5, player 2 buttons(5-8)
		
		
		label2 = new JLabel(); // textbox that says "P2 COLOR:"
		
		label2.setBounds(800, -100, 125, 250);
		label2.setFont(new Font("Ariel", Font.ITALIC, 20));
		label2.setText("P2 COLOR:");
		
				
				
		//label.setBounds(0, 100, 100, 100);
		//label.setVisible(false);
		button5 = new JButton();
		button5.setBounds(860, 50, 100, 100);
		button5.addActionListener(this);			
		//button.setText("I'm a button");
		button5.setFocusable(false);
		button5.setHorizontalTextPosition(JButton.CENTER);
		button5.setVerticalTextPosition(JButton.BOTTOM);
		button5.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button5.setIconTextGap(-5);
		button5.setOpaque(true);
		//button5.setBorderPainted(false);
		button5.setBackground(Color.blue);
		button5.setForeground(Color.cyan);
		button5.setBorder(BorderFactory.createEmptyBorder());
			
				
				//button 6
				
				
		button6 = new JButton();
		button6.setBounds(860, 165, 100, 100);
		button6.addActionListener(this);
		//button6.setText("I'm button 6");
		button6.setFocusable(false);
		button6.setHorizontalTextPosition(JButton.LEFT);
		button6.setVerticalTextPosition(JButton.CENTER);
		button6.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button6.setIconTextGap(-5);
		button6.setOpaque(true);
		button6.setBackground(Color.green);
		button6.setForeground(Color.orange);
			
				
				//button 7
				
		button7 = new JButton();
		button7.setBounds(750, 50, 100, 100);
		button7.addActionListener(this);
		//button7.setText("I'm button 7");
		button7.setFocusable(false);
		button7.setHorizontalTextPosition(JButton.LEFT);
		button7.setVerticalTextPosition(JButton.CENTER);
		button7.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button7.setIconTextGap(-5);
		button7.setOpaque(true);
		button7.setBackground(Color.yellow);
		button7.setForeground(Color.orange);
				
				
				//button 8
				
		button8 = new JButton();
		button8.setBounds(750, 165, 100, 100);
		button8.addActionListener(this);
		//button8.setText("I'm button 8");
		button8.setFocusable(false);				
		button8.setHorizontalTextPosition(JButton.LEFT);
		button8.setVerticalTextPosition(JButton.CENTER);
		button8.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button8.setIconTextGap(-5);
		button8.setOpaque(true);				
		button8.setBackground(Color.red);
		button8.setForeground(Color.orange);
		
		//background color buttons
		
		
		
		back1 = new JButton();
		back1.setBounds(390, 225, 90, 90);
		back1.addActionListener(this);
		//back1.setText("I'm background color 1");
		back1.setFocusable(false);				
		back1.setHorizontalTextPosition(JButton.LEFT);
		back1.setVerticalTextPosition(JButton.CENTER);
		back1.setFont(new Font("Comic Sans", Font.BOLD, 25));
		back1.setIconTextGap(-5);
		back1.setOpaque(true);				
		back1.setBackground(Color.orange);
		back1.setForeground(Color.orange);
		
		
		
		
		back2 = new JButton();
		back2.setBounds(500, 225, 90, 90);
		back2.addActionListener(this);
		//back2.setText("I'm background color 2");
		back2.setFocusable(false);				
		back2.setHorizontalTextPosition(JButton.LEFT);
		back2.setVerticalTextPosition(JButton.CENTER);
		back2.setFont(new Font("Comic Sans", Font.BOLD, 25));
		back2.setIconTextGap(-5);
		back2.setOpaque(true);				
		back2.setBackground(Color.magenta);
		back2.setForeground(Color.orange);
		
		
		back3 = new JButton();
		back3.setBounds(500, 120, 90, 90);
		back3.addActionListener(this);
		//back3.setText("I'm background color 3");
		back3.setFocusable(false);				
		back3.setHorizontalTextPosition(JButton.LEFT);
		back3.setVerticalTextPosition(JButton.CENTER);
		back3.setFont(new Font("Comic Sans", Font.BOLD, 25));
		back3.setIconTextGap(-5);
		back3.setOpaque(true);				
		back3.setBackground(Color.black);
		back3.setForeground(Color.orange);
		

		back4 = new JButton();
		back4.setBounds(390, 120, 90, 90);
		back4.addActionListener(this);
		//back4.setText("I'm background color 4");
		back4.setFocusable(false);				
		back4.setHorizontalTextPosition(JButton.LEFT);
		back4.setVerticalTextPosition(JButton.CENTER);
		back4.setFont(new Font("Comic Sans", Font.BOLD, 25));
		back4.setIconTextGap(-5);
		back4.setOpaque(true);				
		back4.setBackground(Color.gray);
		back4.setForeground(Color.orange);
		
		
		
		
		background = new JLabel(); // textbox that says "Background color:"
		background.setBounds(385, -110, 250, 400);
		background.setFont(new Font("Ariel", Font.ITALIC, 20));
		background.setText("BACKGROUND COLOR:");
		
		
		// finish button; submit button
		
		submit = new JButton();
		submit.setBounds(325, 375, 350, 50);
		submit.addActionListener(this);
		submit.setText("FINISH");
		submit.setFocusable(false);				
		submit.setHorizontalTextPosition(JButton.LEFT);
		submit.setVerticalTextPosition(JButton.CENTER);
		submit.setFont(new Font("Comic Sans", Font.BOLD, 40));
		submit.setIconTextGap(-5);
		submit.setOpaque(true);				
		submit.setBackground(Color.red);
		submit.setForeground(Color.orange);
		
		select = new JLabel(); // text box that says "Please Select..."
		select.setBounds(400, -110, 200, 275);
		select.setFont(new Font("Ariel", Font.BOLD, 25));
		select.setText("Please Select...");
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1000, 555);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		this.add(label2);
		this.add(select);
		this.add(background);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(submit);
		this.add(back1);
		this.add(back2);
		this.add(back3);
		this.add(back4);	
		
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			setPlayer1Color(Color.red);
		}
		if(e.getSource() == button2) {
			setPlayer1Color(Color.yellow);
		}
		if(e.getSource() == button3) {
			setPlayer1Color(Color.blue);
		}
		if(e.getSource() == button4) {
			setPlayer1Color(Color.green);
		}
		if(e.getSource() == button5) {
			setPlayer2Color(Color.blue);
		}
		if(e.getSource() == button6) {
			setPlayer2Color(Color.green);
		}
		if(e.getSource() == button7) {
			setPlayer2Color(Color.yellow);
		}
		if(e.getSource() == button8) {
			setPlayer2Color(Color.red);
		}
		if(e.getSource() == submit) {
			GameFrame frame = new GameFrame(backgroundColor, playerOneColor, playerTwoColor);

			this.dispose();
		}
		if(e.getSource() == back1) {
			setBackgroundColor(Color.orange);
		}
		if(e.getSource() == back2) {
			setBackgroundColor(Color.magenta);
		}
		if(e.getSource() == back3) {
			setBackgroundColor(Color.black);
		}
		if(e.getSource() == back4) {
			setBackgroundColor(Color.gray);
		}
		
	}
	
	public Color getBackgroundColor() {
		return backgroundColor;
	}
	
	public void setBackgroundColor(Color newColor) {
		backgroundColor = newColor;
		System.out.println("the color is changed");
	}
	
	public Color getPlayer1Color() {
		return playerOneColor;
	}
	
	public void setPlayer1Color(Color newColor) {
		playerOneColor = newColor;
	}
	
	public Color getPlayer2Color() {
		return playerTwoColor;
	}
	
	public void setPlayer2Color(Color newColor) {
		playerTwoColor = newColor;
	}
	

	

}
