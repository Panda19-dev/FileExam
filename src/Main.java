

public class Main {
    public static void main(String[] args) {

        FileTest ft = new FileTest();
        ft.findFiles(".");
        ft.createFile("text.txt");
        ft.writeToFile("./src/files/data.txt", "Tilda är en galning på roblox");
    }
}