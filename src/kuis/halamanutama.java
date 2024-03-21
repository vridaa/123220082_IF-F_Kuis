/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Lab Informatika
 */
public class halamanutama extends JFrame implements ActionListener{
    JLabel salam = new JLabel();
    JLabel tulisan = new JLabel("Silahkan pilih menu dibawah untuk membeli majalah");
    JButton tombolanak= new JButton("Majalah Anak");
    JButton tombolremaja= new JButton("Majalah Remaja");
    JButton tomboldewasa= new JButton("Majalah Dewasa");

    halamanutama(String Username) {
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480,520);
        setVisible(true);
        setLayout(null);
        
        add(salam);
        salam.setBounds(20, 20, 150, 30);
        salam.setFont(new Font("Serif",Font.BOLD,20));
        salam.setText("Selamat datang, "+Username);
        
        add(tulisan);
        salam.setBounds(20, 50, 150, 30);
        
        add(tombolanak);
        tombolanak.setBounds(20, 120, 150, 30);
        
        add(tombolremaja);
        tombolremaja.setBounds(20, 170, 150, 30);
        
        add(tomboldewasa);
        tomboldewasa.setBounds(20, 220, 150, 30);
        
        tombolanak.addActionListener(this);
        tombolremaja.addActionListener(this);
        tomboldewasa.addActionListener(this);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        String kategori="";
        int harga=0;
        if(e.getSource()==tombolanak){
            kategori= "Majalah Anak";
            harga= 10800;
        }
        if(e.getSource()==tombolremaja){
            kategori= "Majalah Remaja";
            harga= 13100;
        }
        if(e.getSource()==tomboldewasa){
            kategori= "Majalah Dewasa";
            harga= 69400;
        }
        new halamanpembelian(kategori, harga);
        this.dispose();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
