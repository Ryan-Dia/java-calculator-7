package calculator.controller;

import calculator.Delimiter;
import calculator.UserInputString;
import calculator.view.InputView;
import calculator.view.OutputView;
import java.util.List;

public class CalculatorController {

    public void run() {
        OutputView.printStartMessage();
        UserInputString userInput = new UserInputString(InputView.readInputString());
        if (userInput.isInputEmpty()) {
            OutputView.printResult("결과 : " + 0);
            return;
        }

        String delimiterRegex = new Delimiter(userInput.getInput()).getDelimiterRegex();

        List<Long> inputNumbers = userInput.parser(delimiterRegex);

        if (inputNumbers.size() > 10) {
            throw new IllegalArgumentException("10개 이상의 숫자를 더할 수 없습니다.");
        }

        long result = inputNumbers.stream().mapToLong(Long::longValue).sum();
        OutputView.printResult("결과 : " + result);

    }
}
