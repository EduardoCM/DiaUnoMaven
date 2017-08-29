package com.oracle.diauno.arreglos;
public class ArrreglosAnonimos {
    
    public static void imprimirArreglo(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        imprimirArreglo(new int[]{1,2,5,8,7,9,6});
        int[] arregloAnonimo = new int[]{2,4,5,8,7,54};
    }  
}
