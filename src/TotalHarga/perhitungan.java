/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TotalHarga;

/**
 *
 * @author Lab Informatika
 */
public class perhitungan {
    private int harga3,jumlah3;
    
    public perhitungan(int harga3,int jumlah3){
        this.harga3= harga3;
        this.jumlah3=jumlah3;
    }
    
    public int getharga3(){
        return harga3;
    }
    
    public int getjumlah3(){
        return jumlah3;
    }
    
    public void setharga3(int harga3){
        this.harga3=harga3;
    }
    
    public void setjumlah3(int jumlah3){
        this.jumlah3=jumlah3;
    }
    
    public int hargaTotal(){
        return harga3*jumlah3;
    }
    
}
