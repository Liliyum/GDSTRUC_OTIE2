//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void bubbleSort(int[] numbers) {
        for (int pass = numbers.length - 1; pass >= 0; pass--) {
            System.out.println("Pass " + pass);

            for (int i = 0; i < numbers.length - 1; i++) {
                // number on left is bigger than the right
                if (numbers[i] < numbers[i + 1]) {
                    System.out.println(numbers[i] + " is greater than " + numbers[i + 1] + ", swapping");

                    // swap
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] numbers)
    {
        for (int pass = numbers.length - 1; pass >= 0; pass--)
        {
            System.out.println("Pass " + pass);

            int biggestIndex = 0;

            for (int i = 0; i < pass; i++)
            {
                // number on left is bigger than the right
                //numbers[i] > numbers[i + 1]
                if (numbers[biggestIndex] > numbers[i + 1])
                {
                    System.out.println(numbers[i + 1] + " is greater than " + numbers[biggestIndex]);

                    biggestIndex = i + 1;
                }
            }

            // swap
            int temp = numbers[pass];
            numbers[pass] = numbers[biggestIndex];
            numbers[biggestIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] numbers = new int[8];


        numbers[0] = 7;
        numbers[1] = 99;
        numbers[2] = 100;
        numbers[3] = 21;
        numbers[4] = 43;
        numbers[5] = 11;
        numbers[6] = 1;
        numbers[7] = 69;

        //System.out.println("\nBefore sorting");
        //printArray(numbers);

        bubbleSort(numbers);
        //selectionSort(numbers);

        //System.out.println("\nAfter sorting");
        printArray(numbers);
    }

    public static void printArray(int[] numbers)
    {
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}