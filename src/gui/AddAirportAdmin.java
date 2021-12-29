package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import classes.GUI;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class AddAirportAdmin {

	private JFrame frame;
	private JTextField AirportID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAirportAdmin window = new AddAirportAdmin();
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
	public AddAirportAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 653, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add New Airport");
		lblNewLabel.setIcon(new ImageIcon(AddAirportAdmin.class.getResource("/imgs/airport.png")));
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 50));
		lblNewLabel.setBounds(59, 25, 520, 128);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Country");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(101, 271, 105, 60);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox<String> countries = new JComboBox<String>();
		
		
		countries.setModel(new DefaultComboBoxModel<String>(new String[] { "","Australia", "France", "Germany", "India", "Italy", "Newzland", "Pakistan", "Spain", "United Kingdom", "United States", ""}));
		countries.setBounds(271, 295, 218, 22);
		frame.getContentPane().add(countries);
		
		JLabel lblNewLabel_1_1 = new JLabel("City");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(101, 330, 105, 60);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JComboBox<String> city = new JComboBox<String>();
		city.setBounds(271, 354, 218, 22);
		frame.getContentPane().add(city);
		
		JButton add = new JButton("Add");

		add.setIcon(new ImageIcon(AddAirportAdmin.class.getResource("/imgs/add.png")));
		add.setFont(new Font("Tahoma", Font.BOLD, 18));
		add.setBounds(407, 427, 125, 45);
		frame.getContentPane().add(add);
		
		JButton cancel = new JButton("Back");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		cancel.setIcon(new ImageIcon(AddAirportAdmin.class.getResource("/imgs/close.png")));
		cancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		cancel.setBounds(59, 427, 170, 45);
		frame.getContentPane().add(cancel);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Airport ID");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1_1_1.setBounds(101, 200, 160, 60);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		AirportID = new JTextField();
		AirportID.setColumns(10);
		AirportID.setBounds(271, 225, 218, 20);
		frame.getContentPane().add(AirportID);
	
		
		
		countries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 if(countries.getSelectedItem().equals("Australia"))
				{
				 	city.removeAllItems();
					city.addItem("Sydney");
					city.addItem("Perth");
				        city.addItem("Melbourne");
				        city.addItem("Brisbane");
				}

				else 
					if(countries.getSelectedItem().equals("France"))
				{
						city.removeAllItems();
					city.addItem("Paris");
					city.addItem("Bordeaux");
				        city.addItem("Marseille");
				        city.addItem("Nantes");
				} 

				else 
					if(countries.getSelectedItem().equals("Germany"))
				{
						city.removeAllItems();
					city.addItem("Berlin");
					city.addItem("Hamburg");
				        city.addItem("Munich");
				        city.addItem("Cologne");
				}
				else 
					if(countries.getSelectedItem().equals("India"))
				{
						city.removeAllItems();
					city.addItem("Mombay");
					city.addItem("Dehli");
				        city.addItem("Ahmadabad");
				        city.addItem("Banglore");
				}

				else 
					if(countries.getSelectedItem().equals("Italy"))
				{
						city.removeAllItems();
					city.addItem("Rome");
					city.addItem("Milan");
				        city.addItem("Naples");
				        city.addItem("Turin");
				} 

				else 
					if(countries.getSelectedItem().equals("Newzland"))
				{
						city.removeAllItems();
					city.addItem("Auckland");
					city.addItem("Hamilton");
				        city.addItem("Tauranga");
				        city.addItem("Dunedin");
				}
				else 
					if(countries.getSelectedItem().equals("Pakistan"))
				{
						city.removeAllItems();
					city.addItem("Lahore");
					city.addItem("Faislabad");
				        city.addItem("Karachi");
				        city.addItem("Quetta");
				}

				else 
					if(countries.getSelectedItem().equals("Spain"))
				{
						city.removeAllItems();
					city.addItem("Barcelona");
					city.addItem("Madrid");
				        city.addItem("Seville");
				        city.addItem("Toledo");
				} 

				else 
					if(countries.getSelectedItem().equals("United Kingdom"))
				{
						city.removeAllItems();
					city.addItem("London");
					city.addItem("Manchester");
				        city.addItem("Newport");
				        city.addItem("Newcastle");
				}
				
				else 
					if(countries.getSelectedItem().equals("United States"))
				{
						city.removeAllItems();
					city.addItem("NewYorkCity");
					city.addItem("LosAngeles");
				        city.addItem("Chicago");
				        city.addItem("Houston");
				}
			}
		});
		
		
		
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// more code needed
				
				GUI g=new GUI();
				boolean b = g.addAirportButton(AirportID.getText(),(String) countries.getSelectedItem(),(String)city.getSelectedItem());
				if(b)
				{
					JOptionPane.showMessageDialog(null, "Airport added successfully","Done", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Someting went wrong","Error", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
	}
	
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}

	public void pack() {
		// TODO Auto-generated method stub
		frame.pack();
	}

	public void setLocationRelativeTo(Object object) {
		// TODO Auto-generated method stub
		frame.setLocationRelativeTo(null);
	}

	public void setExtendedState(int maximizedBoth) {
		// TODO Auto-generated method stub
		frame.setExtendedState(JFrame.NORMAL);
	}
}
