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

public class CustomerMainPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerMainPage window = new CustomerMainPage();
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
	public CustomerMainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel WelcomeLabel = new JLabel("Hi ");
		WelcomeLabel.setIcon(new ImageIcon(CustomerMainPage.class.getResource("/imgs/hi.png")));
		WelcomeLabel.setFont(new Font("Monospaced", Font.BOLD, 55));
		WelcomeLabel.setBounds(128, 11, 546, 138);
		frame.getContentPane().add(WelcomeLabel);
		
		JLabel lblNewLabel = new JLabel("Hot Picks");
		lblNewLabel.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 40));
		lblNewLabel.setBounds(241, 150, 246, 71);
		frame.getContentPane().add(lblNewLabel);
		frame.setBounds(100, 100, 700, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu ProfileMenu = new JMenu("Profile");
		menuBar.add(ProfileMenu);
		
		JMenuItem viewProfile = new JMenuItem("View Profile");
		ProfileMenu.add(viewProfile);
		viewProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ViewProfileCustomer vp=new ViewProfileCustomer();
				vp.setVisible(true);
			}
		});
		
		JMenuItem EditProfile = new JMenuItem("Edit Profile");
		ProfileMenu.add(EditProfile);
		EditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EditCustomerProfile cp=new EditCustomerProfile();
				cp.setVisible(true);
			}
		});
		
		JMenuItem Viewhistory = new JMenuItem("View History");
		ProfileMenu.add(Viewhistory);
		Viewhistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewHistoryCustomer h=new ViewHistoryCustomer();
				h.setVisible(true);
				
			}
		});
		
		JMenuItem ChangePassword = new JMenuItem("Change Password");
		ChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ChangePassword cp=new ChangePassword();
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
		
		
		JMenu mnNewMenu = new JMenu("Booking");
		menuBar.add(mnNewMenu);
		
		JMenuItem BookTrip = new JMenuItem("Book Trip");
		mnNewMenu.add(BookTrip);
		BookTrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Booking b =new Booking();
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
	
	
}
