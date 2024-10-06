
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textFeild2;
    JPasswordField passwordFeild3;

    JButton button1, button2, button3;
    Login() {
        //Title
           super("Bank Management System");
       //top icon
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/mobileBanking.png"));
         Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel image = new JLabel(i3);
          image.setBounds(350, 6,100, 100);
          add(image);

      //bottom icon
         ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/debitCard.png"));
         Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
         ImageIcon ii3 = new ImageIcon(ii2);
         JLabel iimage = new JLabel(ii3);
         iimage.setBounds(650, 400,100, 100);
          add(iimage);

       // Welcome label
         label1 = new JLabel("WELCOME TO ATM");
         label1.setForeground(Color.white);
         label1.setFont(new Font("AvantGarde", Font.BOLD, 20));
         label1.setBounds(300,120,450,40);
         add(label1);

       // Card No. label
         label2 = new JLabel("Card No. :");
         label2.setFont(new Font("Ralway", Font.BOLD,28));
         label2.setForeground(Color.white);
         label2.setBounds(150,220,375,25);
         add(label2);

      // Textfeild for Card no.
        textFeild2 = new JTextField(15);
        textFeild2.setBounds(325,220,230, 30);
        textFeild2.setFont(new Font("Arial", Font.BOLD,14));
        add(textFeild2);

     // PIN text
        label3 = new JLabel("PIN :");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setBounds(150, 300, 375,25);
        add(label3);


      // Password feild
        passwordFeild3 = new JPasswordField(15);
        passwordFeild3.setBounds(325,300,230, 30);
        passwordFeild3.setFont(new Font("Arial", Font.BOLD,14));
        add(passwordFeild3);

      //Sign in button
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD,14));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(300,380,100,30);
        button1.addActionListener(this);
        add(button1);

      // Clear button
        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(450, 380,100,30);
        button2.addActionListener(this);
        add(button2);

       // Sign up button
         button3 = new JButton("SIGN UP");
         button3.setFont(new Font("Arial", Font.BOLD,14));
         button3.setForeground(Color.white);
         button3.setBackground(Color.black);
         button3.setBounds(330, 420, 200,30);
         button3.addActionListener(this);
         add(button3);

      //Background
         ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backg.jpg"));
         Image iii2 = iii1.getImage().getScaledInstance(850,550,Image.SCALE_DEFAULT);
         ImageIcon iii3 = new ImageIcon(iii2);
         JLabel iiimage = new JLabel(iii3);
         iiimage.setBounds(0, 0,850, 550);
         add(iiimage);

       setLayout(null);
       setSize(850,550);
       setLocation(250,100);
       setUndecorated(true);
       setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == button1){
                Con c = new Con();
                String cardno = textFeild2.getText();
                String pin = passwordFeild3.getText();
                String q = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }

            } else if(e.getSource() == button2){
                textFeild2.setText("");
                passwordFeild3.setText("");
            } else if (e.getSource() == button3){
                 new Signup();
                 setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
