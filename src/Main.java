import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть числа через пробіл:");
        String input = scanner.nextLine();

        String[] numbers = input.split("\\s+");

        if (numbers.length == 0) {
            System.out.println("Не введено жодного числа!");
            return;
        }

        String result = DigitalPuzzle.findLargestPuzzle(numbers);

        System.out.println("Найбільша послідовність: " + result);
    }
}
