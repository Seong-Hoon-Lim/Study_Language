import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main220915 {
	public static void main(String[] args) {

	//Arrays 클래스 예시
//	int[] test = new int[] {1, 10, 100};
//	String arr = Arrays.toString(test);
//	List list = Arrays.asList(3, 2, 1);
//	System.out.println(arr);
	
	//정규 표현식 예시
			String target = "This year is 2008";
			String reg = ".*[0-9]";
					
			if (target.matches(reg)) {
				System.out.println("일치");
			}
			
			String messge = "This is link- #www.google.com#";
			Pattern p = Pattern.compile("#.*#");
			Matcher matcher = p.matcher(messge);
			while (matcher.find()) {
				String result = matcher.group();
				System.out.println(result);
			}
	
	//Format 클래스 예시			
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String result = sdf.format(now);
			System.out.println(result);
			
			String name = "LSH";
			String addr = "대구 남구";
			//LSH는 대구 남구에 살고 있는 사람입니다.
			
			System.out.printf("%s는 %s에 살고 있는 사람입니다.\n",name,addr);
			String message = "{0}는 {1}에 살고 있는 사람입니다."; 
			String r = MessageFormat.format(message, name, addr);
			System.out.println(r);
	}
	
}
