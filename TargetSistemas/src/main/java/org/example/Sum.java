package org.example;

public class Sum {
    public static void main(String[] args) {
        int indice = 13, soma = 0, k = 0;

        while (k < indice){
            k++;

            soma = soma + k;
        }
        System.out.println(soma);
    }
}