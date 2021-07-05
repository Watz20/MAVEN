package ru.gbrains.webuigroup;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int simpleDiv(int a, int b){
        return a / b;
    }

    public static int simpleDivByZero(int a, int b){
        return b == 0 ? -1: a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
