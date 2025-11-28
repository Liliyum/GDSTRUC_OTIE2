public class Main {
    public static void main(String[] args) {
        PlayerLinkedList queue = new PlayerLinkedList();

        Player p1 = new Player(1, "Bomba", 6);
        Player p2 = new Player(2, "Clatt", 7);
        Player p3 = new Player(3, "Blubberbeast", 9);

        queue.add(p1);
        queue.add(p2);
        queue.add(p3);

        System.out.println("Initial list:");
        queue.printList();

        System.out.println("\nRemoving first: " + queue.removeFirst());
        queue.printList();

        System.out.println("\nContains Blubberbeast? " + queue.contains(p3));
        System.out.println("Index of BlubberBeast: " + queue.indexOf(p3));

        System.out.println("\nCurrent size: " + queue.size());
    }
}
