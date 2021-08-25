import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ClassicCSVReader {
    public static void main(String[] args) {

        String path = "./data.csv";
        String line = "";
        BufferedReader br;

        {
            try {
                br = new BufferedReader(new FileReader(path));
                while ((line = br.readLine()) != null){
                    String[] value = line.split(";");
                    System.out.println(Arrays.toString(value));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}


