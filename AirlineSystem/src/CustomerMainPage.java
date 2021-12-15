import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
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
		WelcomeLabel.setBounds(128, 11, 381, 98);
		frame.getContentPane().add(WelcomeLabel);
		
		JLabel lblNewLabel = new JLabel("Hot Picks");
		lblNewLabel.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 40));
		lblNewLabel.setBounds(228, 101, 246, 71);
		frame.getContentPane().add(lblNewLabel);
		frame.setBounds(100, 100, 700, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu ProfileMenu = new JMenu("Profile");
		menuBar.add(ProfileMenu);
		
		JMenuItem viewProfile = new JMenuItem("View Profile");
		ProfileMenu.add(viewProfile);
		
		JMenuItem EditProfile = new JMenuItem("Edit Profile");
		ProfileMenu.add(EditProfile);
		
		JMenuItem Viewhistory = new JMenuItem("View History");
		ProfileMenu.add(Viewhistory);
		
		JMenuItem ChangePassword = new JMenuItem("Change Password");
		ProfileMenu.add(ChangePassword);
		
		JMenuItem Logout = new JMenuItem("Log out");
		ProfileMenu.add(Logout);
	}
}
