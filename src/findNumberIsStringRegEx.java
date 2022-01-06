import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findNumberIsStringRegEx {


    public static void main(String[] args) {

        System.out.println("Raqamlarni matn ichidan topuvchi dastur");
        show(isNumber(new Scanner(System.in).nextLine()));

    }
    public static String[] isNumber(String s)
    {
        Pattern pattern=Pattern.compile("(([+|-]?\\d+(\\.\\d*)?)|([+|-]?\\.\\d+))");
        Matcher moslik=pattern.matcher(s);
        String []nums=new String[s.length()];
        int c=0;
        while (moslik.find())
        {
            nums[c++]=s.substring(moslik.start(), moslik.end());
        }
        return nums;
    }
    public static void show(String []s)
    {
        for (String m:s) {
            if (m!=null)
            {
                System.out.println(m);
            }
        }
    }

}
