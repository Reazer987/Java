import util.Console;

public class Application {

    final static int ROWS = 7;
    final static int COLS = 12;

    final static int EXPANSION_ONE_ROW = 9;
    final static int EXPANSION_TWO_COL = 14;

    final static int CAPITAL = 10_000;
    final static int MONEY_FOR_EXPANSION_ONE = 10_000;
    final static int MONEY_FOR_EXPANSION_TWO = 50_000;

    final static int HQ_COST = 1000;
    final static int LB_COST = 1000;
    final static int LB_APPROVE = 5;


    static int[][] bank = {
            {0, 0, 1},
            {6, 11, 1}

    };
    static int[][] island = {
            {6, 0, 2},
            {0, 11, 2}
    };
    static int[][] dock = {
            {2, 4, 3},
            {2, 7, 3},
            {4, 4, 3}
    };
    static int[][] terrain = {
            {2, 5, 4},
            {2, 6, 4},
            {3, 4, 4},
            {3, 5, 4},
            {3, 7, 4},
            {4, 6, 4},
            {4, 7, 4},
            {4, 5, 4},
    };
    static int[][] hq = {
            {3, 6, 5}
    };
    static int[][] expandetBankOne = {

            {8, 4, 6}
    };
    static int[][] expandetIslandOne = {

            {8, 7, 7}
    };
    static int[][] extraRow = {
            {5, 4, 8},
            {5, 5, 8},
            {5, 6, 8},
            {5, 7, 8}
    };
    static int[][] expandetBanktTwo = {

            {2, 13, 9},
            {4, 13, 9}
    };
    static int[][] extraCol = {
            {2, 8, 10},
            {3, 8, 10},
            {4, 8, 10},
            {5, 8, 10},
    };


    public static void main(String[] args) {
        int[][] collection = bootstrap();
        RenderBoard(collection);// визуализация на първоначалното самата игра
        int turnCounter = 0;
        System.out.println();

        int[][] collectionOne = boostrapExpansionOne();
        RenderBoardExpansionOne(collectionOne); // визуализация на Експанзия едно
        System.out.println();

        int[][] collectionТwo = boostrapExpansionTwo();
        RenderBoardExpansionTwo(collectionТwo); // визуализация на Експанзия две

    }

    public static int[][] bootstrap() {
        int[][] collection = new int[ROWS][COLS];

        for (int i = 0; i < bank.length; i++) {
            int row = bank[i][0];
            int col = bank[i][1];
            int sign = bank[i][2];
            collection[row][col] = sign;
        }


        for (int i = 0; i < island.length; i++) {
            int row = island[i][0];
            int col = island[i][1];
            int sign = island[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < dock.length; i++) {
            int row = dock[i][0];
            int col = dock[i][1];
            int sign = dock[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < terrain.length; i++) {
            int row = terrain[i][0];
            int col = terrain[i][1];
            int sign = terrain[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < hq.length; i++) {
            int row = hq[i][0];
            int col = hq[i][1];
            int sign = hq[i][2];
            collection[row][col] = sign;
        }
        return collection;
    }

    public static void RenderBoard(int[][] gameboard) {


        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int element = gameboard[row][col];

                if (element == 0) {
                    System.out.print("0 ");
                }
                if (element == 1) {
                    Console.Green("$ ");
                }
                if (element == 2) {
                    Console.Red("& ");
                }
                if (element == 3) {
                    Console.Blue("@ ");
                }
                if (element == 4) {
                    Console.Yellow("X ");
                }
                if (element == 5) {
                    System.out.print("HQ ");
                }

            }
            System.out.println();
        }

    }


    public static int[][] boostrapExpansionOne() {
        int[][] collection = new int[EXPANSION_ONE_ROW][COLS];


        for (int i = 0; i < bank.length; i++) {
            int row = bank[i][0];
            int col = bank[i][1];
            int sign = bank[i][2];
            collection[row][col] = sign;
        }


        for (int i = 0; i < island.length; i++) {
            int row = island[i][0];
            int col = island[i][1];
            int sign = island[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < dock.length; i++) {
            int row = dock[i][0];
            int col = dock[i][1];
            int sign = dock[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < terrain.length; i++) {
            int row = terrain[i][0];
            int col = terrain[i][1];
            int sign = terrain[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < hq.length; i++) {
            int row = hq[i][0];
            int col = hq[i][1];
            int sign = hq[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < expandetBankOne.length; i++) {
            int row = expandetBankOne[i][0];
            int col = expandetBankOne[i][1];
            int sign = expandetBankOne[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < expandetIslandOne.length; i++) {
            int row = expandetIslandOne[i][0];
            int col = expandetIslandOne[i][1];
            int sign = expandetIslandOne[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < extraRow.length; i++) {
            int row = extraRow[i][0];
            int col = extraRow[i][1];
            int sign = extraRow[i][2];
            collection[row][col] = sign;
        }

        return collection;

    }

    public static void RenderBoardExpansionOne(int[][] gameboard) {


        for (int row = 0; row < EXPANSION_ONE_ROW; row++) {
            for (int col = 0; col < COLS; col++) {
                int element = gameboard[row][col];

                if (element == 0) {
                    System.out.print("0 ");
                }
                if (element == 1) {
                    Console.Green("$ ");
                }
                if (element == 2) {
                    Console.Red("& ");
                }
                if (element == 3) {
                    Console.Blue("@ ");
                }
                if (element == 4) {
                    Console.Yellow("X ");
                }
                if (element == 5) {
                    System.out.print("HQ ");
                }
                if (element == 6) {
                    Console.Green("$ ");
                }
                if (element == 7) {
                    Console.Red("& ");
                }
                if (element == 8) {
                    Console.Yellow("X ");
                }


            }
            System.out.println();
        }

    }

    public static int[][] boostrapExpansionTwo() {
        int[][] collection = new int[EXPANSION_ONE_ROW][EXPANSION_TWO_COL];


        for (int i = 0; i < bank.length; i++) {
            int row = bank[i][0];
            int col = bank[i][1];
            int sign = bank[i][2];
            collection[row][col] = sign;
        }


        for (int i = 0; i < island.length; i++) {
            int row = island[i][0];
            int col = island[i][1];
            int sign = island[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < dock.length; i++) {
            int row = dock[i][0];
            int col = dock[i][1];
            int sign = dock[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < terrain.length; i++) {
            int row = terrain[i][0];
            int col = terrain[i][1];
            int sign = terrain[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < hq.length; i++) {
            int row = hq[i][0];
            int col = hq[i][1];
            int sign = hq[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < expandetBankOne.length; i++) {
            int row = expandetBankOne[i][0];
            int col = expandetBankOne[i][1];
            int sign = expandetBankOne[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < expandetIslandOne.length; i++) {
            int row = expandetIslandOne[i][0];
            int col = expandetIslandOne[i][1];
            int sign = expandetIslandOne[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < extraRow.length; i++) {
            int row = extraRow[i][0];
            int col = extraRow[i][1];
            int sign = extraRow[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < expandetBanktTwo.length; i++) {
            int row = expandetBanktTwo[i][0];
            int col = expandetBanktTwo[i][1];
            int sign = expandetBanktTwo[i][2];
            collection[row][col] = sign;
        }
        for (int i = 0; i < extraCol.length; i++) {
            int row = extraCol[i][0];
            int col = extraCol[i][1];
            int sign = extraCol[i][2];
            collection[row][col] = sign;
        }

        return collection;

    }

    public static void RenderBoardExpansionTwo(int[][] gameboard) {


        for (int row = 0; row < EXPANSION_ONE_ROW; row++) {
            for (int col = 0; col < EXPANSION_TWO_COL; col++) {
                int element = gameboard[row][col];

                if (element == 0) {
                    System.out.print("0 ");
                }
                if (element == 1) {
                    Console.Green("$ ");
                }
                if (element == 2) {
                    Console.Red("& ");
                }
                if (element == 3) {
                    Console.Blue("@ ");
                }
                if (element == 4) {
                    Console.Yellow("X ");
                }
                if (element == 5) {
                    System.out.print("HQ ");
                }
                if (element == 6) {
                    Console.Green("$ ");
                }
                if (element == 7) {
                    Console.Red("& ");
                }
                if (element == 8) {
                    Console.Yellow("X ");
                }
                if (element == 9) {
                    Console.Green("$ ");
                }
                if (element == 10) {
                    Console.Yellow("X ");
                }

            }
            System.out.println();
        }


    }

}


