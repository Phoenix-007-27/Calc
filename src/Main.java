import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 0;
        String[] arrStr = new String[3];
        String symbol;

        ArabInRom convertToRom = new ArabInRom();
//        RomanToArabicConverter convertRomToArab = new RomanToArabicConverter();
        IsNumeric isNumeric = new IsNumeric();
        Valid valid = new Valid();

        Scanner in = new Scanner(System.in);
        String numStr = in.nextLine();
        in.close();

        arrStr = valid.lengh(numStr);
        symbol = arrStr[1];
        if (isNumeric.isNumeric(arrStr[0]) && isNumeric.isNumeric(arrStr[2])) {
//
            a = valid.A(arrStr[0]);
            b = valid.B(arrStr[2]);


            switch (symbol) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    throw new IllegalArgumentException("Неверный математический знак ");
            }

        } else {

              a = valid.toArabA(arrStr[0]);
                b = valid.toArabB(arrStr[2]);

        switch (symbol) {
            case "+":
                System.out.println(convertToRom.convert(a + b));
                break;
            case "-":
                try {
                    System.out.println(convertToRom.convert(a - b));
                } catch (Exception e) {
                }
                if ((a-b) == 0) {
                    throw new Exception("давай ты не будешь вычитать равные римские цифры в ноль");
                }

                break;
            case "*":
                System.out.println(convertToRom.convert(a * b));
                break;
            case "/":
                System.out.println(convertToRom.convert(a / b));
                break;
            default:
                throw new IllegalArgumentException("Неверный математический знак ");
        }
    }
    }

}
