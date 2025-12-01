public class Main {

    public static class StringUtils {

        public String concat(String a, String b) {
            return a + b;
        }

        public String concat(String a, String b, String c) {
            return a + b + c;
        }

        public String concat(int x, int y) {
            return String.valueOf(x + y);
        }

        @Override
        public String toString() {
            return "StringUtils base class";
        }
    }

    public static class SmartStringUtils extends StringUtils {

        @Override
        public String concat(String a, String b) {
            return a + " " + b;
        }

        @Override
        public String toString() {
            return "SmartStringUtils child class";
        }
    }

    public static void main(String[] args) {

        StringUtils base = new StringUtils();
        SmartStringUtils child = new SmartStringUtils();

        System.out.println(base.concat("Hello", "World"));
        System.out.println(base.concat("A", "B", "C"));
        System.out.println(base.concat(5, 10));

        System.out.println(child.concat("Hello", "World"));
        System.out.println(child.concat("A", "B", "C"));
        System.out.println(child.concat(100, 200));

        System.out.println(base);
        System.out.println(child);
    }
}