import java.util.Random;
import java.util.Scanner;

public class JavaOne {
    public static final int SIZE = 3;
    public static char [][] map;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();

        while(true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("SkyNet побеждён!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Вы проиграли. Сегодня искусственный разум оказался сильней");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

        }
        System.out.println("Конец игры");
    }

    // создание и инициализация игрового поля
    static void initMap(){
        map = new char[SIZE][SIZE];
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // вывод состояния игрового поля
    static void printMap(){
        for(int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int rows = 0; rows < SIZE; rows++){
            System.out.print(rows+1 + " ");
            for(int cols = 0; cols < SIZE; cols++){
                System.out.print(map[rows][cols] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // ходы игрока
    static void humanTurn(){
        Scanner scan = new Scanner(System.in);
        int x, y;
        do{
            System.out.println("Введите координаты в формате X Y");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        }while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    // проверка возможности хода в заданную клетку
    static boolean isCellValid(int x, int y){
        if(x < 0 || x >= SIZE || y < 0 || y >= SIZE){
            return false;
        }
        if(map[y][x] == DOT_EMPTY){
            return true;
        }
        return false;
    }

    // ход "AI"
    static void aiTurn(){
        Random random = new Random();
        //поиск выигрышного ходя для компьютера
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[j][i] = DOT_O;
                    if (checkWin(DOT_O)) {
                        return;
                    }
                    map[j][i] = DOT_EMPTY;
                }
            }
        // поиск выигрышного следующего ходя игрока
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[j][i] = DOT_X;
                    if (checkWin(DOT_X)) {
                        map[j][i] = DOT_O;
                        return;
                    }
                    map[j][i] = DOT_EMPTY;
                }
            }

        int x, y;
        do{
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }while (!isCellValid(x, y));
        map[y][x] = DOT_O;
        System.out.println("Компьютер сделал ход в точку " + (x + 1) + " " + (y + 1));
    }

    // проверка ничьи
    static boolean isMapFull(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                if(map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    // проверка победы
    static boolean checkWin(char a){
        int count = 0;
        for(int i = 0; i < SIZE; i++){      // проверка строк
            if(count == SIZE){
                return true;
            }else{
                count = 0;
            }
            for(int j = 0; j < SIZE; j++){
                if(map[i][j] == a){
                    count++;
                }
            }
        }
        count = 0;

        for(int i = 0; i < SIZE; i++){      // проверка диагоналей
            for(int j = 0; j < SIZE; j++){
                if((i - j == 0 || i + j == SIZE-1) && map[i][j] == a){
                    count++;
                }
            }
        }
        if(count == SIZE){
            return true;
        }
        count = 0;

        for(int i = 0; i < SIZE; i++){      // проверка столбцов
            for(int j = 0; j < SIZE;j++){
                if(map[j][i] == a) {
                    count++;
                }
            }
            if(count == SIZE){
                return true;
            }
        }

        return false;
    }

}
