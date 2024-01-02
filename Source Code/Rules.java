import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements  ActionListener{

	JButton b1,b2;
    String username;
	Rules(String username){
        this.username=username;

		setBounds(300,50,800,650);
		getContentPane().setBackground(Color.WHITE);

        ImageIcon Io= new ImageIcon(ClassLoader.getSystemResource("we.png"));

        JLabel l1 = new JLabel(Io);
        l1.setBounds(520,90,200,200);
        add(l1);

	    setLayout(null);

		JLabel l= new JLabel("Welcome " + username + " to lab quiz test");
		l.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        l.setForeground(new Color(30, 144, 254));
		l.setBounds(170,20,700,30);
		add(l);

    	JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(20, 90, 650, 350);
        l2.setText(
            "<html>"+ 
                "1. There have 10 questions." + "<br><br>" +
                "2. Each question contains 1 marks." + "<br><br>" +
                "3. You have 20 minutes to answer all the questions." + "<br><br>" +
                "4. If you skip any question without answering then you can not again go to that question." + "<br><br>" +
            "<html>"
        );
        add(l2);

        JLabel l3= new JLabel("Best Of Luck");
		l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        l3.setForeground(new Color(30, 144, 254));
		l3.setBounds(333,370,700,30);
		add(l3);
   
        b1 = new JButton("Back");
        b1.setBounds(270, 430, 100, 30);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Start");
        b2.setBounds(420, 430, 100, 30);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        JLabel l4 = new JLabel("Developed by Moynol Hasan Ome & Samia Akter");
        l4.setFont(new Font("Mongolian Baiti", Font.BOLD, 14));
        l4.setForeground(new Color(30, 144, 254));
        l4.setBounds(230, 530, 500, 20);
        add(l4);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new Main().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }

	public static void main(String[]args){
		new Rules("");
	}
}