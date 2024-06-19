
package com.mycompany.examen2;

class Cuentas {
    String name;
    String activity;
    String code;
    String activity2;

    public Cuentas(String name, String activity, String code, String activity2) {
        this.name = name;
        this.activity = activity;
        this.code = code;
        this.activity2 = activity2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getActivity2() {
        return activity2;
    }

    public void setActivity2(String activity2) {
        this.activity2 = activity2;
    }
    
}
