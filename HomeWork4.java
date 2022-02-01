package Home;

import java.util.Scanner;

public class HomeWork4 {
    public static int fieldSizeH = 3;
    public static int fieldSizeW = 3;
    public static char[][] field;

    public static char playerChar = 'X';
    public static char pcChar = 'O';
    public static char emptyChar = '_';

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("ИГРА В КРЕСТИКИ-НОЛИКИ!!!");
        System.out.println("Вы играете за '" + playerChar + "'");
        initField();
        printField();
        playersMove();
        computersMove();
    }

    public static void playersMove() {
        int x;
        int y;
        do {
            System.out.print("Enter X-coordinate: ");
            x = scanner.nextInt() - 1;
            System.out.print("Enter Y-coordinate: ");
            y = scanner.nextInt() - 1;
        } while (!checkBorders(y, x) || !checkEmptyCell(y, x));

        field[y][x] = playerChar;
        printField();
    }

    public static void computersMove() {
        System.out.println("Now it's '" + pcChar + "' move:");
        for (int y = 0; y < fieldSizeH; y++) {
            for (int x = 0; x < fieldSizeW; x++) {
                if (field[y][x] == emptyChar) {
                    field[y][x] = pcChar;
                    printField();
                    return;
                }
            }
        }
    }

    public static void initField(){
        field = new char[fieldSizeH][fieldSizeW];

        for (int y = 0; y < fieldSizeH; y++) {
            for (int x = 0; x < fieldSizeW; x++) {
                field[y][x] = emptyChar;
            }
        }
    }

    public static void printField(){
        for (int y = 0; y < fieldSizeH; y++) {
            for (int x = 0; x < fieldSizeW; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    public static boolean checkEmptyCell(int y, int x) {
        return field[y][x] == emptyChar;
    }

    public static boolean checkBorders(int y, int x){
        return x >= 0 && x < fieldSizeW && y >= 0 && y < fieldSizeH;
    }

}