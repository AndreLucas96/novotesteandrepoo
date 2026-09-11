package oo;

import java.util.Scanner;

public class TestaPessoa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa a = new Pessoa();
        System.out.printf("Qual e seu nome?")
        a.idade = 30;
        a.peso = 81.9;
        System.out.printf("%s tem %d anos e pesa %.2f kg\n", a.nome, a.idade, a.peso);
        a.comer();
        a.respirar();
        a.dormir();
    }
}
