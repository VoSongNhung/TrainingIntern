package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFile {
    public void readFile() throws IOException {

        String url = "C:\\Users\\Admin\\Downloads\\Enginer.txt";
         //Đọc dữ liệu từ File với Scanner
            FileInputStream fileInputStream = new FileInputStream(url);
            Scanner scanner = new Scanner(fileInputStream,"UTF-8");

            try {
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } finally {
                try {
                    scanner.close();
                    fileInputStream.close();
                } catch (IOException ex) {

                }
            }
        }
    }
