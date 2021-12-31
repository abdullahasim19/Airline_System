package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddTripAdmin {

	private JFrame frame;
	private JTextField TripName;
	private JTextField Departure;
	private JTextField Destination;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTripAdmin window = new AddTripAdmin();
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
	public AddTripAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 626, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Trip");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(210, 22, 198, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Trip Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(56, 91, 92, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Departure");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(56, 135, 92, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Destination");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(56, 185, 113, 33);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		TripName = new JTextField();
		TripName.setBounds(259, 100, 177, 20);
		frame.getContentPane().add(TripName);
		TripName.setColumns(10);
		
		Departure = new JTextField();
		Departure.setColumns(10);
		Departure.setBounds(259, 144, 177, 20);
		frame.getContentPane().add(Departure);
		
		Destination = new JTextField();
		Destination.setColumns(10);
		Destination.setBounds(259, 194, 177, 20);
		frame.getContentPane().add(Destination);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Destination");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_1.setBounds(56, 229, 113, 33);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JRadioButton Round = new JRadioButton("Round");
		Round.setHorizontalAlignment(SwingConstants.CENTER);
		Round.setFont(new Font("Tahoma", Font.BOLD, 16));
		Round.setBackground(new Color(240, 240, 240));
		Round.setBounds(245, 235, 111, 23);
		frame.getContentPane().add(Round);
		
		JRadioButton Single = new JRadioButton("Single");
		Single.setHorizontalAlignment(SwingConstants.CENTER);
		Single.setFont(new Font("Tahoma", Font.BOLD, 16));
		Single.setBackground(SystemColor.menu);
		Single.setBounds(358, 235, 113, 23);
		frame.getContentPane().add(Single);
		
		JButton Add = new JButton("Add");
		Add.setBackground(SystemColor.textHighlight);
		Add.setFont(new Font("Tahoma", Font.BOLD, 18));
		Add.setBounds(488, 323, 89, 23);
		frame.getContentPane().add(Add);
		
		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		Back.setFont(new Font("Tahoma", Font.BOLD, 18));
		Back.setBackground(Color.RED);
		Back.setBounds(56, 323, 89, 23);
		frame.getContentPane().add(Back);
	}
	
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}

}
