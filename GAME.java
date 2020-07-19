import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class GAME extends JFrame {

	private JPanel contentPane;

	private int a1, a2, num;

	private int x;
	private JLabel[] numbersLabel;
	private JLabel[] Ticket1;
	private JLabel[] Ticket2;
	private JLabel[] Ticket3;
	private JLabel[] Ticket4;
	private JLabel lblAhsghaghs;
	public static int[] score = new int[4];
	
	ArrayList<Integer> a = new ArrayList();
	ArrayList<Integer> t1= new ArrayList<Integer>();
	ArrayList<Integer> t2= new ArrayList<Integer>();
	ArrayList<Integer> t3= new ArrayList<Integer>();
	ArrayList<Integer> t4= new ArrayList<Integer>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GAME frame = new GAME();
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
	public GAME() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 444);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		numbersLabel = new JLabel[90];

		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 292, 254);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(9, 10));

		final Ticket ticket1 = new Ticket(contentPane, new int[]{328, 20, 313, 77},new Integer[]{9,10,19,2,3,21,4,13,23,15,24,7,25,8,17},1);
		final Ticket ticket2 = new Ticket(contentPane, new int[]{328, 111, 313, 77},new Integer[]{18,1,19,2,11,12,21,13,22,5,23,6,15,7,17},2);
		final Ticket ticket3 = new Ticket(contentPane, new int[]{328, 201, 313, 77},new Integer[]{11,20,10,1,9,18,3,4,5,14,24,26,17,7,25},3);
		final Ticket ticket4 = new Ticket(contentPane, new int[]{328, 291, 313, 77},new Integer[]{9,0,19,1,11,3,21,4,22,14,24,15,7,26,17},4);
		
		ticket1.sortTicket();
		ticket2.sortTicket();
		ticket3.sortTicket();
		ticket4.sortTicket();
		
		final JButton btn1 = new JButton("QUIT");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn1.setVisible(false);
				ticket1.setVisible(false);
			}
		});
		btn1.setVisible(false);
		btn1.setBounds(653, 48, 72, 25);
		contentPane.add(btn1);

		final JButton btn2 = new JButton("QUIT");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn2.setVisible(false);
				ticket2.setVisible(false);
			}
		});

		btn2.setVisible(false);
		btn2.setBounds(653, 137, 72, 25);
		contentPane.add(btn2);

		final JButton btn3 = new JButton("QUIT");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn3.setVisible(false);
				ticket3.setVisible(false);
			}
		});

		btn3.setVisible(false);
		btn3.setBounds(653, 228, 72, 25);
		contentPane.add(btn3);

		final JButton btn4 = new JButton("QUIT");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn4.setVisible(false);
				ticket4.setVisible(false);
			}
		});

		btn4.setVisible(false);
		btn4.setBounds(653, 323, 72, 25);
		contentPane.add(btn4);

		final JButton btnGenerateNumber = new JButton("Generate Number");
		btnGenerateNumber.setBounds(12, 280, 155, 25);
		contentPane.add(btnGenerateNumber);
		btnGenerateNumber.setVisible(false);

		final JButton btnGenerateTickets = new JButton("Generate tickets");
		btnGenerateTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ticket1.setVisible(true);
				ticket2.setVisible(true);
				ticket3.setVisible(true);
				ticket4.setVisible(true);
				btn1.setVisible(true);
				btn2.setVisible(true);
				btn3.setVisible(true);
				btn4.setVisible(true);
				btnGenerateNumber.setVisible(true);
				btnGenerateTickets.setVisible(false);
			}
		});

		btnGenerateTickets.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnGenerateTickets.setBounds(12, 361, 134, 25);
		contentPane.add(btnGenerateTickets);

		final JLabel lblNewLabel = new JLabel("",SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));

		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setBounds(208, 280, 91, 70);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBorder(new LineBorder(Color.BLACK, 3));
		contentPane.add(lblNewLabel);

		JButton btnScorecard = new JButton("Scorecard");
		btnScorecard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ScorecardFrame(score[0],score[1],score[2],score[3]).setVisible(true);
			}
		});
		btnScorecard.setBounds(174, 364, 125, 25);
		contentPane.add(btnScorecard);

		for(int i=0;i<90;i++) {
			numbersLabel[i] = new JLabel(""+(i+1),SwingConstants.CENTER);
			numbersLabel[i].setOpaque(true);
			numbersLabel[i].setFont(new Font("Serif", Font.BOLD, 18));
			numbersLabel[i].setForeground(Color.BLACK);
			numbersLabel[i].setBackground(Color.WHITE);
			numbersLabel[i].setBorder(new LineBorder(new Color(0, 0, 0)));
			panel.add(numbersLabel[i]);
		}

		btnGenerateNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				while(true) {
					if(a.size() == 90)
						break; 
					x = 1 + (int) (( Math.random() % 100 ) * 90);
					if(!a.contains(x)){
						numbersLabel[x-1].setBackground(Color.YELLOW);
						a.add(x);
						lblNewLabel.setText(""+x);
						
						ticket1.markTicket(x);
						ticket2.markTicket(x);
						ticket3.markTicket(x);
						ticket4.markTicket(x);
						ticket1.checkWin();
						ticket2.checkWin();
						ticket3.checkWin();
						ticket4.checkWin();
						break;
					}
				}
			}
		});
	}
}
