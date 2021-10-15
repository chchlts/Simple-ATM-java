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
public class FindAccount implements iTransaction{
    
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
            if(rekening.equalsIgnoreCase(t.getTabungan().getRekening()) && 
                    namaBank.equalsIgnoreCase(temp.getBank())){
                cek = true;
                hasil = temp;
                
            }
            
        }
        return hasil;
    }
    @Override
    public boolean run(){
        return false;
    }
}
