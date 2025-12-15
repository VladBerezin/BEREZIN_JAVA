public class Hero {
    String name;
    int energy;

    public Hero(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public int getEnergy()
    {
        return energy;
    }

    public String toString() {
        return name + ", энергия: " + energy;
    }
}