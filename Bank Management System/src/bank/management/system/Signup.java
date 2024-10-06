package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JTextField textName, textFname, textEmail, textAd, textCt, textPcode, textSt;
    JRadioButton r1, r2, r3, r4, r5;
    JButton Next;

     JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    Signup(){
    //Title
        super("APPLICATION FORM");
    //top icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/mobileBanking.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10,100, 100);
        add(image);

    //Application form no.
        JLabel label1 = new JLabel("APPLICATION FORM NO. : " + first);
        label1.setBounds(160,20, 600, 40);
        label1.setFont(new Font("Ralway",Font.BOLD,25));
        label1.setForeground(Color.black);
        add(label1);

    //page 1 text
        JLabel label2  = new JLabel( "Page 1");
        label2.setFont(new Font("Ralway", Font.BOLD,16));
        label2.setBounds(300, 60, 600, 30);
        label2.setForeground(Color.black);
        add(label2);

    //personal info text
         JLabel label3 = new JLabel("Personal Info");
         label3.setForeground(Color.black);
         label3.setFont(new Font("Ralway", Font.BOLD,18));
         label3.setBounds(270,90,600,30);
         add(label3);

    // Name
         JLabel label4 = new JLabel("Name : ");
         label4.setFont(new Font("Ralway", Font.BOLD,14));
         label4.setBounds(80,150,500,30);
         label4.setForeground(Color.black);
         add(label4);
            textName = new JTextField();
            textName.setBounds(250,150,300,25);
            add(textName);
    //Father's name
         JLabel label5 = new JLabel("Father's Name : ");
         label5.setForeground(Color.black);
         label5.setFont(new Font("Ralway", Font.BOLD, 14));
         label5.setBounds(80, 190, 500,30);
         add(label5);
             textFname = new JTextField();
             textFname.setBounds(250, 190, 300, 25);
             add(textFname);
        //gender
        JLabel labelg = new JLabel("Gender :");
        labelg.setFont(new Font("Ralway", Font.BOLD,14));
        labelg.setBounds(80,230,500, 30);
        labelg.setForeground(Color.black);
        add(labelg);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBounds(250,230,60,30);
        r1.setBackground(Color.lightGray);
        add(r1);
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBounds(370,230,90,30);
        r2.setBackground(Color.lightGray);
        add(r2);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
    //DOB
         JLabel DOB = new JLabel("Date of Birth :");
         DOB.setFont(new Font("Ralway", Font.BOLD, 14));
         DOB.setForeground(Color.black);
         DOB.setBounds(80, 270, 500, 30);
         add(DOB);
            dateChooser = new JDateChooser();
            dateChooser.setForeground(Color.white);
            dateChooser.setBounds( 250,270,300,30);
            add(dateChooser);
    //Email address
        JLabel Email = new JLabel("Email Address : ");
        Email.setForeground(Color.black);
        Email.setFont(new Font("Ralway", Font.BOLD, 14));
        Email.setBounds(80, 310, 500,30);
        add(Email);
             textEmail = new JTextField();
             textEmail.setBounds(250, 310, 300, 25);
             add(textEmail);
    //Marital Status
         JLabel labelM = new JLabel("Marital Status :");
         labelM.setFont(new Font("Ralway", Font.BOLD,14));
         labelM.setForeground(Color.black);
         labelM.setBounds(80, 350,500,30);
         add(labelM);
             r3 = new JRadioButton("Married");
             r3.setFont(new Font("Ralway", Font.BOLD,14));
             r3.setBounds(250, 350, 90,30);
             r3.setBackground(Color.lightGray);
             add(r3);
             r4 = new JRadioButton("Unmarried");
             r4.setFont(new Font("Ralway", Font.BOLD,14));
             r4.setBounds(350, 350, 100,30);
             r4.setBackground(Color.lightGray);
             add(r4);
             r5 = new JRadioButton("Other");
             r5.setFont(new Font("Ralway", Font.BOLD,14));
             r5.setBounds(475, 350, 90,30);
             r5.setBackground(Color.lightGray);
             add(r5);
                     ButtonGroup buttongroup2 = new ButtonGroup();
                     buttongroup2.add(r3);
                     buttongroup2.add(r4);
                     buttongroup2.add(r5);
    //Address
        JLabel labelad = new JLabel("Address :");
        labelad.setFont(new Font("Ralway", Font.BOLD,14));
        labelad.setForeground(Color.black);
        labelad.setBounds(80,390, 500, 30);
        add(labelad);
            textAd = new JTextField();
            textAd.setBounds(250, 390, 300, 30);
            add(textAd);
    //City
        JLabel labelCt = new JLabel("City :");
        labelCt.setFont(new Font("Ralway", Font.BOLD,14));
        labelCt.setForeground(Color.black);
        labelCt.setBounds(80,430, 500, 30);
        add(labelCt);
            textCt = new JTextField();
            textCt.setBounds(250, 430, 300, 30);
            add(textCt);
    //PIN Code
        JLabel labelP = new JLabel("Pin code :");
        labelP.setFont(new Font("Ralway", Font.BOLD,14));
        labelP.setForeground(Color.black);
        labelP.setBounds(80,470, 550, 30);
        add(labelP);
            textPcode = new JTextField();
            textPcode.setBounds(250, 470, 300, 30);
            add(textPcode);
    //State
        JLabel labelS = new JLabel("State :");
        labelS.setFont(new Font("Ralway", Font.BOLD,14));
        labelS.setForeground(Color.black);
        labelS.setBounds(80,510, 500, 30);
        add(labelS);
            textSt = new JTextField();
            textSt.setBounds(250, 510, 300, 30);
            add(textSt);
    //Next button
        Next = new JButton("Next");
        Next.setFont(new Font("Ralway",Font.BOLD,14));
        Next.setForeground(Color.white);
        Next.setBackground(Color.black);
        Next.setBounds(475,550,100,30);
        Next.addActionListener(this);
        add(Next);

        getContentPane().setBackground(new Color(192,192,192));
        setLayout(null);
        setSize(650, 700);
        setLocation(350,30);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String formno = first;
         String name = textName.getText();
         String fname = textFname.getName();
         String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
         String gender = null;
         if(r1.isSelected()){
             gender = "Male";
         } else if (r2.isSelected()) {
             gender = "Female";
         }
         String mail = textEmail.getText();
         String marital = null;
         if (r3.isSelected()){
             marital = "Married";
         } else if (r4.isSelected()) {
             marital = "Unmarried";
         }else {
             marital = "null";
         }
         String address = textAd.getText();
         String city = textCt.getText();
        String pincode = textPcode.getText();
         String state = textSt.getText();

         try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the feilds");
            }else{
                Con con1 = new Con();
                String q = "insert into signUp values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+mail+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
         } catch(Exception E){
             E.printStackTrace();
         }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
