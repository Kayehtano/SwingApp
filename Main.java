import javax.swing.*;
import java.awt.event.*;

public class Main
{
	public static void main(String args[])
	{
		JFrame frame1 = new JFrame("Array Submission");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Must have this line
		frame1.setSize(500, 500);

		// Buttons
		JButton submit = new JButton("Submit");
		JButton remove = new JButton("Remove");
		JButton clear = new JButton("Clear");

		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Submitted.");
			}
		}); // end of action listener

		remove.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Removed.");
			}
		}); // end of action listener

		clear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Cleared.");
			}
		}); // end of action listener

		frame1.add(submit);
		frame1.add(remove);
		frame1.add(clear);

		frame1.setVisible(true);
	} // main end
} // class end