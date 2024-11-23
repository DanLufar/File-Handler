package app;

public class Main {
    private final static String BASE_PATH = "/Users/macbookair/Desktop/Program/File-Handler/File";

    public static void main(String[] args) {

        FileHandler handler = new FileHandler();
        String fileName = "myfile";

        String fileContent = "My very important information.";

        String result = handler.writeFile(fileName, fileContent);
        String content = handler.readFile(BASE_PATH + fileName + ".txt");
        getOutput("RESULT: " + result);
        getOutput("FILE CONTENT: " + content);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
