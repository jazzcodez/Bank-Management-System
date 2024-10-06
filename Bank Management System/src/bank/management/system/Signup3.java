package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Signup3 extends JFrame implements ActionListener {
    JTextField text;
    JRadioButton r1,r2,r3,r4;
    JButton sb, cl;
    JCheckBox c1, c2,c3,c4,c5,c6,c7;
     String formno ;
    Signup3( String formno){
        super ("APPLICATION FORM");
        this.formno = formno;



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/mobileBanking.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,10,100,100);
        add(image);

        JLabel f1 = new JLabel("Form no : " + formno);
        f1.setFont(new Font("Ralway", Font.BOLD, 14));
        f1.setForeground(Color.black);
        f1.setBounds(500,30, 300, 40);
        add(f1);

        JLabel l1 = new JLabel("Page 3 : ");
        l1.setFont(new Font("Ralway", Font.BOLD, 18));
        l1.setForeground(Color.black);
        l1.setBounds(300,30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Account details");
        l2.setFont(new Font("Ralway", Font.BOLD,18));
        l2.setForeground(Color.black);
        l2.setBounds(250, 60, 600, 40);
        add(l2);

        JLabel at = new JLabel("Account Type : ");
        at.setFont(new Font("Ralway", Font.BOLD,18));
        at.setForeground(Color.black);
        at.setBounds(90, 120, 600, 40);
        add(at);

        r1 = new JRadioButton("Savings");
        r1.setBackground(new Color(95,158,160));
        r1.setForeground(Color.black);
        r1.setFont(new Font("Ralway",Font.BOLD,15));
        r1.setBounds(100, 160, 200, 40);
        add(r1);

        r2 = new JRadioButton("Current");
        r2.setBackground(new Color(95,158,160));
        r2.setForeground(Color.black);
        r2.setFont(new Font("Ralway",Font.BOLD,15));
        r2.setBounds(100, 190, 200, 40);
        add(r2);

        r3 = new JRadioButton("Fixed Deposit Account");
        r3.setBackground(new Color(95,158,160));
        r3.setForeground(Color.black);
        r3.setFont(new Font("Ralway",Font.BOLD,15));
        r3.setBounds(300, 160, 300, 40);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBackground(new Color(95,158,160));
        r4.setForeground(Color.black);
        r4.setFont(new Font("Ralway",Font.BOLD,15));
        r4.setBounds(300, 190, 300, 40);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel cn = new JLabel("Card Number : ");
        cn.setFont(new Font("Ralway", Font.BOLD,18));
        cn.setForeground(Color.black);
        cn.setBounds(90, 230, 300, 40);
        add(cn);
        JLabel cn1 = new JLabel("(Your 16-digit Card Number)");
        cn1.setFont(new Font("Ralway", Font.BOLD,11));
        cn1.setForeground(Color.black);
        cn1.setBounds(90, 250, 300, 40);
        add(cn1);
        JLabel cn2 = new JLabel("XXXX-XXXX-XXXX-0000");
        cn2.setFont(new Font("Ralway", Font.BOLD,18));
        cn2.setForeground(Color.black);
        cn2.setBounds(290, 230, 300, 40);
        add(cn2);
        JLabel cn3 = new JLabel("(It would appear on ATM Card/Cheque Book and Statements)");
        cn3.setFont(new Font("Ralway", Font.BOLD,11));
        cn3.setForeground(Color.black);
        cn3.setBounds(280, 250, 350, 40);
        add(cn3);

        JLabel pn = new JLabel("PIN : ");
        pn.setFont(new Font("Ralway", Font.BOLD,18));
        pn.setForeground(Color.black);
        pn.setBounds(90, 290, 300, 40);
        add(pn);

        JLabel pn1 = new JLabel("(4 digit Password) ");
        pn1.setFont(new Font("Ralway", Font.BOLD,11));
        pn1.setForeground(Color.black);
        pn1.setBounds(90, 310, 300, 40);
        add(pn1);

        JLabel pn2 = new JLabel("XXXX");
        pn2.setFont(new Font("Ralway", Font.BOLD,18));
        pn2.setForeground(Color.black);
        pn2.setBounds(290, 290, 300, 40);
        add(pn2);

        JLabel sr = new JLabel("Services Required :");
        sr.setFont(new Font("Ralway", Font.BOLD,18));
        sr.setForeground(Color.black);
        sr.setBounds(90, 350, 300, 40);
        add(sr);

        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Ralway",Font.BOLD,14));
        c1.setBackground(new Color(95,158,160));
        c1.setForeground(Color.black);
        c1.setBounds(90,380,200,35);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Ralway",Font.BOLD,14));
        c2.setBackground(new Color(95,158,160));
        c2.setForeground(Color.black);
        c2.setBounds(300,380,200,35);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Ralway",Font.BOLD,14));
        c3.setBackground(new Color(95,158,160));
        c3.setForeground(Color.black);
        c3.setBounds(90,410,200,35);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setFont(new Font("Ralway",Font.BOLD,14));
        c4.setBackground(new Color(95,158,160));
        c4.setForeground(Color.black);
        c4.setBounds(300,410,200,35);
        add(c4);

        c5 = new JCheckBox("Cheque book");
        c5.setFont(new Font("Ralway",Font.BOLD,14));
        c5.setBackground(new Color(95,158,160));
        c5.setForeground(Color.black);
        c5.setBounds(90,440,200,35);
        add(c5);

        c6 = new JCheckBox("E - Statement");
        c6.setFont(new Font("Ralway",Font.BOLD,14));
        c6.setBackground(new Color(95,158,160));
        c6.setForeground(Color.black);
        c6.setBounds(300,440,200,35);
        add(c6);

        c7 = new JCheckBox("I have read and accept all the details are correct to the best of my knowledge.");
        c7.setFont(new Font("Ralway",Font.PLAIN,12));
        c7.setBackground(new Color(95,158,160));
        c7.setForeground(Color.black);
        c7.setBounds(90,480,900,35);
        add(c7);

        sb = new JButton("Submit");
        sb.setBounds(200,530,100,35);
        sb.setForeground(Color.white);
        sb.setBackground(Color.black);
        sb.setFont(new Font("Ralway",Font.BOLD,14));
        sb.addActionListener(this);
        add(sb);
        cl = new JButton("Cancel");
        cl.setBounds(350,530,100,35);
        cl.setForeground(Color.white);
        cl.setBackground(Color.black);
        cl.setFont(new Font("Ralway",Font.BOLD,14));
        cl.addActionListener(this);
        add(cl);










        getContentPane().setBackground(new Color(95,158,160));
        setSize(675,690);
        setLocation(350,30);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String atype = null;
       if(r1.isSelected()){
           atype = "Savings Account";
       } else if (r2.isSelected()) {
           atype = "Current";
       } else if (r3.isSelected()) {
           atype = "Fixed Deposit Account";
       } else if (r4.isSelected()) {
           atype = "Recurring Deposit Account";
       }
       Random ran = new Random();
       long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
       String cardno = "" + Math.abs(first7);

       long first3 = (ran.nextLong() % 9000L) + 1000L;
       String pin = "" + Math.abs(first3);

       String fac = " ";
         if(c1.isSelected()){
             fac = fac + "ATM CARD ";
         } else if (c2.isSelected()) {
             fac = fac + "Internet Banking ";
         } else if (c3.isSelected()) {
             fac = fac + "Mobile Banking ";
         } else if (c4.isSelected()) {
             fac = fac + "EMAIL Alerts ";
         } else if (c5.isSelected()) {
             fac = fac + "Cheque Book ";
         } else if (c6.isSelected()) {
             fac = fac + "E-Statement ";
         }
         try {
             if (e.getSource()== sb){
                 if(atype.equals("")){
                     JOptionPane.showMessageDialog(null,"Fill all the fields");
                 } else {
                     Con c1 = new Con();
                     String q1 = "insert into signupthree values ('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                     String q2 = "insert into login values ('"+formno+"','"+cardno+"','"+pin+"')";
                     c1.statement.executeUpdate(q1);
                     c1.statement.executeUpdate(q2);
                     JOptionPane.showMessageDialog(null,"Card Number :" + cardno + "\n Pin :" + pin);
                     new Deposit(pin);
                     setVisible(false);
                 }
             } else if (e.getSource()== cl) {
                 System.exit(0);
             }
         }
         catch(Exception E){
             E.printStackTrace();
         }

    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
