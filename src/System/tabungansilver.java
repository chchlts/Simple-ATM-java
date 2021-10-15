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
public class tabungansilver extends tabungan{
    public tabungansilver(String rekening, String pin, double saldo){
        super(rekening,pin,saldo,5000000);        
    }    
    @Override
    public String getJenis(){
        return "SILVER";
    }    
}
