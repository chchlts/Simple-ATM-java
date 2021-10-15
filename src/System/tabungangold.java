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
public class tabungangold extends tabungan{
    public tabungangold(String rekening, String pin, double saldo){
        super(rekening,pin,saldo,10000000);        
    }
    
    @Override
    public String getJenis(){
        return "GOLD";
    }
    
}