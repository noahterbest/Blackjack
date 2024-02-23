// Noah TerBest - Blackjack
// GitHub: https://github.com/noahterbest/Blackjack

import java.util.Scanner;
import java.util.Random;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduction
        System.out.println("Hello! This is a blackjack game");
        System.out.println("--------------------------------");

        // Variables
        int playerCash = 100;
        int playerBet = 0;
        int dealerCard1 = 0;
        int dealerCard2 = 0;
        int playerCard1 = 0;
        int playerCard2 = 0;

        // Game loop
        while (playerCash > 0) {
            System.out.println("You have $" + playerCash);
            System.out.println("How much would you like to bet?: ");

            // Get bet
            playerBet = scanner.nextInt();
            playerCash -= playerBet;
            System.out.println("You bet $" + playerBet);
            System.out.println("--------------------------------");

            // Deal cards
            dealerCard1 = (int) (Math.random() * 11) + 1;
            dealerCard2 = (int) (Math.random() * 11) + 1;
            playerCard1 = (int) (Math.random() * 11) + 1;
            playerCard2 = (int) (Math.random() * 11) + 1;
        }
        System.out.println("The dealer shows " + dealerCard1);
        System.out.println("You have " + playerCard1 + " and " + playerCard2);
    }
}
