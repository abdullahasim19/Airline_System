package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

import classes.GUI;
import classes.Planes;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RemovePlane {

	private JFrame frame;
	private JTable table;
	private JTextField PlaneID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemovePlane window = new RemovePlane();
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
	public RemovePlane() {
		initialize();
		GUI g=new GUI();
		g.fillPlaneTable(table);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(246, 94, 424, 384);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Plane ID", "Plane Name", "Airport ID"
			}
		));
		
		JLabel lblNewLabel = new JLabel("Remove Plane");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 48));
		lblNewLabel.setBounds(155, 11, 359, 68);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(RemovePlane.class.getResource("/imgs/back2.png")));
		lblNewLabel_1.setBounds(10, 11, 53, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		PlaneID = new JTextField();
		PlaneID.setBounds(46, 241, 146, 28);
		frame.getContentPane().add(PlaneID);
		PlaneID.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Plane ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(80, 202, 79, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton remove = new JButton("Remove");
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(PlaneID.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Information missing","Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else
				{
					Planes p=new Planes();
					
					p.setPlaneID(Integer.parseInt(PlaneID.getText()));
					
					//System.out.println(p.getPlaneID());
					
					GUI g = new GUI();
					boolean b = g.removePlane(p);
					if(b)
					{
						JOptionPane.showMessageDialog(null, "Plane removed successfully","Done", JOptionPane.INFORMATION_MESSAGE);
						
						DefaultTableModel dm = (DefaultTableModel)table.getModel();
						while(dm.getRowCount() > 0)
						{
						    dm.removeRow(0);
						}
						
						
						
						GUI g1=new GUI();
						g1.fillPlaneTable(table);
						return;
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid id or something went wrong","Error", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				
			}
		});
		remove.setBounds(81, 304, 89, 23);
		frame.getContentPane().add(remove);
	}
	
	
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}

}
