import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main
{
	public static void main(String args[])
	{
		JFrame frame1 = new JFrame("Array Submission");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Must have this line
		frame1.setSize(500, 500);
		frame1.setVisible(true);

		// Panel 1
		JPanel panel1 = new JPanel(new GridLayout(2,2, 10,10));

		// Panel 2
		JPanel panel2 = new JPanel (new BorderLayout(10, 10));
		ImageIcon cookie = new ImageIcon("cookie.jpeg", "Cookies, cookies everywhere.");
		JLabel cookiePic = new JLabel(cookie);
		panel2.add(cookiePic);

		// Buttons
		JButton submit = new JButton("Submit");
		JButton remove = new JButton("Remove");
		JButton clear = new JButton("Clear");

		// Submit button
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Submitted.");
			}
		}); // end of action listener

		// Remove button
		remove.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Removed.");
			}
		}); // end of action listener

		// Clear button
		clear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Cleared.");
			}
		}); // end of action listener

		// label1
		JLabel label1 = new JLabel("Array List");

		panel1.add(submit);
		panel1.add(remove);
		panel1.add(clear);
		panel1.add(label1);

		frame1.getContentPane().add(panel1);
		System.out.println("Finished rendering frame.");
	} // main end
} // class end