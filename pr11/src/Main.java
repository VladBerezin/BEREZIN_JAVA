import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Hero> heroes = new LinkedList<>();

        heroes.add(new Hero("Никита", 50));
        heroes.add(new Hero("Артем", 10));
        heroes.add(new Hero("Влад", 30));
        heroes.addFirst(new Hero("Рома", 80));   // в начало
        heroes.addLast(new Hero("Даня", 15));    // в конец

        System.out.println("Список героев:");
        for (Hero h : heroes) {
            System.out.println(h);
        }

        heroes.addFirst(new Hero("Сергей", 60));
        heroes.addLast(new Hero("Миша", 5));

        System.out.println("\nПосле добавления в начало и конец:");
        for (Hero h : heroes) {
            System.out.println(h);
        }

        heroes.removeFirst();
        heroes.removeLast();

        System.out.println("\nПосле удаления первого и последнего:");
        for (Hero h : heroes) {
            System.out.println(h);
        }

        System.out.println("\nПервый герой: " + heroes.getFirst());
        System.out.println("Последний герой: " + heroes.getLast());

        System.out.println("\nПервый герой с энергией < 20:");
        for (Hero h : heroes) {
            if (h.getEnergy() < 20) {
                System.out.println(h);
                break;
            }
        }

        heroes.removeIf(h -> h.getEnergy() < 20);

        System.out.println("\nПосле удаления героев с энергией < 20:");
        for (Hero h : heroes) {
            System.out.println(h);
        }

        System.out.println("\nСписок пуст? " + heroes.isEmpty());
        System.out.println("Размер списка: " + heroes.size());
    }
}
