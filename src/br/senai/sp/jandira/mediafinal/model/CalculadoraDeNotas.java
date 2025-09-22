package br.senai.sp.jandira.mediafinal.model;

import java.util.Scanner;

public class CalculadoraDeNotas {

    String nome;
    double nota1Aluno;
    double nota2Aluno;
    double nota3Aluno;
    double nota4aluno;
    double mediaDoAluno;
    String resultadoDeAprovacao;
    int reinicioDePrograma;


    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o Nome do Aluno: ");
        nome = leitor.nextLine();

        System.out.print("Insira a primeira nota do Aluno: ");
        nota1Aluno = leitor.nextDouble();

        System.out.print("Insira a segunda nota do Aluno: ");
        nota2Aluno = leitor.nextDouble();

        System.out.print("Insira a terceira nota do Aluno: ");
        nota3Aluno = leitor.nextDouble();

        System.out.print("Insira a quarta nota do Aluno: ");
        nota4aluno = leitor.nextDouble();

        calcularDados();


    }


    public void calcularDados(){
        mediaDoAluno = (nota1Aluno + nota2Aluno + nota3Aluno + nota4aluno) / 4;

        if (mediaDoAluno >= 7){
           resultadoDeAprovacao = "Aprovado";
        } else if (mediaDoAluno >=5 && mediaDoAluno < 7){
            resultadoDeAprovacao = "Recuperação";
        } else{
            resultadoDeAprovacao = "Reprovado";
        }

        exibirDados();
    }


    public void exibirDados(){
        System.out.println("*** CÁLCULO DE MÉDIA ESCOLAR ***");
        System.out.println("---------------------------------------");
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Primeira nota do aluno: " + nota1Aluno);
        System.out.println("Segunda nota do aluno: " + nota2Aluno);
        System.out.println("Terceira nota do aluno: " + nota3Aluno);
        System.out.println("Quarta nota do aluno: " + nota4aluno);
        System.out.println("---------------------------------------");
        System.out.println("A média do " + nome +": " + mediaDoAluno);
        System.out.println("Situação do aluno: " + resultadoDeAprovacao);
        System.out.println("*****************************");

        reiniciarPrograma();
    }

    public void reiniciarPrograma() {
        Scanner leitorInt = new Scanner(System.in);

        System.out.println("Deseja calcular média de outro aluno ?");
        System.out.println("Digite '1' para sim, e '0' para finalizar o programa.");
        reinicioDePrograma = leitorInt.nextInt();
        if (reinicioDePrograma == 1) {
            obterDados();
        } else {
            System.out.println("Obrigado por usar o programa!");
            System.out.println("Finalizando o programa...");
        }
    }
}
