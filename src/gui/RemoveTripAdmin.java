package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RemoveTripAdmin {

	private JFrame frame;
	private JTextField TripID;
	private JTable table;
	private JTable table_1;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveTripAdmin window = new RemoveTripAdmin();
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
	public RemoveTripAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1199, 663);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Remove Trip");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(412, 11, 403, 84);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Trip ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(732, 200, 132, 59);
		frame.getContentPane().add(lblNewLabel_1);
		
		TripID = new JTextField();
		TripID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(!Character.isDigit(e.getKeyChar()))
				{
					e.consume();
				}
			}
		});
		TripID.setBounds(930, 211, 201, 33);
		frame.getContentPane().add(TripID);
		TripID.setColumns(10);
		
		JButton Remove = new JButton("Remove");
		Remove.setBackground(Color.LIGHT_GRAY);
		Remove.setFont(new Font("Tahoma", Font.BOLD, 33));
		Remove.setBounds(826, 419, 201, 49);
		frame.getContentPane().add(Remove);
		
		table = new JTable();
		table.setBounds(90, 430, 272, -229);
		frame.getContentPane().add(table);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 177, 613, 427);
		frame.getContentPane().add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Trip ID", "Trip Name", "Departure", "Destination"
			}
		));
		table_1.setToolTipText("");
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(RemoveTripAdmin.class.getResource("/imgs/back2.png")));
		lblNewLabel_2.setBounds(0, 0, 92, 39);
		frame.getContentPane().add(lblNewLabel_2);
	}
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}

}
