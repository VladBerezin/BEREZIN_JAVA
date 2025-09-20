import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = sc.nextInt();

        System.out.println("Сумма цифр: " + digitSum(n));
        System.out.println("Количество цифр: " + digitCount(n));
        System.out.println("Обратное число: " + reverseNumber(n));
    }

    // --- 1. Сумма цифр ---
    public static int digitSum(int n) {
        int sum = 0;
        n = Math.abs(n); // на случай отрицательных
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // --- 2. Количество цифр ---
    public static int digitCount(int n) {
        n = Math.abs(n);
        if (n == 0) return 1; // у числа 0 одна цифра
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // --- 3. Обратное число ---
    public static int reverseNumber(int n) {
        int reversed = 0;
        int sign = (n < 0) ? -1 : 1; // чтобы работали отрицательные числа
        n = Math.abs(n);

        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return reversed * sign;
    }
}
