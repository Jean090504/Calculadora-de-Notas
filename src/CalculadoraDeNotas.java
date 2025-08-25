import java.util.Scanner;

public class CalculadoraDeNotas {

    String nome;
    double nota1;
    double nota2;
    double nota3;
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

        calcularDados();

        exibirDados();
    }


    public void calcularDados(){
        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7){
           resultado = "APROVADO";
        } else if (media >=5 && media < 7){
            resultado = "RECUPERAÇÃO";
        } else{
            resultado = "REPROVADO";
        }


    }


    public void exibirDados(){
        System.out.println("*****************************");
        System.out.println("NOME DO ALUNO: " + nome);
        System.out.println("MÉDIA DO ALUNO: " + media);
        System.out.println("SITUAÇÃO DO ALUNO: " + resultado);
        System.out.println("*****************************");
    }


}
