import util.Console;

import java.util.Random;
import java.util.Scanner;

public class Application {

    final static int ROWS = 7;
    final static int COLS = 9;

    private static int playerRow;
    private static int playerCol;


    static int[][] blackKnight = {
            {5, 0, 1}, {5, 1, 1}, {5, 2, 1}, {5, 3, 1}, {5, 4, 1}, {5, 5, 1}, {5, 6, 1}, {5, 7, 1}, {5, 8, 1},
            {6, 0, 1}, {6, 1, 1}, {6, 2, 1}, {6, 3, 1}, {6, 4, 1}, {6, 5, 1}, {6, 6, 1}, {6, 7, 1}, {6, 8, 1}

    };
    static int[][] redKnight = {
            {0, 0, 1}, {0, 1, 1}, {0, 2, 1}, {0, 3, 1}, {0, 4, 1}, {0, 5, 1}, {0, 6, 1}, {0, 7, 1}, {0, 8, 1},
            {1, 0, 1}, {1, 1, 1}, {1, 2, 1}, {1, 3, 1}, {1, 4, 1}, {1, 5, 1}, {1, 6, 1}, {1, 7, 1}, {1, 8, 1}

    };
    static int[][] blackDwarf = {
            {5, 0, 2}, {5, 1, 2}, {5, 2, 2}, {5, 3, 2}, {5, 4, 2}, {5, 5, 2}, {5, 6, 2}, {5, 7, 2}, {5, 8, 2},
            {6, 0, 2}, {6, 1, 2}, {6, 2, 2}, {6, 3, 2}, {6, 4, 2}, {6, 5, 2}, {6, 6, 2}, {6, 7, 2}, {6, 8, 2}};

    static int[][] redDwarf = {
            {0, 0, 2}, {0, 1, 2}, {0, 2, 2}, {0, 3, 2}, {0, 4, 2}, {0, 5, 2}, {0, 6, 2}, {0, 7, 2}, {0, 8, 2},
            {1, 0, 2}, {1, 1, 2}, {1, 2, 2}, {1, 3, 2}, {1, 4, 2}, {1, 5, 2}, {1, 6, 2}, {1, 7, 2}, {1, 8, 2}};

    static int[][] blackЕlf = {
            {5, 0, 3}, {5, 1, 3}, {5, 2, 3}, {5, 3, 3}, {5, 4, 3}, {5, 5, 3}, {5, 6, 3}, {5, 7, 3}, {5, 8, 3},
            {6, 0, 3}, {6, 1, 3}, {6, 2, 3}, {6, 3, 3}, {6, 4, 3}, {6, 5, 3}, {6, 6, 3}, {6, 7, 3}, {6, 8, 3}

    };
    static int[][] redЕlf = {
            {0, 0, 3}, {0, 1, 3}, {0, 2, 3}, {0, 3, 3}, {0, 4, 3}, {0, 5, 3}, {0, 6, 3}, {0, 7, 3}, {0, 8, 3},
            {1, 0, 3}, {1, 1, 3}, {1, 2, 3}, {1, 3, 3}, {1, 4, 3}, {1, 5, 3}, {1, 6, 3}, {1, 7, 3}, {1, 8, 3}
    };


    public static void main(String[] args) {

        int[][] collection = new int[ROWS][COLS];

        // няма да е във While цикъла
        Scanner scanner = new Scanner(System.in);
        int heroesCounter = 0;

        while (heroesCounter < 12) {

            Console.BlackSpace("ЧЕРНИТЕ СА НА ХОД");
            System.out.println("Разполагате със следните фигури  ");
            System.out.println("1 - Рицар");
            System.out.println("2 - Джудже");
            System.out.println("3 - Елф");
            System.out.println("Kоя единица искате да позиционирате? ");
            int number = scanner.nextInt();


            if (number == 1) {

                BlackKnightPosition(collection);

            } else if (number == 2) {
                BlackDwarfPosition(collection);
            } else if (number == 3) {
                BlackElfPosition(collection);
            }

            heroesCounter++;
            BoardVisualisations(collection);

            Console.RedSpace("ЧЕРВЕНИТЕ СА НА ХОД");
            System.out.println("Разполагате със следните фигури  ");
            System.out.println("1 - Рицар");
            System.out.println("2 - Джудже");
            System.out.println("3 - Елф");
            System.out.println("Kоя единица искате да позиционирате? ");
            int numberForReadPlayers = scanner.nextInt();


            if (numberForReadPlayers == 1) {

                RedKnightPosition(collection);

            } else if (numberForReadPlayers == 2) {
                RedDwarfPosition(collection);
            } else if (numberForReadPlayers == 3) {
                RedDElfPosition(collection);
            }

            BoardVisualisations(collection);

            heroesCounter++;

        }

        GenerateObsticale(collection);//Ако случайно се генерират повече препятствия , рестартирайте играта в повечето случаи логиката работи:Д
        System.out.println();
        BoardVisualisations(collection);

        System.out.println("Въведете a,b,c или d за предвижване");
        int blackKnightCounter = 0;
        while (blackKnightCounter < 4) {
            String direction = scanner.next();

            MoveBlackKnight(direction, collection);
            BoardVisualisations(collection);
            blackKnightCounter++;

        }

        int redKnightCounter = 0;

        while (redKnightCounter < 4) {
            String direction = scanner.next();

            MoveRedKnight(direction, collection);
            BoardVisualisations(collection);
            redKnightCounter++;
        }
        int blackDwarfCounter = 0;

        while (blackDwarfCounter < 4) {
            String direction = scanner.next();

            MoveBlackDwarf(direction, collection);
            BoardVisualisations(collection);
            blackDwarfCounter++;
        }
        int redDwarfCounter = 0;

        while (redDwarfCounter < 4) {
            String direction = scanner.next();

            MoveRedDwarf(direction, collection);
            BoardVisualisations(collection);
            redDwarfCounter++;
        }
        int blackElfCounter = 0;

        while (blackElfCounter < 4) {
            String direction = scanner.next();

            MoveBlackElf(direction, collection);
            BoardVisualisations(collection);
            blackElfCounter++;
        }

        int redElfCounter = 0;

        while (redElfCounter < 4) {
            String direction = scanner.next();

            MoveRedElf(direction, collection);
            BoardVisualisations(collection);
            blackElfCounter++;
        }


    }


    public static void BoardVisualisations(int[][] gameBoard) {


        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int element = gameBoard[row][col];

                if (element == 0) {
                    if (row == 0 || row == 1) {
                        Console.Red("* ");
                    } else if (row == 5 || row == 6) {
                        Console.Black("* ");
                    } else {
                        System.out.print("* ");
                    }

                }
                if (element == 1) {
                    Console.Green("% ");

                }
                if (element == 2) {
                    Console.Red("& ");
                }
                if (element == 3) {
                    Console.Blue("@ ");
                }
                if (element == 4) {
                    Console.Yellow("# ");
                }
                if (element == 5) {
                    Console.Green("$ ");
                }

            }
            System.out.println();
        }

    }

    public static int[][] BlackKnightPosition(int[][] collection) {
        int[][] board = new int[ROWS][COLS];

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int element = board[row][col];

                if (element == 0) {
                    if (row == 5 || row == 6) {
                        Console.Black("X ");
                    } else {
                        System.out.print("* ");
                    }

                }
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("На кой ред ? ");
        System.out.println("Реда трябва да бъде 5 или 6!!! ");
        int rows = scanner.nextInt();
        System.out.println("На коя колона ? ");
        System.out.println("Kолоната може да бъде до 8 включително");
        int cols = scanner.nextInt();
        boolean corectPlacement = false;

        for (int k = 0; k < blackKnight.length; k++) {
            int row = blackKnight[k][0];
            int col = blackKnight[k][1];
            int sign = blackKnight[k][2];

            if (rows == row && cols == col) {
                collection[row][col] = sign;
                corectPlacement = true;
                break;
            } else {
                corectPlacement = false;
            }
        }
        if (corectPlacement == true) {
            System.out.println("Фигурата е успешно позиционирана");
        } else {
            System.out.println("Фигурата е извън полето на черните");
        }
        return collection;
    }


    public static int[][] RedKnightPosition(int[][] collection) {
        int[][] board = new int[ROWS][COLS];

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int element = board[row][col];

                if (element == 0) {
                    if (row == 0 || row == 1) {
                        Console.Red("X ");
                    } else {
                        System.out.print("* ");
                    }

                }
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("На кой ред ? ");
        System.out.println("Реда трябва да бъде 0 или 1!!! ");
        int rows = scanner.nextInt();
        System.out.println("На коя колона ? ");
        System.out.println("Kолоната може да бъде до 8 включително");
        int cols = scanner.nextInt();
        boolean corectPlacement = false;

        for (int k = 0; k < redKnight.length; k++) {
            int row = redKnight[k][0];
            int col = redKnight[k][1];
            int sign = redKnight[k][2];

            if (rows == row && cols == col) {
                collection[row][col] = sign;
                corectPlacement = true;
                break;
            } else {
                corectPlacement = false;
            }
        }
        if (corectPlacement == true) {
            System.out.println("Фигурата е успешно позиционирана");
        } else {
            System.out.println("Фигурата е извън полето на червените");
        }
        return collection;
    }

    public static int[][] BlackDwarfPosition(int[][] collection) {
        int[][] board = new int[ROWS][COLS];

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int element = board[row][col];

                if (element == 0) {
                    if (row == 5 || row == 6) {
                        Console.Black("X ");
                    } else {
                        System.out.print("* ");
                    }

                }
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("На кой ред ? ");
        System.out.println("Реда трябва да бъде 5 или 6!!! ");
        int rows = scanner.nextInt();
        System.out.println("На коя колона ? ");
        System.out.println("Kолоната може да бъде до 8 включително");
        int cols = scanner.nextInt();
        boolean corectPlacement = false;

        for (int k = 0; k < blackDwarf.length; k++) {
            int row = blackDwarf[k][0];
            int col = blackDwarf[k][1];
            int sign = blackDwarf[k][2];

            if (rows == row && cols == col) {
                collection[row][col] = sign;
                corectPlacement = true;
                break;
            } else {
                corectPlacement = false;
            }
        }
        if (corectPlacement == true) {
            System.out.println("Фигурата е успешно позиционирана");
        } else {
            System.out.println("Фигурата е извън полето на черните");
        }
        return collection;
    }

    public static int[][] RedDwarfPosition(int[][] collection) {
        int[][] board = new int[ROWS][COLS];

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int element = board[row][col];

                if (element == 0) {
                    if (row == 0 || row == 1) {
                        Console.Red("X ");
                    } else {
                        System.out.print("* ");
                    }

                }
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("На кой ред ? ");
        System.out.println("Реда трябва да бъде 0 или 1!!! ");
        int rows = scanner.nextInt();
        System.out.println("На коя колона ? ");
        System.out.println("Kолоната може да бъде до 8 включително");
        int cols = scanner.nextInt();
        boolean corectPlacement = false;

        for (int k = 0; k < redDwarf.length; k++) {
            int row = redDwarf[k][0];
            int col = redDwarf[k][1];
            int sign = redDwarf[k][2];

            if (rows == row && cols == col) {
                collection[row][col] = sign;
                corectPlacement = true;
                break;
            } else {
                corectPlacement = false;
            }
        }
        if (corectPlacement == true) {
            System.out.println("Фигурата е успешно позиционирана");
        } else {
            System.out.println("Фигурата е извън полето на червените");
        }
        return collection;
    }

    public static int[][] BlackElfPosition(int[][] collection) {
        int[][] board = new int[ROWS][COLS];

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int element = board[row][col];

                if (element == 0) {
                    if (row == 5 || row == 6) {
                        Console.Black("X ");
                    } else {
                        System.out.print("* ");
                    }

                }
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("На кой ред ? ");
        System.out.println("Реда трябва да бъде 5 или 6!!! ");
        int rows = scanner.nextInt();
        System.out.println("На коя колона ? ");
        System.out.println("Kолоната може да бъде до 8 включително");
        int cols = scanner.nextInt();
        boolean corectPlacement = false;

        for (int k = 0; k < blackЕlf.length; k++) {
            int row = blackЕlf[k][0];
            int col = blackЕlf[k][1];
            int sign = blackЕlf[k][2];

            if (rows == row && cols == col) {
                collection[row][col] = sign;
                corectPlacement = true;
                break;
            } else {
                corectPlacement = false;
            }
        }
        if (corectPlacement == true) {
            System.out.println("Фигурата е успешно позиционирана");
        } else {
            System.out.println("Фигурата е извън полето на черните");
        }
        return collection;
    }

    public static int[][] RedDElfPosition(int[][] collection) {
        int[][] board = new int[ROWS][COLS];

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int element = board[row][col];

                if (element == 0) {
                    if (row == 0 || row == 1) {
                        Console.Red("X ");
                    } else {
                        System.out.print("* ");
                    }

                }
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("На кой ред ? ");
        System.out.println("Реда трябва да бъде 0 или 1!!! ");
        int rows = scanner.nextInt();
        System.out.println("На коя колона ? ");
        System.out.println("Kолоната може да бъде до 8 включително");
        int cols = scanner.nextInt();
        boolean corectPlacement = false;

        for (int k = 0; k < redЕlf.length; k++) {
            int row = redЕlf[k][0];
            int col = redЕlf[k][1];
            int sign = redЕlf[k][2];

            if (rows == row && cols == col) {
                collection[row][col] = sign;
                corectPlacement = true;
                break;
            } else {
                corectPlacement = false;
            }
        }
        if (corectPlacement == true) {
            System.out.println("Фигурата е успешно позиционирана");
        } else {
            System.out.println("Фигурата е извън полето на червените");
        }
        return collection;
    }


    public static int[][] GenerateObsticale(int[][] collection) {
        int counterWall = 0;
        int counterBarricade = 0;

        for (int row = 2; row < 5; row++) {
            for (int col = 0; col < COLS; col++) {
                if (IsPlacementPossible()) {
                    collection[row][col] = 4;
                    counterWall++;

                    if (counterWall == 2) {
                        break;
                    }
                }
                if (counterWall == 2) {
                    break;
                }

            }
        }
        for (int row = 2; row < 5; row++) {
            for (int col = 0; col < COLS; col++) {
                if (IsPlacementPossible()) {
                    collection[row][col] = 5;
                    counterBarricade++;

                    if (counterBarricade == 2) {
                        break;
                    }
                }

            }
            if (counterBarricade == 2) {
                break;
            }

        }
        return collection;
    }

    public static boolean IsPlacementPossible() {
        Random rnd = new Random();
        int low = 1;
        int high = 5;
        int chanceCoefficent = rnd.nextInt(high - low) + low;
        return chanceCoefficent == 1;


    }

    public static int[][] MoveBlackKnight(String direction, int[][] gameBoard) {

        int playerCurrentRow = playerRow;
        int playerCurrentCol = playerCol;

        if (direction.equals("w")) {
            playerCurrentRow = playerCurrentRow - 1;

        }

        if (direction.equals("s")) {
            playerCurrentRow = playerCurrentRow + 1;

        }

        if (direction.equals("a")) {
            playerCurrentCol = playerCurrentCol - 1;

        }

        if (direction.equals("d")) {
            playerCurrentCol = playerCurrentCol + 1;

        }


        gameBoard[playerRow][playerCol] = 0;


        playerRow = playerCurrentRow;
        playerCol = playerCurrentCol;


        gameBoard[playerRow][playerCol] = 1;

        return gameBoard;
    }

    public static int[][] MoveRedKnight(String direction, int[][] gameBoard) {

        int playerCurrentRow = playerRow;
        int playerCurrentCol = playerCol;

        if (direction.equals("w")) {
            playerCurrentRow = playerCurrentRow - 1;

        }

        if (direction.equals("s")) {
            playerCurrentRow = playerCurrentRow + 1;

        }

        if (direction.equals("a")) {
            playerCurrentCol = playerCurrentCol - 1;

        }

        if (direction.equals("d")) {
            playerCurrentCol = playerCurrentCol + 1;

        }


        gameBoard[playerRow][playerCol] = 0;

        // да присвоя новите стойности
        playerRow = playerCurrentRow;
        playerCol = playerCurrentCol;


        gameBoard[playerRow][playerCol] = 1;

        return gameBoard;
    }

    public static int[][] MoveBlackDwarf(String direction, int[][] gameBoard) {

        int playerCurrentRow = playerRow;
        int playerCurrentCol = playerCol;

        if (direction.equals("w")) {
            playerCurrentRow = playerCurrentRow - 1;

        }

        if (direction.equals("s")) {
            playerCurrentRow = playerCurrentRow + 1;

        }

        if (direction.equals("a")) {
            playerCurrentCol = playerCurrentCol - 1;

        }

        if (direction.equals("d")) {
            playerCurrentCol = playerCurrentCol + 1;

        }


        gameBoard[playerRow][playerCol] = 0;


        playerRow = playerCurrentRow;
        playerCol = playerCurrentCol;


        gameBoard[playerRow][playerCol] = 2;

        return gameBoard;
    }

    public static int[][] MoveRedDwarf(String direction, int[][] gameBoard) {

        int playerCurrentRow = playerRow;
        int playerCurrentCol = playerCol;

        if (direction.equals("w")) {
            playerCurrentRow = playerCurrentRow - 1;

        }

        if (direction.equals("s")) {
            playerCurrentRow = playerCurrentRow + 1;

        }

        if (direction.equals("a")) {
            playerCurrentCol = playerCurrentCol - 1;

        }

        if (direction.equals("d")) {
            playerCurrentCol = playerCurrentCol + 1;

        }


        gameBoard[playerRow][playerCol] = 0;


        playerRow = playerCurrentRow;
        playerCol = playerCurrentCol;


        gameBoard[playerRow][playerCol] = 2;

        return gameBoard;
    }

    public static int[][] MoveBlackElf(String direction, int[][] gameBoard) {

        int playerCurrentRow = playerRow;
        int playerCurrentCol = playerCol;

        if (direction.equals("w")) {
            playerCurrentRow = playerCurrentRow - 1;

        }

        if (direction.equals("s")) {
            playerCurrentRow = playerCurrentRow + 1;

        }

        if (direction.equals("a")) {
            playerCurrentCol = playerCurrentCol - 1;

        }

        if (direction.equals("d")) {
            playerCurrentCol = playerCurrentCol + 1;

        }


        gameBoard[playerRow][playerCol] = 0;


        playerRow = playerCurrentRow;
        playerCol = playerCurrentCol;


        gameBoard[playerRow][playerCol] = 3;

        return gameBoard;
    }

    public static int[][] MoveRedElf(String direction, int[][] gameBoard) {

        int playerCurrentRow = playerRow;
        int playerCurrentCol = playerCol;

        if (direction.equals("w")) {
            playerCurrentRow = playerCurrentRow - 1;

        }

        if (direction.equals("s")) {
            playerCurrentRow = playerCurrentRow + 1;

        }

        if (direction.equals("a")) {
            playerCurrentCol = playerCurrentCol - 1;

        }

        if (direction.equals("d")) {
            playerCurrentCol = playerCurrentCol + 1;

        }


        gameBoard[playerRow][playerCol] = 0;


        playerRow = playerCurrentRow;
        playerCol = playerCurrentCol;


        gameBoard[playerRow][playerCol] = 3;

        return gameBoard;
    }
}













