/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import static System.system.account;
import static System.system.count;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author user
 */
public class SystemTeller{
    static bank temp;
    public static int count=0;
    public int mode;
    
    public SystemTeller(){
        
    }
    public void setTemp(bank temp){
        this.temp = temp;
    }
    public bank getTemp(){
        return this.temp;
    }
    public void addNewNasabah(bank NewAccount){
        count++;
        account.put(count, NewAccount);
    }
    public void updateNasabah(int key, bank updateAccount){
        account.put(key, updateAccount);
    }
    public void allnasabah(){
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
            System.out.println(temp.getBank()+"\t" +temp.getNasabah().getNamaNasabah()+ "\t" +temp.getNasabah().getTabungan().getRekening()+ "\t" +temp.getNasabah().getTabungan().getSaldo());
            
            
        }
      
    }
}
