public class Main {
    public static void main(String[] args) {
        int [ ] mas = {1, 2, 1, 2, 4, 5};
        System.out.println(uniqueCount(mas));
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

}
