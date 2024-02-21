package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener
{
    JButton b1, b2 , b3,b4 ,b5 ,b6 ,b7  ;
    String pin ;

    main_Class(String pin)
    {
        super("ATM Transaction Menu");
        this.pin = pin ;

        //  Image Adding
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550 , 830 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel label1 = new JLabel("Please Select Your Transaction");
        label1.setBounds(430,180,700,35);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System" ,Font.BOLD,26));
        l1.add(label1);

        b1 = new JButton("Deposit");
        b1.setBounds(410,274,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("Cash Withdrawl");
        b2.setBounds(700,274,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l1.add(b2);

        b3 = new JButton("Fast Cash");
        b3.setBounds(410,318,150,35);
        b3.setBackground(new Color(65,125,128));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l1.add(b3);

        b4 = new JButton("Mini Statement");
        b4.setBounds(700,318,150,35);
        b4.setBackground(new Color(65,125,128));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        l1.add(b4);

        b5 = new JButton("Pin Change");
        b5.setBounds(410,362,150,35);
        b5.setBackground(new Color(65,125,128));
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        l1.add(b5);

        b6 = new JButton("Balance Enquiry");
        b6.setBounds(700,362,150,35);
        b6.setBackground(new Color(65,125,128));
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        l1.add(b6);

        b7 = new JButton("Exit");
        b7.setBounds(410,406,150,35);
        b7.setBackground(new Color(65,125,128));
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        l1.add(b7);

        setSize(1550,1080);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() ==b1)
        {
            new Deposit(pin);
            setVisible(false);
        }
    else if (e.getSource()==b7)
    {
    System.exit(0);
    }
    else if (e.getSource()==b2)
    {
    new Withdrawl(pin);
    setVisible(false);
    }
    else if (e.getSource()==b6)
    {
    new BalanceEnquriy(pin);
    setVisible(false);
    }
    else if (e.getSource()==b3)
    {
    new FastCash(pin);
    setVisible(false);
    }
    else if (e.getSource()==b5)
    {
    new Pin(pin);
    setVisible(false);
    }
    else if (e.getSource()==b4) {
    new Mini(pin);
}

    }

    public static void main(String[] args)
    {
     new main_Class("");
    }


}
