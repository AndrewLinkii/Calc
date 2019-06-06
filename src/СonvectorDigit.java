public class СonvectorDigit {
    private String romanNumbers[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public int romanToInt(String romanNumb) {
        int arabNumb;

        for (int i = 1; i <= romanNumbers.length; i++) {
            if (romanNumbers[i - 1].contentEquals(romanNumb)) {
                arabNumb = i;
                return arabNumb;
            }
        }

        return -1;
    }

    public String intToRomain(int arabNumb) {
        String romanNumb = "";
        switch (arabNumb) {
            case 1:
                romanNumb = "I";
                break;
            case 2:
                romanNumb = "II";
                break;
            case 3:
                romanNumb = "III";
                break;
            case 4:
                romanNumb = "IV";
                break;
            case 5:
                romanNumb = "V";
                break;
            case 6:
                romanNumb = "VI";
                break;
            case 7:
                romanNumb = "VII";
                break;
            case 8:
                romanNumb = "VIII";
                break;
            case 9:
                romanNumb = "IX";
                break;
            case 10:
                romanNumb = "X";
                break;
        }
        return romanNumb;

    }
}
