/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture6;

import java.util.Date;

/**
 *
 * @author Ahmed Al-Brashdi
 */
public class Compare {
    public static void main(String[] args) {
        Date date1 = new Date(2019, 12, 12);
        Date date2 = new Date(2020, 2, 28);
        System.out.println(date2.compareTo(date1));
        String a = "Ahmed";
        String b = "Basim";
        System.out.println(a.compareTo(a));
    }

}
