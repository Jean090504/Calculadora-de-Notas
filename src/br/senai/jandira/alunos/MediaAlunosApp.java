package br.senai.jandira.alunos;

import br.senai.jandira.alunos.model.CalculadoraDeNotas;

public class MediaAlunosApp {
    public static void main(String[] args) {
        System.out.println("Iniciando a aplicacão...");

        CalculadoraDeNotas calculadoradenotasnew = new CalculadoraDeNotas();

        calculadoradenotasnew.entradaDeDados();
    }
}
