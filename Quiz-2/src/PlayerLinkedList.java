public class PlayerLinkedList {

    private PlayerNode head;
    private int size;

    public PlayerLinkedList() {
        head = null;
        size = 0;
    }

    public void add(Player p) {
        PlayerNode newNode = new PlayerNode(p);

        if (head == null) {
            head = newNode;
        } else {
            PlayerNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        size++;
    }

    // Remove the first player
    public Player removeFirst() {
        if (head == null) {
            return null;
        }

        Player removed = head.data;
        head = head.next;
        size--;
        return removed;
    }

    // checks if player object exists in the list
    public boolean contains(Player p) {
        PlayerNode temp = head;
        while (temp != null) {
            if (temp.data.equals(p)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Player p) {
        PlayerNode temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data.equals(p)) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    public int size() {
        return size;
    }

    public void printList() {
        PlayerNode temp = head;
        System.out.print("[ ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println("]");
    }
}