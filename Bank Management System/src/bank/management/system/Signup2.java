package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JTextField textPn, textAr;
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JRadioButton r1,r2,m1,m2;
    JButton Next;
    String formno;
    Signup2(String formno){
        super ("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/mobileBanking.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,10,100,100);
        add(image);

        this.formno = formno;

        JLabel f1 = new JLabel("Form no : " + formno);
        f1.setFont(new Font("Ralway", Font.BOLD, 14));
        f1.setForeground(Color.white);
        f1.setBounds(500,30, 300, 40);
        add(f1);

        JLabel l1 = new JLabel("Page 2 : ");
        l1.setFont(new Font("Ralway", Font.BOLD, 18));
        l1.setForeground(Color.white);
        l1.setBounds(300,30, 300, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional details");
        l2.setFont(new Font("Ralway", Font.BOLD,18));
        l2.setForeground(Color.white);
        l2.setBounds(250, 60, 600, 40);
        add(l2);

        JLabel rg = new JLabel("Religion :");
        rg.setFont(new Font("Ralway", Font.BOLD, 14));
        rg.setForeground(Color.white);
        rg.setBounds(120,120,100,30);
        add(rg);
            String religion [] = {"Hindu","Muslim","Sikh","Christian","Other"};
            comboBox = new JComboBox(religion);
            comboBox.setBackground(new Color(95,158,160));
            comboBox.setForeground(Color.white);
            comboBox.setFont(new Font("Ralway", Font.BOLD, 14));
            comboBox.setBounds(300,120, 200,30);
            add(comboBox);

        JLabel cg = new JLabel("Category :");
        cg.setFont(new Font("Ralway", Font.BOLD, 14));
        cg.setForeground(Color.white);
        cg.setBounds(120,170,100,30);
        add(cg);
            String category []= {"General","OBC","SC","ST","Other"};
            comboBox2 = new JComboBox(category);
            comboBox2.setFont(new Font("Ralway", Font.BOLD,14));
            comboBox2.setForeground(Color.white);
            comboBox2.setBackground(new Color(95,158,160));
            comboBox2.setBounds(300,170,200,30);
            add(comboBox2);
        JLabel ic = new JLabel("Income :");
        ic.setFont(new Font("Ralway", Font.BOLD, 14));
        ic.setForeground(Color.white);
        ic.setBounds(120,220,100,30);
        add(ic);
           String income [] = {"NULL","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
           comboBox3 = new JComboBox(income);
           comboBox3.setFont(new Font("Ralway", Font.BOLD,14));
           comboBox3.setForeground(Color.white);
           comboBox3.setBackground(new Color(95,158,160));
           comboBox3.setBounds(300,220,200,30);
           add(comboBox3);
        JLabel ed = new JLabel("Education :");
        ed.setFont(new Font("Ralway", Font.BOLD, 14));
        ed.setForeground(Color.white);
        ed.setBounds(120,270,100,30);
        add(ed);
            String education [] = {"Non-Graduate","Graduate","Post-Graduate","Doctorate","Other"};
            comboBox4 = new JComboBox(education);
            comboBox4.setFont(new Font("Ralway", Font.BOLD,14));
            comboBox4.setForeground(Color.white);
            comboBox4.setBackground(new Color(95,158,160));
            comboBox4.setBounds(300,270,200,30);
            add(comboBox4);
        JLabel oc = new JLabel("Occupation :");
        oc.setFont(new Font("Ralway", Font.BOLD, 14));
        oc.setForeground(Color.white);
        oc.setBounds(120,320,100,30);
        add(oc);
            String occupation [] = {"Salaried","Self-employed","Business","Retired","Other"};
            comboBox5 = new JComboBox(occupation);
            comboBox5.setFont(new Font("Ralway", Font.BOLD,14));
            comboBox5.setForeground(Color.white);
            comboBox5.setBackground(new Color(95,158,160));
            comboBox5.setBounds(300,320,200,30);
            add(comboBox5);

        JLabel pn = new JLabel("PAN Number :");
        pn.setFont(new Font("Ralway", Font.BOLD, 14));
        pn.setForeground(Color.white);
        pn.setBounds(120,370,150,30);
        add(pn);
            textPn = new JTextField();
            textPn.setBounds(300,370,200,30);
            add(textPn);
        JLabel ar = new JLabel("Adhar Number :");
        ar.setFont(new Font("Ralway", Font.BOLD, 14));
        ar.setForeground(Color.white);
        ar.setBounds(120,420,150,30);
        add(ar);
            textAr = new JTextField();
            textAr.setBounds(300,420,200,30);
            add(textAr);

        JLabel sc = new JLabel("Senior Citizens :");
        sc.setFont(new Font("Ralway", Font.BOLD, 14));
        sc.setForeground(Color.white);
        sc.setBounds(120,470,150,30);
        add(sc);
            r1 = new JRadioButton("Yes");
            r1.setBackground(new Color(95,158,160));
            r1.setFont(new Font("Ralway", Font.BOLD,14));
            r1.setForeground(Color.white);
            r1.setBounds(320,470,60,30);
            add(r1);
            r2 = new JRadioButton("No");
            r2.setBackground(new Color(95,158,160));
            r2.setFont(new Font("Ralway", Font.BOLD,14));
            r2.setForeground(Color.white);
            r2.setBounds(420,470,60,30);
            add(r2);
        JLabel ea = new JLabel("Existing Account :");
        ea.setFont(new Font("Ralway", Font.BOLD, 14));
        ea.setForeground(Color.white);
        ea.setBounds(120,520,150,30);
        add(ea);
            m1 = new JRadioButton("Yes");
            m1.setBackground(new Color(95,158,160));
            m1.setFont(new Font("Ralway", Font.BOLD,14));
            m1.setForeground(Color.white);
            m1.setBounds(320,520,60,30);
            add(m1);
            m2 = new JRadioButton("No");
            m2.setBackground(new Color(95,158,160));
            m2.setFont(new Font("Ralway", Font.BOLD,14));
            m2.setForeground(Color.white);
            m2.setBounds(420,520,60,30);
            add(m2);
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);

        JLabel fn = new JLabel("Form No :");
        fn.setFont(new Font("Ralway", Font.BOLD, 14));
        fn.setForeground(Color.white);
        fn.setBounds(700,10,60,30);
        add(fn);
        JLabel fn1 = new JLabel(formno);
        fn1.setFont(new Font("Ralway", Font.BOLD, 14));
        fn1.setForeground(Color.white);
        fn1.setBounds(760,10,30,30);
        add(fn1);
    // Next button
    Next = new JButton("Next");
    Next.setFont(new Font(":Ralway", Font.BOLD,14));
    Next.setBackground(Color.white);
    Next.setForeground(Color.black);
    Next.setBounds(400,570,80,25);
    Next.addActionListener(this);
    add(Next);





        getContentPane().setBackground(new Color(95,158,160));
        setLayout(null);
        setSize(650, 700);
        setLocation(350,30);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rgn = (String) comboBox.getSelectedItem();
        String ctg = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edc = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPn.getText();
        String adhaar = textAr.getText();

        String scitizen = null;
        if((r1.isSelected())){
            scitizen = "Yes";
        } else if(r2.isSelected()) {
            scitizen = "No";
        }


        String eAccount = "";
        if((m1.isSelected())){
            eAccount = "Yes";
        } else if((m2.isSelected())) {
           eAccount = "No";
        }

        try {
            if(textPn.getText().equals(" ") || textAr.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Fill all the feilds");
            }else {
                Con c1 = new Con();
                String q = "insert into signuptwo values('"+formno+"','"+rgn+"', '"+ctg+"', '"+inc+"', '"+edc+"', '"+occ+"', '"+pan+"', '"+adhaar+"', '"+scitizen+"', '"+eAccount+"' )";
                     c1.statement.executeUpdate(q);
                     new Signup3(formno);
                     setVisible(false);
            }

        }catch (Exception E ){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
