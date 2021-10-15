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
public class bank {
    private nasabah nasabah;
    private String namaBank;
    
    public bank(){
    }
    public bank(String namaBank, String nama,String rekening,String pin, double saldo, String jenis){
        this.namaBank = namaBank;
        this.nasabah = new nasabah(nama, rekening, pin, saldo, jenis);
    }
    public String getBank(){
        return this.namaBank;
    }
    public void setBank(String namaBank){
        this.namaBank = namaBank;
    }
    public nasabah getNasabah(){
        return this.nasabah;
    }
}
