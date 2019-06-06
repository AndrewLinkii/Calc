import java.util.Scanner;

public class Start {
    GetNumber gNum = new GetNumber();
    Operation oper = new Operation();
    СonvectorDigit convect = new СonvectorDigit();
    Scanner in = new Scanner(System.in);

    public Start() {
        run();
    }

    private void run() {
        boolean flag = true;
        int num1;
        int num2;
        int result;
        char operation;

        System.out.println("Hello" + "\n" +
                "The calculator can work with Arabic numerals from 0 to 10. With Roman numerals from I to X.");

        while (flag) {
            System.out.println("Please choose : " + "\n" + "1 - Canculate " + "\n" + "2 - Exit");
            int toDo = in.nextInt();

            if (toDo == 1) {
                System.out.println("plese input first digit");
                num1 = gNum.getNumb();

                System.out.println("plese input second digit");
                num2 = gNum.getNumb();

                if (gNum.isRomane() == gNum.isArab()) {
                    System.out.println("try again ,different numbers");
                    break;
                }


                if (num1 > 10 || num2 > 10) {
                    System.out.println("out of border");

                } else {
                    System.out.println("Choose operation between digits");
                    operation = oper.getOperation();
                    result = oper.toDoOperation(num1, num2, operation);
                    if (gNum.isRomane() == true) {
                        System.out.println(convect.intToRomain(num1) + "+" + convect.intToRomain(num1) + "=" + convect.intToRomain(result));
                    } else {
                        System.out.println(num1 + "+" + num2 + "=" + result);
                    }
                }

                gNum.setDefault();

            } else if (toDo == 2) {
                break;
            }


        }

    }
}
