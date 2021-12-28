package gui;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import classes.GUI;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookingPage {

	private JFrame frame;
	private JTextField time;
	private JTextField date;
	private JPasswordField passwordField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingPage window = new BookingPage();
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
	public BookingPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1100, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		DefaultListModel<String>l1=new DefaultListModel<>();
		l1.addElement("Karachi");
		l1.addElement("Lahore");
		
		JLabel lblNewLabel = new JLabel("Available Trips");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(354, 25, 136, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book Trip");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(144, 0, 95, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Select Number of People");
		lblNewLabel_2.setBounds(10, 82, 161, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSpinner seats = new JSpinner();
		seats.setBounds(170, 79, 30, 20);
		frame.getContentPane().add(seats);
		
		JLabel lblNewLabel_3 = new JLabel("Select Time");
		lblNewLabel_3.setBounds(10, 122, 78, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Select Date");
		lblNewLabel_4.setBounds(10, 147, 65, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		time = new JTextField();
		time.setBounds(85, 119, 86, 20);
		frame.getContentPane().add(time);
		time.setColumns(10);
		
		date = new JTextField();
		date.setBounds(85, 144, 86, 20);
		frame.getContentPane().add(date);
		date.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Choose Payment Method");
		lblNewLabel_5.setBounds(10, 186, 190, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton cash = new JRadioButton("Cash");
		cash.setBounds(6, 207, 95, 23);
		frame.getContentPane().add(cash);
		
		JRadioButton credit = new JRadioButton("Credit");
		credit.setBounds(116, 207, 109, 23);
		frame.getContentPane().add(credit);
		
		JLabel lblNewLabel_6 = new JLabel("Enter Password to Confirm");
		lblNewLabel_6.setBounds(10, 244, 161, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(181, 237, 102, 20);
		frame.getContentPane().add(passwordField);
		
		JButton booktrip = new JButton("Book Trip");
		booktrip.setBounds(85, 432, 89, 23);
		frame.getContentPane().add(booktrip);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(293, 75, 730, 274);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
	
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Trip ID","Departure", "Destination",  "Time", "Date", "Available Seats"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, true, true, true, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		JComboBox departure = new JComboBox();
		departure.setBounds(106, 269, 65, 22);
		frame.getContentPane().add(departure);
		
		JLabel lblNewLabel_7 = new JLabel("Departure");
		lblNewLabel_7.setBounds(20, 269, 81, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JComboBox destination = new JComboBox();
		destination.setBounds(106, 302, 67, 22);
		frame.getContentPane().add(destination);
		
		JLabel lblNewLabel_8 = new JLabel("Destination");
		lblNewLabel_8.setBounds(20, 306, 81, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Plane Type");
		lblNewLabel_9.setBounds(20, 348, 68, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JComboBox planetype = new JComboBox();
		planetype.setBounds(106, 344, 65, 22);
		frame.getContentPane().add(planetype);
		
		JButton btnNewButton = new JButton("View Trips");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI g=new GUI();
				g.displayTrips(table);
			}
		});
		btnNewButton.setBounds(581, 375, 171, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(401, 492, 95, 23);
		frame.getContentPane().add(btnNewButton_1);
		table.getColumnModel().getColumn(5).setPreferredWidth(93);
		
		
		
		
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
