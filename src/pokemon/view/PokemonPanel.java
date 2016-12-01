package pokemon.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokemonSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		this.updateButton = new JButton("Update the stats!");
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 504, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -179, SpringLayout.EAST, this);
		this.nameField = new JTextField(25);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, -28, SpringLayout.EAST, this);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 63, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameField, -8, SpringLayout.NORTH, numberField);
		this.advancedArea = new JTextArea(10, 25);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -17, SpringLayout.NORTH, updateButton);
		this.pokemonSelector = new JComboBox(new String [] {"Charmander", "Pickachu", "Eevee", "Charizard", "Snorlax"});
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonSelector, 40, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonSelector, 42, SpringLayout.WEST, this);
		this.advancedLabel = new JLabel("Advanced Info");
		this.combatLabel = new JLabel("Combat Points: ");
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, -6, SpringLayout.NORTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatField, 6, SpringLayout.EAST, combatLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 18, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, combatLabel, -324, SpringLayout.EAST, this);
		this.healthLabel = new JLabel("Health Points: ");
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, -6, SpringLayout.NORTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 6, SpringLayout.EAST, healthLabel);
		this.speedLabel = new JLabel("Speed Rate: ");
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, -6, SpringLayout.NORTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 6, SpringLayout.EAST, speedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 15, SpringLayout.SOUTH, combatField);
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 0, SpringLayout.WEST, healthLabel);
		this.numberLabel = new JLabel("Pokemon Number: ");
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 14, SpringLayout.SOUTH, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 18, SpringLayout.SOUTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, -307, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 6, SpringLayout.EAST, numberLabel);
		this.nameLabel = new JLabel("My name is: ");
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -20, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, nameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -6, SpringLayout.WEST, nameField);
		this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, JLabel.CENTER);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.GRAY);
		
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
		
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		this.add(pokemonSelector);
		this.add(healthField);
		this.add(healthLabel);
		this.add(combatField);
		this.add(combatLabel);
		this.add(speedField);
		this.add(speedLabel);
		this.add(nameField);
		this.add(nameLabel);
		this.add(numberField);
		this.add(numberLabel);
		this.add(advancedLabel);
		this.add(advancedArea);
		this.add(pokemonLabel);
		this.add(updateButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, 0, SpringLayout.NORTH, advancedLabel);
		baseLayout.putConstraint(SpringLayout.EAST, pokemonLabel, -67, SpringLayout.WEST, advancedLabel);
		baseLayout.putConstraint(SpringLayout.EAST, advancedArea, -96, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedLabel, 289, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, advancedLabel, -402, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
