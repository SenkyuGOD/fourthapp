import java.util.Scanner;

public class Zadacha01to20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //zadacha1
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("8");
        } else {
            System.out.println("7");
        }

        //zadacha2

        if (num1 > num2) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }

        //zadacha3
        int a = sc.nextInt();

        if (a < 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        //zadacha4
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();

        if (a1 == b1) {
            System.out.println("a = b");
        } else {
            System.out.println("a != b");
        }

        //zadacha5
        if (a1 < b1) {
            System.out.println(a1);
        } else {
            System.out.println(b1);
        }

        //zadacha6
        if (a1 > b1) {
            System.out.println(a1);
        } else {
            System.out.println(b1);
        }

        //zadacha7

        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double x = sc.nextDouble();

        int result;

        result = (int) (Math.abs(a2 * x * x + b2 * x + c2));
        System.out.println(result);

        //zadacha8

        double a3 = sc.nextDouble();
        double b3 = sc.nextDouble();

        a3 = Math.pow(a3, 2);
        b3 = Math.pow(b3, 2);

        if (a3 > b3) {
            System.out.println(b3);
        } else {
            System.out.println(a3);
        }

        //Zadacha9
        System.out.print("Введите длинну первой стороны: ");
        int storona1 = sc.nextInt();
        System.out.print("Введите длину второй стороны: ");
        int storona2 = sc.nextInt();
        System.out.print("Введите длинну третьей стороны: ");
        int storona3 = sc.nextInt();

        if (storona3 == storona1 && storona3 == storona2) {
            System.out.println("Треугольник является равносторонним ");
        } else {
            System.out.println("Треугольник не является равносторнним ");
        }

        //zadacha10
        double pi = Math.PI;

        System.out.print("Введите радиус первого круга: ");
        double r1 = sc.nextDouble();
        System.out.print("Введите радиус вторго круга: ");
        double r2 = sc.nextDouble();

        double square1 = Math.pow(r1, 2) * pi;
        double square2 = Math.pow(r2, 2) * pi;

        if (square1 > square2) {
            System.out.println("Площадь второго круга меньше");
        } else {
            System.out.println("Площадь первого круга меньше");
        }

        //zadacha11
        System.out.print("Введите 3 стороны треугольника: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        System.out.print("Введите 3 другие сторны треугольника: ");
        int side11 = sc.nextInt();
        int side12 = sc.nextInt();
        int side13 = sc.nextInt();

        int p1 = (side1 + side2 + side3) / 2;
        int p2 = (side11 + side12 + side13) / 2;

        double s1 = Math.sqrt(p1 * (p1 - side1) * (p1 - side2) * (p1 - side3));
        double s2 = Math.sqrt(p2 * (p2 - side11) * (p2 - side12) * (p2 - side13));

        if (s1 > s2) {
            System.out.println("Площадь первого треугольника больше");
        } else {
            System.out.println("Площадь второго треугольника больше");
        }

        //zadacha12
        System.out.print("Введите 3 действительных числа: ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();

        if (number1 > 0) {
            number1 = Math.pow(number1, 2);
            System.out.println(number1);
        } else {
            number1 = Math.pow(number1, 4);
            System.out.println(number1);
        }

        if (number2 > 0) {
            number2 = Math.pow(number2, 2);
            System.out.println(number2);
        } else {
            number2 = Math.pow(number2, 4);
            System.out.println(number2);
        }

        if (number3 > 0) {
            number3 = Math.pow(number3, 2);
            System.out.println(number3);
        } else {
            number3 = Math.pow(number3, 4);
            System.out.println(number3);
        }

        //zadacha13
        System.out.println("Введите координаты первой точки: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Введите координаты второй точки: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double d1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double d2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        if (d1 > d2) {
            System.out.println("Координаты второй точки ближе к началу отсчёта");
        } else if (d2 > d1) {
            System.out.println("Координаты первой точки ближе к началу отсчёта");
        } else {
            System.out.println("Расстояние до начала отсчета от координат первой и второй точки одинаковы");
        }

        //zadacha14
        System.out.println("Введите два угла в градусах: ");
        int corner1 = sc.nextInt();
        int corner2 = sc.nextInt();

        if (corner2 + corner1 == 180) {
            System.out.println("Такого треугоьника не существует");
            return;
        } else {
            System.out.println("Спасибо что ввели адекватные углы, ваш треугольник существует");
        }

        int corner3 = 180 - (corner1 + corner2);

        if (corner3 == 90 || corner1 == 90 || corner2 == 90) {
            System.out.println("Это прямоугольный треугольник");
        }

        //zadacha15
        System.out.print("Введите два числа которые не равны друг другу: ");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        if (firstNum > secondNum) {
            int lowestNum = (secondNum + firstNum) / 2;
            int highestNum = 2 * (secondNum * firstNum);
            secondNum = lowestNum;
            firstNum = highestNum;
            System.out.println(secondNum + " " + firstNum);
        } else {
            int lowestNum = (secondNum + firstNum) / 2;
            int highestNum = 2 * (secondNum * firstNum);
            firstNum = lowestNum;
            secondNum = highestNum;
            System.out.println(secondNum + " " + firstNum);
        }

        //zadacha16
        System.out.println("Введите координаты точки");
        double X = sc.nextDouble();
        double Y = sc.nextDouble();

        if (X == 0 && Y == 0) {
            System.out.println("Точка находится в начале координат.");
        } else if (X == 0) {
            System.out.println("Точка находится на оси Y.");
        } else if (Y == 0) {
            System.out.println("Точка находится на оси X.");
        } else if (X > 0 && Y > 0) {
            System.out.println("Точка находится в I квадранте.");
        } else if (X < 0 && Y > 0) {
            System.out.println("Точка находится в II квадранте.");
        } else if (X < 0 && Y < 0) {
            System.out.println("Точка находится в III квадранте.");
        } else if (X > 0 && Y < 0) {
            System.out.println("Точка находится в IV квадранте.");
        }

        //zadach17
        System.out.print("Введите два числа: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m != n) {
            int maxNum = Math.max(m, n);
            m = maxNum;
            n = maxNum;
        } else {
            m = 0;
            n = 0;
        }

        //zadacha18
        System.out.print("Введите три любых числа: ");
        double chislo1 = sc.nextDouble();
        double chislo2 = sc.nextDouble();
        double chislo3 = sc.nextDouble();

        int numOfNegativeNum = 0;

        if (chislo1 < 0) {
            ++numOfNegativeNum;
        }

        if (chislo2 < 0) {
            ++numOfNegativeNum;
        }

        if (chislo3 < 0) {
            ++numOfNegativeNum;
        }

        System.out.println("Количество отрицательных чисел: " + numOfNegativeNum);

        //zadazha19
        int numOfPositiveNum = 0;

        if (chislo1 > 0) {
            ++numOfPositiveNum;
        }

        if (chislo2 > 0) {
            ++numOfPositiveNum;
        }

        if (chislo3 > 0) {
            ++numOfPositiveNum;
        }

        System.out.println("Количество положительных чисел: " + numOfPositiveNum);

        //zadacha20
        System.out.print("Введите число: ");
        int k = sc.nextInt();

        if (chislo1 % k == 0) {
            System.out.println(k + " является делителем первого числа");
        }

        if (chislo2 % k == 0) {
            System.out.println(k + " является делителем второго числа");
        }

        if (chislo3 % k == 0) {
            System.out.println(k + " является делителем третьего числа");
        }

        if (chislo3 % k != 0 && chislo1 % k != 0 && chislo2 % k != 0){
            System.out.println(k + " не является делителем этих трёх чисел");
        }
    }
}