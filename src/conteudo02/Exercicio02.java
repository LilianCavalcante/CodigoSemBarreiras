package conteudo02;

import java.util.Scanner;

public class

        Exercicio02 {

    public static void main(String[] args) {

        Scanner in = new Scanner((System.in));

        System.out.println("Digite um número inteiro a:");
        int primeiroNumero = in.nextInt();

        System.out.println("Digite um número inteiro b:");
        int segundoNumero = in.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Os dois números são iguais");
        }else if (primeiroNumero>segundoNumero) {
            System.out.println("O primeiro número é maior");
            } else {
                System.out.println("O segundo número é maior");
            }
        }
    }

