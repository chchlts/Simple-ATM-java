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
public class SystemAtm extends SystemTeller{
    static bank CurrentAccount;
    static double limit;
    static int mode;
    tabungan tab;
    
    public SystemAtm(){
        super();
    }
    public void setMode(int i){
        this.mode = i;
    }
    public boolean login(String namaBank, String rekening, String pin){
        boolean cek = false;             
        if(findAccount(namaBank,rekening) != null && pin.equalsIgnoreCase(findAccount(namaBank,rekening).getNasabah().getTabungan().getPin())){                       
                setCurrentAccount(findAccount(namaBank,rekening));    
                cek = true;              
        }
        return cek;
    }

    public void setCurrentAccount(bank CurrentAccount){
        if(CurrentAccount != null){
            this.CurrentAccount = CurrentAccount;
            this.tab = this.CurrentAccount.getNasabah().getTabungan();
            this.limit = this.CurrentAccount.getNasabah().getTabungan().getLimit();
        }
        else{
            this.CurrentAccount = CurrentAccount;
            this.tab = null;
        }
        
    }
    public bank getCurrentAccount(){
        return this.CurrentAccount;
    }
    public boolean Withdrawal(double jumlah){
        boolean cek = false;
        
        
        transaction tr = new Withdrawal(this.mode, this.CurrentAccount, jumlah);
        //setLimit();
        /*if((this.CurrentAccount.getNasabah().getTabungan().getSaldo()-jumlah >= 0)){
            if((this.mode != 1 && jumlah <= this.limit) || this.mode == 1){
                this.CurrentAccount.getNasabah().getTabungan().setSaldo(this.CurrentAccount.getNasabah().getTabungan().getSaldo() - jumlah);
                cek = true;
                this.UpdateHashMap(CurrentAccount);
            }
            else if(this.mode == 1){
                this.CurrentAccount.getNasabah().getTabungan().setSaldo(this.CurrentAccount.getNasabah().getTabungan().getSaldo() - jumlah);
                cek = true;
                this.UpdateHashMap(CurrentAccount);
            }
            
        }*/
        cek = tr.run();
        return cek;
    }
    public boolean Deposit(double jumlah){
        //this.CurrentAccount.getNasabah().getTabungan().setSaldo(this.CurrentAccount.getNasabah().getTabungan().getSaldo()+ jumlah);
        boolean run;
        transaction tr = new Deposit(this.CurrentAccount, jumlah);
        run = tr.run();
        this.UpdateHashMap(CurrentAccount);
        return run;
        
    }
    public boolean Transfer(String namaBank, String rekening, double jumlah){
        boolean flag = false;
        bank DestAccount;
        DestAccount = findAccount(namaBank, rekening);
        transaction tr = new transfer(this.CurrentAccount, DestAccount, jumlah);
        flag = tr.run();
        UpdateHashMap(this.CurrentAccount);
        UpdateHashMap(DestAccount);
        
        
        return flag;
    }
    
    public void UpdateHashMap(bank update){
        bank temp = null;
        bank hasil = null;
        int i;
        Set entryset = account.entrySet();
        Iterator itr = entryset.iterator();       
        nasabah t = null;
        boolean cek = false;
        
        
        while(itr.hasNext()){
            Map.Entry me = (Map.Entry)itr.next();
            temp = (bank)me.getValue();
            t = temp.getNasabah();
            
            if(update.getNasabah().getTabungan().getRekening().equalsIgnoreCase(t.getTabungan().getRekening()) && update.getBank().equalsIgnoreCase(temp.getBank())){
                cek = true;
                i = (int)me.getKey();
                super.updateNasabah(i, update);
                
                
            }
            
        }
        
    }
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
            if(rekening.equalsIgnoreCase(t.getTabungan().getRekening()) && namaBank.equalsIgnoreCase(temp.getBank())){
                cek = true;
                hasil = temp;
                //System.out.println("REKENING FOUND");
                
            }
            
        }
        return hasil;
    }
}
