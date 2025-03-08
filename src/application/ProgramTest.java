package application;

import entities.Champion;

import java.util.Scanner;

public class ProgramTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeao: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Vida inicial: ");
        int vida = sc.nextInt();
        System.out.print("Ataque: ");
        int ataque = sc.nextInt();
        System.out.print("Armadur: ");
        int armadura = sc.nextInt();
        Champion champA = new Champion(name, vida, ataque, armadura);
        System.out.println();
        sc.nextLine();
        System.out.println("Digite os dados do segundo campeao: ");
        System.out.print("Nome: ");
        name = sc.nextLine();
        System.out.print("Vida inicial: ");
        vida = sc.nextInt();
        System.out.print("Ataque: ");
        ataque = sc.nextInt();
        System.out.print("Armadur: ");
        armadura = sc.nextInt();
        Champion champB = new Champion(name, vida, ataque, armadura);
        System.out.println();

        System.out.print("Quantos turnos deseja executar? ");
        int turnos = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= turnos; i++) {
            if (champA.getLife() > 0 && champB.getLife() > 0) {
                System.out.println("Resultado do turno " + i + ":");
                champA.takeDamage(champB);
                champB.takeDamage(champA);
                System.out.print(champA.status());
                System.out.print(champB.status());
                System.out.println();
            }

        }

        System.out.println("Fim de combate");


        sc.close();
    }
}
