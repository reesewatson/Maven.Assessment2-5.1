package rocks.zipcode.assessment2.fundamentals;

import java.util.regex.Pattern;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        return String.format("%1$" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        return String.format("%1$-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder repeat = new StringBuilder(stringToBeRepeated);
        for (int i = 1; i < numberOfTimeToRepeat; i++) {
            repeat.append(stringToBeRepeated);
        } return repeat.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
//        string.replaceAll(" ", "");
////        return string.matches("[a-zA-Z]+");
        string.replaceAll(" ", "");
        char[] chars = string.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        } return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

        return string.matches("[0-9]+");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        char[] chars = string.toCharArray();
        char[] specialchars = {'[','$','&','+',',',':',';','=','?','@','#','|','<','>','.','-','^','*','(',')','%','!',']'};
        for (char c : chars) {
            for (char spec : specialchars) {
                if ((c == spec) && (!(Character.isAlphabetic(c)))){
                    return true;
                }
            }
        } return false;
//        return string.matches("[$&+,:;=?@#|'<>.-^*()%!]");
    }
}
