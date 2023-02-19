import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        int[] years = {1981, 2000, 2008};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractionalNumbers.length; i++) {
            System.out.print(fractionalNumbers[i]);
            if (i != fractionalNumbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        int[] years = {1981, 2000, 2008};
        for (int i = 0; i < years.length; i++) {
            System.out.print(years[i]);
            if (i != years.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void task3() {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        for (int i = fractionalNumbers.length - 1; i >= 0; i--) {
            System.out.print(fractionalNumbers[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        int[] years = {1981, 2000, 2008};
        for (int i = years.length - 1; i >= 0; i--) {
            System.out.print(years[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0){
                numbers[i]++;
            }
            System.out.println(Arrays.toString(numbers));

            }
        }
    }





















