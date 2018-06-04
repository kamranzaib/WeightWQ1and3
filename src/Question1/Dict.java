package Question1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dict {


    public static void main(String[] args) {

        File file = new File("/Users/kamranzaib/Desktop/IT CLASS /WeightWQ1&3/src/Question1/Dictionary");

        boolean result;

        result=file.exists();
        if(result) {

            System.out.println("File exists");
            Scanner s;

            try {
                s = new Scanner(file);
                while(s.hasNextLine()){
                    System.out.println(s.nextLine());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else{
            System.out.println("File does not exists");
        }
    }

}
