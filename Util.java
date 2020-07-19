import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class Util {
	public static JLabel getTicket() {
		JLabel ticket = new JLabel("",SwingConstants.CENTER);
		
		ticket.setOpaque(true);
		ticket.setBackground(Color.CYAN);
		ticket.setForeground(Color.RED);
		ticket.setFont(new Font("Serif", Font.BOLD,20));
		ticket.setBorder(new LineBorder(new Color(0, 0, 0)));
	
		return ticket;
	}
	
	public static int getRandomNumber(int lowerBound, int upperBound) {
		return lowerBound + (int) (( Math.random() % 100 ) * upperBound);
	}
}
