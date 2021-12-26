package gui;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddPackageAdmin {

	private JFrame frame;
	private JTextField tripID;
	private JPasswordField tripPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPackageAdmin window = new AddPackageAdmin();
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
	public AddPackageAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 547, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Package");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(200, 11, 136, 31);
		frame.getContentPane().add(lblNewLabel);
		
		DefaultListModel<String>l1=new DefaultListModel<>();
		l1.addElement("Family");
		l1.addElement("Popular Destination");
		l1.addElement("Popular Journey");
		l1.addElement("Discount");
		JList list = new JList();
		list.setBounds(265, 77, 213, 177);
		list.setModel(l1);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel_1 = new JLabel("Choose your Package");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_1.setBounds(305, 52, 130, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tripID = new JTextField();
		tripID.setBounds(169, 131, 86, 20);
		frame.getContentPane().add(tripID);
		tripID.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Trip ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(77, 134, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tripPassword = new JPasswordField();
		tripPassword.setBounds(172, 221, 83, 20);
		frame.getContentPane().add(tripPassword);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Password to confirm");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 221, 153, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton addButton = new JButton("Add Package");
		addButton.setForeground(Color.RED);
		addButton.setBounds(160, 295, 136, 23);
		frame.getContentPane().add(addButton);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		Cancel.setForeground(Color.RED);
		Cancel.setBounds(21, 351, 83, 23);
		frame.getContentPane().add(Cancel);
	}
}
