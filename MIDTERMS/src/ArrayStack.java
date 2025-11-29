import java.util.EmptyStackException;

public class ArrayStack {
    private Card[] stack;
    private int top;
    public int size = 0;

    public ArrayStack(int capacity) {
        this.stack = new Card[capacity];
    }

    public void push(Card Card)
    {
        // is stack full?
        if(top == stack.length)
        {
            Card[] newStack = new Card[stack.length * 2];

            // copy the old stack to the new one
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = Card;
        size++;
    }

    public Card pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        Card poppedCard = stack[--top];
        stack[top] = null;
        size--;
        return poppedCard;
    }

    public Card peek()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        System.out.println("printing stack");
        for (int i = top - 1; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }

     public int getSize()
     {
         return size;
     }
}