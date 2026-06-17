public class Main {

    public static void main(String[] args) {

        FileProcessor fileProcessor = new FileProcessor("input.txt", "output.html");
        TextProccessor textProccessor = new TextProccessor(fileProcessor);
        textProccessor.convertText();
    }
}
