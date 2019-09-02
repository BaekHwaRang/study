import java.util.Scanner;

public class Suger {

	public static void main(String[] args) {
		
		int suger5,suger3=0;
		System.out.print("설탕의 무게를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		
		suger5 = sc.nextInt();
		
		while(true)
		{
			if(suger5%5==0)
			{
				System.out.print("설탕 5kg의 갯수는 "+suger5/5+"개 , 설탕 3kg의 갯수는 "+suger3+"개 입니다.");
				break;
			}
			
			else if(suger5<0) {
				System.out.print("1");
				break;
			}
			suger5-=3;
			suger3++;
		}
	}

}
