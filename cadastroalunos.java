package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class cadastroalunos {
    public static void main(String[] args) {
        //Criar uma sub-rotina de teste para cadastrar 3 alunos

        Scanner leia = new Scanner(System.in);
        int contalunos = 0;


        String [] nomealunos = new String [3];

        mensagem("Bem vindo a página de cadastro!!!");

        for(int i = 0; i<3;i++){
            System.out.println("Insira o nome do " + (i+1) + "º aluno: ");
             nomealunos [i] = leia.nextLine();



        }System.out.println(Arrays.toString(nomealunos));




    }
    public static void mensagem(String frase){
        System.out.println("-------------------");
        System.out.println(frase);
        System.out.println("-------------------");
    }
}

