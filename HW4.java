import java.util.Random;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        int turn = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            Random random = new Random();
            int unknown = random.nextInt(10);
            do {
                System.out.println("Угадайте число от 0 до 9");
                int number = scanner.nextInt();
                if (number == unknown) {
                    System.out.println("Вы угадали");
                    break;
                }
                if (number < unknown) {
                    System.out.println("Загаданное число больше");
                } else if (number > unknown) {
                    System.out.println("Загаданное число меньше");
                }
                turn++;
            } while (turn < 3);
            System.out.println("Повторить попытку еще раз? 1 - да / 0 - нет!");
        } while (0 != scanner.nextInt());
    }
}
