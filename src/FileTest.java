import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileTest {

    public FileTest() {

    }

    public void createFile(String path) {
        try {
            if (!(path.contains(".txt") || (path.contains(".yml")))) {
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
            if (path.isEmpty()) {
                System.out.println("Path is empty!");
                return;
            }
            FileWriter pw = new FileWriter(path, true);
            pw.write("\n" + value);
            pw.close();
            System.out.println("Successfully wrote to the file!");
        } catch (IOException e) {
            System.out.println("Path is incorrect");
            e.printStackTrace();
        }
    }

    public void readFromFile(String path) {
        try {
            if (path.isEmpty()) {
                System.out.println("Path can not be empty");
                return;
            }
            if (!(path.contains(".txt") || (path.contains(".yml")))) {
                System.out.println("Path does not contain a file extension! (.txt)");
                return;
            }
            File file = new File(path);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Incorrect path!");
            e.printStackTrace();
        }
    }

    public void deleteFile(String path) {
        File f = new File(path);
        if (f.delete()) {
            System.out.println("Deleted the file: " + f.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public void getSpecificLine(String path, int num) {
        try {
            File file = new File(path);
            if (!(path.isEmpty())) {
                System.out.println("Path is Empty");
            }
            if(!(file.exists())) {
                System.out.println("File does not exist");
            }
            String line = Files.readAllLines(Paths.get(path)).get(num); //Starts on 0 and ++
            System.out.println(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
