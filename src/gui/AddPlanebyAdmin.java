package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import classes.GUI;

import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddPlanebyAdmin {

	private JFrame frame;
	private JTextField planeid;
	private JTextField Pname;
	private JSpinner FirstClassCap;
	private JSpinner businesClassCap;
	private JLabel BusinessLabel;
	private JLabel FirstClassCapLabel;
	private JLabel EconomicLabel;
	private JSpinner EconomicCap;
	private JLabel setCapLabel;
	private JSpinner capacity;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPlanebyAdmin window = new AddPlanebyAdmin();
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
	public AddPlanebyAdmin() {
		initialize();
		FirstClassCap.setVisible(false);
		businesClassCap.setVisible(false);
		BusinessLabel.setVisible(false);
		FirstClassCapLabel.setVisible(false);
		EconomicLabel.setVisible(false);
		EconomicCap.setVisible(false);
		setCapLabel.setVisible(false);
		capacity.setVisible(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 640, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("ADD PLANE");
		lblNewLabel.setIcon(new ImageIcon(AddPlanebyAdmin.class.getResource("/imgs/plane.png")));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 56));
		lblNewLabel.setBounds(67, 11, 494, 97);
		frame.getContentPane().add(lblNewLabel);
		
		
		String []types= {"Private","General"};
		JComboBox planetype = new JComboBox(types);
		
		
		planetype.setModel(new DefaultComboBoxModel(new String[] {"", "Private", "General"}));
		planetype.setForeground(Color.BLUE);
		planetype.setBounds(187, 149, 109, 22);
		
		frame.getContentPane().add(planetype);
		
		JLabel lblNewLabel_1 = new JLabel("Select Plane Type");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(10, 142, 159, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		capacity = new JSpinner();
		capacity.setForeground(Color.BLUE);
		capacity.setBounds(187, 196, 109, 20);
		frame.getContentPane().add(capacity);
		
		setCapLabel = new JLabel("Set Capacity");
		setCapLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		setCapLabel.setForeground(Color.BLUE);
		setCapLabel.setBounds(10, 184, 123, 38);
		frame.getContentPane().add(setCapLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Plane ID");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setBounds(10, 289, 148, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		planeid = new JTextField();
		planeid.setBounds(171, 296, 142, 22);
		frame.getContentPane().add(planeid);
		planeid.setColumns(10);
		
		EconomicCap = new JSpinner();
		EconomicCap.setForeground(Color.BLUE);
		EconomicCap.setBounds(531, 195, 83, 22);
		frame.getContentPane().add(EconomicCap);
		
		JLabel addbtn = new JLabel("");

		addbtn.setIcon(new ImageIcon(AddPlanebyAdmin.class.getResource("/imgs/add.png")));
		addbtn.setBounds(297, 360, 58, 53);
		frame.getContentPane().add(addbtn);
		
		JLabel cancel = new JLabel("");
		cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		cancel.setIcon(new ImageIcon(AddPlanebyAdmin.class.getResource("/imgs/back2.png")));
		cancel.setBounds(0, 0, 46, 44);
		frame.getContentPane().add(cancel);
		
		JLabel lblNewLabel_6 = new JLabel("Add");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(307, 405, 46, 32);
		frame.getContentPane().add(lblNewLabel_6);
		
		EconomicLabel = new JLabel("Economic Class Cap");
		EconomicLabel.setForeground(Color.BLUE);
		EconomicLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		EconomicLabel.setBounds(330, 184, 177, 38);
		frame.getContentPane().add(EconomicLabel);
		
		FirstClassCapLabel = new JLabel("First Class Cap");
		FirstClassCapLabel.setForeground(Color.BLUE);
		FirstClassCapLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		FirstClassCapLabel.setBounds(330, 233, 177, 38);
		frame.getContentPane().add(FirstClassCapLabel);
		
		BusinessLabel = new JLabel("Business Class Cap");
		BusinessLabel.setForeground(Color.BLUE);
		BusinessLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		BusinessLabel.setBounds(330, 138, 177, 38);
		frame.getContentPane().add(BusinessLabel);
		
		businesClassCap = new JSpinner();
		businesClassCap.setForeground(Color.BLUE);
		businesClassCap.setBounds(531, 149, 83, 22);
		frame.getContentPane().add(businesClassCap);
		
		FirstClassCap = new JSpinner();
		FirstClassCap.setForeground(Color.BLUE);
		FirstClassCap.setBounds(531, 244, 83, 22);
		frame.getContentPane().add(FirstClassCap);
		
		JLabel lblNewLabel_3_1 = new JLabel("Plane Name");
		lblNewLabel_3_1.setForeground(Color.BLUE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(10, 240, 123, 31);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		Pname = new JTextField();
		Pname.setBounds(184, 245, 112, 20);
		frame.getContentPane().add(Pname);
		Pname.setColumns(10);
		
		
		planetype.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(planetype.getSelectedItem().equals("General"))
				{
					FirstClassCap.setVisible(true);
					businesClassCap.setVisible(true);
					BusinessLabel.setVisible(true);
					FirstClassCapLabel.setVisible(true);
					EconomicLabel.setVisible(true);
					EconomicCap.setVisible(true);
					setCapLabel.setVisible(true);
					capacity.setVisible(true);
				}
				else
				{
					FirstClassCap.setVisible(false);
					businesClassCap.setVisible(false);
					BusinessLabel.setVisible(false);
					FirstClassCapLabel.setVisible(false);
					EconomicLabel.setVisible(false);
					EconomicCap.setVisible(false);
					setCapLabel.setVisible(false);
					capacity.setVisible(false);
				}
				
			}
		});
		
		addbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(planetype.getSelectedItem().equals("General"))
				{
					GUI g = new GUI();
					g.addGeneralPlane(planeid.getText(),Pname.getText(),capacity.getToolTipText(),FirstClassCap.getToolTipText(), businesClassCap.getToolTipText(),EconomicCap.getToolTipText());
				}
				else if(planetype.getSelectedItem().equals("Private"))
				{
					
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



