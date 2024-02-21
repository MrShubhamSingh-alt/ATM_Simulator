package bank_management_system;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener
{
    JTextField textName,textFName,textEmail ,textAddress,textCity, textPincode,textState;
    JButton next;
    JRadioButton r1, r2 ,m1,m2 ;
    JDateChooser datechooser;
    Random ran = new Random() ;
    long first4 = (ran.nextLong()%9000L)+1000L ;
    String first = "" + Math.abs(first4);

    Signup()
    {
        super(" APPLICATION FORM ");

        // for image add
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO : " + first);
        label1.setBounds(200,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,32));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD , 20));
        label2.setBounds(395,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD,20));
        label3.setBounds(350,110,600,30);
        add(label3);

        JLabel Name = new JLabel("Name :");
        Name.setForeground(Color.BLACK);
        Name.setFont(new Font("AvantGrade",Font.BOLD,16));
        Name.setBounds(150,160,375,30);
        add(Name);

        textName = new JTextField();
        textName.setBounds(325,160,320,30);
        textName.setBackground(new Color(222,255,228));
        textName.setFont(new Font("AvantGrade", Font.BOLD,14));
        add(textName);

        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setForeground(Color.BLACK);
        labelFName.setFont(new Font("AvantGrade",Font.BOLD,16));
        labelFName.setBounds(150,200,375,30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setBounds(325,200,320,30);
        textFName.setBackground(new Color(222,255,228));
        textFName.setFont(new Font("AvantGrade", Font.BOLD,14));
        add(textFName);

        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setForeground(Color.BLACK);
        DOB.setFont(new Font("AvantGrade",Font.BOLD,16));
        DOB.setBounds(150,240,375,30);
        add(DOB);

        datechooser = new JDateChooser();
        datechooser.setForeground(new Color(105,105,105));
        datechooser.setBounds(325,240,320,30);
        add(datechooser);

        JLabel labelGender = new JLabel("Gender :");
        labelGender.setForeground(Color.BLACK);
        labelGender.setFont(new Font("AvantGrade",Font.BOLD,16));
        labelGender.setBounds(150,280,375,30);
        add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setBounds(325,280,80,30);
        r1.setBackground(new Color(222,255,228));
        r1.setFont(new Font("AvantGrade", Font.BOLD,14));
        add(r1);
        r2 = new JRadioButton("Female");
        r2.setBounds(500,280,80,30);
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("AvantGrade", Font.BOLD,14));
        add(r2);

        // For only one button select we have to use button group
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setForeground(Color.BLACK);
        labelEmail.setFont(new Font("AvantGrade",Font.BOLD,16));
        labelEmail.setBounds(150,320,375,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail .setBounds(325,320,320,30);
        textEmail.setBackground(new Color(222,255,228));
        textEmail .setFont(new Font("AvantGrade", Font.BOLD,14));
        add(textEmail);

        JLabel labelMartial_Status = new JLabel("Martial_Status :");
        labelMartial_Status.setForeground(Color.BLACK);
        labelMartial_Status.setFont(new Font("AvantGrade",Font.BOLD,16));
        labelMartial_Status.setBounds(150,360,375,30);
        add(labelMartial_Status);

        m1 = new JRadioButton("Married ");
        m1.setBounds(325,360,100,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("AvantGrade", Font.BOLD,14));
        add(m1);
        m2 = new JRadioButton("UnMarried");
        m2.setBounds(500,360,150,30);
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("AvantGrade", Font.BOLD,14));
        add(m2);

        // For only one button select we have to use button group
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);

        JLabel labelAddress = new JLabel("Address :");
        labelAddress.setForeground(Color.BLACK);
        labelAddress.setFont(new Font("AvantGrade",Font.BOLD,16));
        labelAddress.setBounds(150,400,375,30);
        add(labelAddress);

        textAddress= new JTextField();
        textAddress.setBounds(325,400,320,30);
        textAddress.setBackground(new Color(222,255,228));
        textAddress.setFont(new Font("AvantGrade", Font.BOLD,14));
        add(textAddress);

        JLabel labelCity = new JLabel("City :");
        labelCity.setForeground(Color.BLACK);
        labelCity.setFont(new Font("AvantGrade",Font.BOLD,16));
        labelCity.setBounds(150,440,375,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setBounds(325,440,320,30);
        textCity.setBackground(new Color(222,255,228));
        textCity.setFont(new Font("AvantGrade", Font.BOLD,14));
        add(textCity);

        JLabel labelPincode = new JLabel("Pincode :");
        labelPincode.setForeground(Color.BLACK);
        labelPincode.setFont(new Font("AvantGrade",Font.BOLD,16));
        labelPincode.setBounds(150,480,375,30);
        add(labelPincode);

        textPincode = new JTextField();
        textPincode.setBounds(325,480,320,30);
        textPincode.setFont(new Font("AvantGrade", Font.BOLD,14));
        textPincode.setBackground(new Color(222,255,228));
        add(textPincode);

        JLabel labelState = new JLabel("State :");
        labelState.setForeground(Color.BLACK);
        labelState.setFont(new Font("AvantGrade",Font.BOLD,16));
        labelState.setBounds(150,520,375,30);
        add(labelState);

        textState = new JTextField();
        textState.setBounds(325,520,320,30);
        textState.setFont(new Font("AvantGrade", Font.BOLD,14));
        textState.setBackground(new Color(222,255,228));
        add(textState);

        next = new JButton("Next");
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setFont(new Font("AvantGrade",Font.BOLD,16));
        next.setBounds(525,600,100,30);
        next.addActionListener(this);
        add(next);


//		for set background we use
        setLayout(null);
        getContentPane().setBackground(new Color(222,255,228));
        setSize(800,700);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String formno = first ;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null ;
        if(r1.isSelected())
        {
            gender = "Male";
        }
        else if(r2.isSelected())
        {
            gender = "FeMale" ;
        }
        String email = textEmail.getText();

        String matrial_status = null ;
        if(m1.isSelected())
        {
            matrial_status = "Married";
        }
        else if (m2.isSelected())
        {
            matrial_status = "UnMarried" ;
        }
        String address = textAddress.getText();
        String city = textCity.getText();
        String pincode = textPincode.getText();
        String state = textState.getText();

//        for data storing
        try
        {
            if(textName.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null ,"Fill all the fields");
            }
            else
            {
                Connn con1 = new Connn();
                String q = "insert into Signup Values ('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+matrial_status+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }
        catch(Exception E)
        {
            E.printStackTrace();
        }

    }

    public static void main (String [] args)
    {
        // Object Create
        new Signup();

    }


}

