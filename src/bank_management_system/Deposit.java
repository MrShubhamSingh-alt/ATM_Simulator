package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener
{
    String pin ;
    JTextField textField1 ;
    JButton b1 ,b2 ;
    Deposit(String pin)
    {
        this.pin = pin ;

//  Image Adding
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550 , 830 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setBounds(460,180,400,35);
        label1.setFont(new Font("System",Font.BOLD, 16));
        l1.add(label1);

        textField1 = new JTextField();
        textField1.setBackground(new Color(65,125,128));
        textField1.setForeground(Color.WHITE);
        textField1.setBounds(460,230,320,25);
        textField1.setFont(new Font("Raleway" , Font.BOLD , 22));
        add(textField1);

        b1 = new JButton("Deposit");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.setBounds(700,362,150,35);
        b1.addActionListener( this);
        l1.add(b1);

        b2 = new JButton("Back");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(700,406,150,35);
        b2.addActionListener( this);
        l1.add(b2);

        setSize(1550,1080);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            String amount = textField1.getText();
            Date date = new Date();
            if(e.getSource()==b1)
            {
                if(textField1.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Fill all The field");
                }
                else
                {
                    Connn c = new Connn();
                    c.statement.executeUpdate("insert into bank Values('" + pin + "','" + date + "','Deposit','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. "+ amount +"Deposited Sucessfully");
                    setVisible(false);
                }
            }
            else if(e.getSource() == b2)
            {
                JOptionPane.showMessageDialog(null,"This will take you to main screen Logic not written now : ");
                setVisible(false);
            }


        }


        catch(Exception E)
        {
            E.printStackTrace();
        }
    }


    public static void main(String [] args)
    {
        new Deposit("");
    }


}
