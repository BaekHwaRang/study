import java.util.Scanner;

public class Suger {

	public static void main(String[] args) {
		
		int suger5,suger3=0;
		System.out.print("������ ���Ը� �Է����ּ��� : ");
		Scanner sc = new Scanner(System.in);
		
		suger5 = sc.nextInt();
		
		while(true)
		{
			if(suger5%5==0)
			{
				System.out.print("���� 5kg�� ������ "+suger5/5+"�� , ���� 3kg�� ������ "+suger3+"�� �Դϴ�.");
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
