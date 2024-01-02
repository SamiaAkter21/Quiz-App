import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame implements ActionListener{
	JButton b1,b2;
	JTextField t1,t2;
	Main(){

		setBounds(80,90,1200,600);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		ImageIcon Io= new ImageIcon(ClassLoader.getSystemResource("samia.jpg"));

		JLabel l = new JLabel(Io);
		l.setBounds(0,110,600,500);
		add(l);

        ImageIcon Io1= new ImageIcon(ClassLoader.getSystemResource("hello.png"));

        JLabel l7 = new JLabel(Io1);
        l7.setBounds(195,0,200,200);
        add(l7);

	    JLabel l2 = new JLabel("Object Oriented Programming Language Lab II");
        l2.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        l2.setBounds(680, 100, 600, 45);
        add(l2);

        JLabel l6 = new JLabel("Quiz Test");
        l6.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        l6.setBounds(850, 130, 600, 45);
        add(l6);

        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBounds(810, 220, 300, 20);
        add(l3);

        t1 = new JTextField();
        t1.setBounds(735, 260, 300, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);

        JLabel l4 = new JLabel("Enter Your ID");
        l4.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l4.setForeground(new Color(30, 144, 254));
        l4.setBounds(820, 310, 300, 20);
        add(l4);

        t2 = new JTextField();
        t2.setBounds(785, 350, 200, 25);
        t2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t2);

        b1 = new JButton("Next");
        b1.setBounds(823, 418, 120, 25);
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        JLabel l5 = new JLabel("Developed by Samia Akter & Moynol Hasan Ome");
        l5.setFont(new Font("Mongolian Baiti", Font.BOLD, 14));
        l5.setForeground(new Color(30, 144, 254));
        l5.setBounds(720, 500, 500, 20);
        add(l5);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){

     	if(ae.getSource() == b1){
     		String name =t1.getText();
     		this.setVisible(false);
     		new Rules(name);

     	}
     	else {
     		System.exit(0);
     	}
    }

	public static void main(String []args)
	{
		new Main();
	}
}