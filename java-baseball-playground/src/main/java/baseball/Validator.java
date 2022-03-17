package baseball;

public class Validator {
    private static int MIN_NO = 0;
    private static int MAX_NO = 10;

    public static Boolean validNo(int number) {
        return number > MIN_NO && number < MAX_NO;
    }
}
