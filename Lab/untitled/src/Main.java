//import java.util.Scanner;
import java.util.ArrayList;



public class Main {
    private static final int MIN_NUMBER = -100;
    private static final int MAX_NUMBER = 100;
    private static final int SIZE = 10;
    private static final int DIVISIBLE_NUMBER = 3;

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        FillingArray randomArray = new FillingArray();

//        int min_num = scanner.nextInt();
//        int max_num = scanner.nextInt();
//        int size_num = scanner.nextInt();

        ArrayList<Integer> randArray = randomArray.FillArray(MIN_NUMBER, MAX_NUMBER, SIZE);

        System.out.println("Random Array: ");
        randArray.stream()
                .forEach(num -> System.out.print(num + " "));

        System.out.println();

        System.out.println("Random Array with numbers, divisible by 3: ");
        randArray.stream()
                .filter(num -> num % DIVISIBLE_NUMBER == 0)
                .map(Math::abs)
                .forEach(num -> System.out.print(num + " "));

    }
}
