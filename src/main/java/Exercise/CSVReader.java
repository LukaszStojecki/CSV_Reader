package Exercise;

import de.vandermeer.asciitable.AsciiTable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CSVReader {

    public static void main(String[] args) {

        String path = "./data.csv";

        String[][] csv = readCSV(path);
        System.out.println(drawTable(csv));

    }

    public static String drawTable(String[][] table) {
        String borderRow = Arrays.stream(table[0])
                .map(str -> "-".repeat(str.length()))
                .collect(Collectors.joining("+", "+", "+\n"));
        return Arrays.stream(table)
                .map(row -> Arrays.stream(row)
                        .collect(Collectors.joining("|", "|", "|\n")))
                .collect(Collectors.joining(borderRow, borderRow, borderRow));
    }

    public static String[][] readCSV(String path) {
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            List<String[]> lines = new ArrayList<String[]>();
            while ((line = br.readLine()) != null) {
                lines.add(line.split(";"));
            }
            return lines.toArray(new String[lines.size()][]);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new String[0][];
    }
}
