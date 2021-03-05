package file_examples;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) throws IOException {
        String path = "src/file_examples/sample.csv";
        File file = new File(path);
        file.createNewFile();
        ArrayList<Course> data = new ArrayList<Course>();
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String[] line = input.nextLine().split(",");
            data.add(new Course(line[0], line[1], line[2]));
        }

        for(Course asdf : data) {
            System.out.printf("%-15s | %-25s | %-25s\n", asdf.getId(), asdf.getName(), asdf.getInstructor());
//            System.out.println(asdf);
        }

        System.out.println("End of the code");
    }
}
