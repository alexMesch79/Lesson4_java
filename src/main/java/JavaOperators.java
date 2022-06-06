public class JavaOperators {
    public static void main (String[] args){

        byte aByte1 = -128, aByte2 = 100;
        short aShort1 = 32000, aShort2 = 5000;
        int aIntger1 = 2147483646, aIntger2 = -250000;
        long aLong = 300000;
        float aFloat = 123.4f;
        double aDouble = 12.8;
        boolean aBoolean1 = true, aBoolean2 = false;
        char aChar = 'A';
        String aString1 = "Это строка ", aString2 = "для вывода в консоль!";
        int aInt1 = 2147483647;     // максимальное значение для int = 2 в 31-ой степени минус 1
        int aInt2 = -2147483648;    // минимальное значение для int = - 2 в 31-ой степени
        int overFlowMax = aInt1 + 10;
        int overFlowMin = aInt2 - 10;


        System.out.println(aByte1 + aByte2);
        System.out.println(aShort1 - aShort2);
        System.out.println(aLong * 2);
        System.out.println(aByte2 / 50);
        System.out.println(aByte1 % 3);

        System.out.println(aChar + aIntger1); // результат тип int
        System.out.println(aByte1 + aShort1); // результат тип int
        System.out.println(aIntger2 + aDouble); // результат тип double
        System.out.println(aIntger1 + aFloat); // результат тип float
        System.out.println(aIntger2 + aLong); // результат тип long

        System.out.println("aBoolean1 = " + aBoolean1);
        System.out.println("aBoolean2 = " + aBoolean2);
        System.out.println("aBoolean1 | aBoolean2 = " + (aBoolean1 | aBoolean2));
        System.out.println("aBoolean1 & aBoolean2 = " + (aBoolean1 & aBoolean2));
        System.out.println("aBoolean1 ^ aBoolean2 = " + (aBoolean1 ^ aBoolean2));
        System.out.println("!aBoolean1 = " + !aBoolean1);

        System.out.println(aString1 + aString2); // Объединение строк


        System.out.println("Переполнение максимального значения integer = " + overFlowMax);
        System.out.println("Переполнение минимального значения integer = " + overFlowMin);

    }
}
