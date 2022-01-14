import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String inputString;

        for ( ; ; ) {

            inputString = input();

            if (findNamber(inputString)) {
                System.out.println("Попробуйте еще раз");
            }
            else {
                return;
            }


        }
    }

    private static boolean findNamber(String str) {
        char[] chars = str.toCharArray();
        for (char ch:chars) {
            if (Character.isDigit(ch)) {
                try {
                    throw new MyException("Строка содержит число ", Integer.parseInt(Character.toString(ch)) );
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                    System.out.println(e.getNumber());
                    return true;
                }

            }

        }
        return false;
    }

    private static String input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чтроку без цифр");
        String inputString = scanner.nextLine();
        return inputString;
    }
}