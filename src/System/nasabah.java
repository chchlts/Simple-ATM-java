/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

/**
 *
 * @author user
 */
public class nasabah {
    tabungan tabungan;
    String nama;
    
    public nasabah(String nama,String rekening,String pin, 
            double saldo, String jenis){
        this.nama = nama;
        switch (jenis){
            case "SILVER" :
                this.tabungan = new tabungansilver(rekening,pin,saldo);
                break;
            case "GOLD" :
                this.tabungan = new tabungangold(rekening,pin,saldo);
                break;
            case "PLATINUM" :
                this.tabungan = new tabunganplatinum(rekening,pin,saldo);
                break;
        }
        
    }
    public String getNamaNasabah(){
        return this.nama;
    }
    public void setNamaNasabah(String nama){
        this.nama = nama;
    }
    public tabungan getTabungan(){
        return this.tabungan;
    }
}
