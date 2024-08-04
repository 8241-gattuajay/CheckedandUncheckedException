import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class TrywithResource {
    public void processFiles(List<String> filePaths){
        for (String filePath : filePaths){
            try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
                String line;
                while ((line = reader.readLine()) != null){
                    System.out.println(line);
                }
            }catch (IOException e){
                System.out.println("Error reading file : "+filePath);
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TrywithResource twr = new TrywithResource();
        twr.processFiles(List.of("C:\\Users\\ajay.gattu\\newProject3\\file1.txt", "C:\\Users\\ajay.gattu\\newProject3\\file2.txt"));
    }
}
