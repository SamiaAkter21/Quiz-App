import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color.*;

public class Answer extends JFrame{

	String username;
	Answer(String username,int count)
	{
		this.username=username;

		setBounds(300,80,850,600);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		JLabel l2 = new JLabel("Thank you so much "+ username +" for participating in this quiz test");
		l2.setBounds(50,0,800,200);
		l2.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
		add(l2);

		ImageIcon Io = new ImageIcon(ClassLoader.getSystemResource("donald_duck.jpg"));
		JLabel l = new JLabel(Io);
		l.setBounds(100,200,200,200);
		add(l);

		JLabel l1 = new JLabel("Your Score is "+ count+"!");
		l1.setBounds(380,120,600,200);
		l1.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
		l1.setForeground(new Color(30, 144, 254));
		add(l1);

		JLabel l3 = new JLabel("\"Our greatest weakness lies in giving up.");
		l3.setBounds(510,280,400,200);
		l3.setFont(new Font("Mongolian Baiti",Font.BOLD,14));
		l3.setForeground(new Color(153, 102, 0));
		add(l3);

		JLabel l4 = new JLabel("The most certain way to succeed is");
		l4.setBounds(530,300,400,200);
		l4.setFont(new Font("Mongolian Baiti",Font.BOLD,14));
		l4.setForeground(new Color(153, 102, 0));

		add(l4);

		JLabel l5 = new JLabel("always to try just one more time.\"");
		l5.setBounds(535,320,400,200);
		l5.setFont(new Font("Mongolian Baiti",Font.BOLD,14));
		l5.setForeground(new Color(153, 102, 0));
		add(l5);

		JLabel l6 = new JLabel("-Thomas A Edison");
		l6.setBounds(623,350,400,200);
		l6.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
		l6.setForeground(new Color(102, 102, 102));
		add(l6);

		JLabel l7 = new JLabel("Developed by Moynol Hasan Ome & Samia Akter");
        l7.setFont(new Font("Mongolian Baiti", Font.BOLD, 14));
        l7.setForeground(new Color(30, 144, 254));
        l7.setBounds(230, 500, 500, 20);
        add(l7);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}

	public static void main(String[]args)
	{
		new Answer("",0).setVisible(true);
	}
}
