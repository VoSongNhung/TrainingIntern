package File;

import java.awt.print.PrinterException;
import java.io.*;
import java.util.List;

public class WriteFile {

    public void writeFile(String line) throws IOException {
        //FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Downloads\\Enginer.txt");
        File file = new File("C:\\Users\\Admin\\Downloads\\Enginer.txt");
        FileWriter fileWritter = new FileWriter(file,false);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        bufferWritter.newLine();
        bufferWritter.write(line);
        bufferWritter.close();
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        if(employee.equals(null))
//        {
//            oos.writeObject("null");
//        }
//        else
//        {
//            oos.writeObject(employee);
//            fos.close();
//            oos.close();
//        }
    }
}
