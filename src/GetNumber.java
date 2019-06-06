import java.util.Scanner;

public class GetNumber {

    Scanner in = new Scanner(System.in);
    СonvectorDigit change = new СonvectorDigit();
    private String numb;
    private boolean isRomane;
    private boolean isArab;


    public int getNumb() {
        numb = in.next();

        char tempNumb = numb.charAt(0);
        int value;
        if (Character.isDigit(tempNumb)) {
            value = Integer.parseInt(numb);
            isArab = true;
            return value;
        } else {
            value = change.romanToInt(numb);
            isRomane = true;
            return value;

        }
    }


    public boolean isRomane() {
        return isRomane;
    }

    public boolean isArab() {
        return isArab;
    }

    public void setDefault() {
        isRomane = false;
        isArab = false;
    }
}
