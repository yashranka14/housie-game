import java.awt.Color;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ticket extends JPanel {

	private int tid;
	private JLabel[] ticketsLabel;
	public static int points = 0;
	
	private static int fcflag = 0, ffflag = 0 , frflag = 0, srflag = 0, trflag = 0, bsflag = 0, fh1 = 0, fh2 = 0, fh3 = 0,t1flag = 0 ,
			           t2flag = 0, t3flag = 0, t4flag = 0, cplflag = 0;
	
	private int num;
	private int ncount = 0;
	private Integer[] arr;

	private TreeSet<Integer> uniqueRandomNumbers;

	private Iterator<Integer> uniqueRandomNumbersIterator;

	/**
	 * auto generated
	 */
	private static final long serialVersionUID = 1L;

	public Ticket(JPanel contentPane, int[] bounds, Integer[] pos,int id) {
		setVisible(false);
		setBackground(Color.WHITE);
		setBounds(bounds[0], bounds[1], bounds[2], bounds[3]);
		setLayout(new GridLayout(3,9, 0, 0));
		contentPane.add(this);
		tid = id;
		arr = pos;
		ticketsLabel = new JLabel[27];

		generateTicket();
	}

	public void markTicket(int n)
	{
		for(int i=0;i<27;i++)
		{
			if(ticketsLabel[i].getText().equals(""+n))
			{
				ticketsLabel[i].setBackground(Color.GREEN);
				ticketsLabel[i].setForeground(Color.YELLOW);
				ncount++; 
			}
		}
	}

	public void generateTicket() {
		for(int i=0;i<27;i++) {
			ticketsLabel[i] = Util.getTicket();
			add(ticketsLabel[i]);
		}

		uniqueRandomNumbers = new TreeSet<Integer>();

		for(Integer pos : arr) {
			if(pos == 0 || pos == 9 || pos == 18) {
				num = Util.getRandomNumber(1, 10);

				while(uniqueRandomNumbers.contains(num)) {
					num = Util.getRandomNumber(1, 10);
				}
				
				uniqueRandomNumbers.add(num);

				ticketsLabel[pos].setText("" + num);
				ticketsLabel[pos].setBackground(Color.WHITE);
			}

			else if(pos == 1 || pos == 10 || pos == 19) {
				num = Util.getRandomNumber(11, 10);

				while(uniqueRandomNumbers.contains(num)) {
					num = Util.getRandomNumber(11, 10);
				}

				uniqueRandomNumbers.add(num);
				
				ticketsLabel[pos].setText("" + num);
				ticketsLabel[pos].setBackground(Color.WHITE);
			}

			else if(pos == 2 || pos == 11 || pos == 20) {
				num = Util.getRandomNumber(21, 10);

				while(uniqueRandomNumbers.contains(num)) {
					num = Util.getRandomNumber(21, 10);
				}
				
				uniqueRandomNumbers.add(num);

				ticketsLabel[pos].setText("" + num);
				ticketsLabel[pos].setBackground(Color.WHITE);
			}

			else if(pos == 3 || pos == 12 || pos == 21) {
				num = Util.getRandomNumber(31, 10);

				while(uniqueRandomNumbers.contains(num)) {
					num = Util.getRandomNumber(31, 10);
				}

				uniqueRandomNumbers.add(num);
				
				ticketsLabel[pos].setText("" + num);
				ticketsLabel[pos].setBackground(Color.WHITE);
			} 			
			else if(pos == 4 || pos == 13 || pos == 22) {
				num = Util.getRandomNumber(41, 10);

				while(uniqueRandomNumbers.contains(num)) {
					num = Util.getRandomNumber(41, 10);
				}

				uniqueRandomNumbers.add(num);
				
				ticketsLabel[pos].setText("" + num);
				ticketsLabel[pos].setBackground(Color.WHITE);
			}

			else if(pos == 5 || pos == 14 || pos == 23) {
				num = Util.getRandomNumber(51, 10);

				while(uniqueRandomNumbers.contains(num)) {
					num = Util.getRandomNumber(51, 10);
				}

				uniqueRandomNumbers.add(num);
				
				ticketsLabel[pos].setText("" + num);
				ticketsLabel[pos].setBackground(Color.WHITE);
			}

			else if(pos == 6 || pos == 15 || pos == 24) {
				num = Util.getRandomNumber(61, 10);

				while(uniqueRandomNumbers.contains(num)) {
					num = Util.getRandomNumber(61, 10);
				}

				uniqueRandomNumbers.add(num);
				
				ticketsLabel[pos].setText("" + num);
				ticketsLabel[pos].setBackground(Color.WHITE);
			} 

			else if(pos == 7 || pos == 16 || pos == 25) {
				num = Util.getRandomNumber(71, 10);

				while(uniqueRandomNumbers.contains(num)) {
					num = Util.getRandomNumber(71, 10);
				}

				uniqueRandomNumbers.add(num);
				
				ticketsLabel[pos].setText("" + num);
				ticketsLabel[pos].setBackground(Color.WHITE);
			}

			else if(pos == 8 || pos == 17 || pos == 26) {
				num = Util.getRandomNumber(81, 10);

				while(uniqueRandomNumbers.contains(num)) {
					num = Util.getRandomNumber(81, 10);
				}

				uniqueRandomNumbers.add(num);
				
				ticketsLabel[pos].setText("" + num);
				ticketsLabel[pos].setBackground(Color.WHITE);
			}
		}
	}
	
	 public void checkWin()
	 {
		if(fcflag == 0)
		{
			if(t1flag == 0 && tid == 1)
			{
				if(ticketsLabel[2].getBackground() == Color.GREEN && ticketsLabel[8].getBackground() == Color.GREEN && 
				   ticketsLabel[19].getBackground() == Color.GREEN && ticketsLabel[25].getBackground() == Color.GREEN)
				{
					JOptionPane.showMessageDialog(null, "Player 1 wins four corners");

					points = Integer.parseInt(ScorecardFrame.label_10.getText());
					points = points + 10;
					ScorecardFrame.label_10.setText(""+points);	

					ScorecardFrame.label_1.setText("Player 1");
					fcflag = 1;
				}
			}
			
			else if(t2flag == 0 && tid == 2)
			{
				if(ticketsLabel[1].getBackground() == Color.GREEN && ticketsLabel[7].getBackground() == Color.GREEN && 
				   ticketsLabel[18].getBackground() == Color.GREEN && ticketsLabel[23].getBackground() == Color.GREEN)
				{
					JOptionPane.showMessageDialog(null, "Player 2 wins four corners");

					points = Integer.parseInt(ScorecardFrame.label_11.getText());
					points = points + 10;
					ScorecardFrame.label_11.setText(""+points);

					ScorecardFrame.label_1.setText("Player 2");
					fcflag = 1;
				}
			}
			
			else if(t3flag == 0 && tid == 3)
			{
				if(ticketsLabel[1].getBackground() == Color.GREEN && ticketsLabel[7].getBackground() == Color.GREEN && 
				   ticketsLabel[18].getBackground() == Color.GREEN && ticketsLabel[26].getBackground() == Color.GREEN)
				{
					JOptionPane.showMessageDialog(null, "Player 3 wins four corners");

					points = Integer.parseInt(ScorecardFrame.label_12.getText());
					points = points + 10;
					ScorecardFrame.label_12.setText(""+points);

					ScorecardFrame.label_1.setText("Player 3");
					fcflag = 1;
				}
			}
			
			else if(t4flag == 0 && tid == 4)
			{
				if(ticketsLabel[0].getBackground() == Color.GREEN && ticketsLabel[7].getBackground() == Color.GREEN && 
				   ticketsLabel[19].getBackground() == Color.GREEN && ticketsLabel[26].getBackground() == Color.GREEN)
				{
					JOptionPane.showMessageDialog(null, "Player 4 wins four corners");

					points = Integer.parseInt(ScorecardFrame.label_13.getText());
					points = points + 10;
					ScorecardFrame.label_13.setText(""+points);

					ScorecardFrame.label_1.setText("Player 4");
					fcflag = 1;
				}
			}
		} // fcflag

		if(cplflag == 0)
		{
			if(t1flag == 0 && tid == 1)
			{
				if( (ticketsLabel[2].getBackground() == Color.GREEN && ticketsLabel[3].getBackground() == Color.GREEN) ||
					(ticketsLabel[3].getBackground() == Color.GREEN && ticketsLabel[4].getBackground() == Color.GREEN) ||
					(ticketsLabel[7].getBackground() == Color.GREEN && ticketsLabel[8].getBackground() == Color.GREEN) ||
					(ticketsLabel[9].getBackground() == Color.GREEN && ticketsLabel[10].getBackground() == Color.GREEN) ||
					(ticketsLabel[23].getBackground() == Color.GREEN && ticketsLabel[24].getBackground() == Color.GREEN) ||
					(ticketsLabel[24].getBackground() == Color.GREEN && ticketsLabel[25].getBackground() == Color.GREEN) )
				{
					JOptionPane.showMessageDialog(null, "Player 1 wins Couple");	

					points = Integer.parseInt(ScorecardFrame.label_10.getText());
					points = points + 10;
					ScorecardFrame.label_10.setText(""+points);

					ScorecardFrame.label_5.setText("Player 1");
					cplflag = 1;
				}
			} // TICKET 1

			if(t2flag == 0 && tid == 2)
			{
				if( (ticketsLabel[1].getBackground() == Color.GREEN && ticketsLabel[2].getBackground() == Color.GREEN) ||
					(ticketsLabel[5].getBackground() == Color.GREEN && ticketsLabel[6].getBackground() == Color.GREEN) ||
					(ticketsLabel[6].getBackground() == Color.GREEN && ticketsLabel[7].getBackground() == Color.GREEN) ||
					(ticketsLabel[11].getBackground() == Color.GREEN && ticketsLabel[12].getBackground() == Color.GREEN) ||
					(ticketsLabel[12].getBackground() == Color.GREEN && ticketsLabel[13].getBackground() == Color.GREEN) ||
					(ticketsLabel[18].getBackground() == Color.GREEN && ticketsLabel[19].getBackground() == Color.GREEN) ||
					(ticketsLabel[21].getBackground() == Color.GREEN && ticketsLabel[22].getBackground() == Color.GREEN) ||
					(ticketsLabel[22].getBackground() == Color.GREEN && ticketsLabel[23].getBackground() == Color.GREEN) )
				{
					JOptionPane.showMessageDialog(null, "Player 2 wins Couple");	

					points = Integer.parseInt(ScorecardFrame.label_11.getText());
					points = points + 10;
					ScorecardFrame.label_11.setText(""+points);

					ScorecardFrame.label_5.setText("Player 2");
					cplflag = 1;
				}
			} // TICKET 2	

			if(t3flag == 0 && tid == 3)
			{
				if( (ticketsLabel[3].getBackground() == Color.GREEN && ticketsLabel[4].getBackground() == Color.GREEN) ||
					(ticketsLabel[4].getBackground() == Color.GREEN && ticketsLabel[5].getBackground() == Color.GREEN) ||
					(ticketsLabel[9].getBackground() == Color.GREEN && ticketsLabel[10].getBackground() == Color.GREEN) ||
					(ticketsLabel[10].getBackground() == Color.GREEN && ticketsLabel[11].getBackground() == Color.GREEN) ||
					(ticketsLabel[24].getBackground() == Color.GREEN && ticketsLabel[25].getBackground() == Color.GREEN) ||
					(ticketsLabel[25].getBackground() == Color.GREEN && ticketsLabel[26].getBackground() == Color.GREEN) )
				{
					JOptionPane.showMessageDialog(null, "Player 3 wins Couple");	

					points = Integer.parseInt(ScorecardFrame.label_12.getText());
					points = points + 10;
					ScorecardFrame.label_12.setText(""+points);

					ScorecardFrame.label_5.setText("Player 3");
					cplflag = 1;
				}
			} // TICKET 3

			if(t4flag == 0 && tid == 4)
			{
				if( (ticketsLabel[0].getBackground() == Color.GREEN && ticketsLabel[1].getBackground() == Color.GREEN) ||
					(ticketsLabel[3].getBackground() == Color.GREEN && ticketsLabel[4].getBackground() == Color.GREEN) ||
					(ticketsLabel[14].getBackground() == Color.GREEN && ticketsLabel[15].getBackground() == Color.GREEN) ||
					(ticketsLabel[21].getBackground() == Color.GREEN && ticketsLabel[22].getBackground() == Color.GREEN) )
				{
					JOptionPane.showMessageDialog(null, "Player 4 wins Couple");	

					points = Integer.parseInt(ScorecardFrame.label_13.getText());
					points = points + 10;
					ScorecardFrame.label_13.setText(""+points);

					ScorecardFrame.label_5.setText("Player 4");
					cplflag = 1;
				}
			} // TICKET 4			

		} // Couple 	
		
		if(ffflag == 0)
		{
			if(t1flag == 0 && tid == 1)
			{
				if(ncount == 5)
				{
					JOptionPane.showMessageDialog(null, "Player 1 wins first five");

					points = Integer.parseInt(ScorecardFrame.label_10.getText());
					points = points + 10;
					ScorecardFrame.label_10.setText(""+points);

					ScorecardFrame.label_6.setText("Player 1");
					ffflag = 1;
				}
			}
			
			if(t2flag == 0 && tid == 2)
			{
				if(ncount == 5)
				{
					JOptionPane.showMessageDialog(null, "Player 2 wins first five");

					points = Integer.parseInt(ScorecardFrame.label_11.getText());
					points = points + 10;
					ScorecardFrame.label_11.setText(""+points);

					ScorecardFrame.label_6.setText("Player 2");
					ffflag = 1;
				}
			}
			
			if(t3flag == 0 && tid == 3)
			{
				if(ncount == 5)
				{
					JOptionPane.showMessageDialog(null, "Player 3 wins first five");

					points = Integer.parseInt(ScorecardFrame.label_12.getText());
					points = points + 10;
					ScorecardFrame.label_12.setText(""+points);

					ScorecardFrame.label_6.setText("Player 3");
					ffflag = 1;
				}
			}
			
			if(t4flag == 0 && tid == 4)
			{
				if(ncount == 5)
				{
					JOptionPane.showMessageDialog(null, "Player 4 wins first five");

					points = Integer.parseInt(ScorecardFrame.label_13.getText());
					points = points + 10;
					ScorecardFrame.label_13.setText(""+points);

					ScorecardFrame.label_6.setText("Player 4");
					ffflag = 1;
				}
			}
			
		} // ffflag
		
		if(frflag == 0)
		{
			if(t1flag == 0 && tid == 1)
			{
				if(ticketsLabel[2].getBackground() == Color.GREEN && ticketsLabel[3].getBackground() == Color.GREEN && 
						   ticketsLabel[4].getBackground() == Color.GREEN && 
						   ticketsLabel[7].getBackground() == Color.GREEN && ticketsLabel[8].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 1 wins first row");	

							points = Integer.parseInt(ScorecardFrame.label_10.getText());
							points = points + 10;
							ScorecardFrame.label_10.setText(""+points);	

							ScorecardFrame.label_2.setText("Player 1");
							frflag = 1;
						}
			}
			
			else if(t2flag == 0 && tid == 2)
			{
				if(ticketsLabel[1].getBackground() == Color.GREEN && ticketsLabel[2].getBackground() == Color.GREEN && 
						   ticketsLabel[5].getBackground() == Color.GREEN && 
						   ticketsLabel[6].getBackground() == Color.GREEN && ticketsLabel[7].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 2 wins first row");

							points = Integer.parseInt(ScorecardFrame.label_11.getText());
							points = points + 10;
							ScorecardFrame.label_11.setText(""+points);	

							ScorecardFrame.label_2.setText("Player 2");
							frflag = 1;
						}
			}
			
			else if(t3flag == 0 && tid == 3)
			{
				if(ticketsLabel[1].getBackground() == Color.GREEN && ticketsLabel[3].getBackground() == Color.GREEN && 
						   ticketsLabel[4].getBackground() == Color.GREEN && 
						   ticketsLabel[5].getBackground() == Color.GREEN && ticketsLabel[7].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 3 wins first row");

							points = Integer.parseInt(ScorecardFrame.label_12.getText());
							points = points + 10;
							ScorecardFrame.label_12.setText(""+points);	

							ScorecardFrame.label_2.setText("Player 3");
							frflag = 1;
						}
			}
			
			else if(t4flag == 0 && tid == 4)
			{
				if(ticketsLabel[0].getBackground() == Color.GREEN && ticketsLabel[1].getBackground() == Color.GREEN && 
						   ticketsLabel[3].getBackground() == Color.GREEN && 
						   ticketsLabel[4].getBackground() == Color.GREEN && ticketsLabel[7].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 4 wins first row");

							points = Integer.parseInt(ScorecardFrame.label_13.getText());
							points = points + 10;
							ScorecardFrame.label_13.setText(""+points);	

							ScorecardFrame.label_2.setText("Player 4");
							frflag = 1;
						}
			}
			
		} // FIRST ROW
		
		if(srflag == 0)
		{
			if(t1flag == 0 && tid == 1)
			{
				if(ticketsLabel[9].getBackground() == Color.GREEN && ticketsLabel[10].getBackground() == Color.GREEN && 
						   ticketsLabel[13].getBackground() == Color.GREEN && 
						   ticketsLabel[15].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 1 wins second row");

							points = Integer.parseInt(ScorecardFrame.label_10.getText());
							points = points + 10;
							ScorecardFrame.label_10.setText(""+points);

							ScorecardFrame.label_3.setText("Player 1");
							srflag = 1;
						}
			}
			
			else if(t2flag == 0 && tid == 2)
			{
				if(ticketsLabel[11].getBackground() == Color.GREEN && ticketsLabel[12].getBackground() == Color.GREEN && 
						   ticketsLabel[13].getBackground() == Color.GREEN && 
						   ticketsLabel[15].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 2 wins second row");

							points = Integer.parseInt(ScorecardFrame.label_11.getText());
							points = points + 10;
							ScorecardFrame.label_11.setText(""+points);

							ScorecardFrame.label_3.setText("Player 2");
							srflag = 1;
						}
			}
			
			else if(t3flag == 0 && tid == 3)
			{
				if(ticketsLabel[9].getBackground() == Color.GREEN && ticketsLabel[10].getBackground() == Color.GREEN && 
						   ticketsLabel[11].getBackground() == Color.GREEN && 
						   ticketsLabel[14].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 3 wins second row");

							points = Integer.parseInt(ScorecardFrame.label_12.getText());
							points = points + 10;
							ScorecardFrame.label_12.setText(""+points);

							ScorecardFrame.label_3.setText("Player 3");
							srflag = 1;
						}
			}
			
			else if(t4flag == 0 && tid == 4)
			{
				if(ticketsLabel[9].getBackground() == Color.GREEN && ticketsLabel[11].getBackground() == Color.GREEN && 
						   ticketsLabel[14].getBackground() == Color.GREEN && 
						   ticketsLabel[15].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 4 wins second row");

							points = Integer.parseInt(ScorecardFrame.label_13.getText());
							points = points + 10;
							ScorecardFrame.label_13.setText(""+points);

							ScorecardFrame.label_3.setText("Player 4");
							srflag = 1;
						}
			}
			
		} // SECOND ROW
		
		if(trflag == 0)
		{
			if(t1flag == 0 && tid == 1)
			{
				if(ticketsLabel[19].getBackground() == Color.GREEN && ticketsLabel[21].getBackground() == Color.GREEN && 
						   ticketsLabel[23].getBackground() == Color.GREEN && 
						   ticketsLabel[24].getBackground() == Color.GREEN && ticketsLabel[25].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 1 wins third row");

							points = Integer.parseInt(ScorecardFrame.label_10.getText());
							points = points + 10;
							ScorecardFrame.label_10.setText(""+points);

							ScorecardFrame.label_4.setText("Player 1");
							trflag = 1;
						}
			}
			
			else if(t2flag == 0 && tid == 2)
			{
				if(ticketsLabel[18].getBackground() == Color.GREEN && ticketsLabel[19].getBackground() == Color.GREEN && 
						   ticketsLabel[21].getBackground() == Color.GREEN && 
						   ticketsLabel[22].getBackground() == Color.GREEN && ticketsLabel[23].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 2 wins third row");

							points = Integer.parseInt(ScorecardFrame.label_11.getText());
							points = points + 10;
							ScorecardFrame.label_11.setText(""+points);

							ScorecardFrame.label_4.setText("Player 2");
							trflag = 1;
						}
			}
			
			else if(t3flag == 0 && tid == 3)
			{
				if(ticketsLabel[18].getBackground() == Color.GREEN && ticketsLabel[20].getBackground() == Color.GREEN && 
						   ticketsLabel[24].getBackground() == Color.GREEN && 
						   ticketsLabel[25].getBackground() == Color.GREEN && ticketsLabel[26].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 3 wins third row");

							points = Integer.parseInt(ScorecardFrame.label_12.getText());
							points = points + 10;
							ScorecardFrame.label_12.setText(""+points);

							ScorecardFrame.label_4.setText("Player 3");
							trflag = 1;
						}
			}
			
			else if(t4flag == 0 && tid == 4)
			{
				if(ticketsLabel[19].getBackground() == Color.GREEN && ticketsLabel[21].getBackground() == Color.GREEN && 
						   ticketsLabel[22].getBackground() == Color.GREEN && 
						   ticketsLabel[24].getBackground() == Color.GREEN && ticketsLabel[26].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 4 wins third row");

							points = Integer.parseInt(ScorecardFrame.label_13.getText());
							points = points + 10;
							ScorecardFrame.label_13.setText(""+points);

							ScorecardFrame.label_4.setText("Player 4");
							trflag = 1;
						}
			}
			
		} // THIRD ROW
		
		if(bsflag == 0)
		{
			if(t1flag == 0 && tid == 1)
			{
				if(ticketsLabel[9].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN)
				{
					JOptionPane.showMessageDialog(null, "Player 1 wins Big Small");

					points = Integer.parseInt(ScorecardFrame.label_10.getText());
					points = points + 10;
					ScorecardFrame.label_10.setText(""+points);

					ScorecardFrame.label_14.setText("Player 1");
					bsflag = 1;
				}
			}
			
			else if(t2flag == 0 && tid == 2)
			{
				if(ticketsLabel[18].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN)
				{
					JOptionPane.showMessageDialog(null, "Player 2 wins Big Small");

					points = Integer.parseInt(ScorecardFrame.label_11.getText());
					points = points + 10;
					ScorecardFrame.label_11.setText(""+points);

					ScorecardFrame.label_14.setText("Player 2");
					bsflag = 1;
				}
			}
			
			else if(t3flag == 0 && tid == 3)
			{
				if(ticketsLabel[9].getBackground() == Color.GREEN && ticketsLabel[26].getBackground() == Color.GREEN)
				{
					JOptionPane.showMessageDialog(null, "Player 3 wins Big Small");

					points = Integer.parseInt(ScorecardFrame.label_12.getText());
					points = points + 10;
					ScorecardFrame.label_12.setText(""+points);

					ScorecardFrame.label_14.setText("Player 3");
					bsflag = 1;
				}
			}
			
			else if(t4flag == 0 && tid == 4)
			{
				if(ticketsLabel[0].getBackground() == Color.GREEN && ticketsLabel[26].getBackground() == Color.GREEN)
				{
					JOptionPane.showMessageDialog(null, "Player 4 wins Big Small");

					points = Integer.parseInt(ScorecardFrame.label_13.getText());
					points = points + 10;
					ScorecardFrame.label_13.setText(""+points);

					ScorecardFrame.label_14.setText("Player 4");
					bsflag = 1;
				}
			}
			
		} // BIG SMALL
		
		if(fh1 == 0)
		{
			if(t1flag == 0 && tid == 1)
			{
				if(ticketsLabel[2].getBackground() == Color.GREEN && ticketsLabel[3].getBackground() == Color.GREEN &&
			       ticketsLabel[4].getBackground() == Color.GREEN && ticketsLabel[7].getBackground() == Color.GREEN &&
				   ticketsLabel[8].getBackground() == Color.GREEN && ticketsLabel[9].getBackground() == Color.GREEN && 
				   ticketsLabel[10].getBackground() == Color.GREEN && ticketsLabel[13].getBackground() == Color.GREEN && 
				   ticketsLabel[15].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN && 
				   ticketsLabel[19].getBackground() == Color.GREEN && ticketsLabel[21].getBackground() == Color.GREEN &&
				   ticketsLabel[23].getBackground() == Color.GREEN && ticketsLabel[24].getBackground() == Color.GREEN &&
				   ticketsLabel[25].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 1 wins full housie 1");

							points = Integer.parseInt(ScorecardFrame.label_10.getText());
							points = points + 30;
							ScorecardFrame.label_10.setText(""+points);

							ScorecardFrame.label_7.setText("Player 1");
							fh1 = 1;
							t1flag = 1;
						}
			}
			
			if(t2flag == 0 && tid == 2)
			{
				if(ticketsLabel[1].getBackground() == Color.GREEN && ticketsLabel[2].getBackground() == Color.GREEN &&
			       ticketsLabel[5].getBackground() == Color.GREEN && ticketsLabel[6].getBackground() == Color.GREEN &&
				   ticketsLabel[7].getBackground() == Color.GREEN && ticketsLabel[11].getBackground() == Color.GREEN && 
				   ticketsLabel[12].getBackground() == Color.GREEN && ticketsLabel[13].getBackground() == Color.GREEN && 
				   ticketsLabel[15].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN && 
				   ticketsLabel[18].getBackground() == Color.GREEN && ticketsLabel[19].getBackground() == Color.GREEN &&
				   ticketsLabel[21].getBackground() == Color.GREEN && ticketsLabel[22].getBackground() == Color.GREEN &&
				   ticketsLabel[23].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 2 wins full housie 1");

							points = Integer.parseInt(ScorecardFrame.label_11.getText());
							points = points + 30;
							ScorecardFrame.label_11.setText(""+points);		

							ScorecardFrame.label_7.setText("Player 2");
							fh1 = 1;
							t2flag = 1;
						}
			}
			
			if(t3flag == 0 && tid == 3)
			{
				if(ticketsLabel[1].getBackground() == Color.GREEN && ticketsLabel[3].getBackground() == Color.GREEN &&
			       ticketsLabel[4].getBackground() == Color.GREEN && ticketsLabel[5].getBackground() == Color.GREEN &&
				   ticketsLabel[7].getBackground() == Color.GREEN && ticketsLabel[9].getBackground() == Color.GREEN && 
				   ticketsLabel[10].getBackground() == Color.GREEN && ticketsLabel[11].getBackground() == Color.GREEN && 
				   ticketsLabel[14].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN && 
				   ticketsLabel[18].getBackground() == Color.GREEN && ticketsLabel[20].getBackground() == Color.GREEN &&
				   ticketsLabel[24].getBackground() == Color.GREEN && ticketsLabel[25].getBackground() == Color.GREEN &&
				   ticketsLabel[26].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 3 wins full housie 1");

							points = Integer.parseInt(ScorecardFrame.label_12.getText());
							points = points + 30;
							ScorecardFrame.label_12.setText(""+points);

							ScorecardFrame.label_7.setText("Player 3");
							fh1 = 1;
							t3flag = 1;
						}
			}
			
			if(t4flag == 0 && tid == 4)
			{
				if(ticketsLabel[0].getBackground() == Color.GREEN && ticketsLabel[1].getBackground() == Color.GREEN &&
			       ticketsLabel[3].getBackground() == Color.GREEN && ticketsLabel[4].getBackground() == Color.GREEN &&
				   ticketsLabel[7].getBackground() == Color.GREEN && ticketsLabel[9].getBackground() == Color.GREEN && 
				   ticketsLabel[11].getBackground() == Color.GREEN && ticketsLabel[14].getBackground() == Color.GREEN && 
				   ticketsLabel[15].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN && 
				   ticketsLabel[19].getBackground() == Color.GREEN && ticketsLabel[21].getBackground() == Color.GREEN &&
				   ticketsLabel[22].getBackground() == Color.GREEN && ticketsLabel[24].getBackground() == Color.GREEN &&
				   ticketsLabel[26].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 4 wins full housie 1");

							points = Integer.parseInt(ScorecardFrame.label_13.getText());
							points = points + 30;
							ScorecardFrame.label_13.setText(""+points);

							ScorecardFrame.label_7.setText("Player 4");
							fh1 = 1;
							t4flag = 1;
						}
			}
				  
		} // FULL HOUSIE 1
		
		if(fh2 == 0)
		{
			if(t1flag == 0 && tid == 1)
			{
				if(ticketsLabel[2].getBackground() == Color.GREEN && ticketsLabel[3].getBackground() == Color.GREEN &&
			       ticketsLabel[4].getBackground() == Color.GREEN && ticketsLabel[7].getBackground() == Color.GREEN &&
				   ticketsLabel[8].getBackground() == Color.GREEN && ticketsLabel[9].getBackground() == Color.GREEN && 
				   ticketsLabel[10].getBackground() == Color.GREEN && ticketsLabel[13].getBackground() == Color.GREEN && 
				   ticketsLabel[15].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN && 
				   ticketsLabel[19].getBackground() == Color.GREEN && ticketsLabel[21].getBackground() == Color.GREEN &&
				   ticketsLabel[23].getBackground() == Color.GREEN && ticketsLabel[24].getBackground() == Color.GREEN &&
				   ticketsLabel[25].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 1 wins full housie 2");

							points = Integer.parseInt(ScorecardFrame.label_10.getText());
							points = points + 20;
							ScorecardFrame.label_10.setText(""+points);

							ScorecardFrame.label_8.setText("Player 1");
							fh2 = 1;
							t1flag = 1;
						}
			}
			
			if(t2flag == 0 && tid == 2)
			{
				if(ticketsLabel[1].getBackground() == Color.GREEN && ticketsLabel[2].getBackground() == Color.GREEN &&
			       ticketsLabel[5].getBackground() == Color.GREEN && ticketsLabel[6].getBackground() == Color.GREEN &&
				   ticketsLabel[7].getBackground() == Color.GREEN && ticketsLabel[11].getBackground() == Color.GREEN && 
				   ticketsLabel[12].getBackground() == Color.GREEN && ticketsLabel[13].getBackground() == Color.GREEN && 
				   ticketsLabel[15].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN && 
				   ticketsLabel[18].getBackground() == Color.GREEN && ticketsLabel[19].getBackground() == Color.GREEN &&
				   ticketsLabel[21].getBackground() == Color.GREEN && ticketsLabel[22].getBackground() == Color.GREEN &&
				   ticketsLabel[23].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 2 wins full housie 2");

							points = Integer.parseInt(ScorecardFrame.label_11.getText());
							points = points + 20;
							ScorecardFrame.label_11.setText(""+points);

							ScorecardFrame.label_8.setText("Player 2");
							fh2 = 1;
							t2flag = 2;
						}
			}
			
			if(t3flag == 0 && tid == 3)
			{
				if(ticketsLabel[1].getBackground() == Color.GREEN && ticketsLabel[3].getBackground() == Color.GREEN &&
			       ticketsLabel[4].getBackground() == Color.GREEN && ticketsLabel[5].getBackground() == Color.GREEN &&
				   ticketsLabel[7].getBackground() == Color.GREEN && ticketsLabel[9].getBackground() == Color.GREEN && 
				   ticketsLabel[10].getBackground() == Color.GREEN && ticketsLabel[11].getBackground() == Color.GREEN && 
				   ticketsLabel[14].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN && 
				   ticketsLabel[18].getBackground() == Color.GREEN && ticketsLabel[20].getBackground() == Color.GREEN &&
				   ticketsLabel[24].getBackground() == Color.GREEN && ticketsLabel[25].getBackground() == Color.GREEN &&
				   ticketsLabel[26].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 3 wins full housie 2");

							points = Integer.parseInt(ScorecardFrame.label_12.getText());
							points = points + 20;
							ScorecardFrame.label_12.setText(""+points);

							ScorecardFrame.label_8.setText("Player 3");
							fh2 = 1;
							t3flag = 1;
						}
			}
			
			if(t4flag == 0 && tid == 4)
			{
				if(ticketsLabel[0].getBackground() == Color.GREEN && ticketsLabel[1].getBackground() == Color.GREEN &&
			       ticketsLabel[3].getBackground() == Color.GREEN && ticketsLabel[4].getBackground() == Color.GREEN &&
				   ticketsLabel[7].getBackground() == Color.GREEN && ticketsLabel[9].getBackground() == Color.GREEN && 
				   ticketsLabel[11].getBackground() == Color.GREEN && ticketsLabel[14].getBackground() == Color.GREEN && 
				   ticketsLabel[15].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN && 
				   ticketsLabel[19].getBackground() == Color.GREEN && ticketsLabel[21].getBackground() == Color.GREEN &&
				   ticketsLabel[22].getBackground() == Color.GREEN && ticketsLabel[24].getBackground() == Color.GREEN &&
				   ticketsLabel[26].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 4 wins full housie 2");

							points = Integer.parseInt(ScorecardFrame.label_13.getText());
							points = points + 20;
							ScorecardFrame.label_13.setText(""+points);

							ScorecardFrame.label_8.setText("Player 4");
							fh2 = 1;
							t4flag = 1;
						}
			}
				  
		} // FULL HOUSIE 2
		
		if(fh3 == 0)
		{
			if(t1flag == 0 && tid == 1)
			{
				if(ticketsLabel[2].getBackground() == Color.GREEN && ticketsLabel[3].getBackground() == Color.GREEN &&
			       ticketsLabel[4].getBackground() == Color.GREEN && ticketsLabel[7].getBackground() == Color.GREEN &&
				   ticketsLabel[8].getBackground() == Color.GREEN && ticketsLabel[9].getBackground() == Color.GREEN && 
				   ticketsLabel[10].getBackground() == Color.GREEN && ticketsLabel[13].getBackground() == Color.GREEN && 
				   ticketsLabel[15].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN && 
				   ticketsLabel[19].getBackground() == Color.GREEN && ticketsLabel[21].getBackground() == Color.GREEN &&
				   ticketsLabel[23].getBackground() == Color.GREEN && ticketsLabel[24].getBackground() == Color.GREEN &&
				   ticketsLabel[25].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 1 wins full housie 3");

							points = Integer.parseInt(ScorecardFrame.label_10.getText());
							points = points + 10;
							ScorecardFrame.label_10.setText(""+points);

							ScorecardFrame.label_9.setText("Player 1");
							fh3 = 1;
							t1flag = 1;
						}
			}
			
			if(t2flag == 0 && tid == 2)
			{
				if(ticketsLabel[1].getBackground() == Color.GREEN && ticketsLabel[2].getBackground() == Color.GREEN &&
			       ticketsLabel[5].getBackground() == Color.GREEN && ticketsLabel[6].getBackground() == Color.GREEN &&
				   ticketsLabel[7].getBackground() == Color.GREEN && ticketsLabel[11].getBackground() == Color.GREEN && 
				   ticketsLabel[12].getBackground() == Color.GREEN && ticketsLabel[13].getBackground() == Color.GREEN && 
				   ticketsLabel[15].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN && 
				   ticketsLabel[18].getBackground() == Color.GREEN && ticketsLabel[19].getBackground() == Color.GREEN &&
				   ticketsLabel[21].getBackground() == Color.GREEN && ticketsLabel[22].getBackground() == Color.GREEN &&
				   ticketsLabel[23].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 2 wins full housie 3");

							points = Integer.parseInt(ScorecardFrame.label_11.getText());
							points = points + 10;
							ScorecardFrame.label_11.setText(""+points);

							ScorecardFrame.label_9.setText("Player 2");
							fh3 = 1;
							t2flag = 1;
						}
			}
			
			if(t3flag == 0 && tid == 3)
			{
				if(ticketsLabel[1].getBackground() == Color.GREEN && ticketsLabel[3].getBackground() == Color.GREEN &&
			       ticketsLabel[4].getBackground() == Color.GREEN && ticketsLabel[5].getBackground() == Color.GREEN &&
				   ticketsLabel[7].getBackground() == Color.GREEN && ticketsLabel[9].getBackground() == Color.GREEN && 
				   ticketsLabel[10].getBackground() == Color.GREEN && ticketsLabel[11].getBackground() == Color.GREEN && 
				   ticketsLabel[14].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN && 
				   ticketsLabel[18].getBackground() == Color.GREEN && ticketsLabel[20].getBackground() == Color.GREEN &&
				   ticketsLabel[24].getBackground() == Color.GREEN && ticketsLabel[25].getBackground() == Color.GREEN &&
				   ticketsLabel[26].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 3 wins full housie 3");

							points = Integer.parseInt(ScorecardFrame.label_12.getText());
							points = points + 10;
							ScorecardFrame.label_12.setText(""+points);

							ScorecardFrame.label_9.setText("Player 3");
							fh3 = 1;
							t3flag = 1;
						}
			}
			
			if(t4flag == 0 && tid == 4)
			{
				if(ticketsLabel[0].getBackground() == Color.GREEN && ticketsLabel[1].getBackground() == Color.GREEN &&
			       ticketsLabel[3].getBackground() == Color.GREEN && ticketsLabel[4].getBackground() == Color.GREEN &&
				   ticketsLabel[7].getBackground() == Color.GREEN && ticketsLabel[9].getBackground() == Color.GREEN && 
				   ticketsLabel[11].getBackground() == Color.GREEN && ticketsLabel[14].getBackground() == Color.GREEN && 
				   ticketsLabel[15].getBackground() == Color.GREEN && ticketsLabel[17].getBackground() == Color.GREEN && 
				   ticketsLabel[19].getBackground() == Color.GREEN && ticketsLabel[21].getBackground() == Color.GREEN &&
				   ticketsLabel[22].getBackground() == Color.GREEN && ticketsLabel[24].getBackground() == Color.GREEN &&
				   ticketsLabel[26].getBackground() == Color.GREEN)
						{
							JOptionPane.showMessageDialog(null, "Player 4 wins full housie 3");

							points = Integer.parseInt(ScorecardFrame.label_13.getText());
							points = points + 10;
							ScorecardFrame.label_13.setText(""+points);

							ScorecardFrame.label_9.setText("Player 4");
							fh3 = 1;
				            t4flag = 1;
						}
			}
				  
		} // FULL HOUSIE 3
						
	 } // CHECKWIN
	 
	 void sortTicket()
	 {
		 Integer x,y;
		 if(tid == 1)
		 {
			x = Integer.parseInt(ticketsLabel[10].getText());
			y = Integer.parseInt(ticketsLabel[19].getText());
			
			if(x > y)
			{
				ticketsLabel[10].setText(""+y);
				ticketsLabel[19].setText(""+x);
			}
			
			x = Integer.parseInt(ticketsLabel[3].getText());
			y = Integer.parseInt(ticketsLabel[21].getText());
			
			if(x > y)
			{
				ticketsLabel[3].setText(""+y);
				ticketsLabel[21].setText(""+x);
			}
			
			x = Integer.parseInt(ticketsLabel[4].getText());
			y = Integer.parseInt(ticketsLabel[13].getText());
			
			if(x > y)
			{
				ticketsLabel[4].setText(""+y);
				ticketsLabel[13].setText(""+x);
			}
			
			x = Integer.parseInt(ticketsLabel[15].getText());
			y = Integer.parseInt(ticketsLabel[24].getText());
			
			if(x > y)
			{
				ticketsLabel[15].setText(""+y);
				ticketsLabel[24].setText(""+x);
			}
			
			x = Integer.parseInt(ticketsLabel[7].getText());
			y = Integer.parseInt(ticketsLabel[25].getText());
			
			if(x > y)
			{
				ticketsLabel[7].setText(""+y);
				ticketsLabel[25].setText(""+x);
			}
			
			x = Integer.parseInt(ticketsLabel[8].getText());
			y = Integer.parseInt(ticketsLabel[17].getText());
			
			if(x > y)
			{
				ticketsLabel[8].setText(""+y);
				ticketsLabel[17].setText(""+x);
			}
		 } // TICKET 1
		 
		 else if(tid == 2)
		 {
		 	x = Integer.parseInt(ticketsLabel[1].getText());
			y = Integer.parseInt(ticketsLabel[19].getText());

			if(x > y)
			{
				ticketsLabel[1].setText(""+y);
				ticketsLabel[19].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[2].getText());
			y = Integer.parseInt(ticketsLabel[11].getText());

			if(x > y)
			{
				ticketsLabel[2].setText(""+y);
				ticketsLabel[11].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[12].getText());
			y = Integer.parseInt(ticketsLabel[21].getText());

			if(x > y)
			{
				ticketsLabel[12].setText(""+y);
				ticketsLabel[21].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[13].getText());
			y = Integer.parseInt(ticketsLabel[22].getText());

			if(x > y)
			{
				ticketsLabel[13].setText(""+y);
				ticketsLabel[22].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[5].getText());
			y = Integer.parseInt(ticketsLabel[23].getText());

			if(x > y)
			{
				ticketsLabel[5].setText(""+y);
				ticketsLabel[23].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[6].getText());
			y = Integer.parseInt(ticketsLabel[15].getText());

			if(x > y)
			{
				ticketsLabel[6].setText(""+y);
				ticketsLabel[15].setText(""+x);
			}
		 } // TICKET 2

		 else if(tid == 3)
		 {
		 	x = Integer.parseInt(ticketsLabel[9].getText());
			y = Integer.parseInt(ticketsLabel[18].getText());

			if(x > y)
			{
				ticketsLabel[9].setText(""+y);
				ticketsLabel[18].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[1].getText());
			y = Integer.parseInt(ticketsLabel[10].getText());

			if(x > y)
			{
				ticketsLabel[1].setText(""+y);
				ticketsLabel[10].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[11].getText());
			y = Integer.parseInt(ticketsLabel[20].getText());

			if(x > y)
			{
				ticketsLabel[11].setText(""+y);
				ticketsLabel[20].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[5].getText());
			y = Integer.parseInt(ticketsLabel[14].getText());

			if(x > y)
			{
				ticketsLabel[5].setText(""+y);
				ticketsLabel[14].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[7].getText());
			y = Integer.parseInt(ticketsLabel[25].getText());

			if(x > y)
			{
				ticketsLabel[7].setText(""+y);
				ticketsLabel[25].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[17].getText());
			y = Integer.parseInt(ticketsLabel[26].getText());

			if(x > y)
			{
				ticketsLabel[17].setText(""+y);
				ticketsLabel[26].setText(""+x);
			}

		 } // TICKET 3

		 else if(tid == 4)
		 {
		 	x = Integer.parseInt(ticketsLabel[0].getText());
			y = Integer.parseInt(ticketsLabel[9].getText());

			if(x > y)
			{
				ticketsLabel[0].setText(""+y);
				ticketsLabel[9].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[1].getText());
			y = Integer.parseInt(ticketsLabel[19].getText());

			if(x > y)
			{
				ticketsLabel[1].setText(""+y);
				ticketsLabel[19].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[3].getText());
			y = Integer.parseInt(ticketsLabel[21].getText());

			if(x > y)
			{
				ticketsLabel[3].setText(""+y);
				ticketsLabel[21].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[4].getText());
			y = Integer.parseInt(ticketsLabel[22].getText());

			if(x > y)
			{
				ticketsLabel[4].setText(""+y);
				ticketsLabel[22].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[15].getText());
			y = Integer.parseInt(ticketsLabel[24].getText());

			if(x > y)
			{
				ticketsLabel[15].setText(""+y);
				ticketsLabel[24].setText(""+x);
			}

			x = Integer.parseInt(ticketsLabel[17].getText());
			y = Integer.parseInt(ticketsLabel[26].getText());

			if(x > y)
			{
				ticketsLabel[17].setText(""+y);
				ticketsLabel[26].setText(""+x);
			}
		 } // TICKET 4

	 } // SORT TICKET
	 
	 void swap(Integer x, Integer y)
	 {
		 Integer temp;
		 temp = x;
		 x = y;
		 y = temp;
	 }
} // CLASS TICKET

