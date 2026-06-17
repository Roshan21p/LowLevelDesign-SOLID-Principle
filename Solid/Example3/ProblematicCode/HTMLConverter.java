import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HTMLConverter {

    public static void main(String[] args) {

        try {
            System.out.println("Please Specify the full path of the text file to be converted to HTML:");
            BufferReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fullFilePath = reader.readLine();

            if (fullFilePath == null || fullFilePath.isEmpty()) {
                System.out.println("Invalid file path specified.");
                return;
            }

            String text = readAllText(fullFilePath);

            String[] paragraphs = text.split("\\r?\\n\\r?\\n");

            StringBuilder htmlContent = new StringBuilder();

            for (String paragraph : paragraphs) {

                if (paragraph.trim().isEmpty()) {
                    continue; // Skip empty paragraphs
                }
                htmlContent.append("<p>").append(paragraph).append("</p>\n");
            }
            htmlContent.append("<br/>\n");

            writeToFile(htmlContent.toString(), fullFilePath);

        } catch (IOException e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }

        System.out.println("Press any key to exit.");
        try {
            System.in.read();
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }

    public static String readAllText(String fullFilePath) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get(fullFilePath)));
        return content;
    }

    public static void writeToFile(String text, String fullFilePath) throws IOException {

        String outputFilePath = Paths.get(fullFilePath).getFileName().toString().replace(".txt", ".html");

        System.println("Output file path: " + outputFilePath);

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath))) {
            writer.write(text);
        }
    }
}