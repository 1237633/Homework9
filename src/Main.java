import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(){
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Сумма расходов за месяц " + sum);
        System.out.println(" ");
    }

    public static void task2(){
        int[] arr = generateRandomArray();
        int minValue = arr[0]; // так 100% не получим значение меньше минимального или больше максимального
        int maxValue = arr[0];
        for (int j : arr) {
            if (minValue > j) {
                minValue = j;
            }
            if (maxValue < j) {
                maxValue = j;
            }
        }
        System.out.println("Минимальная сумма трат составила " + minValue + " рублей. Максимальная сумма трат составила "+ maxValue + " рублей.");
        System.out.println(" ");
    }

    public static void  task3(){
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        float avg = sum / arr.length;
        System.out.println("Средняя сумма трат " + avg);
        System.out.println(" ");
    }

    //ПЕРЕДЕЛАТЬ!!
    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        boolean vBuhgalteriiVsePereputali = true;  // начало известного анекдота про зарплаты
        if(vBuhgalteriiVsePereputali) {
            System.out.println("Было: " + Arrays.toString(reverseFullName));
            //  char[] correctFullName = new char[reverseFullName.length];
            for (int i = 0; i < reverseFullName.length/2; i++) {
                final char c = reverseFullName[i];
                reverseFullName[i] = reverseFullName[reverseFullName.length-1-i];
                reverseFullName[reverseFullName.length-1-i] = c;

            }
            System.out.println("Стало: " + Arrays.toString(reverseFullName));
        }

    }
}