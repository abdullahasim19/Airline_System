package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrontPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage window = new FrontPage();
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
	public FrontPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Airline Management System");
		lblNewLabel.setIcon(new ImageIcon(FrontPage.class.getResource("/imgs/front.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(102, 41, 806, 148);
		frame.getContentPane().add(lblNewLabel);
		
		JButton adminlogin = new JButton("Login as Admin");
		adminlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				AdminLoginPage ap=new AdminLoginPage();
				ap.setVisible(true);
				
				frame.dispose();
				
			}
		});
		adminlogin.setIcon(new ImageIcon(FrontPage.class.getResource("/imgs/admin.png")));
		adminlogin.setBackground(SystemColor.controlShadow);
		adminlogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		adminlogin.setBounds(118, 315, 303, 136);
		frame.getContentPane().add(adminlogin);
		
		JButton CustomerLogin = new JButton("Login as Customer");
		CustomerLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CustomerLoginPage cp=new CustomerLoginPage();
				cp.setVisible(true);
				frame.dispose();
				
			}
		});
		CustomerLogin.setIcon(new ImageIcon(FrontPage.class.getResource("/imgs/customer.png")));
		CustomerLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		CustomerLogin.setBackground(SystemColor.controlShadow);
		CustomerLogin.setBounds(526, 315, 333, 136);
		frame.getContentPane().add(CustomerLogin);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		Cancel.setIcon(new ImageIcon(FrontPage.class.getResource("/imgs/close.png")));
		Cancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		Cancel.setBounds(400, 510, 157, 49);
		frame.getContentPane().add(Cancel);
		frame.setBounds(100, 100, 955, 656);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
