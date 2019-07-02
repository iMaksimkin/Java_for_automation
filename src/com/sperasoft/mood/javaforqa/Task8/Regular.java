package Task8;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    // BTW we can use one method for our String
    public static void main(String[] args) {
        System.out.println("First Task");
        String firstStr = "Word cAT DATA A site Java tExt";
        System.out.println(firstStr);
        Pattern pattern = Pattern.compile("\\b[A-Z]\\S*\\b");
        Matcher matcher = pattern.matcher(firstStr);
        while (matcher.find())
            System.out.print(matcher.group() + " ");
        System.out.println();

        System.out.println("Second Task");
        String secondStr = "  Removing        Extra Spaces       Between Words in  the             text  ";
        System.out.println(secondStr);

        Pattern pattern1 = Pattern.compile("\\s+");
        Matcher matcher1 = pattern1.matcher(secondStr);
        System.out.println(pattern1.matcher(secondStr).replaceAll(" ").trim());

        System.out.println("Third Task");
        String thirdString = new String("password wword word Heeeeeeello");
        Pattern pattern2 = Pattern.compile("\\b\\w*(\\w)\\1\\w*\\b\\s*");
        Matcher matcher2 = pattern2.matcher(thirdString);
        System.out.println(thirdString);

        System.out.println(matcher2.replaceAll(""));
    }
}
