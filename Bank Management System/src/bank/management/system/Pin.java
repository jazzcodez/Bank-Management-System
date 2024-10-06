package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton cg, bk;
    JPasswordField p1,p2;
    String pin;
    Pin(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(130,0,1100,830);
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setForeground(Color.white);
        label1.setBounds(210,180,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel("New PIN :");
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setForeground(Color.white);
        label2.setBounds(210,220,400,35);
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.white);
        p1.setBounds(400,220,200,25);
        p1.setFont(new Font("Ralway",Font.BOLD,22));
        l3.add(p1);

        JLabel label3 = new JLabel("Re-Enter New PIN :");
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setForeground(Color.white);
        label3.setBounds(210,250,400,35);
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.white);
        p2.setBounds(400,255,200,25);
        p2.setFont(new Font("Ralway",Font.BOLD,22));
        l3.add(p2);

        cg = new JButton("CHANGE");
        cg.setBounds(480,362,150,35);
        cg.setBackground(new Color(65,125,128));
        cg.setForeground(Color.white);
        cg.addActionListener(this);
        l3.add(cg);

        bk = new JButton("BACK");
        bk.setBounds(480,406,150,35);
        bk.setBackground(new Color(65,125,128));
        bk.setForeground(Color.white);
        bk.addActionListener(this);
        l3.add(bk);



        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;
            }
            if(e.getSource()==cg){
                if(p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter new PIN");
                    return;
                }
                if(p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter new PIN");
                    return;
                }

                Con c = new Con();
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN changed successfully");

                setVisible(false);
                new main_Class(pin);
            } else if (e.getSource()==bk) {
                new main_Class(pin);
                setVisible(false);
            }

        } catch(Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Pin("");
    }
}
