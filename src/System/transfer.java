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
public class transfer extends transaction{
    //@Override
    //String namaBank,rekening,jenis;
    double jumlah,limit;
    static bank CurrentAccount,DestAccount;
    boolean flag = false;
    public transfer(bank CurrentAccount,bank DestAccount, double jumlah){
      
       this.jumlah = jumlah;
       this.DestAccount = DestAccount;
       this.CurrentAccount = CurrentAccount;
       this.limit = this.CurrentAccount.getNasabah().getTabungan().getLimit();
    }
    @Override
    public boolean run(){
        
        //checking the bank, if have same bank so limit is greater then when is different bank
        if(isSameBank()){
            limit *= 2;
        }
        
        //if user have balance and the transaction less than limit 
        if(isBalanceAvailable() && isLessThanLimit()){
            double CurrentBalance = this.CurrentAccount.getNasabah().getTabungan().getSaldo();
            double DestBalance = DestAccount.getNasabah().getTabungan().getSaldo();
            this.CurrentAccount.getNasabah().getTabungan().setSaldo(CurrentBalance - jumlah);
            DestAccount.getNasabah().getTabungan().setSaldo(DestBalance + jumlah);
            System.out.println("perfectly execute");
            
            flag = true;
        }
        return flag;
    }
    public boolean isSameBank(){
        return (this.CurrentAccount.getBank().equalsIgnoreCase(DestAccount.getBank()));
    }
    public boolean isBalanceAvailable(){
        return (this.CurrentAccount.getNasabah().getTabungan().getSaldo() - jumlah >= 0);
    }
    public boolean isLessThanLimit(){
        return (jumlah <= this.limit);
    }
    /*public void setSameKind(){
        switch(this.CurrentAccount.getNasabah().getTabungan().getJenis()){
            case "Silver" :
                this.Max = 10000000;
                break;
            case "Gold" :
                this.Max = 20000000;
                break;
            case "Platinum" :
                this.Max = 50000000;
                break;
        }
    }
    public void setDiffKind(){
        switch(this.CurrentAccount.getNasabah().getTabungan().getJenis()){
            case "Silver" :
                this.Max = 5000000;
                break;
            case "Gold" :
                this.Max = 10000000;
                break;
            case "Platinum" :
                this.Max = 20000000;
                break;
        }
    }*/
    
}
