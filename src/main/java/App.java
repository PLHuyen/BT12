import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        String text = "Hello java regex 2-12-2018, hello world 12/12/2018";
        String regex = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        System.out.println("Ngày tháng trong chuỗi text: " + text);
        while (m.find()) {
            System.out.println(text.substring(m.start(), m.end()));
        }

        String text1 = "Email: phanlehuyen1@gmail.com, 1phanlehuyen@gmail.com";
        String regex1 = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";
        Pattern p2 = Pattern.compile(regex1);
        Matcher m2 = p2.matcher(text1);

        System.out.println("Địa chỉ email tìm thấy: " + text1);
        while (m2.find()) {
            System.out.println(text1.substring(m2.start(), m2.end()));
        }
    }
}
