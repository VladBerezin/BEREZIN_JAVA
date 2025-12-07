import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Herro> list = new ArrayList<>();

        list.add(new Herro("Никита", 50));
        list.add(new Herro("Артем", 10));
        list.add(new Herro("Влад", 30));
        list.add(new Herro("Рома", 80));
        list.add(new Herro("Даня", 15));

        System.out.println("Список героев:");
        for (Herro h : list) {
            System.out.println(h);
        }

        list.add(0, new Herro("Начальный", 100));
        list.add(new Herro("Конечный", 5));

        list.remove(1);
        list.remove( new Herro("Даня", 15) );
        list.removeIf(h -> h.name.equals("Даня"));

        System.out.println("Размер списка: " + list.size());

        Herro h2 = list.get(2);
        System.out.println("Герой по индексу 2: " + h2.name);

        list.get(2).energy = 999;

        System.out.println("Герой с энергией < 20:");
        for (Herro h : list) {
            if (h.energy < 20) {
                System.out.println(h);
                break;
            }
        }

        System.out.println("Содержится ли первый герой? " + list.contains(list.get(0)));

        list.clear();
        System.out.println("Размер после очистки: " + list.size());
    }
}