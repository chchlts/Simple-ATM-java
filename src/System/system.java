/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.util.HashMap;

/**
 *
 * @author user
 */
public class system{
    public static HashMap<Integer, bank> account = new HashMap<Integer,bank>();
    public static int count=0;
    public int mode;
    public system(){
        this.StaticData();
    }
    public system(int mode){
        this.mode = mode;
        this.StaticData();
    }
    public void StaticData(){
        count++;
        account.put(count, new bank("MANDIRI","Rahmafatin", "2110191018", "140402", 1000000, "platinum"));
        count++;
        account.put(count, new bank("BRI","Laila Marufah", "2110191025", "252525", 400000, "gold"));
        count++;
        account.put(count, new bank("BRI","Feri Afrianto", "2110191007", "070707", 500000, "silver"));
        count++;
        account.put(count, new bank("BCA","Putu Bagus", "2110191001", "010101", 400000, "silver"));
    }
    
}