package com.mycompany.examen2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Examen2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        List<Cuentas> Cuenta=new ArrayList<>();
        File archivo = new File("lista");
        String deportes[]={"Futbol","Boleibol","Baloncesto"};
        BufferedWriter writer = new BufferedWriter(new FileWriter("lista"));
         Codee codigo = new Codee(); 
         Contador cont=new Contador();
         System.out.println("LIST OF ACTIVITYS"+"\n"
                 + deportes[0]+"\n"
                 + deportes[1]+"\n"
                 + deportes[2]+"\n");
        while (true) {          
            Cuentas cuenta1=new Cuentas("","","","");
      
            System.out.println("¿register new activity?");
            String r=scan.nextLine();
            if (r.equalsIgnoreCase("no")) {
                break;
            }
            System.out.println("egrees u name");
             String name=scan.nextLine();
             
             try {
             Exist.verificar(name, Cuenta);
           
           } catch (Exception e) {
                System.out.println("error"+ e.getMessage()+"va a vincular su segunda actividad");
                String activity2=scan.nextLine();
                cuenta1.setActivity2(activity2);
                break;
            }
             cuenta1.setName(name);
            System.out.println("egrees activiti to register");
            String activity=scan.nextLine();
            cuenta1.setActivity(activity);
            String codigoo=codigo.code(name);
            try {
                Exist.verifiCode(codigoo, Cuenta);
                
            } catch (Exception ex) {
                System.out.println("error"+" "+ex.getMessage());
                String nuevocodigo=codigo.code(name)+"1";
            
                System.out.println("tu nuevo codigo es:"+nuevocodigo);
                cuenta1.setCode(nuevocodigo);
                break;
            }
            cuenta1.setCode(codigoo);
            System.out.println(codigoo);
            Cuenta.add(cuenta1); 
                      writer.write(cuenta1.getName()+" "+cuenta1.getActivity()+" "+cuenta1.getActivity2()+" "+cuenta1.getCode());
                      writer.write("\n");
                      

        
} 
        int contadorf=cont.cantf(Cuenta, deportes);
        int contadorba=cont.cantb(Cuenta, deportes);
        int contadorbo=cont.cantbo(Cuenta, deportes);
            System.out.println("la cantidad de futbolistas es:"+contadorf);
            System.out.println("la cantidad de boleibol es:"+contadorbo);
            System.out.println("la cantidad de basket es:"+contadorba);
            writer.write("la cantidad de futbolistas es:"+contadorf);
                                  writer.write("\n");

            writer.write("la cantidad de baloncesto es:"+contadorba);
                                  writer.write("\n");

            writer.write("la cantidad de boleibol es:"+contadorbo);
            writer.close();
        }
        
    }

