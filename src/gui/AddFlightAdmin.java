package gui;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import classes.GUI;

public class AddFlightAdmin {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTextField aid;
	private JTextField aid2;
	private JTextField dest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFlightAdmin window = new AddFlightAdmin();
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
	public AddFlightAdmin() {
		initialize();
		aid.setVisible(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1100, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Flight");
		lblNewLabel.setIcon(new ImageIcon(AssignCaptainAdmin.class.getResource("/imgs/captain.png")));
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 55));
		lblNewLabel.setBounds(313, 0, 507, 138);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane airportTable = new JScrollPane();
		airportTable.setEnabled(false);
		airportTable.setBounds(385, 176, 330, 201);
		frame.getContentPane().add(airportTable);
		
		table = new JTable();
		airportTable.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Airport#", "Ariport Name", "City"
			}
		));
		
		JLabel lblNewLabel_1 = new JLabel("Country");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(417, 378, 81, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox<String> countries = new JComboBox<String>();
		countries.setModel(new DefaultComboBoxModel(new String[] {"", "Australia", "France", "Germany", "India", "Italy", "Newzland", "Pakistan", "Spain", "United Kingdom", "United States"}));
		countries.setBounds(538, 388, 134, 22);
		frame.getContentPane().add(countries);
		
		JButton getAirport = new JButton("Get Airports");
		
		getAirport.setFont(new Font("Tahoma", Font.BOLD, 18));
		getAirport.setBounds(461, 453, 155, 28);
		frame.getContentPane().add(getAirport);
		
		JLabel lblNewLabel_2 = new JLabel("Plane ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(98, 173, 81, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		JScrollPane PlaneTable = new JScrollPane();
		PlaneTable.setEnabled(false);
		PlaneTable.setBounds(739, 176, 317, 201);
		frame.getContentPane().add(PlaneTable);
		
		table_1 = new JTable();
		PlaneTable.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Plane#", "Plane Name"
			}
		));
		table_1.setVisible(false);
		table_1.setEnabled(false);
		
		JLabel aidlabel = new JLabel("Airport ID");
		aidlabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		aidlabel.setBounds(764, 378, 100, 36);
		frame.getContentPane().add(aidlabel);
		aidlabel.setVisible(false);
		
		aid = new JTextField();
		aid.setBounds(897, 389, 86, 20);
		frame.getContentPane().add(aid);
		aid.setColumns(10);
		
		JButton GetPlanesList = new JButton("Get Planes List");
		
		GetPlanesList.setFont(new Font("Tahoma", Font.BOLD, 18));
		GetPlanesList.setBounds(806, 453, 188, 28);
		frame.getContentPane().add(GetPlanesList);
		
		aid2 = new JTextField();
		aid2.setEnabled(false);
		aid2.setBounds(79, 208, 119, 20);
		frame.getContentPane().add(aid2);
		aid2.setColumns(10);
		
		JDateChooser Flightdate = new JDateChooser();
		Flightdate.setBounds(79, 284, 119, 20);
		frame.getContentPane().add(Flightdate);
		Flightdate.setEnabled(false);
		
		JLabel lblNewLabel_2_1 = new JLabel("Flight Date");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(89, 245, 100, 28);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Flight Time");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_1_1.setBounds(98, 320, 100, 28);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JComboBox<String> minutes = new JComboBox<String>();
		minutes.setEnabled(false);
		minutes.setModel(new DefaultComboBoxModel<String>(new String[] {"min", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		minutes.setBounds(160, 359, 52, 22);
		frame.getContentPane().add(minutes);
		
		JComboBox<String> hours = new JComboBox<String>();
		hours.setEnabled(false);
		hours.setModel(new DefaultComboBoxModel(new String[] {"hour", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		hours.setBounds(79, 359, 54, 22);
		frame.getContentPane().add(hours);
		
		JButton done = new JButton("Done");

		done.setFont(new Font("Tahoma", Font.BOLD, 18));
		done.setEnabled(false);
		done.setBounds(98, 523, 89, 22);
		frame.getContentPane().add(done);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		Cancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		Cancel.setBounds(490, 614, 89, 23);
		frame.getContentPane().add(Cancel);
		
		dest = new JTextField();
		dest.setBounds(72, 426, 140, 22);
		frame.getContentPane().add(dest);
		dest.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Destination");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_1_1_1.setBounds(79, 388, 100, 28);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		GetPlanesList.setVisible(false);
		
		
		getAirport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// more code needed
				
				if(!countries.getSelectedItem().equals(""))
				{
					GUI g = new GUI();
					g.fillAirportTable(table, (String)countries.getSelectedItem());
					aid.setVisible(true);
					GetPlanesList.setVisible(true);
					aidlabel.setVisible(true);
					table_1.setVisible(true);
				}
				else
				{
					aid.setVisible(false);
					GetPlanesList.setVisible(false);
					aidlabel.setVisible(false);
					table_1.setVisible(false);
				}
				
				
			}
		});
		
		
		GetPlanesList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/// more code needed
				
				
				
				
				if(!aid.getText().equals(""))
				{
					GUI g = new GUI();
					g.fillPlaneTable(table_1,aid.getText());
					done.setEnabled(true);
					minutes.setEnabled(true);
					hours.setEnabled(true);
					aid2.setEnabled(true);
					Flightdate.setEnabled(true);
					//am_pm.setEnabled(true);
				}
				else
				{
				
					done.setEnabled(false);
					minutes.setEnabled(false);
					hours.setEnabled(false);
					aid2.setEnabled(false);
					Flightdate.setEnabled(false);
					//am_pm.setEnabled(false);
				}
				
				
				
				
				
			}
		});
		
		
		
		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int min = 10;
			    int max = 100000;
			        
			    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
				
				GUI g = new GUI();
				
				String fid="F-00"+Integer.toString(random_int);
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String da = sdf.format(Flightdate.getDate());
				
				String ti= (String) hours.getSelectedItem() + ":" + (String) minutes.getSelectedItem() + ":00";
				
				boolean b  = g.AddFlight(fid,aid2.getText(),aid.getText(), da,dest.getText(),ti);
				
				if(b)
				{
					JOptionPane.showMessageDialog(null, "Flight Successfully Added","Done", JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Something went wrong","Error", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		
	}

	

	public void setVisible(boolean b) {
	
		frame.setVisible(b);
	}

	public void pack() {
		
		frame.pack();
	}

	public void setLocationRelativeTo(Object object) {
	
		frame.setLocationRelativeTo(null);
	}

	public void setExtendedState(int maximizedBoth) {
		
		frame.setExtendedState(JFrame.NORMAL);
	}
	
}
