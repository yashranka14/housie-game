import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;


public class ScorecardFrame extends JFrame {

	/**
	 * 
	 */
	static JLabel label_1 = new JLabel("",SwingConstants.CENTER);
	static JLabel label_14 = new JLabel("",SwingConstants.CENTER);
	static JLabel label_2 = new JLabel("",SwingConstants.CENTER);
	static JLabel label_9 = new JLabel("",SwingConstants.CENTER);
	static JLabel label_4 = new JLabel("",SwingConstants.CENTER);
	static JLabel label_3 = new JLabel("",SwingConstants.CENTER);
	static JLabel label_6 = new JLabel("",SwingConstants.CENTER);
	static JLabel label_7 = new JLabel("",SwingConstants.CENTER);
	static JLabel label_5 = new JLabel("",SwingConstants.CENTER);
	static JLabel label_8 = new JLabel("",SwingConstants.CENTER);
	static JLabel label_10 = new JLabel("",SwingConstants.CENTER);
	static JLabel label_11 = new JLabel("",SwingConstants.CENTER);
	static JLabel label_12 = new JLabel("",SwingConstants.CENTER);
	static JLabel label_13 = new JLabel("",SwingConstants.CENTER);

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ScorecardFrame(int p1, int p2, int p3, int p4) {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 531, 510);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLAYER 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(0, 0, 92, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblPlayer = new JLabel("PLAYER 2");
		lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlayer.setBounds(0, 45, 92, 32);
		contentPane.add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("PLAYER 3");
		lblPlayer_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlayer_1.setBounds(242, 0, 92, 32);
		contentPane.add(lblPlayer_1);
		
		JLabel lblPlayer_2 = new JLabel("PLAYER 4");
		lblPlayer_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlayer_2.setBounds(242, 45, 92, 32);
		contentPane.add(lblPlayer_2);
		
		JLabel lblBigSmall = new JLabel(" BIG  SMALL");
		lblBigSmall.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBigSmall.setBounds(10, 125, 110, 45);
		contentPane.add(lblBigSmall);
		
		JLabel lblFirstRow = new JLabel(" FIRST ROW");
		lblFirstRow.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFirstRow.setBounds(10, 253, 110, 45);
		contentPane.add(lblFirstRow);
		
		JLabel lblSecondRow = new JLabel(" SECOND ");
		lblSecondRow.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSecondRow.setBounds(10, 311, 110, 45);
		contentPane.add(lblSecondRow);
		
		JLabel lblThird = new JLabel("THIRD");
		lblThird.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThird.setBounds(10, 385, 110, 45);
		contentPane.add(lblThird);
		
		JLabel lblPrizes = new JLabel("                                             PRIZES");
		lblPrizes.setOpaque(true);
		lblPrizes.setBackground(Color.CYAN);
		lblPrizes.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPrizes.setBounds(10, 96, 493, 29);
		lblPrizes.setBorder(new LineBorder(Color.BLACK,1));
		contentPane.add(lblPrizes);
		
		
		JLabel lblFour = new JLabel("FOUR");
		lblFour.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFour.setBounds(20, 171, 110, 45);
		contentPane.add(lblFour);
		
		JLabel lblCorners = new JLabel("CORNERS");
		lblCorners.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCorners.setBounds(20, 195, 110, 45);
		contentPane.add(lblCorners);
		
		JLabel lblRow = new JLabel("   ROW");
		lblRow.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRow.setBounds(0, 327, 110, 45);
		contentPane.add(lblRow);
		
		JLabel lblRow_1 = new JLabel("ROW");
		lblRow_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRow_1.setBounds(10, 401, 110, 45);
		contentPane.add(lblRow_1);
		
		JLabel lblCouple = new JLabel("COUPLE");
		lblCouple.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCouple.setBounds(264, 125, 110, 45);
		contentPane.add(lblCouple);
		
		JLabel lblFirst = new JLabel("FIRST FIVE");
		lblFirst.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFirst.setBounds(264, 187, 110, 45);
		contentPane.add(lblFirst);
		
		JLabel lblFullHousie = new JLabel("FULL");
		lblFullHousie.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFullHousie.setBounds(264, 245, 110, 45);
		contentPane.add(lblFullHousie);
		
		JLabel lblFull = new JLabel("FULL");
		lblFull.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFull.setBounds(264, 311, 110, 45);
		contentPane.add(lblFull);
		
		JLabel lblFull_1 = new JLabel("FULL");
		lblFull_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFull_1.setBounds(264, 385, 110, 45);
		contentPane.add(lblFull_1);
		
		JLabel lblHousie = new JLabel("HOUSIE 1");
		lblHousie.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHousie.setBounds(264, 269, 110, 45);
		contentPane.add(lblHousie);
		
		JLabel lblHousie_1 = new JLabel("HOUSIE 2");
		lblHousie_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHousie_1.setBounds(264, 327, 110, 45);
		contentPane.add(lblHousie_1);
		
		JLabel lblHousie_2 = new JLabel("HOUSIE 3");
		lblHousie_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHousie_2.setBounds(264, 401, 110, 45);
		contentPane.add(lblHousie_2);
		
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBorder(new LineBorder(Color.BLACK,1));
		label_1.setBackground(Color.CYAN);
		label_1.setBounds(137, 187, 98, 29);
		contentPane.add(label_1);
		
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBorder(new LineBorder(Color.BLACK,1));
		label_2.setBackground(Color.CYAN);
		label_2.setBounds(132, 261, 98, 29);
		contentPane.add(label_2);
		
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_3.setBorder(new LineBorder(Color.BLACK,1));
		label_3.setBackground(Color.CYAN);
		label_3.setBounds(132, 327, 98, 29);
		contentPane.add(label_3);
		
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_4.setBorder(new LineBorder(Color.BLACK,1));
		label_4.setBackground(Color.CYAN);
		label_4.setBounds(132, 401, 98, 29);
		contentPane.add(label_4);
		
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_5.setBorder(new LineBorder(Color.BLACK,1));
		label_5.setBackground(Color.CYAN);
		label_5.setBounds(384, 141, 98, 29);
		contentPane.add(label_5);
		
		label_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_6.setBorder(new LineBorder(Color.BLACK,1));
		label_6.setBackground(Color.CYAN);
		label_6.setBounds(384, 203, 98, 29);
		contentPane.add(label_6);
		
		label_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_7.setBorder(new LineBorder(Color.BLACK,1));
		label_7.setBackground(Color.CYAN);
		label_7.setBounds(384, 269, 98, 29);
		contentPane.add(label_7);
		
		label_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_8.setBorder(new LineBorder(Color.BLACK,1));
		label_8.setBackground(Color.CYAN);
		label_8.setBounds(384, 327, 98, 29);
		contentPane.add(label_8);
		
		label_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_9.setBorder(new LineBorder(Color.BLACK,1));
		label_9.setBackground(Color.CYAN);
		label_9.setBounds(384, 401, 98, 29);
		contentPane.add(label_9);

		label_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_14.setBorder(new LineBorder(Color.BLACK,1));
		label_14.setBackground(Color.CYAN);
		label_14.setBounds(137, 141, 98, 29);
		contentPane.add(label_14);
				
		label_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_10.setBorder(new LineBorder(Color.BLACK,1));
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(98, 9, 98, 29);
		label_10.setText(""+p1);
		contentPane.add(label_10);
		
		//JLabel label_11 = new JLabel("",SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_11.setBorder(new LineBorder(Color.BLACK,1));
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(98, 54, 98, 29);
		label_11.setText(""+p2);
		contentPane.add(label_11);
		
		//JLabel label_12 = new JLabel("",SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_12.setBorder(new LineBorder(Color.BLACK,1));
		label_12.setBackground(Color.WHITE);
		label_12.setBounds(338, 9, 98, 29);
		label_12.setText(""+p3);
		contentPane.add(label_12);
		
		//JLabel label_13 = new JLabel("",SwingConstants.CENTER);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_13.setBorder(new LineBorder(Color.BLACK,1));
		label_13.setBackground(Color.WHITE);
		label_13.setBounds(338, 54, 98, 29);
		label_13.setText(""+p4);
		contentPane.add(label_13);
	}
}
