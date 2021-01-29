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

		// First button
		JButton submit = new JButton("Submit!");

		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Submitted.");
			}
		}); // end of action listener

		frame1.add(submit);

		frame1.setVisible(true);
	} // main end
} // class end