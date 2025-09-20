import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- 1. Ввод размера массива ---
        System.out.print("Введите количество элементов массива N: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        // --- 2. Заполнение массива по формуле a[i] = i*i ---
        for (int i = 0; i < n; i++) {
            a[i] = i * i;
        }

        // --- 3. Поиск первого чётного элемента ---
        int firstEven = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                firstEven = a[i];
                break;
            }
        }

        // --- 4. Вывод массива через запятую ---
        System.out.print("Массив: ");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }

        // --- 5. Вывод результата ---
        if (firstEven != -1) {
            System.out.println("\nПервый чётный элемент: " + firstEven);
        } else {
            System.out.println("\nВ массиве нет чётных элементов.");
        }
    }
}
