package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener
{

    JCheckBox c1 ,c2, c3,c4 ,c5,c6 ;
    JButton s,c;
    JRadioButton r1 ,r2,r3,r4 ;
    String formno ;
    Signup3(String formno)
    {
        super(" APPLICATION FORM ");
        this.formno = formno ;
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1 = new JLabel("Page No 3 :");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,400,40);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(210, 94, 75));
        r1.setBounds(100,180,150,40);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(210, 94, 75));
        r2.setBounds(350,180,200,40);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(210, 94, 75));
        r3.setBounds(100,210,150,40);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(210, 94, 75));
        r4.setBounds(350,210,250,40);
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel l4 = new JLabel("Card Number");
        l4.setFont(new Font("Raleway" ,Font.BOLD , 18));
        l4.setBounds(100,260,150,40);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway" ,Font.BOLD , 12));
        l5.setBounds(100,290,220,40);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway" ,Font.BOLD , 18));
        l6.setBounds(350,260,220,40);
        add(l6);

        JLabel l7 = new JLabel("It would appear on atm card/ cheque Book and Statements");
        l7.setFont(new Font("Raleway" ,Font.BOLD , 12));
        l7.setBounds(350,290,500,40);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway" ,Font.BOLD , 18));
        l8.setBounds(100,330,200,40);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway" ,Font.BOLD , 18));
        l9.setBounds(350,330,200,40);
        add(l9);

        JLabel l10 = new JLabel("(4-Digit Password)");
        l10.setFont(new Font("Raleway" ,Font.BOLD , 12));
        l10.setBounds(100,350,200,40);
        add(l10);

        JLabel l11 = new JLabel("Services Required :");
        l11.setFont(new Font("Raleway" ,Font.BOLD , 18));
        l11.setBounds(100,390,200,40);
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        c1.setBackground(new Color(210, 94, 75));
        c1.setBounds(100,420,200,40);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        c2.setBackground(new Color(210, 94, 75));
        c2.setBounds(350,420,200,40);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        c3.setBackground(new Color(210, 94, 75));
        c3.setBounds(100,460,200,40);
        add(c3);

        c4 = new JCheckBox("Email Alert");
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        c4.setBackground(new Color(210, 94, 75));
        c4.setBounds(350,460,200,40);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        c5.setBackground(new Color(210, 94, 75));
        c5.setBounds(100,500,200,40);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,14));
        c6.setBackground(new Color(210, 94, 75));
        c6.setBounds(350,500,200,40);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declare that the above entered details correct to the best of my knowledge. ", true);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBackground(new Color(210, 94, 75));
        c7.setBounds(100,540,600,30);
        add(c7);

        JLabel l12 = new JLabel("Form No :-");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(650,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(730,10,60,30);
        add(l13);

        s= new JButton("Submit");
        s.setFont(new Font("Raleway", Font.BOLD,14));
        s.setBounds(220,620,100,30);
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.addActionListener(this);
        add(s);

        c= new JButton("Cancel");
        c.setFont(new Font("Raleway", Font.BOLD,14));
        c.setBounds(420,620,100,30);
        c.setForeground(Color.white);
        c.setBackground(Color.BLACK);
        c.addActionListener(this);
        add(c);

        setLayout(null);
        getContentPane().setBackground(new Color(210, 94, 75));
        setSize(790,750);
        setLocation(400,20);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        String atype = null ;
        if (r1.isSelected())
        {
            atype = "Saving Account";
        }
        else if(r2.isSelected())
        {
            atype = "Fixed Deposit Account";
        }
        else if(r3.isSelected())
        {
            atype = "Current Account";
        }
        else if(r4.isSelected())
        {
            atype = "Recurring Deposit Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong()%90000000L)+1409963000000000L ;
        String cardno = "" + Math.abs(first7);
        long first3 = (ran.nextLong()%9000)+1000L;
        String pin = "" + Math.abs(first3);
        String fac = null ;
        if(c1.isSelected())
        {
            fac = fac +"ATM Card" ;
        }
        else if (c2.isSelected())
        {
            fac= fac + "Internet Banking" ;
        }
        else if (c3.isSelected())
        {
            fac= fac + "Mobile Banking" ;
        }
        else if (c4.isSelected())
        {
            fac= fac + "Email Alert" ;
        }
        else if (c5.isSelected())
        {
            fac= fac + "Cheque Book" ;
        }
        else if (c6.isSelected())
        {
            fac= fac + "E-Statement" ;
        }
        try
        {
            if(e.getSource()==s) {
                if (atype.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Fill all fields ");
                } else {
                    Connn c1 = new Connn();
                    String q1 = "insert into signupthree Values('" +formno + "','" + atype + "','" +cardno + "','" +pin+"','" + fac + "')";
                    String q2 = "insert into login Values('" +formno + "','" +cardno + "','" +pin + "')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number:" +cardno + "\n Pin:"+pin);
                    new Login();
                    setVisible(false);
                }
            }
        }
        catch(Exception E)
        {
            E.printStackTrace();
        }


    }


    public static void main (String [] args )
    {
        new Signup3("");
    }

}
