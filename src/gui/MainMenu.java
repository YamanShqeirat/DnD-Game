package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import players.Player;

public class MainMenu extends JFrame implements ActionListener{
	
	Player person = new Player();
	
	//All Buttons and shit
	JButton StartGame;
	
	JComboBox stats;
	JTextField pickYourClass;
	JTextField pickYourRace;
	JTextField NameBox;
	
	JRadioButton OrcButton;
	JRadioButton HumanButton;
	JRadioButton DragonBornButton;
	JRadioButton ElfButton;
	
	JRadioButton BarbButton;
	JRadioButton ClericButton;
	JRadioButton FigterButton;
	JRadioButton PaladinButton;
	
	
	
	
	
	@SuppressWarnings("unchecked")
	MainMenu(){
		String[] stat = {person.StringStrength(), person.StringDexterity(), person.StringCharisma(), person.StringConstitution(), person.StringWisdom(), person.StringIntelligence()};
		stats = new JComboBox(stat);
		
		NameBox = new JTextField();
		NameBox.setText("Type your Name");
		
		pickYourClass = new JTextField();
		pickYourClass.setText("Pick Your Class");
		pickYourClass.setEditable(false);
		
		pickYourRace = new JTextField();
		pickYourRace.setText("Select Your Race");
		pickYourClass.setEditable(false);
		
		
		StartGame = new JButton();
		StartGame.setBounds(250,800,500,100);//x,y coordinate to position length and width to resize
		StartGame.addActionListener(this);
		StartGame.setText("Start Game");
		
		OrcButton = new JRadioButton("Orc");
		OrcButton.addActionListener(this); 
		HumanButton = new JRadioButton("Human");
		HumanButton.addActionListener(this); 
		DragonBornButton = new JRadioButton("DragonBorn");
		DragonBornButton.addActionListener(this); 
		ElfButton = new JRadioButton("Elf");
		ElfButton.addActionListener(this); 
		
		BarbButton = new JRadioButton("Barbarian");
		BarbButton.addActionListener(this); 
		ClericButton = new JRadioButton("Cleric");
		ClericButton.addActionListener(this); 
		FigterButton = new JRadioButton("Figter");
		FigterButton.addActionListener(this); 
		PaladinButton = new JRadioButton("Paladin");
		PaladinButton.addActionListener(this); 
		
		
		
		ButtonGroup classes = new ButtonGroup();
		classes.add(BarbButton);
		classes.add(ClericButton);
		classes.add(FigterButton);
		classes.add(PaladinButton);
		
		ButtonGroup races = new ButtonGroup();
		races.add(OrcButton);
		races.add(HumanButton);
		races.add(DragonBornButton);
		races.add(ElfButton);
		
		
		
		this.setSize(450,200);//sets the size of the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exits out of the application 
		this.setTitle("DND Adventure"); //Title of frame
		this.setResizable(false);//prevents frame from being resized 
		this.setVisible(true); //renders the gui
		this.setLayout(new FlowLayout()); // needed to not make button big for some reason
	
		this.add(pickYourRace);
		this.add(OrcButton);
		this.add(HumanButton);
		this.add(DragonBornButton);
		this.add(ElfButton);
		
		this.add(pickYourClass);
		this.add(BarbButton);
		this.add(ClericButton);
		this.add(FigterButton);
		this.add(PaladinButton);
		
		this.add(stats);
		
		this.add(NameBox);
		
		
		this.add(StartGame);
	}
	
	
	
	
	
	
	
	
	
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent input) {
	
		//Races button events
		
		
		if(input.getSource() == OrcButton) { //OrcButton event
			System.out.println("OrcButton");
		//	HumanButton.setVisible(false);
			//DragonBornButton.setVisible(false);
			//ElfButton.setVisible(false);
			person.setRace("Orc");
			
		}
		if(input.getSource() == HumanButton) { //HumanButton event
			System.out.println("HumanButton");
			//OrcButton.setVisible(false);
		//	DragonBornButton.setVisible(false);
			//ElfButton.setVisible(false);
			person.setRace("Human");
		}
		if(input.getSource() == DragonBornButton) { //DragonBornButton event
			System.out.println("DragonBornButton");
			//OrcButton.setVisible(false);
			//HumanButton.setVisible(false);
			//ElfButton.setVisible(false);
			person.setRace("DragonBorn");
			
		}
		if(input.getSource() == ElfButton) { //ElfButton event
			System.out.println("ElfButton");
			//OrcButton.setVisible(false);
			//HumanButton.setVisible(false);
			//DragonBornButton.setVisible(false);
			person.setRace("Elf");
			
		}
		
		
		
		//Classes button events
		
		
		if(input.getSource() == BarbButton) { //OrcButton event
			System.out.println("BarbButton");
			//ClericButton.setVisible(false);
			//FigterButton.setVisible(false);
			//PaladinButton.setVisible(false);
			person.setClasses("Barbarian");
		}
		if(input.getSource() == ClericButton) { //OrcButton event
			System.out.println("ClericButton");
			//FigterButton.setVisible(false);
			//PaladinButton.setVisible(false);
			//BarbButton.setVisible(false);
			person.setClasses("Cleric");
		}
		if(input.getSource() == FigterButton) { //OrcButton event
			System.out.println("FigterButton");
			//PaladinButton.setVisible(false);
			//BarbButton.setVisible(false);
			//ClericButton.setVisible(false);
			person.setClasses("Fighter");
		}
		if(input.getSource() == PaladinButton) { //OrcButton event
			System.out.println("PaladinButton");
			//FigterButton.setVisible(false);
			//BarbButton.setVisible(false);
			//ClericButton.setVisible(false);
			person.setClasses("Paladin");
		}
		
		//Start Game buton event
		if(input.getSource() == StartGame) {
			person.setName(NameBox.getText());
			System.out.println(person.toString());
			new MainFighting();
			this.dispose(); 
			//create new gui with fight logic and battles
		}
		
		
	};
}
