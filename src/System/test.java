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
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SystemAtm sys = new SystemAtm();
        sys.allnasabah();
        sys.addNewNasabah(new bank("BCA", "ichaa", "2110191018", "140402", 2000000, "PLATINUM"));
        sys.allnasabah();
        System.out.println("Login Status " +sys.login("BCA", "2110191018", "140402"));
        System.out.println("Nasabah login : "+sys.getCurrentAccount().getNasabah().getNamaNasabah());
        System.out.println("Withdrawal 50000 : " +sys.Withdrawal(500000));
        System.out.println(sys.getCurrentAccount().getNasabah().getTabungan().getSaldo());
        sys.allnasabah();
        System.out.println("Transfering to Rahmafatin 50000 : "+sys.Transfer("MANDIRI", "2110191018", 50000));
        sys.allnasabah();
    }
    
}
