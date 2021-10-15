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
public class tabunganplatinum extends tabungan{
    public tabunganplatinum(String rekening, String pin, double saldo){
        super(rekening,pin,saldo,20000000);
        
    }
    
    @Override
    public String getJenis(){
        return "PLATINUM";
    }
    
}
