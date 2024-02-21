package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Signup2 extends JFrame implements ActionListener {

    String formno;

    JComboBox comboBox1 ,comboBox2,comboBox3,comboBox4 , comboBox5 ;
    JTextField textPan,textAadhar ;
    JRadioButton r1 ,r2,e1,e2 ;

    JButton next ;
    Signup2(String formno)
    {
        super("APPLICATION FORM");
        this.formno = formno;

        JLabel l1 = new JLabel("Page No 2 :");
        l1.setFont(new Font ("Raleway",Font.BOLD,20));
        l1.setBounds(400,30,600,35);
        add(l1);

        JLabel l2 = new JLabel("Additional Information");
        l2.setFont(new Font("Raleway",Font.BOLD , 20));
        l2.setBounds(400,70,600,35);
        add(l2);
//       for image adding
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(200,5,100,100);
        add(image);


        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD,14));
        l3.setBounds(150,120,100,30);
        add(l3);

        String Religion[] ={"Hindu" , "Muslim", "Sikh", "Christian","Other"};

        comboBox1 = new JComboBox(Religion);
        comboBox1.setBackground(new Color(97, 213, 119));
        comboBox1.setFont(new Font("Raleway",Font.BOLD , 14));
        comboBox1.setBounds(350,120,320,30);
        add(comboBox1);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway", Font.BOLD,14));
        l4.setBounds(150,170,100,30);
        add(l4);

        String Category[] ={"General", "SC", "ST", "OBC" , "Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(97, 213, 119));
        comboBox2.setFont(new Font("Raleway" , Font.BOLD , 14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway", Font.BOLD,14));
        l5.setBounds(150,220,100,30);
        add(l5);

        String Income[] ={"null", "<150000", "<250000", "<500000" , "Upto 1000000","Above 1000000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(97, 213, 119));
        comboBox3.setFont(new Font("Raleway" , Font.BOLD , 14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Raleway", Font.BOLD,14));
        l6.setBounds(150,270,150,30);
        add(l6);

        String Educational[] ={ "Non Graduate", "Graduate" , "Post Graduation","Doctrate","Other"};
        comboBox4 = new JComboBox(Educational);
        comboBox4.setBackground(new Color(97, 213, 119));
        comboBox4.setFont(new Font("Raleway" , Font.BOLD , 14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Educational :");
        l7.setFont(new Font("Raleway", Font.BOLD,14));
        l7.setBounds(150,320,150,30);
        add(l7);

        String Occupation[] ={ "Salaried", "Self-Employed" , "Business","Student","Retired","Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(97, 213, 119));
        comboBox5.setFont(new Font("Raleway" , Font.BOLD , 14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway", Font.BOLD,14));
        l8.setBounds(150,370,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD,14));
        textPan.setBackground(new Color(97, 213, 119));
        textPan.setBounds(350,370,320,30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number :");
        l9.setFont(new Font("Raleway", Font.BOLD,14));
        l9.setBounds(150,420,150,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD,14));
        textAadhar.setBackground(new Color(97, 213, 119));
        textAadhar.setBounds(350,420,320,30);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway", Font.BOLD,14));
        l10.setBounds(150,470,150,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(97, 213, 119));
        r1.setBounds(360,470,100,30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(97, 213, 119));
        r2.setBounds(470,470,100,30);
        add(r2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway", Font.BOLD,14));
        l11.setBounds(150,520,150,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD,14));
        e1.setBackground(new Color(97, 213, 119));
        e1.setBounds(360,520,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD,14));
        e2.setBackground(new Color(97, 213, 119));
        e2.setBounds(470,520,100,30);
        add(e2);
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(e1);
        buttonGroup2.add(e2);

        JLabel l12 = new JLabel("Form No :-");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(650,10,150,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(730,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setFont(new Font("AvantGrade",Font.BOLD,16));
        next.setBounds(525,600,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        getContentPane().setBackground(new Color(97, 213, 119));
        setSize(850,750);
        setLocation(400,20);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        String rel =(String)comboBox1.getSelectedItem();
        String cate = (String)comboBox2.getSelectedItem();
        String inc = (String)comboBox3.getSelectedItem();
        String edu = (String)comboBox4.getSelectedItem();
        String occ = (String)comboBox5.getSelectedItem();
        String pan = textPan.getText();
        String aadhar = textAadhar.getText();
        String scitizen = null ;
        if (r1.isSelected())
        {
            scitizen = "Yes";
        }
        else if (r2.isSelected())
        {
            scitizen = "No";
        }

        String eAccount = null ;
        if(e1.isSelected())
        {
            eAccount = "Yes";
        }
        else if(e2.isSelected())
        {
            eAccount = "No";
        }

        try
        {
            if(textPan.getText().isEmpty()||textAadhar.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Fill all fields ");
            }
            else
            {
               Connn c1=new Connn() ;
               String q = "insert into signuptwo Values('"+formno+"' , '"+rel+"' ,'"+cate+"', '"+inc+"' , '"+edu+"' , '"+occ+"' , '"+pan+"' , '"+aadhar+"' , '"+scitizen+"' , '"+eAccount+"')";
               c1.statement.executeUpdate(q);
               new Signup3(formno);
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
        Object first;
        new Signup2("");
    }

}
