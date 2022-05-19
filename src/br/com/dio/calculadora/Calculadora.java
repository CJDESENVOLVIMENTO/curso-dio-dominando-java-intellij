package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

            int a, b;
        System.out.println("Digite Primeiro valor:   ");
        a = scan.nextInt();
        System.out.println("Digite Segundo valor:     ");
        b = scan.nextInt();

        int soma = soma(a, b);
        int subtracao = subtracao(a, b);
        int mutiplicacao = mutiplicacao(a, b);
        double divisao = divisao(a, b);

        System.out.println("soma:   " + soma);
        System.out.println("sub:   " + subtracao);
        System.out.println("mult:   " + mutiplicacao);
        System.out.println("div:   " + divisao);
    }
    public  static int soma(int a, int b){
        return a + b;
}
    public  static int subtracao(int a, int b){
        return a - b;
}
    public  static int mutiplicacao(int a, int b){
        return a * b;
}
    public  static double divisao(double a, double b){
        return a / b;
}
}

