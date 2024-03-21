/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;
import TotalHarga.perhitungan;
import TotalHarga.perhitungan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class halamanpembelian extends JFrame implements ActionListener{
    JLabel header = new JLabel("Halaman Pembelian");
    JLabel Kategori = new JLabel("Kategori");
    JLabel isikategori= new JLabel();
    JLabel Harga = new JLabel("Harga");
    JLabel isiharga= new JLabel();
    JLabel jumlah=new JLabel("Jumlah");
    JTextField isijumlah= new JTextField();
    
    JButton tombolkembali= new JButton("Kembali");
    JButton tombolbeli= new JButton("Beli");
    
    JLabel total = new JLabel("Total Pembelian");
    JLabel hargasatuan = new JLabel("Harga Satuan");
    JLabel isihargasatuan = new JLabel();
    JLabel labeljumlah = new JLabel("Jumlah");
    JLabel isijumlah2= new JLabel();
    JLabel labeltotal= new JLabel("Total Harga");
    JLabel isitotal= new JLabel();
    

    public halamanpembelian(String kategori, int harga) {
        String Hargaa = String.valueOf(harga);
        setTitle("Halaman Pembeliaan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480,520);
        setVisible(true);
        setLayout(null);
        
        add(header);
        header.setBounds(20, 20, 150, 30);
        
        add(Kategori);
        Kategori.setBounds(20, 40, 150, 30);
        add(isikategori);
        isikategori.setBounds(80, 40, 150, 30);
        isikategori.setText(kategori);
        
        add(Harga);
        Harga.setBounds(20, 90, 150, 30);
        add(isiharga);
        isiharga.setBounds(80, 90, 150, 30);
        isiharga.setText(Hargaa);
        
        add(jumlah);
        jumlah.setBounds(20, 140, 150, 30);
        add(isijumlah);
        isijumlah.setBounds(80, 140, 150, 30);
        
        add(tombolkembali);
        tombolkembali.setBounds(20,170, 100, 30);
        tombolkembali.addActionListener(this);
        
        add(tombolbeli);
        tombolbeli.setBounds(200, 170, 150, 30);
        tombolbeli.addActionListener(this);
        tombolbeli.addActionListener(this);
        
        add(total);
        total.setBounds(20, 220, 150, 30);
        
        add(hargasatuan);
        hargasatuan.setBounds(20, 250, 80, 30);
        add(isihargasatuan);
        isihargasatuan.setBounds(120, 250, 80, 30);
        isihargasatuan.setText(Hargaa);
        
        add(labeljumlah);
        labeljumlah.setBounds(20, 280, 80, 30);
        add(isijumlah2);
        isijumlah2.setBounds(120, 280, 80, 30);
        
        
        add(labeltotal);
        labeltotal.setBounds(20, 310, 80, 30);
        isitotal.setBounds(120, 310, 80, 30);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int jumlah3;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        jumlah3 = Integer.parseInt(isijumlah.getText());
        int harga3 = Integer.parseInt(isiharga.getText());
        perhitungan majalah1 = new perhitungan(harga3,jumlah3);
        
        String hitungjumlah= String.valueOf(jumlah3);
        String hitungTotal= String.valueOf(majalah1.hargaTotal());
        
        if(e.getSource()==tombolbeli){
            isijumlah2.setText(hitungjumlah);
            isitotal.setText(hitungTotal);
        }
        if(e.getSource()==tombolkembali){
            new loginpage();
        }
        
    }
    
}
