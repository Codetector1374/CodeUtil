package cn.codetector.util.FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public static List<String> readFileByLine(File file){
        List<String> string = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new java.io.FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
               string.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return string;
    }
}