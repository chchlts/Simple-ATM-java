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
public class Deposit extends transaction{
    static bank CurrentAccount;
    double jumlah;
    public Deposit(bank CurrentAccount, double jumlah){
        this.CurrentAccount = CurrentAccount;
        this.jumlah  = jumlah;
    }
    public Deposit(String namaBank,String rekening, double jumlah){
        this.CurrentAccount = super.findAccount(namaBank, rekening);
        this.jumlah = jumlah;
    }
    @Override
    public boolean run(){
        double CurrentBalance = this.CurrentAccount.getNasabah().getTabungan().getSaldo();
        this.CurrentAccount.getNasabah().getTabungan().setSaldo(CurrentBalance + this.jumlah);
        return true;
    }
}
