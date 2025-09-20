import java.util.Scanner;

// Класс Temperature
class Temperature {
    int celsius; // поле для хранения температуры

    // Конструктор
    public Temperature(int celsius) {
        this.celsius = celsius;
    }

    // Метод перевода в Фаренгейты
    public int toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    // Метод проверки на замерзание
    public boolean isFreezing() {
        return celsius <= 0;
    }
}

// Основной класс
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        int c = sc.nextInt();

        Temperature t = new Temperature(c);

        System.out.println("Температура в Фаренгейтах: " + t.toFahrenheit());
        System.out.println("Замерзает ли? " + t.isFreezing());
    }
}
