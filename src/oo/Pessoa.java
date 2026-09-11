package oo;

public class Pessoa {
    String nome;
    int idade;
    double peso;

    public void comer(){
        System.out.printf("Sou %s e estou comendo!\n",nome);
    }
    public void respirar(){
        System.out.printf("Tenho %d anos e estou respirando,\n",idade);
    }
    public void dormir(){
        System.out.printf("e peso %.2f kg e estou dormindo!\n",peso);
    }
}
