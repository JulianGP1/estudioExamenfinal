
package com.mycompany.examen2;

import java.util.List;

public class Contador {
    
    
    public  int cantf(List<Cuentas> cuentas,String deportes[]){
        int cont=0;
       
        for (Cuentas cuenta : cuentas) {
            if (cuenta.activity.equalsIgnoreCase("futbol")) {
                cont++;
                return cont;

            }
        }
        return cont;
    }
    public  int cantb(List<Cuentas> cuentas,String deportes[]){
        int conbt=0;
       
        for (Cuentas cuenta : cuentas) {
            if (cuenta.activity.equalsIgnoreCase("baloncesto")) {
                conbt++;
                return conbt;

            }
        }
        return conbt;
    }
    public  int cantbo(List<Cuentas> cuentas,String deportes[]){
        int contbo=0;
       
        for (Cuentas cuenta : cuentas) {
            if (cuenta.activity.equalsIgnoreCase("boleibol")) {
                contbo++;
                return contbo;

            }
        }
        return contbo;
    }
}
