package abstractclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class ExtractorReport extends DummyAbstractClass {
    String a;
    ExtractorReport(String a) {
        super(a);
        this.a = a;
        System.out.println("HAVE GOT THE VARIABLE INTO CONSTRUCTOR " + this.a);
    }
    public abstract Pattern getPattern();

    public abstract String getReportName();

    public abstract String clean(String input);

    private void justPrint(String name) {
        System.out.println(name + " HAS IMPLEMEMTED");
    }

    /*
    @Author Santhosh

    The Below Function is the hidden implementation where abstraction comes into picture
     */

    private String parse(String path) throws FileNotFoundException {
        System.out.println("THE VALUE OF A IS " + a);
        String out = "";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        if(scanner.hasNext()) {
            scanner.nextLine();
        } else {
            return "Empty File";
        }

        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);

            boolean matches = matcher.matches();
            if(matches) {
                out += nextLine + "\n";
            }
        }
        return out.isBlank() ? "Empty file" : out;
    }

    public void prepareAndSendReport(String path) throws FileNotFoundException{
        System.out.println("SENDING REPORT.... " + getReportName());
        String report = parse(path);
        justPrint("SANTHOSH");
        System.out.println(clean(report));
        System.out.println(getReportName() + " REPORT SENT.");
    }
}
