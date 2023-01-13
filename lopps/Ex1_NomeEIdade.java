package lopps;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
/*public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui..."); 

    }

}   */

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variáveis
        String nome; //armazena o nome
        int idade; //armazena a idade

        while(true) { //Enquando o loop for verdadeiro
            System.out.println("Nome: "); //Peça o nome
            nome = scan.next(); //armazene esse nome na variável

            if (nome.equals("0")) { //caso o nome igual a "0"
                break; //interrompa o programa
            }

            System.out.println("Idade: "); //Peça a idade
            idade = scan.nextInt(); //armazene a idade na variável

            //imprima o nome e a idade
            System.out.println("Nome: " + nome + " - idade: " + idade);
        }
    }
}