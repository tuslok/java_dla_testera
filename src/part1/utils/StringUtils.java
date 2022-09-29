package part1.utils;

public class StringUtils {

    static public String getFormattedString(String text) {
        if (text.length() < 10) {
            return text;
        } else {
            return text.substring(0, 7) + "...";
        }
    }
}
