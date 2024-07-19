import java.util.List;
import java.util.stream.Collectors;

public class CsvProcessor {
    public List<String> processCsv() {
        // Assuming leerCsv() returns a Stream<String> representing lines of the CSV file
        return leerCsv()
                .map(linea -> String.join(",", linea))  // Map each line to a comma-separated string
                .collect(Collectors.toList());          // Collect the results into a list
    }

    // Assume leerCsv() method reads the CSV file and returns a Stream<String>
    private Stream<String> leerCsv() {
        // Implementation of reading CSV file as a Stream of lines
    }
}
