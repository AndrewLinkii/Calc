import java.util.Scanner;

public class Operation {
    Scanner in = new Scanner(System.in);

    public int toDoOperation(int firstNum, int seconNum, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = firstNum + seconNum;
                break;
            case '-':
                result = firstNum - seconNum;
                break;
            case '*':
                result = firstNum * seconNum;
                break;
            case '/':
                result = firstNum / seconNum;
                break;
        }
        return result;
    }

    public char getOperation() {
        char operation = in.next().charAt(0);

        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            System.out.println("You made a mistake when entering the operation. try again");
            operation = getOperation();
        }
        return operation;
    }
}
