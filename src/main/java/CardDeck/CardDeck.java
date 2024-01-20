package CardDeck;

import java.util.Scanner;

public class CardDeck {

    public static void main(final String[] args) {

        Scanner input = new Scanner(System.in);
        int userInput = 0;
        String suit;
        String rank;

        while (userInput != -1) {
            System.out.print("Enter Card Number between 1 and 52(enter -1 to exit program): ");
            userInput = input.nextInt();
            suit = getSuit(userInput);
            rank = getCardRanking(userInput);

            System.out.println("The card you picked is " + rank + " of " + suit);
        }
        System.out.println("Exiting program, good night :)");

    }


    public static String getSuit(int suit) {
        String suitString;
        switch ((suit - 1) / 13) {
            case 0:
                suitString = "Clubs";
                break;
            case 1:
                suitString = "Diamonds";
                break;
            case 2:
                suitString = "Hearts";
                break;
            case 3:
                suitString = "Spades";
                break;
            default:
                suitString = "NO SUIT";
        }
        return suitString;
    }

    public static String getCardRanking(int cardNumber) {
        String cardRanking;
        while (cardNumber > 13) {
            cardNumber -= 13;
        }
        switch (cardNumber) {
            case 1:
                cardRanking = "Ace";
                break;
            case 2:
                cardRanking = "Two";
                break;
            case 3:
                cardRanking = "Three";
                break;
            case 4:
                cardRanking = "Four";
                break;
            case 5:
                cardRanking = "Five";
                break;
            case 6:
                cardRanking = "Six";
                break;
            case 7:
                cardRanking = "Seven";
                break;
            case 8:
                cardRanking = "Eight";
                break;
            case 9:
                cardRanking = "Nine";
                break;
            case 10:
                cardRanking = "Ten";
                break;
            case 11:
                cardRanking = "Jack";
                break;
            case 12:
                cardRanking = "Queen";
                break;
            case 13:
                cardRanking = "King";
                break;
            default:
                cardRanking = "NO CARD VALUE";
        }
        return cardRanking;
    }
}
