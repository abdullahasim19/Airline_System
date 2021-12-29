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

import classes.Customer;
import classes.GUI;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

public class BookingPage {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTable table;
	private Customer customer;
	private JTextField flightdate;

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
		
		JLabel lblNewLabel_3 = new JLabel("Select Time");
		lblNewLabel_3.setBounds(6, 121, 78, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Select Date");
		lblNewLabel_4.setBounds(10, 161, 65, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Choose Seat Type");
		lblNewLabel_5.setBounds(10, 186, 190, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton economic = new JRadioButton("Economic");
		economic.setBounds(6, 207, 78, 23);
		frame.getContentPane().add(economic);
		
		JRadioButton firstclass = new JRadioButton("First Class");
		firstclass.setBounds(100, 207, 86, 23);
		frame.getContentPane().add(firstclass);
		
		JLabel lblNewLabel_6 = new JLabel("Enter Password to Confirm");
		lblNewLabel_6.setBounds(10, 244, 161, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(181, 237, 102, 20);
		frame.getContentPane().add(passwordField);
		
		JButton booktrip = new JButton("Book Trip");
		
		booktrip.setBounds(85, 459, 89, 23);
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
		
		JLabel lblNewLabel_9 = new JLabel("Plane Type");
		lblNewLabel_9.setBounds(20, 359, 68, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JComboBox planetype = new JComboBox();
		planetype.setBounds(106, 355, 65, 22);
		planetype.insertItemAt("General", 0);
		planetype.insertItemAt("Private", 1);
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
		
		JRadioButton buisness = new JRadioButton("Buisness");
		buisness.setBounds(188, 207, 109, 23);
		frame.getContentPane().add(buisness);
		
		JComboBox packageID = new JComboBox();
		packageID.setBounds(106, 404, 65, 22);
		packageID.insertItemAt(3, 0);
		packageID.insertItemAt(2, 0);
		packageID.insertItemAt(1, 0);
		frame.getContentPane().add(packageID);
		
		
		JLabel lblNewLabel_10 = new JLabel("Package ID");
		lblNewLabel_10.setBounds(20, 404, 68, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JComboBox hours = new JComboBox();
		hours.setBounds(85, 117, 44, 22);
		frame.getContentPane().add(hours);
		
		JComboBox minutes = new JComboBox();
		minutes.setBounds(144, 117, 42, 22);
		frame.getContentPane().add(minutes);
		
		JComboBox seconds = new JComboBox();
		seconds.setBounds(209, 117, 44, 22);
		frame.getContentPane().add(seconds);
		
		for(int i=0;i<=12;i++)
			hours.insertItemAt(i, i);
		
		for(int i=0;i<60;i++)
			minutes.insertItemAt(i, i);
		
		for(int i=0;i<60;i++)
			seconds.insertItemAt(i, i);
		
		JLabel lblNewLabel_8 = new JLabel("Hours");
		lblNewLabel_8.setBounds(85, 96, 46, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("Minutes");
		lblNewLabel_11.setBounds(144, 96, 46, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Seconds");
		lblNewLabel_12.setBounds(207, 96, 46, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		flightdate = new JTextField();
		flightdate.setBounds(81, 158, 86, 20);
		frame.getContentPane().add(flightdate);
		flightdate.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(179, 161, 74, 20);
		frame.getContentPane().add(dateChooser);
		table.getColumnModel().getColumn(5).setPreferredWidth(93);
		
		
		booktrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int r=(int) Math.random();
				String bid="B-";
				bid+=Integer.toString(r);
				//bid booking id
				
				int val=(int) seats.getValue();//seats count
				int trip=(int) tripid.getSelectedItem(); //tripID
				GUI g = new GUI();
				int f=g.getFlightID(trip); //flightID
				//System.out.print(f);
				
//				String time=(String) hours.getSelectedItem(); 
//				time+="-";
//				time+=(String)minutes.getSelectedItem();
//				time+="-";
//				time+=(String)seconds.getSelectedItem(); //booking time
				String time="12:12:12";
				
				
				java.sql.Date d=(java.sql.Date) dateChooser.getDate();
				int pid=(int) packageID.getSelectedItem();//packageID
				String seatType=" ";
				
				if(economic.isSelected())
					seatType="E";
				else if(firstclass.isSelected())
					seatType="F";
				else if(buisness.isSelected())
					seatType="B";
				
				if(g.checkSeats(val, trip)==false)
				{
					JOptionPane.showMessageDialog(null, "Not enough seats\n");
					return;
				}
					String datee=flightdate.getSelectedText();
					
				g.BookTrip(bid, customer.getUsername(), val, seatType,pid, trip, f,  datee, time);
				JOptionPane.showMessageDialog(null, "Booking done\n");
			}
		});
		
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
