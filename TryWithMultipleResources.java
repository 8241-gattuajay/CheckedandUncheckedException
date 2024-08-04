import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithMultipleResources {
        public static void main(String[] args) {
            String file1Path = "C:\\Users\\ajay.gattu\\newProject3\\file1.txt";
            String file2Path = "C:\\Users\\ajay.gattu\\newProject3\\file2.txt";
            String outputPath = "combined_output.txt";

            try {
                StringBuilder combinedData = new StringBuilder();
                try (BufferedReader reader1 = new BufferedReader(new FileReader(file1Path))) {
                    String line;
                    while ((line = reader1.readLine()) != null) {
                        combinedData.append(line).append("\n");
                    }
                }

                try (BufferedReader reader2 = new BufferedReader(new FileReader(file2Path))) {
                    String line;
                    while ((line = reader2.readLine()) != null) {
                        combinedData.append(line).append("\n");
                    }
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                    writer.write(combinedData.toString());
                }

                System.out.println("Combined data written to " + outputPath);
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
