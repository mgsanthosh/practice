package abstractclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractorReport extends ExtractorReport{

    NumberExtractorReport(String a) {
        super(a);
    }
    private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");
    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "PHONE NUMBERS";
    }

    @Override
    public String clean(String input) {
        return input;
    }


}
