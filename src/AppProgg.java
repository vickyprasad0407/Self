import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppProgg {

	public static void main(String[] args) {

		String s="application is to be filled by appium people";
        Pattern p=Pattern.compile("app");
        Matcher m=p.matcher(s);
        while(m.find())
        {
        	System.out.println(m.group());
        }
	}

}
