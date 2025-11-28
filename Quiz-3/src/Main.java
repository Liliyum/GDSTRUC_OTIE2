import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        ArrayQueue queue = new ArrayQueue(5);
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int playerID = 1;
        int games = 0;

        while (games < 10) {

            System.out.println("\n--- Press ENTER to queue next lobby ---");
            scanner.nextLine();

            // 1 to 7 random players join
            int x = rand.nextInt(7) + 1;
            System.out.println("Players joining: " + x);

            for (int i = 0; i < x; i++) {
                Player p = new Player(playerID, "Player " + playerID, 1);
                queue.enqueue(p);
                System.out.println("Queued: " + p);
                playerID++;
            }

            // If we have enough for a match
            if (queue.size() >= 5) {

                System.out.println("\n=== GAME " + (games + 1) + " START ===");
                System.out.println("Players:");

                // Remove first 5 players
                for (int i = 0; i < 5; i++) {
                    System.out.println(queue.dequeue());
                }

                games++;
            } else {
                System.out.println("Not enough players. Current queue size: " + queue.size());
            }
        }

        System.out.println("\n=== 10 games created. Matchmaking finished. ===");
    }
}