import java.util.Scanner;

/**
 * Home Work 1
 *
 * @author Alexander Marchishin
 * @version 03.02.2019
 */

public class HW1 {
    public static void main(String[] args) {
        /**
         * 2. Создаем типы данных из второго задания
         * кроме int и boolean
         */
        byte abyte = 127;
        short ashort = 32767;
        long athree = 922337203;
        float afour = 3.14159265F;
        double afive = 1.7e+308;
        char aletter = 'A';

        /**
         *  3. Метод вычисляет выражение
         * a*(b+(c/d))
         */
        int result = 0;
        int a = 2, b = 1, c = 4, d = 2;
        result = a * (b + (c / d));
        System.out.println(result);

        /**
         * 4. Метод проверяет 2 числа
         * если они находятся в диапозоне от 10 до 20
         * вернет true если нет false
         */
        int numberOne = 10;
        int numberTwo = 5;
        int result1 = (numberOne + numberTwo);
        boolean sum = (10 <= result1 && 20 >= result1);
        System.out.println(sum);

        /**
         * 5. Метод определяет какое число передеали
         * положительное или отрицательное
         */
        int number = 5;
        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        /**
         * 6. Метод выводит в консоль true если число отрицательное
         */
        int negative = 5;
        boolean result2 = (negative < 0);
        System.out.println(result2);

        /**
         * 7. Метод выводит привет + имя
         */
        String name = "Alexander";
        System.out.println("Привет " + name);

        /**
         * 8. x и y переменные типа boolean
         */
//        boolean x, y;
//        boolean result3 = (!(x && y) && (x || y)) || ((x && y) || !(x || y)) ? true : false;
//        System.out.println(result3);

        /**
         * 9. упростить выражение (!(a<b) && !(a>b))
         */
        // int a == b;

        /**
         * 10. Метод выводит true если числа делятся без остатка
         */
        int nbrOne = 4;
        int nbrTwo = 2;
        boolean rslt = (nbrOne % nbrTwo == 0);
        System.out.println(rslt);

        /**
         * 11. Метод для проверки чисел для сторон треугольника
         */
        int legOne = 2;
        int legTwo = 2;
        int hypotinuse = 5;
        if (hypotinuse > (legOne + legTwo)) {
            System.out.println("True");
        } else System.out.println("False");

        /**
         * 12. Метод считает какой год был високосным
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в формате ГГГГ для того чтобы узнать високосный он или нет");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
        Scanner close;

        /**
         * 13.
         */

        /**
         * 14.
         */

        /**
         * 15.
         */
        double t = 2;
        double sum1 = Math.sin(2*t)+Math.sin(3*t);
        System.out.println(sum1);


        /**
         * 16.
         */

        /**
         * 17.
         */

        /**
         * 18.
         */
        int e = 1, f = 22, g = 15;
        if (e == f && g == e) {
            System.out.println("Числа равны");
        } else System.out.println("Числа не равны");

        /**
         * 19.
         */
        double xx = 0.1235, yy = 0;
        if ((xx >= 0 && xx <= 1) && (yy >= 0 && yy <= 1)) {
            System.out.println("true");
        }




    }
}
