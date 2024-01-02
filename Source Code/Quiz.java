import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{

		JLabel ql;
	    JButton lg,lg1;
	    ButtonGroup bg;
	    JRadioButton rb[] = new JRadioButton[5];
	    int Running = 0;
	    int count = 0;
	    String username;
	    public static int Min = 19;
	    public static int Sec = 59;

	Quiz(String username){
		this.username=username;

		setBounds(10,10,1346,950);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		ImageIcon Io= new ImageIcon(ClassLoader.getSystemResource("ome.jpg"));
		Image i2 = Io.getImage().getScaledInstance(1346,325,Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);

		JLabel l = new JLabel(i3);
		l.setBounds(0,0,1346,325);
		add(l);

		ql = new JLabel();
        add(ql);
               
        bg = new ButtonGroup();


        for(int i = 0; i < 5; i++)
        {
            rb[i] = new JRadioButton();
            add(rb[i]);
            rb[i].setFont(new Font("Tahoma", Font.PLAIN, 16));
            rb[i].setBackground(Color.WHITE);
            bg.add(rb[i]);
        }

        rb[0].setBounds(100, 450, 550, 20);
        rb[1].setBounds(100, 490, 550, 20);
        rb[2].setBounds(100, 530, 550, 20);
        rb[3].setBounds(100, 570, 550, 20);
               
        lg = new JButton("Next");
        lg.setBounds(1015, 500, 80, 30);
        lg.setBackground(new Color(30, 144, 255));
        lg.setForeground(Color.WHITE);
        add(lg);
       
        lg.addActionListener(this);

        lg1 = new JButton("Submit");
        lg1.setBounds(1015,550,80,30);
        lg1.setBackground(new Color(30, 144, 255));
        lg1.setForeground(Color.WHITE);
        lg1.setVisible(false);
        add(lg1);

        lg1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        set();

        JLabel l2 = new JLabel("Developed by Samia Akter & Moynol Hasan Ome");
        l2.setFont(new Font("Mongolian Baiti", Font.BOLD, 14));
        l2.setForeground(new Color(30, 144, 254));
        l2.setBounds(500, 630, 500, 20);
        add(l2);

        setVisible(true);

	}

	public void actionPerformed(ActionEvent e){
            if(e.getSource() == lg)
            {
                if(check()){
                    count++;
                }
                Running++;
                set();
               
                if(Running == 9){
                	lg.setEnabled(false);
                	lg1.setVisible(true);
                    lg1.setText("Submit");
                }
            }
           
            if(e.getActionCommand().equals("Submit"))
            {
                if(check())
                {
                    count++;
                }
                Running++;
               
                this.setVisible(false);
                new Answer(username,count).setVisible(true);
            }
        }

    public void paint(Graphics g){
        super.paint(g);

        String time = "Time Left - " + Min + ":"+ Sec +" seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Times New Roman", Font.BOLD, 20));
        
        if(Min >= 0) {
            g.drawString(time, 950, 450);
        }else {
            g.drawString("Times Up!!", 1000, 400);
        }
        
        Sec--;
        if(Sec==0)
        {
        	Min--;
        	Sec=59;
        }
        if(Min<0)
        {
        	lg.setEnabled(false);
                	lg1.setVisible(true);
        }
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
        
		void set(){
			rb[4].setSelected(true);
			if(Running == 0){
			ql.setText("1. The class whose properties are inherited is known as:");
			rb[0].setText("superclass");
			rb[1].setText("baseclass");
			rb[2].setText("parentclass");
			rb[3].setText("All of the above");
			}

			if(Running == 1){
			ql.setText("2. Which OOP concept is called data hiding?");
			rb[0].setText("Encapsulation");
			rb[1].setText("Inheritance");
			rb[2].setText("Abstraction");
			rb[3].setText("Polymorphism");
			}

			if(Running == 2){
			ql.setText("3. Which keyword is used to inherit the properties of a class?");
			rb[0].setText("implemnts");
			rb[1].setText("extends");
			rb[2].setText("None of them");
			rb[3].setText("All of the above");
			}

			if(Running == 3){
			ql.setText("4.Which method can be used to find the length of a string?");
			rb[0].setText("length()");
			rb[1].setText("len()");
			rb[2].setText("getSize()");
			rb[3].setText("getLength()");
			}

			if(Running == 4){
			ql.setText("5. The process by which one object can acquire the properties of another object:");
			rb[0].setText("Encapsulation");
			rb[1].setText("Interface");
			rb[2].setText("Inheritance");
			rb[3].setText("Polymorphism");
			}

			if(Running == 5){
			ql.setText("6. Which option is false about the final keyword?");
			rb[0].setText("A final method cannot be overridden in its subclasses");
			rb[1].setText("A final class cannot be extended");
			rb[2].setText("A final class cannot extend other classes");
			rb[3].setText("A final method can be inherited");
			}

			if(Running == 6){
			ql.setText("7. Which keyword is used to access the method or member variables from the superclass?");
			rb[0].setText("super");
			rb[1].setText("this");
			rb[2].setText("final");
			rb[3].setText("throw");
			}

			if(Running == 7){
			ql.setText("8. Which keyword appears at the end of a method's signature?");
			rb[0].setText("final");
			rb[1].setText("throws");
			rb[2].setText("throw");
			rb[3].setText("finally");
			}

			if(Running == 8){
			ql.setText("9. Which is non-access modifier?");
			rb[0].setText("public");
			rb[1].setText("private");
			rb[2].setText("protected");
			rb[3].setText("abstract");
			}

			if(Running == 9){
			ql.setText("10. An object that has more than one form is referred to as:");
			rb[0].setText("Inheritance");
			rb[1].setText("Interface");
			rb[2].setText("Abstraction");
			rb[3].setText("Polymorphism");
			}

			ql.setBounds(100, 410, 700, 30);
			ql.setFont(new Font("Tahoma", Font.PLAIN, 16));
			}

		boolean check(){
			if(Running == 0){
			return(rb[3].isSelected());
			}
			if(Running == 1){
			return(rb[0].isSelected());
			}
			if(Running == 2){
			return(rb[1].isSelected());
			}
			if(Running == 3){
			return(rb[0].isSelected());
			}
			if(Running == 4){
			return(rb[2].isSelected());
			}
			if(Running == 5){
			return(rb[2].isSelected());
			}
			if(Running == 6){
			return(rb[0].isSelected());
			}
			if(Running == 7){
			return(rb[1].isSelected());
			}
			if(Running == 8){
			return(rb[3].isSelected());
			}
			if(Running == 9){
			return(rb[3].isSelected());
			}
			return false;
		}


	public static void main(String [] args){

		new Quiz("");

	}
}