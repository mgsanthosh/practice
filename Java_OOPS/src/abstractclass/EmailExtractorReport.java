package abstractclass;

import java.util.Locale;
import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport {

    EmailExtractorReport(String a) {
        super(a);
    }
    private static final Pattern PATTERN = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "EMAILS";
    }

    @Override
    public String clean(String input) {
        return input.toUpperCase();
    }
}
