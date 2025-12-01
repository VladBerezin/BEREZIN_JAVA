public class Main {

    public static class Temperature {

        public int c;

        public Temperature() {
            this.c = 0;
        }

        public Temperature(int c) {
            this.c = c;
        }

        public Temperature(Temperature other) {
            this.c = other.c;
        }

        public int toFahrenheit() {
            return c * 9 / 5 + 32;
        }

        public boolean isFreezing() {
            return c <= 0;
        }

        @Override
        public String toString() {
            return "Temperature: " + c + " °C";
        }
    }

    public static void main(String[] args) {

        Temperature temp1 = new Temperature();
        Temperature temp2 = new Temperature(25);
        Temperature temp3 = new Temperature(temp2);

        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);

        System.out.println("temp2 в Фаренгейтах: " + temp2.toFahrenheit());
        System.out.println("temp1 заморозок? " + temp1.isFreezing());
    }
}