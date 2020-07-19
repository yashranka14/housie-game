import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;


public class Startscreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Startscreen frame = new Startscreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Startscreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 407);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(Color.YELLOW);
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOUSIE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel.setBounds(249, -15, 289, 133);
		contentPane.add(lblNewLabel);
		
		final JCheckBox chckbxIAgree = new JCheckBox("I AGREE ");
		chckbxIAgree.setToolTipText("click this button to start playing");
		chckbxIAgree.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		chckbxIAgree.setBounds(286, 290, 113, 25);
		contentPane.add(chckbxIAgree);
		

		final JButton btnStartGame = new JButton("START GAME");
		btnStartGame.setVisible(false);
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new GAME().setVisible(true);
			}
		});
		btnStartGame.setBounds(249, 324, 173, 25);
		btnStartGame.setVisible(false);
		contentPane.add(btnStartGame);
				
		/*while(true)
		{
			if(chckbxIAgree.isSelected())
			{
				btnStartGame.setVisible(true);
				break;
			}
		}*/
				
		JLabel lblRules = new JLabel("Rules :");
		lblRules.setFont(new Font("Tw Cen MT", Font.BOLD, 24));
		lblRules.setBounds(36, 68, 200, 50);
		contentPane.add(lblRules);
		
		JLabel lblNewLabel_1 = new JLabel("\u2022 Only one ticket per player");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(36, 103, 386, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblOnlyA = new JLabel("\u2022 Only a called number can be marked on a ticket");
		lblOnlyA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOnlyA.setBounds(36, 178, 624, 50);
		contentPane.add(lblOnlyA);
		
		JLabel lblACheck = new JLabel("\u2022 A check will be performed to for each winning condition");
		lblACheck.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblACheck.setBounds(36, 141, 624, 50);
		contentPane.add(lblACheck);
		
		JLabel lblIfThere = new JLabel("\u2022 If there is a tie for a prize, points are distributed equally");
		lblIfThere.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIfThere.setBounds(36, 219, 624, 50);
		contentPane.add(lblIfThere);
		
		chckbxIAgree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxIAgree.isSelected()) {
					btnStartGame.setVisible(true);
				}
			}
		});
	}
}
