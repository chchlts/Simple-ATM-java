/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;
import static System.system.account;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author user
 */
public class Withdrawal extends transaction{
    int mode;
    static bank CurrentAccount;
    double jumlah,limit;
    boolean flag = false;
    public Withdrawal(int mode,bank CurrentAccount, double jumlah){
        this.CurrentAccount = CurrentAccount;
        this.mode = mode;
        this.jumlah = jumlah;
    }
    public Withdrawal(int mode, bank CurrentAccount){
        this.CurrentAccount = CurrentAccount;
        this.mode = mode;
        this.jumlah = jumlah;
    }
    
    @Override
    public boolean run(){
        double CurrentBalance = this.CurrentAccount.getNasabah().
                                getTabungan().getSaldo();
        boolean cek = false;
        if(isBalanceAvailable()){
            if((this.mode == 2 && jumlah <= this.limit) || this.mode == 1){
                this.CurrentAccount.getNasabah().getTabungan().
                        setSaldo(this.CurrentAccount.getNasabah().getTabungan()
                                .getSaldo() - jumlah);
                cek = true;
               
            }
                     
        }
        return cek;       
    }  
}
