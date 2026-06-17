import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextProccessor {

    private FileProcessor fileProcessor;

    public TextProccessor(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
    }

    public void convertText() {

        try {
            System.out.println("Please Specify the full path of the text file to be converted to HTML:");
            BufferReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fullFilePath = reader.readLine();

            if (fullFilePath == null || fullFilePath.isEmpty()) {
                System.out.println("Invalid file path specified.");
                return;
            }

            String text = this.fileProcessor.readAllText();

            String[] paragraphs = text.split("\\r?\\n\\r?\\n");

            StringBuilder htmlContent = new StringBuilder();

            for (String paragraph : paragraphs) {

                if (paragraph.trim().isEmpty()) {
                    continue; // Skip empty paragraphs
                }
                htmlContent.append("<p>").append(paragraph).append("</p>\n");
            }
            htmlContent.append("<br/>\n");

            this.fileProcessor.writeToFile(htmlContent.toString());

        } catch (IOException e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }

    }
}
