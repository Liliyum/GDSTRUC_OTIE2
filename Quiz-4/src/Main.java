public class Main {
    public static void main(String[] args) {
        Player one = new Player (134, "UchiNekoko", 134);
        Player two = new Player (536, "Serdyi", 643);
        Player three = new Player (32, "bomba", 34);
        Player four = new Player (4931, "mangomango", 614);
        Player five = new Player (6919, "clatt", 594);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(one.getName(), one);
        hashtable.put(two.getName(), two);
        hashtable.put(three.getName(), three);
        hashtable.put(four.getName(), four);
        hashtable.put(five.getName(), five);

        hashtable.printHashtable();

        System.out.println("\nGet 'mogversity'");
        System.out.println(hashtable.get("mogversity"));

        System.out.println("\nGet 'UchiNekoko'");
        System.out.println(hashtable.get("UchiNekoko"));


        System.out.println(hashtable.get("Serdyi"));
        System.out.println("\nRemove 'Serdyi'...");
        Player removed1 = hashtable.remove("Serdyi");
        System.out.println("removed: " + removed1);

        System.out.println(hashtable.get("bomba"));
        System.out.println("\nRemove 'bomba'...");
        Player removed2 = hashtable.remove("bomba");
        System.out.println("removed: " + removed2);

        System.out.println("\nGet 'Serdyi'");
        System.out.println(hashtable.get("Serdyi"));

        System.out.println("\n");
        hashtable.printHashtable();
    }
}