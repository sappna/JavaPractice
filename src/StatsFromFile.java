import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StatsFromFile {

    public static void main(String[] args) {
        try{
            File readerObj = new File("file.txt");
            Scanner open = new Scanner(readerObj);

            while(open.hasNextLine()) {
                String line = open.nextLine();
                String[] strData = line.split(",");
                int[] arrData = new int[strData.length];
                for(int i=0; i< strData.length; i++)
                {
                    arrData[i] = Integer.parseInt(strData[i]);
                }
                System.out.println(arrData);

            }

            open.close();
        } catch(FileNotFoundException ex) {
            System.out.println("File Not Found!");

        }
    }


    }
