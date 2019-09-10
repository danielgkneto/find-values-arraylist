import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int value, frequency;

        System.out.println("\nWelcome to the numbers list\n");

        for (int i = 0; i < 20; i++)
            numbers.add(new Random().nextInt(50) + 1);

        System.out.println(numbers);

        System.out.println("Value to find: ");
        value = kb.nextInt();

        frequency = Collections.frequency(numbers, value);

        if (frequency > 0)
            System.out.println(value + " was found " + frequency + " time" + ((frequency == 1) ? "" : "s"));
        else
            System.out.println(value + " was not found");
    }
}