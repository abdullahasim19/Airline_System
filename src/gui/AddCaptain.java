package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import classes.GUI;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AddCaptain {

	private JFrame frame;
	private JTextField Captain_Username;
	private JTextField Captain_Name;
	private JTextField Age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCaptain window = new AddCaptain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddCaptain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 508, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel addCaptain = new JLabel("Add New Captain");
		addCaptain.setFont(new Font("Tahoma", Font.BOLD, 26));
		addCaptain.setBounds(128, 24, 233, 39);
		frame.getContentPane().add(addCaptain);
		
		JLabel captain_username = new JLabel("Username");
		captain_username.setFont(new Font("Tahoma", Font.BOLD, 17));
		captain_username.setBounds(71, 103, 107, 19);
		frame.getContentPane().add(captain_username);
		
		JLabel captainName = new JLabel("Captain Name");
		captainName.setFont(new Font("Tahoma", Font.BOLD, 17));
		captainName.setBounds(71, 146, 140, 19);
		frame.getContentPane().add(captainName);
		
		Captain_Username = new JTextField();
		Captain_Username.setBounds(241, 105, 157, 20);
		frame.getContentPane().add(Captain_Username);
		Captain_Username.setColumns(10);
		
		Captain_Name = new JTextField();
		Captain_Name.setColumns(10);
		Captain_Name.setBounds(241, 148, 157, 20);
		frame.getContentPane().add(Captain_Name);
		
		JButton add = new JButton("Add");

		add.setBackground(SystemColor.textHighlight);
		add.setFont(new Font("Tahoma", Font.BOLD, 16));
		add.setBounds(324, 308, 74, 23);
		frame.getContentPane().add(add);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 16));
		back.setBackground(Color.RED);
		back.setBounds(77, 308, 74, 23);
		frame.getContentPane().add(back);
		
		JLabel gender = new JLabel("Gender");
		gender.setFont(new Font("Tahoma", Font.BOLD, 17));
		gender.setBounds(71, 190, 140, 19);
		frame.getContentPane().add(gender);
		
		String[] strgender = {"Male", "Female"};
		
		JComboBox Gender = new JComboBox(strgender);
		Gender.setModel(new DefaultComboBoxModel(new String[] {"", "Male", "Female"}));
		Gender.setBounds(241, 190, 96, 22);
		frame.getContentPane().add(Gender);
		
		JLabel age = new JLabel("Age");
		age.setFont(new Font("Tahoma", Font.BOLD, 17));
		age.setBounds(71, 233, 140, 19);
		frame.getContentPane().add(age);
		
		Age = new JTextField();
		Age.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(!Character.isDigit(e.getKeyChar()))
				{
					e.consume();
				}
				
			}
		});
		Age.setColumns(10);
		Age.setBounds(241, 235, 157, 20);
		frame.getContentPane().add(Age);
		
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Captain_Username.getText().equals("") || Captain_Name.getText().equals("") || Age.getText().equals("") || Gender.getSelectedItem().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Information missing","Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				int ag= Integer.valueOf(Age.getText());
				
				if(ag<25)
				{
					JOptionPane.showMessageDialog(null, "Age must be 25+","Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				
				String gen;
				if(Gender.getSelectedItem().equals("Male"))
				{
					gen="M";
				}
				else
				{
					gen="F";
				}
				
				
				GUI g = new GUI();
				
				boolean b = g.addCaptain(Captain_Username.getText(),Captain_Name.getText(),Age.getText(),gen);
				if(b)
				{
					JOptionPane.showMessageDialog(null, "Captain Added Successfully","Done", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Something went wrong","Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		
	}
	
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
