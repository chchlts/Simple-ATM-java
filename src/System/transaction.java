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
public class transaction {
     public boolean isBalanceAvailable(){
        return (this.CurrentAccount.getNasabah().getTabungan().getSaldo()-jumlah >= 0);
    }
    int mode;
    static bank CurrentAccount;
    double jumlah,limit;
    boolean flag = false;
    public bank findAccount(String namaBank, String rekening){
        bank temp = null;
        bank hasil = null;
        Set entryset = account.entrySet();
        Iterator itr = entryset.iterator();       
        nasabah t = null;
        boolean cek = false;
        
        
        while(itr.hasNext()){
            Map.Entry me = (Map.Entry)itr.next();
            temp = (bank)me.getValue();
            t = temp.getNasabah();
            //System.out.println("LOOKING FOR");
            if(rekening.equalsIgnoreCase(t.getTabungan().getRekening()) && 
                    namaBank.equalsIgnoreCase(temp.getBank())){
                cek = true;
                hasil = temp;
                //System.out.println("REKENING FOUND");
                
            }
            
        }
        return hasil;
    }
   
    
    public boolean run(){
        return false;
    }
}
