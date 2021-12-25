package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMainPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMainPage window = new AdminMainPage();
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
	public AdminMainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 768, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello Admin");
		lblNewLabel.setIcon(new ImageIcon(AdminMainPage.class.getResource("/imgs/hello.png")));
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.BOLD, 60));
		lblNewLabel.setBounds(131, 47, 517, 110);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 752, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu customerMenu = new JMenu("Customer");
		menuBar.add(customerMenu);
		
		JMenuItem ViewCustomer = new JMenuItem("View all Customers");
		ViewCustomer.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		customerMenu.add(ViewCustomer);
		
		JMenuItem EditCustomer = new JMenuItem("Edit Customer Details");
		customerMenu.add(EditCustomer);
		EditCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EditUserDetailsbyAdmin ed=new EditUserDetailsbyAdmin();
				ed.setVisible(true);
				
			}
		});
		
		JMenu AirportMenu = new JMenu("Airport");
		menuBar.add(AirportMenu);
		
		JMenuItem AddAirport = new JMenuItem("Add Airport");
		AirportMenu.add(AddAirport);
		AddAirport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddAirportAdmin ap=new AddAirportAdmin();
				ap.setVisible(true);
				
			}
		});
		
		JMenu PlanesMenu = new JMenu("Planes");
		menuBar.add(PlanesMenu);
		
		JMenuItem AddPlane = new JMenuItem("Add Plane");
		PlanesMenu.add(AddPlane);
		
		JMenuItem RemovePlane = new JMenuItem("Remove Plane");
		PlanesMenu.add(RemovePlane);
		
		JMenuItem AssignCap = new JMenuItem("Assign Captian");
		PlanesMenu.add(AssignCap);
		
		JMenuItem EditPlane = new JMenuItem("Edit Plane Details");
		PlanesMenu.add(EditPlane);
		
		JMenu CaptainMenu = new JMenu("Captain");
		menuBar.add(CaptainMenu);
		
		JMenuItem AddCap = new JMenuItem("Add Captain");
		CaptainMenu.add(AddCap);
		
		JMenuItem RemoveCap = new JMenuItem("Remove Captain");
		CaptainMenu.add(RemoveCap);
		
		JMenuItem EditCap = new JMenuItem("Edit Captain Details");
		CaptainMenu.add(EditCap);
		
		JMenu flightmenu = new JMenu("Flights");
		menuBar.add(flightmenu);
		
		JMenuItem addFlight = new JMenuItem("Add Flight");
		flightmenu.add(addFlight);
		addFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddFlightAdmin fp=new AddFlightAdmin();
				fp.setVisible(true);
				
			}
		});
		
		JMenuItem editflight = new JMenuItem("Edit Flight Details");
		flightmenu.add(editflight);
		
		JMenu mnNewMenu = new JMenu("Packages");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Add Package");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Remove Package");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JButton ViewAllCustomer = new JButton("View All Customers");
		ViewAllCustomer.setFont(new Font("Tahoma", Font.BOLD, 18));
		ViewAllCustomer.setBounds(92, 289, 205, 37);
		frame.getContentPane().add(ViewAllCustomer);
		
		JButton ViewBookings = new JButton("View All Bookings");
		ViewBookings.setFont(new Font("Tahoma", Font.BOLD, 18));
		ViewBookings.setBounds(404, 289, 205, 37);
		frame.getContentPane().add(ViewBookings);
		
		JButton AddPackage = new JButton("Add Package");
		AddPackage.setFont(new Font("Tahoma", Font.BOLD, 18));
		AddPackage.setBounds(92, 380, 205, 37);
		frame.getContentPane().add(AddPackage);
		
		JButton AddPlanes = new JButton("Add Planes");
		AddPlanes.setFont(new Font("Tahoma", Font.BOLD, 18));
		AddPlanes.setBounds(404, 380, 205, 37);
		frame.getContentPane().add(AddPlanes);
		
		JButton Logout = new JButton("Log out");
		Logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "See you soon. Good Bye!","Loging Out", JOptionPane.INFORMATION_MESSAGE);
				FrontPage fp=new FrontPage();
				fp.setVisible(true);
				frame.dispose();
				
			}
		});
		Logout.setFont(new Font("Tahoma", Font.BOLD, 18));
		Logout.setBounds(273, 497, 125, 37);
		frame.getContentPane().add(Logout);
		
		JLabel lblNewLabel_1 = new JLabel("Quick Menu");
		lblNewLabel_1.setIcon(new ImageIcon(AdminMainPage.class.getResource("/imgs/menu.png")));
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblNewLabel_1.setBounds(273, 206, 205, 54);
		frame.getContentPane().add(lblNewLabel_1);
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