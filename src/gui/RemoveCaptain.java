package gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import classes.GUI;

import javax.swing.JScrollPane;

public class RemoveCaptain {

	private JFrame frame;
	private JTextField username;
	private JTextField CaptainID;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveCaptain window = new RemoveCaptain();
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
	public RemoveCaptain() {
		initialize();
		GUI g = new GUI();
		g.fillCaptainTable(table);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 820, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel removeCaptain = new JLabel("Remove Captain");
		removeCaptain.setFont(new Font("Tahoma", Font.BOLD, 26));
		removeCaptain.setBounds(220, 23, 214, 39);
		frame.getContentPane().add(removeCaptain);
		
		JLabel captain_username = new JLabel("Username");
		captain_username.setFont(new Font("Tahoma", Font.BOLD, 17));
		captain_username.setBounds(10, 128, 107, 19);
		frame.getContentPane().add(captain_username);
		
		JLabel captainIdl = new JLabel("Captain ID");
		captainIdl.setFont(new Font("Tahoma", Font.BOLD, 17));
		captainIdl.setBounds(10, 185, 140, 19);
		frame.getContentPane().add(captainIdl);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(113, 130, 149, 20);
		frame.getContentPane().add(username);
		
		CaptainID = new JTextField();
		CaptainID.setColumns(10);
		CaptainID.setBounds(113, 187, 149, 20);
		frame.getContentPane().add(CaptainID);
		
		String[] strgenderforRemove = {"Male", "Female"};
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 16));
		back.setBackground(Color.RED);
		back.setBounds(10, 356, 95, 23);
		frame.getContentPane().add(back);
		
		JButton remove = new JButton("Remove");
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(username.getText().equals("") || CaptainID.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Information missing","Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				GUI g = new GUI();
				
				g.removeCaptain(username.getText(),CaptainID.getText());
				
				
				DefaultTableModel dm = (DefaultTableModel)table.getModel();
				while(dm.getRowCount() > 0)
				{
				    dm.removeRow(0);
				}
				
				g.fillCaptainTable(table);
				
				
			}
		});
		remove.setFont(new Font("Tahoma", Font.BOLD, 16));
		remove.setBackground(SystemColor.textHighlight);
		remove.setBounds(172, 356, 115, 23);
		frame.getContentPane().add(remove);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(297, 94, 485, 282);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Captain ID", "Username", "Name", "Age", "Gender"
			}
		));
		
		
	}
	
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
