package lopps;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
/*public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }
}*/

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        System.out.println("Nota de 0 a 10: "); //Peça uma nota de 0 a 10
        int nota = scan.nextInt(); //Entrada de dados, neste caso de um int

        while(nota < 0 | nota > 10) { //Enquanto o valor da nota for menor que 0 ou maior que 10.
            System.out.println("Nota Inválida!"); //Mensagem que o valor é inválido
            System.out.println("Tente novamente. Nota: "); //Peça novamente a nota
            nota = scan.nextInt(); //Entrada de dados, neste caso de um int
        }

        System.out.println("Nota: " + nota); //imprimindo a nota válida
    }

}