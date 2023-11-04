package abstractclass;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("THIS IS AN EXAMPLE OF ABSTRACT CLASSES AND METHODS");
        String filePath = "src/abstractclass/data.txt";

        NumberExtractorReport numberExtractorReport = new NumberExtractorReport("**************");
        numberExtractorReport.prepareAndSendReport(filePath);


        EmailExtractorReport emailExtractorReport = new EmailExtractorReport("++++++++++++++++++");
        emailExtractorReport.prepareAndSendReport(filePath);

    }
}
