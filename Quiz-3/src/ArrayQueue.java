import java.util.NoSuchElementException;

public class ArrayQueue
{
    Player[] queue;
    int front;
    int back;

    public ArrayQueue(int capacity)
    {
        queue = new Player[capacity];
    }

    public void enqueue(Player player)
    {
        // if the array is full
        if(back == queue.length)
        {
            // resizing the array
            Player[] newQueue = new Player[queue.length * 2];
            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            queue = newQueue;
        }

        queue[back] = player;
        back++;
    }

    public int size()
    {
        // just like stack, back is the "top"
        return back - front;
    }

    public Player dequeue()
    {
        if(size() == 0)
        {
            throw new NoSuchElementException();
        }

        Player removedPlayer = queue[front];
        queue[front] = null;
        front++;

        // “Increasing the number of front so we know where our front is”
        // “bc we are not shifting our array back to the left every time an object is removed, we are only nullifying it”

        // “so now, after we remove an element, we should check if our queue is empty”
        // “if it is, we should reset our front and back”

        // reset trackers when queue is empty
        if(size() == 0)
        {
            front = 0;
            back = 0;
        }

        return removedPlayer;
    }

    public Player peek()
    {
        if(size() == 0)
        {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public void printQueue()
    {
        for (int i = front; i < back; i++)
        {
            System.out.println(queue[i]);
        }
    }
}