package com.company;
import java.util.Scanner;

//Classe que representa os alunos
class Aluno {
    String nome; //nome do aluno
    double notas [] = new double[3]; //vetor para guardar as tres notas do aluno
    double media = 0;
    String situacao;
}
public class Main {
    //variave para controlar a quandtidade de alunos cadastrados
    static int qtd = 0;
    //vetor para cadastrar até 100 alunos
    static Aluno [] turma = new Aluno[100];

    public static void main(String[] args) { //aqui onde tudo vai rodar
        //Definindo Scanner
        Scanner leia = new Scanner(System.in);

        //variavel para ler opção do usuario
        int opcao = 0;

        //chamando a sub-rotina de boas vindas
        mensagem();

        //faça enquanto para controlar o menu de operações e garantir que ele vai continar aparecendo até o usuario digitar o num 5
        do{
        System.out.println("Qual operação deseja seguir: \n1.Cadastrar Aluno \n2.Média das notas \n3.Alunos Aprovados/Reprovados \n4.Relatório Final \n5.Sair");
        opcao = leia.nextInt();
        //estrutura de repetição escolha caso
        switch (opcao){
            case 1:
                cadastrarAlunos(leia);
                break;

            case 2:
                calcularMedias();
                break;

            case 3:
                VerificarSituacoes();
                break;

            case 4:
                RelatorioFinal();
                break;

            case 5:
                System.out.println("Encerrando o programa....");
                break;

            default:
                System.out.println("Operação inválida. Tente novamente");
        }
        }while(opcao!=5);




    }


    //Subrotina para cadastrar um novo aluno
    public static void cadastrarAlunos(Scanner leia) {
        System.out.println("Nome do aluno: ");
        leia.nextLine(); //limpa o buffer para não dar conflito no cadastro
        String nome = leia.nextLine(); //Lê o nome do aluno


        //vetor para armazenar as notas do aluno
        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            notas[i] = leia.nextDouble(); //Lê cada nota
        }
        leia.nextLine(); //limpa o buffer para não conflito ao usuario


        //Cria um novo objeto Aluno e armazena os dados que o usuario digitou
        Aluno aluno = new Aluno();
        aluno.nome = nome;
        aluno.notas = notas;

        //Adiciona o aluno ao vetor e incrementa a quantidade
        turma[qtd] = aluno;
        qtd++;

        System.out.println("Aluno cadastrado com sucesso!");
    }
    //sub-rotina para calcular a média dos alunos
    public static void calcularMedias() {
        if (qtd == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        //Laço para percorrer todos os alunos cadastrados
        for (int i = 0; i < qtd; i++) {
            Aluno aluno = turma[i];
            double soma = 0;
            //laço para adicionar as notas na soma
            for (double nota : aluno.notas) {
                soma += nota;
            }

            //calculo da media
            aluno.media = soma / aluno.notas.length;

            //Exibe a média ao usuario
            System.out.printf("Média do aluno %s: %.2f\n", aluno.nome, aluno.media);
        }
    }
    //subrotina para verificar se o aluno está aprovado ou não
    public static void VerificarSituacoes() {
        if(qtd == 0){ //se a quantidade de alunos cadastrados for zero
            System.out.println("Nenhum aluno cadastrado até o momento!");
            return;
        }
        //laço para percorrer todos o alunos cadastrados
        for (int i = 0; i < qtd; i++) {
            Aluno aluno = turma[i];

            //if para retornar a situação deles
            if (aluno.media >= 70.00) {
                aluno.situacao = "Aprovado";
            } else {
                aluno.situacao = "Reprovado";
            }

            //saida de dados
            System.out.printf("Aluno: %s - Situação: %s\n", aluno.nome, aluno.situacao);
        }

    }
    //subrotina para exibir o relatorio final
    public static void RelatorioFinal(){
        if(qtd == 0){//if para caso não tiver alunos cadastrados ainda
            System.out.println("Nenhum usuário cadastrado até o momento!");
            return;
        }
        //saida de dados
        System.out.println("\n===== RELATÓRIO FINAL =====");
        //laço para percorrer todo o vetor com os alunos cadastrados e imprimir na tela ao usuario
        for (int i = 0; i < qtd; i++) {
            Aluno aluno = turma[i];
            System.out.println("Nome: " + aluno.nome);
            System.out.printf("Notas: %.1f, %.1f, %.1f\n", aluno.notas[0], aluno.notas[1], aluno.notas[2]);
            System.out.printf("Média: %.2f\n", aluno.media);
            System.out.println("Situação: " + aluno.situacao);
            System.out.println("-------------------------------");
        }

    }

//subrotina para imprimir mini mensagem de boas vindas na tela
    public static void mensagem(){
        System.out.println("-----------------------------------------");
        System.out.println("BEM VINDO A PÁGINA DE CADASTROS DE ALUNOS");
        System.out.println("-----------------------------------------");

    }
}
