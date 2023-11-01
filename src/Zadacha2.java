public class Zadacha2 {
    public static void main(String[] args) {
        double a = 10, b = 8;
        double x = 9, y = 9, z = 20;


        if (a > x) {
            if (b > y) {
                System.out.println("Пройдёт");
            }

            if (b > z) {
                System.out.println("Пройдёт");
            }
        } else {
            System.out.println("Не пройдёт");
        }

        if (a > y) {
            if (b > x) {
                System.out.println("Пройдёт");
            }

            if (b > z) {
                System.out.println("Пройдёт");
            }
        } else {
            System.out.println("Не пройдёт");
        }

        if (a > z) {
            if (b > y) {
                System.out.println("Пройдёт");
            }

            if (b > x) {
                System.out.println("Пройдёт");
            }
        } else {
            System.out.println("Не пройдёт");
        }
    }
}
