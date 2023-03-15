package com.virtusa.IO.StreamEx;
//  Read a CSV file and display the content
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCSVUsingBufferedReader {

    private final static String COMMA_DELIMITER = ",";

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HRISHI\\OneDrive\\Documents\\CSV file.txt"))) {

            List<List<String>> result = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                result.add(Arrays.asList(values));
            }

            System.out.println(result);
        }
    }
}
