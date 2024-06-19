package com.mycompany.examen2;

import java.util.List;

public class Exist {
    public static void verificar(String name, List<Cuentas> cuentas) throws Exception {
        for (Cuentas cuenta : cuentas) {
        if (name.equalsIgnoreCase(cuenta.getName())) {
            throw new Exception("¡La cuenta ya está registrada!");
        }
    }}
    public static void verifiCode(String code,List<Cuentas> cuentas)throws Exception{
       for (Cuentas cuenta : cuentas) {
            if (code.equalsIgnoreCase(cuenta.getCode())) {
                throw new Exception("EL CODIGO YA ESTA EN USO");
            }
        
    }
    }
}

