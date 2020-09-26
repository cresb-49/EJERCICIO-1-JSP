package com.carlos.eje_jps_1;

import java.util.ArrayList;

public class operacionesCalculadora {
    
    public operacionesCalculadora(){
        
    }
        
    public double multiplicarNumeros(double n1, double n2){
        return n1*n2;
    }
    public double sumarNumeros(double n1, double n2){
        return n1+n2;
    }
    public double obtenerMayor(double n1, double n2){
        if(n1>n2){
            return n1;
        }else{
            return n2;
        }
    }
    public double potenciaNumeros (double n1, double n2){
        return Math.pow(n1, n2);
    }
    public ArrayList<String> trasladoBinario(double n1, double n2){
        ArrayList<String> resultado= new ArrayList<>();
        String binN1=binario(n1);
        String binN2=binario(n2);
        resultado.add(binN1);
        resultado.add(binN2);
        return resultado;
    }
    private String binario(double num){
        int num2 = (int) num;
        int temp;
        String resultado="";
        if (num > 1) {
            do {
                temp = num2 % 2;
                num2 = num2 / 2;
                resultado=temp+resultado;
                if (num2 == 1) {
                    resultado=num2+resultado;
                }
            } while (num2 != 1);
        } else if (num == 1) {
            resultado = "1";
        }else{
            resultado="El numero introducido no tiene representacion binaria";
        }
        return resultado;
    }
}
