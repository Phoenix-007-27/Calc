public class Valid {

    RomanToArabicConverter convertRomToArab = new RomanToArabicConverter();
    ArabInRom convertToRom = new ArabInRom();

    public String[] lengh(String str) throws Exception {
        String[] arg = new String[0];
        try {
            arg = str.split(" ");
        } catch (Exception e) {
        }
        if (arg.length !=3) {
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор");
        }
        return arg;
    }

    public int A(String argum) throws Exception {

        int a = 0;
        try {
            a = Integer.parseInt(argum);
        } catch (Exception e) {
        }
        if ((a < 1 || a > 10)) {
            throw new Exception("Числа должны быть от 1 до 10 включительно");
        }
        return a;
    }
    public int B(String argum) throws Exception {
        int b = 0;
        try {
            b = Integer.parseInt(argum);
        } catch (Exception e) {
        }
        if ((b < 1 || b > 10)) {
            throw new Exception("Числа должны быть от 1 до 10 включительно");        }
        return b;
    }

    public int toArabA(String argum) throws Exception {
        int a = 0;
        try {
                a = convertRomToArab.convertToArabic(argum);

            } catch (Exception e) {
            }
            if ((a < 1 || a > 10) ) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }
            return a;
    }

    public int toArabB(String argum) throws Exception {
        int b = 0;
        try {
            b = convertRomToArab.convertToArabic(argum);
        } catch (Exception e) {
        }
        if ((b < 1 || b > 10)) {
            throw new Exception("Числа должны быть от 1 до 10 включительно");
        }
        return b;
    }

    public void ZeroCheck(int x, int y) throws Exception {
        try {
//            System.out.println(convertToRom.convert(x - y));

        } catch (Exception e) {
        }
        if ((x-y) <= 0 ) {
            throw new Exception("давай ты не будешь вычитать равные римские цифры в ноль и уходить в минус");
        }

        System.out.println(convertToRom.convert(x - y));

    }

}
