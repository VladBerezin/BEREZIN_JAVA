import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        taskIfElse(sc);
        taskSwitch(sc);
        taskTernary(sc);
    }

    // --- Задача 1: if/else ---
    public static void taskIfElse(Scanner sc) {
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();

        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        System.out.print("Введите третье число: ");
        int c = sc.nextInt();

        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("Максимальное число: " + max);
    }

    // --- Задача 2: switch ---
    public static void taskSwitch(Scanner sc) {
        System.out.print("Введите зону доставки (1-4): ");
        int zone = sc.nextInt();
        int cost;

        switch (zone) {
            case 1:
                cost = 100;
                break;
            case 2:
                cost = 200;
                break;
            case 3:
                cost = 500;
                break;
            case 4:
                cost = 1000;
                break;
            default:
                cost = -1;
        }

        if (cost != -1) {
            System.out.println("Стоимость доставки: " + cost + " руб.");
        } else {
            System.out.println("Ошибка: такой зоны не существует.");
        }
    }

    // --- Задача 3: тернарный оператор ---
    public static void taskTernary(Scanner sc) {
        System.out.print("Введите температуру: ");
        int t = sc.nextInt();

        String result = (t < 0) ? "Холодно"
                : (t < 20) ? "Прохладно"
                : (t < 30) ? "Тепло"
                : "Жарко";

        System.out.println("Температурная характеристика: " + result);
    }
}
