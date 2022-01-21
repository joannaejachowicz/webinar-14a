import java.io.FileWriter;
import java.io.IOException;

public class AlertFile {

    public static void main(String[] args) {
        try {
            FileWriter alertText = new FileWriter("alert.txt");
            alertText.write("testuj.pl");
            alertText.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    }
}
