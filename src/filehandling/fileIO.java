package filehandling;

import java.util.HashMap;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class fileIO {
    public static void  putInFile(HashMap<String,employee> hmap){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;
        try{
            fileWriter = new FileWriter("C:\\Users\\arpit.jha\\IdeaProjects\\Training\\src\\fileIOPayroll.txt",true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
            printWriter.println();
            for (Map.Entry mapElement : hmap.entrySet()){
                printWriter.println(mapElement.getKey()+" : "+mapElement.getValue());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
