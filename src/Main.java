

public class Main {
    public static void main(String[] args) {

        FileTest ft = new FileTest();
        ft.findFiles(".");
        ft.createFile("data.yml");
        ft.writeToFile("./src/files/data.txt", "Tilda är en galning på roblox");
        ft.readFromFile("./src/files/data.txt");
        ft.getSpecificLine("./src/files/data.txt", 0);
        ft.deleteFile("text.txt");
    }
}