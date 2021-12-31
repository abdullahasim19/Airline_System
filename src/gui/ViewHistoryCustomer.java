package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import classes.Customer;
import classes.GUI;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ViewHistoryCustomer {

	private JFrame frame;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton Back;
	private Customer customer;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	public ViewHistoryCustomer(Customer c)
	{
		this.customer=c;
		initialize();
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewHistoryCustomer window = new ViewHistoryCustomer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void showHistory(JTable table)
	{
		GUI g=new GUI();
		g.viewHistory(customer.getUsername(), table);
	}
	/**
	 * Create the application.
	 */
	public ViewHistoryCustomer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 779, 711);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BookingPage History");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(63, 24, 568, 70);
		frame.getContentPane().add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(90, 124, 428, 309);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Trip ID", "Trip Departure", "Trip Destination"
			}
		));
		showHistory(table); //displaying
		
		Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
			}
		});
		Back.setFont(new Font("Tahoma", Font.BOLD, 14));
		Back.setBounds(334, 634, 89, 23);
		frame.getContentPane().add(Back);
		
		lblNewLabel_1 = new JLabel("Select Trip to give feedback");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(141, 470, 210, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox trips = new JComboBox();
		trips.setBounds(396, 475, 72, 22);
		frame.getContentPane().add(trips);
		
		GUI g=new GUI();
		g.showUserTrips(trips, customer.getUsername());
		
		btnNewButton = new JButton("Give Feedback");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeedbackGUI ff=new FeedbackGUI(customer.getUsername(),(int)trips.getSelectedItem());
				ff.setVisible(true);
			}
		});
		btnNewButton.setBounds(188, 533, 280, 23);
		frame.getContentPane().add(btnNewButton);
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
