package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MainFighting extends MainMenu implements ActionListener {
	
	JButton ArrowRight;
	JButton ArrowLeft;
	JButton ArrowUp;
	JLabel background;
	ImageIcon Background1 = new ImageIcon("hill.jpg");
	ImageIcon Background2 = new ImageIcon("castle.png");
	ImageIcon Background3 = new ImageIcon("hands.jpg");
	ImageIcon Background4 = new ImageIcon("scarycastle.png");
	
	
	@SuppressWarnings("deprecation")
	MainFighting(){
		
		
		
		background = new JLabel();
		
		background.setIcon(RandomBackground());
		background.setBounds(0,0,1000,1000);
		
		
		ImageIcon ArrowRightImg = new ImageIcon("arrow right.png");
		//Border border = BorderFactory.createLineBorder(Color.green,3);
		ArrowRight = new JButton();
		ArrowRight.setIcon(ArrowRightImg);
		//ArrowLeft.setBorder(border);
		//ArrowRight.setVerticalAlignment(JLabel.TOP);
		//ArrowRight.setHorizontalAlignment(JLabel.RIGHT);
		ArrowRight.setBounds(850, 515, 100, 100);
		ArrowRight.addActionListener(this);
		
		
		ImageIcon ArrowLeftImg = new ImageIcon("arrow left.png");
		//Border border = BorderFactory.createLineBorder(Color.green,3);
		ArrowLeft = new JButton();
		ArrowLeft.setIcon(ArrowLeftImg);
		//ArrowLeft.setBorder(border);
		//ArrowLeft.setVerticalAlignment(JLabel.CENTER);
	    //ArrowLeft.setHorizontalAlignment(JLabel.LEFT);
		ArrowLeft.setBounds(30,510,100,100);
		ArrowLeft.addActionListener(this);
		
		ImageIcon ArrowUpImg = new ImageIcon("arrow up.png");
		//Border border = BorderFactory.createLineBorder(Color.green,3);
		ArrowUp = new JButton();
		ArrowUp.setIcon(ArrowUpImg);
		//ArrowLeft.setBorder(border);
		//ArrowUp.setVerticalAlignment(JLabel.CENTER);
		//ArrowUp.setHorizontalAlignment(JLabel.LEFT);
		ArrowUp.setBounds(445,0,100,100);
		ArrowUp.addActionListener(this);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exits out of the application 
		frame.setSize(1000,1000);//sets the size of the frame
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setResizable(true);
		frame.setLayout(null);
		frame.setVisible(true); //renders the gui
		
		
		frame.add(ArrowUp);
		frame.add(ArrowRight);
		frame.add(ArrowLeft);
		frame.add(background);
		
	}
	public Icon RandomBackground() {
		Random rand = new Random();
		Icon s = null;
		int x = rand.nextInt(4)+1;
		switch(x) {
		case 1: s = Background1;
		break;
		case 2: s = Background2;
		break;
		case 3: s = Background3;
		break;
		case 4: s = Background4;
		break;
		}
		
		return s;
	}
	
	
	
	public void actionPerformed(ActionEvent input) {
		if(input.getSource()==ArrowUp) {
			System.out.println("Arrow up");
			background.setIcon(RandomBackground());
		}
		
		if(input.getSource()==ArrowRight) {
			System.out.println("ArrowRight");
			background.setIcon(RandomBackground());
		}
		
		if(input.getSource()==ArrowLeft) {
			System.out.println("Arrow Left");
			background.setIcon(RandomBackground());
		}
		
	}
}
