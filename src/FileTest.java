import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class FileTest {

    public FileTest() {

    }

    public void createFile(String path) {
        try {
            if (!(path.contains(".txt"))) {
                System.out.println("You need to specify the file extension! (.txt)");
            } else {
                File file = new File(path);
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            }
        } catch (IOException e) {
            System.out.println("Not a valid path!");
        }
    }

    public void findFiles(String path) {
        try {
            if (path.isEmpty()) {
                System.out.println("Not a valid path");
            } else {
                File file = new File(path);
                String[] files = file.list();

                assert files != null;
                for (String fileNames: files) {
                    System.out.println(fileNames);
                }
            }
        } catch(Exception e) {
            System.out.println("Not a valid path!");
        }
    }

    public void writeToFile(String path, String value) {
        try {
            PrintWriter pw = new PrintWriter(path);
            pw.write(value);
            pw.close();
            System.out.println("Successfully wrote to the file!");
        } catch (IOException e) {
            System.out.println("Path is incorrect");
            e.printStackTrace();
        }
    }



}
