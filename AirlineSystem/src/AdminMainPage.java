import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

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
		frame.setBounds(100, 100, 768, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello Admin");
		lblNewLabel.setIcon(new ImageIcon(AdminMainPage.class.getResource("/imgs/hello.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblNewLabel.setBounds(141, 65, 468, 110);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 752, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu customerMenu = new JMenu("Customer");
		menuBar.add(customerMenu);
		
		JMenuItem ViewCustomer = new JMenuItem("View all Customers");
		ViewCustomer.setFont(new Font("Segoe UI", Font.BOLD, 12));
		customerMenu.add(ViewCustomer);
		
		JMenuItem EditCustomer = new JMenuItem("Edit Customer Details");
		customerMenu.add(EditCustomer);
		
		JMenu AirportMenu = new JMenu("Airport");
		menuBar.add(AirportMenu);
		
		JMenuItem AddAirport = new JMenuItem("Add Airport");
		AirportMenu.add(AddAirport);
		
		JMenuItem RemoveAirport = new JMenuItem("Remove Airport");
		AirportMenu.add(RemoveAirport);
		
		JMenuItem EditAirportDetails = new JMenuItem("Edit Airport Details");
		AirportMenu.add(EditAirportDetails);
		
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
	}
}
