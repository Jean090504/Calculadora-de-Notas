package br.senai.jandira.alunos.model;

import java.util.Scanner;

public class CalculadoraDeNotas {

    String nome;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;
    String resultado;


    public void entradaDeDados(){
        Scanner leitorDouble = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);

        System.out.print("Insira o Nome do Aluno: ");
        nome = leitorString.nextLine();

        System.out.print("Insira a primeira nota do Aluno: ");
        nota1 = leitorDouble.nextDouble();

        System.out.print("Insira a segunda nota do Aluno: ");
        nota2 = leitorDouble.nextDouble();

        System.out.print("Insira a terceira nota do Aluno: ");
        nota3 = leitorDouble.nextDouble();

        System.out.print("Insira a quarta nota do Aluno: ");
        nota4 = leitorDouble.nextDouble();

        calcularDados();


    }


    public void calcularDados(){
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7){
           resultado = "Aprovado";
        } else if (media >=5 && media < 7){
            resultado = "Recuperação";
        } else{
            resultado = "Reprovado";
        }

        exibirDados();
    }


    public void exibirDados(){
        System.out.println("*** CÁLCULO DE MÉDIA ESCOLAR ***");
        System.out.println("---------------------------------------");
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Primeira nota do aluno: " + nota1);
        System.out.println("Segunda nota do aluno: " + nota2);
        System.out.println("Terceira nota do aluno: " + nota3);
        System.out.println("Quarta nota do aluno: " + nota4);
        System.out.println("---------------------------------------");
        System.out.println("A média do " + nome +": " + media);
        System.out.println("Situação do aluno: " + resultado);
        System.out.println("*****************************");
    }

    private void reiniciarPrograma(){


    }


}
