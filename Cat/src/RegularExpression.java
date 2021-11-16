import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
        Matcher matcher = pattern.matcher("nastre70@gmail.com");
        boolean matches = matcher.matches();
        System.out.println(matches);

        Pattern pattern2 = Pattern.compile("[Хх]([аоие])х?(?:\\1х?)*|[Аа]х?(?:ах?)+");
        Matcher matcher2 = pattern2.matcher("Ахахаах");
        boolean matches2 = matcher2.matches();
        System.out.println(matches2);
    }
}
