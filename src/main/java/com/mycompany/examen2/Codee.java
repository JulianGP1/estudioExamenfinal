
package com.mycompany.examen2;

import java.util.List;
import java.util.Random;

public class Codee {
    public String code(String name){
        String code="";
        Random random = new Random();

        int numero = random.nextInt(2);
        String namee[]=name.split(" ");
            for (String string : namee) {
                char str=string.charAt(0);
                code +=str;    
            }
            code=code+numero;    
        return code;
    }
    public boolean codeEx(String codigoo,Cuentas cuenta1,List<Cuentas> Cuenta){
        for (Cuentas cuentas : Cuenta) {
            if (codigoo.equalsIgnoreCase(cuenta1.getCode())) {
                return true;
            }
        }
        return false;
       
    }
}
