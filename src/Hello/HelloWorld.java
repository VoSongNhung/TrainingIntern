package Hello;

import java.util.Scanner;

public class HelloWorld {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        for(int i=0;i< 5;i++){
            System.out.println("Hello "+ name);
        }
    }
}
