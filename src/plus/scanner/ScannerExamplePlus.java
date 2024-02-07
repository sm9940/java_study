package plus.scanner;

import java.util.Scanner;

public class ScannerExamplePlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nextLine()입력: ");
        String inputNextLine = scanner.nextLine();
        System.out.println(inputNextLine);

        System.out.print("next()입력: ");
        String inputNext = scanner.next();
        System.out.println(inputNext);
    }
}
