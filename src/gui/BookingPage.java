package gui;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
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

import classes.Booking;
import classes.Customer;
import classes.GUI;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

public class BookingPage {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTable table;
	private Customer customer;

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
	public BookingPage(Customer c)
	{
		this.customer=c;
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
		lblNewLabel_2.setBounds(6, 60, 161, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSpinner seats = new JSpinner();
		seats.setBounds(164, 57, 44, 20);
		frame.getContentPane().add(seats);
		
		JLabel lblNewLabel_4 = new JLabel("Select Date");
		lblNewLabel_4.setBounds(6, 106, 65, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Choose Seat Type");
		lblNewLabel_5.setBounds(6, 137, 190, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton economic = new JRadioButton("Economic");
		economic.setBounds(6, 164, 127, 23);
		frame.getContentPane().add(economic);
		
		JRadioButton firstclass = new JRadioButton("First Class");
		firstclass.setBounds(6, 190, 86, 23);
		frame.getContentPane().add(firstclass);
		
		JLabel lblNewLabel_6 = new JLabel("Enter Password to Confirm");
		lblNewLabel_6.setBounds(10, 263, 161, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(181, 260, 102, 20);
		frame.getContentPane().add(passwordField);
		
		JButton booktrip = new JButton("Book Trip");
		
		booktrip.setBounds(117, 512, 89, 23);
		frame.getContentPane().add(booktrip);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(303, 75, 720, 274);
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
		
		JComboBox tripid = new JComboBox();
		tripid.setBounds(106, 301, 65, 22);
		
		frame.getContentPane().add(tripid);
		
		JLabel lblNewLabel_7 = new JLabel("Select Trip ID");
		lblNewLabel_7.setBounds(20, 305, 81, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		GUI g =new GUI();
		g.setComboBoxes(tripid);
		
		JLabel lblNewLabel_9 = new JLabel("Click the button to check Plane Types:");
		lblNewLabel_9.setBounds(16, 359, 267, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JComboBox planetype = new JComboBox();
		planetype.setBounds(143, 386, 65, 22);
		//planetype.insertItemAt("General", 0);
		//planetype.insertItemAt("Private", 1);
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
		btnNewButton_1.setBounds(571, 512, 95, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JRadioButton buisness = new JRadioButton("Buisness");
		buisness.setBounds(6, 214, 109, 23);
		frame.getContentPane().add(buisness);
		
		JComboBox packageID = new JComboBox();
		packageID.setBounds(121, 432, 65, 22);
		packageID.insertItemAt(3, 0);
		packageID.insertItemAt(2, 0);
		packageID.insertItemAt(1, 0);
		frame.getContentPane().add(packageID);
		
		
		JLabel lblNewLabel_10 = new JLabel("Package ID");
		lblNewLabel_10.setBounds(16, 436, 68, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		
		JDateChooser flightDate = new JDateChooser();
		flightDate.setBounds(100, 106, 121, 20);
		frame.getContentPane().add(flightDate);
		
		JButton btnNewButton_2 = new JButton("Check");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int trip=(int) tripid.getSelectedItem(); //tripID
				GUI g=new GUI();
				g.setPlaneCombo(planetype, trip);
			}
		});
		btnNewButton_2.setBounds(12, 386, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		table.getColumnModel().getColumn(5).setPreferredWidth(93);
		
		
		booktrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String passwordcurrent=new String(passwordField.getPassword());
				if(passwordcurrent.equals(customer.getPassword())==false)
				{
					JOptionPane.showMessageDialog(null, "Invalid Password");
					return;
				}
				
				
				Random gen=new Random();
				int r=gen.nextInt(1000);
				
				
				String bid="B-";
				bid+=Integer.toString(r);
				//bid booking id
				
				int val=(int) seats.getValue();//seats count
				if(val<=0)
				{
					JOptionPane.showMessageDialog(null, "Invalid Seats");
					return;
				}
				int trip=(int) tripid.getSelectedItem(); //tripID
				GUI g = new GUI();
				int f=g.getFlightID(trip); //flightID
				//System.out.print(f);
				
			
			
				int pid=(int) packageID.getSelectedItem();//packageID
				String seatType=" ";
				
				if(economic.isSelected())
					seatType="E";
				else if(firstclass.isSelected())
					seatType="F";
				else if(buisness.isSelected())
					seatType="B";
				
				if(g.checkSeats(val, trip)==-1)
				{
					JOptionPane.showMessageDialog(null, "Not enough seats\n");
					return;
				}
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String datee = sdf.format(flightDate.getDate());
				Booking b=new Booking(bid, customer.getUsername(), val, seatType,pid, trip, f,  datee);
				
				g.BookTrip(b);
				JOptionPane.showMessageDialog(null, "Booking done\n");
			}
		});
		
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
