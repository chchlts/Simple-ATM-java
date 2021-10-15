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
public class Login extends transaction{
    String NamaBank,Rekening,Pin;
    public Login(String NamaBank, String Rekening, String Pin){
        this.NamaBank = NamaBank;
        this.Rekening = Rekening;
        this.Pin = Pin;
    }
    @Override
    public boolean run(){
       bank CurrentAccount;
       boolean flag = false;
       CurrentAccount = super.findAccount(NamaBank, Rekening);
       if(CurrentAccount.getNasabah().getTabungan().getPin().equalsIgnoreCase(this.Pin))
           flag = true;
       return flag;
    }
}
