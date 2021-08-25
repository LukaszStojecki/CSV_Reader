import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Arrays;

public class CSVReaderOpenCSV {

    public static void main(String[] args) {

//        String path = "C:\\Users\\lukas\\Desktop\\data.csv";

        String path = "./data.csv";

        CSVReader reader;
        try {
            reader = new CSVReader(new FileReader(path));
            String[] line;
            while ((line = reader.readNext()) != null) {
                System.out.println(Arrays.toString(line));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

