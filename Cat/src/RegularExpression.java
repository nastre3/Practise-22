import java.util.Arrays;
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

        // это hex код цвета?
        if (Pattern.matches("^#?([a-f0-9]{6}|[a-f0-9]{3})$", "#8b2323")) { // вернет true
            System.out.println("hex код цвета");
        }

        Pattern pattern3 = Pattern.compile(":|;");
        String[] animals = pattern3.split("cat:dog;bird:cow");
        Arrays.asList(animals).forEach(animal -> System.out.print(animal + " "));
// cat dog bird cow
    }
}
