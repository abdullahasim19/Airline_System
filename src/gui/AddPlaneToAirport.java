package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import classes.GUI;

import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddPlaneToAirport {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTextField aid;
	private JTextField planeID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPlaneToAirport window = new AddPlaneToAirport();
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
	public AddPlaneToAirport() {
		initialize();
		GUI g =new GUI();
		g.planesForAiportTable(table);
		g.fillAirportTableForTrip(table_1);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 1144, 641);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(380, 153, 347, 376);
		frame.getContentPane().add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Plane ID", "Plane Name"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(742, 153, 376, 376);
		frame.getContentPane().add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Airport ID", "Country", "City"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		JLabel lblNewLabel = new JLabel("Available Planes");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(472, 540, 180, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAirport = new JLabel("Airports");
		lblAirport.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblAirport.setBounds(908, 540, 102, 32);
		frame.getContentPane().add(lblAirport);
		
		JLabel lblNewLabel_1 = new JLabel("Add Plane to Airport");
		lblNewLabel_1.setIcon(new ImageIcon(AddPlaneToAirport.class.getResource("/imgs/front.png")));
		lblNewLabel_1.setFont(new Font("Traditional Arabic", Font.BOLD, 50));
		lblNewLabel_1.setBounds(283, 11, 547, 112);
		frame.getContentPane().add(lblNewLabel_1);
		
		aid = new JTextField();
		aid.setBounds(142, 285, 191, 25);
		frame.getContentPane().add(aid);
		aid.setColumns(10);
		
		planeID = new JTextField();
		planeID.setColumns(10);
		planeID.setBounds(142, 350, 191, 25);
		frame.getContentPane().add(planeID);
		
		JLabel lblNewLabel_2 = new JLabel("Airport ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(16, 282, 116, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Plane ID");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(16, 350, 116, 25);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel add = new JLabel("");
		
		add.setIcon(new ImageIcon(AddPlaneToAirport.class.getResource("/imgs/add.png")));
		add.setBounds(150, 485, 53, 60);
		frame.getContentPane().add(add);
		
		JLabel lblNewLabel_4 = new JLabel("Add");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(157, 540, 46, 37);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel back = new JLabel("");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
			}
		});
		back.setIcon(new ImageIcon(AddPlaneToAirport.class.getResource("/imgs/back2.png")));
		back.setBounds(16, 0, 53, 71);
		frame.getContentPane().add(back);
		
		
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				GUI g = new GUI();
				
				boolean b = g.addPlanetoairpot(aid.getText(), Integer.valueOf(planeID.getText()));
			
				if(b)
				{
					JOptionPane.showMessageDialog(null, "Plane succesfully added to airport","Done", JOptionPane.INFORMATION_MESSAGE);
					
					DefaultTableModel dm = (DefaultTableModel)table.getModel();
					while(dm.getRowCount() > 0)
					{
					    dm.removeRow(0);
					}
					
					
					g.planesForAiportTable(table);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Something went wrong","Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});

	}
	
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
