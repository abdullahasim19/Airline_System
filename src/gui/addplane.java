package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;

public class addplane {

	private JFrame frame;
	private JTextField planeid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addplane window = new addplane();
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
	public addplane() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("ADD PLANES");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(148, 11, 105, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
		String []types= {"Private","General"};
		JComboBox planetype = new JComboBox(types);
		planetype.setForeground(Color.BLUE);
		planetype.setBounds(148, 50, 83, 22);
		
		frame.getContentPane().add(planetype);
		
		JLabel lblNewLabel_1 = new JLabel("Select Plane Type");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(27, 54, 111, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSpinner capacity = new JSpinner();
		capacity.setForeground(Color.BLUE);
		capacity.setBounds(123, 92, 45, 20);
		frame.getContentPane().add(capacity);
		
		JLabel lblNewLabel_2 = new JLabel("Set Capacity");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setBounds(27, 95, 99, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Plane ID");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setBounds(27, 137, 99, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		planeid = new JTextField();
		planeid.setBounds(107, 134, 86, 20);
		frame.getContentPane().add(planeid);
		planeid.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("/imgs/planenew.png"));
		lblNewLabel_4.setBounds(203, 92, 213, 130);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton addplane = new JButton("Add Plane");
		addplane.setForeground(Color.BLUE);
		addplane.setBounds(164, 261, 89, 23);
		frame.getContentPane().add(addplane);
	}
}
