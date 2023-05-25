import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void processMockData() {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("E:\\web\\Java\\HelloWorld\\src\\MOCK_DATA.json"));
            String line;
            while ((line = br.readLine()) != null) {
                // Process each line of data here
                // Example: Split the line by a delimiter (e.g., comma) to access individual values
                String[] data = line.split(",");
                String firstName = data[0];
                String lastName = data[1];
                String email = data[2];

                // Do something with the data
//                System.out.println("First Name: " + firstName);
//                System.out.println("Last Name: " + lastName);
                System.out.println("Email: " + email);
               // System.out.println("---------------------");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close(); // Close the BufferedReader in the finally block
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        processMockData();
    }
}
