import java.util.Scanner;
public class plus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~10000�� ���ڸ� �Է����ּ��� : ");
		int n = sc.nextInt();
		int count=0;
	while(true)
	{
		if(n<=10000 && n>=1) {
			for(int i=1;i<=n;i++)
			{
				count+=i;
			}
		System.out.print(count);
		break;
		}
		else
			System.out.println("1~10000�� ���ڸ� �Է����ּ���.");
	}	
		
	}

}
