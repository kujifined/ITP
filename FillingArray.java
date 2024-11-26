import java.util.ArrayList;
import java.util.Random;

public class FillingArray {
    public ArrayList<Integer> FillArray(int min_num, int max_num, int size_of_arr) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size_of_arr; i++) {
            int rand_int = random.nextInt(max_num - min_num + 1) + min_num;
            numbers.add(rand_int);
        }
        return numbers;
    }
}
