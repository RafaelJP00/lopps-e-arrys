package arrys;
import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

/*public class Ex3_NumerosAleatorios{
    public static void main(String[] args) {
        Random random = new Random();
        int [] numerosAleatorios = new int [20];
        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;    
        } 
        System.out.print("\nAntecessor dos Números Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
        System.out.print("\nNúmeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.print("\nSucessores dos Números Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
    }
}*/

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); //classe para gerar números aleatórios

        int[] numeros = new int[20]; //array com 20 posições

        //para: variável i = numero, até i menor que o tamanho do array, acrescentamos 1 ao valor de i a cada loop.
        for (int i = 0; i < numeros.length; i++) {
            int numero = random.nextInt(100); //pegando um número aleatório entre 0 e 100.
            numeros[i] = numero; //atribuindo esse valor ao elemento na respectiva posição do array numeros.
        }

        System.out.print("Numeros: "); //frase ilustrativa
        //loop for-each
        for (int numero : numeros) { //para cada numero dentro do array de números
            System.out.print(numero + " "); //imprima o número
        }

        System.out.println("\n-----------------"); //separar os vetores

        System.out.print("Sucessores: "); //frase ilustrativa
        for (int numero : numeros) { //para cada numero dentro do array de números
            System.out.print((numero + 1) + " "); //adicione o valor 1 ao número e imprima esse novo valor
        }
    }
}
