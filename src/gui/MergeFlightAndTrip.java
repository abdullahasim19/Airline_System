package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import classes.GUI;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MergeFlightAndTrip {

	private JFrame frame;
	private JTable table;
	private JTextField tripName;
	private JTextField fid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MergeFlightAndTrip window = new MergeFlightAndTrip();
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
	public MergeFlightAndTrip() {
		initialize();
		GUI g=new GUI();
		g.fillFlightTable(table);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 989, 703);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Merge Flight");
		lblNewLabel.setFont(new Font("Traditional Arabic", Font.BOLD, 50));
		lblNewLabel.setBounds(327, 11, 327, 98);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 113, 593, 495);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Flight ID", "Airport ID", "Plane ID", "Departure", "Destination", "Flight Date", "Flight Time"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Trip Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(730, 129, 126, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		tripName = new JTextField();
		tripName.setBounds(659, 173, 243, 31);
		frame.getContentPane().add(tripName);
		tripName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Flight ID");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(737, 236, 86, 46);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		fid = new JTextField();
		fid.setColumns(10);
		fid.setBounds(659, 293, 243, 31);
		frame.getContentPane().add(fid);
		
		JLabel lblNewLabel_2 = new JLabel("Make it round?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(631, 378, 149, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton roundtrip = new JRadioButton("Round Trip");
		roundtrip.setFont(new Font("Tahoma", Font.BOLD, 14));
		roundtrip.setBackground(SystemColor.activeCaption);
		roundtrip.setBounds(806, 378, 112, 30);
		frame.getContentPane().add(roundtrip);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(MergeFlightAndTrip.class.getResource("/imgs/back2.png")));
		lblNewLabel_3.setBounds(0, 0, 71, 38);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton Done = new JButton("Done");
		Done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(fid.getText().equals("") || tripName.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Information missing","Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				String sOrR;
				if(roundtrip.isSelected())
				{
					sOrR="R";
				}
				else
				{
					sOrR="S";
				}
				
				String dep = null, dest = null;
				
				int pid=0;
				
			    for (int i = 0; i < table.getRowCount(); i++) 
			    {  
			        	if(table.getValueAt(i, 0).equals(fid.getText()))
			        	{
			        		//System.out.println(table.getValueAt(i, 0));
			        		pid=Integer.valueOf((String) table.getValueAt(i, 2) );
			        		dep=(String) table.getValueAt(i, 3);
			        		dest=(String) table.getValueAt(i, 4);    				
			        	}  
			     }
			    
			   // System.out.println(pid);
			    
			   // System.out.println(dep);
			   // System.out.println(dest);
			    
			    
			    GUI g = new GUI();
			    boolean b = g.MergeFlighttoTrip(tripName.getText(), pid, sOrR, dep, dest);
			    		
				if(b)
				{
					JOptionPane.showMessageDialog(null, "Merged Successfully","Done", JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Something went wrong","Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		Done.setFont(new Font("Tahoma", Font.BOLD, 18));
		Done.setBackground(SystemColor.activeCaption);
		Done.setBounds(717, 477, 149, 38);
		frame.getContentPane().add(Done);
	}


	public void setVisible(boolean b) {
		
		frame.setVisible(b);
	}


}
