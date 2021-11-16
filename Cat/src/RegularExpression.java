import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
        Matcher matcher = pattern.matcher("nastre70@gmail.com");
        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}
