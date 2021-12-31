package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import classes.GUI;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AssignCaptainAdmin {

	private JFrame frame;
	private JTable table;
	@SuppressWarnings("rawtypes")
	private JComboBox availableCap;
	private JTextField fid;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssignCaptainAdmin window = new AssignCaptainAdmin();
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
	public AssignCaptainAdmin() {
		initialize();
		//aid.setVisible(false);
		GUI g = new GUI();
		g.fillTableForAssignCaptain(table);
		g.fillCaptainComboBox(availableCap);
		
		
		
	
		//this.
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1120, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Assign Captain");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(335, 22, 392, 67);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(485, 150, 609, 424);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Flight ID", "Departure", "Destination", "Flight Date", "Flight Time"
			}
		));
		
		
		JLabel lblNewLabel_1 = new JLabel("Available Captains");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(61, 264, 178, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		availableCap = new JComboBox();
		availableCap.setBounds(274, 277, 148, 22);
		frame.getContentPane().add(availableCap);
		
		JLabel Assign = new JLabel("");
		
		Assign.setIcon(new ImageIcon(AssignCaptainAdmin.class.getResource("/imgs/assign.png")));
		Assign.setBounds(193, 352, 69, 67);
		frame.getContentPane().add(Assign);
		
		JLabel lblNewLabel_3 = new JLabel("Assign");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(193, 410, 58, 43);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon(AssignCaptainAdmin.class.getResource("/imgs/back2.png")));
		lblNewLabel_2_1.setBounds(0, 0, 77, 67);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		
		JLabel lblNewLabel_11 = new JLabel("Flight ID");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_11.setBounds(61, 197, 178, 43);
		frame.getContentPane().add(lblNewLabel_11);
		
		fid = new JTextField();
		fid.setBounds(274, 211, 148, 20);
		frame.getContentPane().add(fid);
		fid.setColumns(10);
		
		
		
		Assign.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(availableCap.getSelectedItem().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please select the captain","Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				GUI g = new GUI();
				boolean b = g.AssignCaptain((String)availableCap.getSelectedItem(),fid.getText());
				if(b)
				{
					JOptionPane.showMessageDialog(null, "Captain Assigned Successfully Successfully","Done", JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Someting went wrong","Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
	
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
