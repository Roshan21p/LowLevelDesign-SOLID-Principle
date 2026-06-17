import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessor {

    private String fullFilePath;

    public FileProcessor(String fullFilePath) {
        this.fullFilePath = fullFilePath;
    }

    public String readAllText() throws IOException {

        String content = new String(Files.readAllBytes(Paths.get(this.fullFilePath)));
        return content;
    }

    public void writeToFile(String text) throws IOException {

        String outputFilePath = Paths.get(this.fullFilePath).getFileName().toString().replace(".txt", ".html");

        System.out.println("Output file path: " + outputFilePath);

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath))) {
            writer.write(text);
        }
    }
}
