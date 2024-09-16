import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) * 2;
        }

        Arrays.sort(array);
        System.out.println("Массив: " + Arrays.toString(array));

        int sum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            sum += array[i];
        }

        double average = sum / (double)(array.length - 2);
        System.out.println("Среднее арифметическое без учета мин и макс: " + average);
    }
}
