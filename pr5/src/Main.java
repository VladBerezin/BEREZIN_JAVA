public class Main {


    public static int digitSum(int n) {
        n = Math.abs(n);
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }


    public static int digitCount(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;

        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }


    public static int reverseNumber(int n) {
        int sign = (n < 0) ? -1 : 1;
        n = Math.abs(n);

        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev * sign;
    }

    public static void main(String[] args) {
        int number = -12345;

        System.out.println("Число: " + number);
        System.out.println("Сумма цифр: " + digitSum(number));
        System.out.println("Количество цифр: " + digitCount(number));
        System.out.println("Обратное число: " + reverseNumber(number));
    }
}