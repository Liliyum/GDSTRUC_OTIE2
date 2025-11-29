import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main
{
    public static void main(String[] args)
    {
        ArrayStack deck = new ArrayStack(30);
        ArrayStack discard = new ArrayStack(30);
        ArrayStack hand = new ArrayStack(30);
        Random random = new Random();
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 30; i++)
        {
            int rand = (int)(Math.random() * 10);
            Card card = new Card(rand);
            deck.push(card);
        }

        System.out.print("Starting Cards " + " card:" + "\n" + "\n");
        for (int i = 0; i < 3; i++)
        {
            int rand = (int)(Math.random() * 10);
            hand.push(new Card(rand));
        }
        hand.printStack();
        int turn = 1;
        while(!deck.isEmpty())
        {
            int drawingCards = random.nextInt(5)+1;
            System.out.println("----------- TURN " + turn + " -----------");
            System.out.println("Press ENTER to continue...");
            sc.nextLine();

            int randChoice = random.nextInt(3)+1;
            switch (randChoice)
            {
                case 1:
                    if (deck.getSize() >= drawingCards)
                    {
                        System.out.print("Drawing Cards " + drawingCards + " card:" + "\n" + "\n");
                        for (int i = 0; i < drawingCards; i++) {
                            hand.push(deck.pop());
                        }
                    }
                    break;
                case 2:
                    if (hand.getSize() >= drawingCards)
                    {
                        System.out.print("Discarding " + drawingCards + " card:" + "\n" + "\n");
                        for (int i = 0; i < drawingCards; i++) {
                            discard.push(hand.pop());
                        }
                    }
                    else
                    {
                        System.out.print("Cards at Hand is less " + drawingCards + " card:" + "\n" + "\n");
                    }
                    break;
                case 3:
                    if (!discard.isEmpty() && (discard.getSize() >= drawingCards))
                    {
                        System.out.print("Drawing from Discard Pile " + drawingCards + " card:" + "\n" + "\n");
                        for (int i = 0; i < drawingCards; i++)
                        {
                            hand.push(discard.pop());
                        }
                    }
                    else
                    {
                        System.out.print("Discard pile is Empty " + "\n" + "\n");
                    }
                    break;
            }
            // STATUS AFTER ROUND
            System.out.println("\n--- CARD STATUS ---");
            hand.printStack();
            System.out.println("Deck: " + deck.getSize());
            System.out.println("Discard: " + discard.getSize());
            System.out.println("Hand: " + hand.getSize());
            turn++;
        }

        System.out.print("You won !");
    }
}