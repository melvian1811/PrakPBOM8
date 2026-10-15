package prakm8;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;

public class UI {

    public static void main(String[] args) {
        
    JFrame frame = new JFrame("Beranda");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    
    CardLayout card = new CardLayout();
    JPanel mainPanel = new JPanel(card);

    
    
    JPanel login = new JPanel(new GridLayout(4, 2, 15, 30));
    login.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    JLabel labelogin = new JLabel("Username ");
    JTextField txtlogin = new JTextField();
    JLabel labelpass = new JLabel("Password");
    JTextField txtpass = new JTextField();
    JButton btnlogin = new JButton("Login");
    JButton btnregister = new JButton("Register");
    
    login.add(labelogin);
    login.add(txtlogin);
    login.add(labelpass);
    login.add(txtpass);
    login.add(btnlogin);
    login.add(btnregister);



    JPanel register = new JPanel(new GridLayout(4, 2, 15, 30));
    register.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    JLabel labelregis = new JLabel("Username ");
    JTextField txtregis = new JTextField();
    JLabel labelrepas = new JLabel("Password");
    JTextField txtrepas = new JTextField();
    JButton btndaftar = new JButton("Daftarkan");
    JButton batal = new JButton("Batal Register");
    
    register.add(labelregis);
    register.add(txtregis);
    register.add(labelrepas);
    register.add(txtrepas);
    register.add(btndaftar);
    register.add(batal);


    JPanel panelUser = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
    JLabel labelWelcome = new JLabel("Selamat Datang di Halaman User!");
    JButton logout = new JButton("Logout");

    panelUser.add(labelWelcome);
    panelUser.add(logout);


    mainPanel.add(login, "LOGIN");
    mainPanel.add(register, "REGIS");
    mainPanel.add(panelUser, "USER");

    btnlogin.addActionListener(e -> card.show(mainPanel, "USER"));
    btnregister.addActionListener(e -> card.show(mainPanel, "REGIS"));
    btndaftar.addActionListener(e -> card.show(mainPanel, "LOGIN"));
    batal.addActionListener(e -> card.show(mainPanel, "LOGIN"));
    logout.addActionListener(e -> card.show(mainPanel, "LOGIN"));

    frame.add(mainPanel);
    frame.setVisible(true);
    }
}
