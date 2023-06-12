package june07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

import static java.util.Collections.*;

public class ReadCsvfile {
    public static void main(String[] args) throws Exception {
        List<Details> stu = new ArrayList<Details>();
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader("/Users/tarunvemasani/Desktop/Book1.csv"));
        while ((line = br.readLine()) != null) {
            String[] student = line.split(",");
            String firstname = student[0];
            String lastname = student[1];
            double gpa = Double.valueOf(student[2]);
            Details d = new Details(firstname, lastname, gpa);
            stu.add(d);
        }
        Collections.sort(stu);
        stu.stream().forEach(System.out::println);


    }
}
