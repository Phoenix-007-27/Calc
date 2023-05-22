public class RomanToArabicConverter {

    public  int convertToArabic(String romanNumber) {
        int arabicNumber = 0;
        int previousValue = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            char currentSymbol = romanNumber.charAt(i);
            int currentValue = getRomanValue(currentSymbol);

            if (currentValue >= previousValue) {
                arabicNumber += currentValue;
            } else {
                arabicNumber -= currentValue;
            }

            previousValue = currentValue;
        }

        return arabicNumber;
    }

    private  int getRomanValue(char symbol) {
        switch (symbol) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Неверный символ римской цифры: " + symbol);
        }
    }


}
