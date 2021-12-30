package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.border.TitledBorder;

import classes.Customer;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class CustomerMainPage {

	private JFrame frame;
	private Customer customer;
	private JLabel WelcomeLabel;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public CustomerMainPage(Customer c) {
		this.setCustomer(c);
		//System.out.println(c.getFullname());
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 255));
		frame.getContentPane().setLayout(null);
		
		WelcomeLabel = new JLabel("Welcome user  " + customer.getUsername());
		WelcomeLabel.setIcon(new ImageIcon(CustomerMainPage.class.getResource("/imgs/hi.png")));
		WelcomeLabel.setFont(new Font("Monospaced", Font.BOLD, 55));
		WelcomeLabel.setBounds(67, 30, 1058, 213);
		frame.getContentPane().add(WelcomeLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel.setBounds(214, 235, 690, 347);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("View Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewProfileCustomer vp=new ViewProfileCustomer(customer);
				vp.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(110, 86, 130, 40);
		panel.add(btnNewButton);
		
		JButton btnEditDetails = new JButton("Edit Profile");
		btnEditDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditCustomerProfile cp=new EditCustomerProfile(customer);
				cp.setVisible(true);
			}
		});
		btnEditDetails.setForeground(Color.BLUE);
		btnEditDetails.setBackground(Color.CYAN);
		btnEditDetails.setBounds(410, 86, 130, 40);
		panel.add(btnEditDetails);
		
		JButton btnBookTrip = new JButton("Book Trip");
		btnBookTrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookingPage b =new BookingPage(customer);
				b.setVisible(true);
			}
		});
		btnBookTrip.setForeground(Color.BLUE);
		btnBookTrip.setBackground(Color.CYAN);
		btnBookTrip.setBounds(110, 226, 130, 40);
		panel.add(btnBookTrip);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePassword cp=new ChangePassword(customer);
				cp.setVisible(true);
			}
		});
		btnChangePassword.setForeground(Color.BLUE);
		btnChangePassword.setBackground(Color.CYAN);
		btnChangePassword.setBounds(410, 226, 152, 40);
		panel.add(btnChangePassword);
		frame.setBounds(100, 100, 1170, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu ProfileMenu = new JMenu("Profile");
		menuBar.add(ProfileMenu);
		
		JMenuItem viewProfile = new JMenuItem("View Profile");
		ProfileMenu.add(viewProfile);
		viewProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ViewProfileCustomer vp=new ViewProfileCustomer(customer);
				vp.setVisible(true);
			}
		});
		
		JMenuItem EditProfile = new JMenuItem("Edit Profile");
		ProfileMenu.add(EditProfile);
		EditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EditCustomerProfile cp=new EditCustomerProfile(customer);
				cp.setVisible(true);
			}
		});
		
		JMenuItem Viewhistory = new JMenuItem("View History");
		ProfileMenu.add(Viewhistory);
		Viewhistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewHistoryCustomer h=new ViewHistoryCustomer(customer);
				h.setVisible(true);
				
			}
		});
		
		JMenuItem ChangePassword = new JMenuItem("Change Password");
		ChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ChangePassword cp=new ChangePassword(customer);
				cp.setVisible(true);
			}
		});
		
		
		ProfileMenu.add(ChangePassword);
		
		
		JMenuItem Logout = new JMenuItem("Log out");
		ProfileMenu.add(Logout);
		Logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "See you soon. Good Bye!","Loging Out", JOptionPane.INFORMATION_MESSAGE);
				FrontPage fp = new FrontPage();
				fp.setVisible(true);
				frame.dispose();
				
			}
		});
		
		
		JMenu mnNewMenu = new JMenu("BookingPage");
		menuBar.add(mnNewMenu);
		
		JMenuItem BookTrip = new JMenuItem("Book Trip");
		mnNewMenu.add(BookTrip);
		BookTrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BookingPage b =new BookingPage(customer);
				b.setVisible(true);
				
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
