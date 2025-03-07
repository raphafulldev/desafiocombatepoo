package application;

import entities.Champion;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Vida inicial: ");
        int vida = sc.nextInt();
        System.out.print("Ataque: ");
        int ataque = sc.nextInt();
        System.out.print("Armadura: ");
        int armadura = sc.nextInt();

        Champion champA = new Champion(name, vida, ataque, armadura);
        sc.nextLine();
        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        name = sc.nextLine();
        System.out.print("Vida inicial: ");
        vida = sc.nextInt();
        System.out.print("Ataque: ");
        ataque = sc.nextInt();
        System.out.print("Armadura: ");
        armadura = sc.nextInt();

        Champion champB = new Champion(name, vida, ataque, armadura);
        System.out.println();
        System.out.print("Quantos turnos você deseja executar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (champA.getLife() > 0 && champB.getLife() > 0) {
                champA.takeDamage(champB);
                champB.takeDamage(champA);
                System.out.println();
                System.out.printf("Resulto do turno %d:%n", i);
                System.out.print(champA.status());
                System.out.print(champB.status());
            }
        }
        System.out.println();
        System.out.println("FIM DO COMBATE");

        sc.close();
    }
}
