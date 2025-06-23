package com.company;
import java.util.Scanner; //importando a biblioteca para o Scanner
import java.util.Arrays; //importando a biblioteca Arrays
public class Main {

    public static void main(String[] args) {
        //Definindo Scanner
        Scanner leia = new Scanner(System.in);
        //variavel para ler opção do usuario
        int opcao = 0;

        //sub-rotina para a mensagem
        mensagem();
        //faça enquanto para controlar o menu de operações e garantir que ele vai continar aparecendo até o usuario digitar o num 5
        do{
        System.out.println("Qual operação deseja seguir: \n 1.Cadastrar Aluno \n2.Média das notas \n3.Alunos Aprovados/Reprovados \n4.Relatório Final \n5.Sair");
        opcao = leia.nextInt();
        switch (opcao){
            case 1:
        }
        }while(opcao!=5);




    }


    public static void CadastroAlons(){
        String nomes[] = new String[1];
        System.out.println("Informe o nome do aluno:");

        for(int i = 0; i<3; i++){
            System.out.println("Informe a nota " + (i+1) + ":");

        }
    }

    public static void mensagem(){
        System.out.println("-----------------------------------------");
        System.out.println("BEM VINDO A PÁGINA DE CADASTROS DE ALUNOS");
        System.out.println("-----------------------------------------");

    }
}
