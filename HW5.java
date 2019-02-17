import java.text.MessageFormat;
import java.util.Random;
import java.util.Scanner;

public class HW5 {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOT_TO_WINS = 3;

    public static final char DOT_EMPTY = ' ';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("YOU WIN");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw!");
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("YOU LOSE!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw!");
            }
        }
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;

            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X");
            x = scanner.nextInt() - 1;
            System.out.println("Введите координаты Y");
            y = scanner.nextInt() - 1;
        } while (!isCellWalid(x, y));
        map[x][y] = DOT_X;
    }

    public static void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellWalid(x, y));
        System.out.println(
                MessageFormat.format("Компьютер сходил в точку {0}:{1}", x + 1, y + 1)
        );
        map[x][y] = DOT_O;
    }

    private static boolean isCellWalid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[x][y] == DOT_EMPTY;
    }

    public static boolean checkWin(char dot) {
        for (int i = 0; i < SIZE; i++) {
            if ((map[i][0] == dot && map[i][1] == dot && map[i][2] == dot) ||
                    (map[0][i] == dot && map[1][i] == dot && map[2][i] == dot)) {
                return true;
            }

        }
        if ((map[0][0] == dot && map[1][1] == dot && map[2][2] == dot) ||
                (map[2][0] == dot && map[1][1] == dot && map[0][2] == dot)) {
            return true;
        }
        return false;
    }
}
