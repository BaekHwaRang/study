import java.util.Scanner;

import org.xml.sax.Parser;

public class week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int count =0;
		String date[] = {"31","28","31","30","31","30","31","31","30","31","30","31"};
		String result[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		for(int i=1;i<month;i++)
		{
			count += Integer.parseInt(date[i-1]);
		}
		count += day;
		
		System.out.println(result[count%=7]);
		
		}
}
	}
// 3월 17일 -> 입력 3 17