package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import classes.Feedback;
import classes.GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FeedbackGUI {

	private JFrame frame;
	
	private Feedback feed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeedbackGUI window = new FeedbackGUI();
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
	public FeedbackGUI() {
		feed=new Feedback();
		initialize();
	}
	public FeedbackGUI(String username,int tripID) {
		feed=new Feedback();
		feed.setUsername(username);
		feed.setTripID(tripID);
	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBackground(Color.RED);
		frame.setBounds(100, 100, 725, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(58, 104, 598, 338);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextPane feedbacktext = new JTextPane();
		feedbacktext.setBackground(Color.WHITE);
		feedbacktext.setBounds(99, 73, 439, 194);
		panel.add(feedbacktext);
		
		JLabel lblNewLabel_1 = new JLabel("Write your feedback:");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setBackground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(99, 28, 221, 34);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Submit Feedback");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI g=new GUI();
				feed.setFeedback(feedbacktext.getText());
				g.InsertFeedback(feed);
				JOptionPane.showMessageDialog(null,"Feedback Submitted");
				
			}
		});
		btnNewButton.setBounds(116, 293, 169, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(380, 293, 134, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Feedback");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(232, 11, 159, 41);
		frame.getContentPane().add(lblNewLabel);
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
