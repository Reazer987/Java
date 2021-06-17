package util;

public class Console {
    public static void Print(String message){
        System.out.print(message);
    }
    public static void Println ( String message){
        System.out.println(message);
    }

    public static void  Red( String message)
    {
        Print("\u001B[31m" + message + "\u001B[0m");
    }

    public static void Green(String message)
    {
        Print("\u001B[32m" + message + "\u001B[0m");

    }
    public static void Yellow(String message)
    {
        Print("\u001B[33m" + message + "\u001B[0m");

    }
    public static void Blue(String message)
    {
        Print("\u001B[34m" + message + "\u001B[0m");

    }
    public static void Black(String message)
    {
        Print("\u001B[30m" + message + "\u001B[0m");

    }

    public static void BlackSpace (String message)
    {
        Println("\u001B[30m" + message + "\u001B[0m");

    }
    public static void  RedSpace( String message)
    {
        Println("\u001B[31m" + message + "\u001B[0m");
    }

}