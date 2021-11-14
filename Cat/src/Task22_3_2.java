import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22_3_2 {
    public static void main(String[] args) {
        String text = "aba aba a!a abba adca abea";
        Pattern pattern = Pattern.compile("a.{2}a");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Found match\n" + text.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
        }
    }
}
