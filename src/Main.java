import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 0;
        String[] arrStr = new String[3];
        String symbol;

        ArabInRom convertToRom = new ArabInRom();
        RomanToArabicConverter convertRomToArab = new RomanToArabicConverter();
        IsNumeric isNumeric = new IsNumeric();

        Scanner in = new Scanner(System.in);
        String numStr = in.nextLine();
        in.close();


        try {
            arrStr = numStr.split(" ");
        } catch (Exception e) {
        }
        if (arrStr.length !=3) {
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор");
        }
        symbol = arrStr[1];
        if (isNumeric.isNumeric(arrStr[0]) && isNumeric.isNumeric(arrStr[2])) {
            try {
                a = Integer.parseInt(arrStr[0]);
                b = Integer.parseInt(arrStr[0]);
            } catch (Exception e) {
              }
            if ((a < 1 || a > 10) || (b < 1 || b > 10)) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }

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
//
            try {
                a = convertRomToArab.convertToArabic(arrStr[0]);
                b = convertRomToArab.convertToArabic(arrStr[2]);
            } catch (Exception e) {
            }
            if ((a < 1 || a > 10) || (b < 1 || b > 10)) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }

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
//                System.out.println(convertToRom.convert(a - b));
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
