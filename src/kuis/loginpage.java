/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */

public class loginpage extends JFrame implements ActionListener{
    JLabel labellogin= new JLabel("Halaman Login");
    JLabel username = new JLabel("Username");
    JTextField inputuser= new JTextField();
    JLabel password = new JLabel("Password");
    JPasswordField inputpass= new JPasswordField();
    
    JButton tombollogin= new JButton("Login");
    public loginpage(){
        setTitle("Halaman Login");
        
        setSize(500,400);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(labellogin);
        labellogin.setBounds(20, 20, 150, 30);
        labellogin.setFont(new Font("Serif",Font.BOLD,20));
        
        add(username);
        username.setBounds(20, 60, 150, 30);
        
        add(inputuser);
        inputuser.setBounds(100, 60, 150, 30);
        
        add(password);
        password.setBounds(20, 100, 150, 30);
        
        add(inputpass);
        inputpass.setBounds(100, 100, 150, 30);
        
        add(tombollogin);
        tombollogin.setBounds(20, 140, 150, 30);
        tombollogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try{
            String Username = inputuser.getText();
            String Password;
            Password = String.valueOf(inputpass.getPassword());
                if(!"123220082".equals(Username)){
                throw new Exception("Username salah ya");
                }else if(!"12345".equals(Password)){
                throw new Exception("Password salah ya");
                }
                new halamanutama(Username);
                this.dispose();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        } 
    }
    
}
