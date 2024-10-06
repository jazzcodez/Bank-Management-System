package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {
    JTextField textField;
    JButton dp, bk;
    String pin;

    Withdrawal(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(130,0,1100,830);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS 10,000");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setForeground(Color.white);
        label1.setBounds(270,170,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setForeground(Color.white);
        label2.setBounds(280,220,400,35);
        l3.add(label2);

        textField = new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(240,270,320,25);
        textField.setFont(new Font("Ralway",Font.BOLD,22));
        l3.add(textField);

        dp = new JButton("CASH WITHDRAW");
        dp.setBounds(480,362,150,35);
        dp.setBackground(new Color(65,125,128));
        dp.setForeground(Color.white);
       dp.addActionListener(this);
        l3.add(dp);

        bk = new JButton("BACK");
        bk.setBounds(480,406,150,35);
        bk.setBackground(new Color(65,125,128));
        bk.setForeground(Color.white);
        bk.addActionListener(this);
        l3.add(bk);


        setLayout(null);
        setSize(1370,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==dp) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    Con c = new Con();

                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'withdrawl', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }


            } catch (Exception E) {

            }
        } else if (e.getSource()==bk) {
            setVisible(false);
           new main_Class(pin);

        }

    }

    public static void main(String[] args) {
        new Withdrawal("");
    }
}
