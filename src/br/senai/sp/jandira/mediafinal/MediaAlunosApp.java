package br.senai.sp.jandira.mediafinal;

import br.senai.sp.jandira.mediafinal.model.CalculadoraDeNotas;

public class MediaAlunosApp {
    public static void main(String[] args) {
        System.out.println("Iniciando a aplicacão...");

        CalculadoraDeNotas calculadoradenotasnew = new CalculadoraDeNotas();

        calculadoradenotasnew.obterDados();
    }
}
