import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class Main
{
	public static void main(String args[])
	{
		JFrame frame1 = new JFrame("Array Submission");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Must have this line
		frame1.setSize(500, 500);
		frame1.setVisible(true);

		// ArrayList
		ArrayList<String> cookieTypes = new ArrayList<String>();

		// Panel 1
		JPanel panel1 = new JPanel(new GridLayout(2,2, 10,10));

		// Panel 2
		JPanel panel2 = new JPanel (new BorderLayout(10, 10));
		ImageIcon cookie = new ImageIcon("cookie.jpeg", "Cookies, cookies everywhere.");
		JLabel cookiePic = new JLabel(cookie);
		panel2.add(cookiePic);

		// Text fields
		JTextField whatToSubmit = new JTextField(10);
		JTextField whatToRemove = new JTextField(10);

		// Buttons
		JButton submit = new JButton("Submit");
		JButton remove = new JButton("Remove");
		JButton clear = new JButton("Clear");

		// Submit button
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String submission = whatToSubmit.getText();
				System.out.println("Submitted " + submission + "!");
				if(!cookieTypes.contains(submission))
				{
					cookieTypes.add(submission);
				}
			}
		}); // end of action listener

		// Remove button
		remove.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String removal = whatToRemove.getText();
				if(cookieTypes.contains(removal))
				{
					System.out.println("Removed " + removal + "!");
					cookieTypes.remove(removal);
				}
				else
				{
					System.out.println(removal + " does not exist!");
				}
			}
		}); // end of action listener

		// Clear button
		clear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(cookieTypes.size() > 0)
				{
					cookieTypes.clear();
					System.out.println("Cleared array list!");
				}
				else
				{
					System.out.println("Array list does not have any items!");
				}
			}
		}); // end of action listener

		// label1
		JLabel label1 = new JLabel("Types of Cookies");

		panel1.add(clear);
		panel1.add(submit);
		panel1.add(remove);
		panel1.add(label1);
		panel1.add(whatToSubmit);
		panel1.add(whatToRemove);

		frame1.getContentPane().add(BorderLayout.NORTH, panel1);
		frame1.getContentPane().add(BorderLayout.CENTER, panel2);
		System.out.println("Finished rendering frame.");
	} // main end
} // class end