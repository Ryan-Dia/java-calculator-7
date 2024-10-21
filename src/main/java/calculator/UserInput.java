package calculator;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInput {
    private static final String CUSTOM_DELIMITERS_START = "//";
    private static final String CUSTOM_DELIMITERS_END = "\\\\n";
    private final String input;

    public UserInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public boolean isInputEmpty() {
        return input.isEmpty();
    }

    public List<Long> parser(String userInput) {
        String delimiterRegex = extractDelimiterRegex(userInput);
        String numbers = "";

        if (delimiterRegex.equals(",|:")) {
            numbers = input;
        } else {
            String pattern = String.join("", CUSTOM_DELIMITERS_START, "(.)", CUSTOM_DELIMITERS_END, "(.*)");
            Matcher m = Pattern.compile(pattern).matcher(input);
            if (m.find()) {
                numbers = m.group(2);
            }

        }
        return convertToLongList(new InputParser(delimiterRegex, numbers).parse());
    }

    private String extractDelimiterRegex(String userInput) {
        return new Delimiter(userInput).getDelimiterRegex();
    }

    private List<Long> convertToLongList(List<String> userInputNumbers) {
        return userInputNumbers
                .stream()
                .map(token -> {
                    Number number = new Number(token);
                    return number.getInputNumber();
                }).toList();
    }
}