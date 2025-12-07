public class Herro {
    String name;
    int energy;

    public Herro(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String toString() {
        return name + ", энергия: " + energy;
    }
}