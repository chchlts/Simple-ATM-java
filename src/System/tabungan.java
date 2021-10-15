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
public abstract class tabungan {
    private String rekening;
    private double saldo;
    private String pin;
    private double limit;
    public tabungan(){
    }
    public tabungan(String rekening,String pin, double saldo, double limit){
        this.rekening = rekening;
        this.pin = pin;
        this.saldo = saldo;
        this.limit = limit;
    }
    public String getRekening(){
        return this.rekening;
    }
    public void setRekening(String rekening){
        this.rekening = rekening;
    }
    public String getPin(){
        return this.pin;
    }
    public void setPin(String pin){
        this.pin = pin;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getLimit(){
        return this.limit;
    }
    public abstract String getJenis();
}
