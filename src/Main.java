import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Введите длинну массива: ");
        Scanner scanner = new Scanner(System.in);
        int[] mass = new int[scanner.nextInt()];//{1, 2, 1, 2, 4, 5};
        System.out.printf("Введите числа в созданный массив: ");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
        System.out.println(uniqueCount(mass));
        System.out.println(uniqueCountSet(mass));
        System.out.println(uniqueCountStream(mass));
    }
    static int uniqueCount(int[] mass) {
        int result = 0;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            countUnique++;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[j] == mass[i]) {
                    count++;
                    break;
                }
            }
        }
        return result = countUnique - count;
    }

    static int uniqueCountSet(int[] mass) {
        Set<Integer> masSet = new HashSet<>();
        for (int x : mass) {
            masSet.add(x);
        }
        return masSet.size();
    }
    public static int uniqueCountStream(int[] mass)
    {
        return (int) Arrays.stream(mass).distinct().count();
    }
}
