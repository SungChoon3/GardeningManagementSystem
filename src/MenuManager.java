import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int i = 0;
		Scanner input = new Scanner(System.in);
		
		while(i != 5) { //5.exit�� �ƴ� ��
		System.out.println("1. Add Plant");
		System.out.println("2. Delete Plant");
		System.out.println("3. Edit Plant");
		System.out.println("4. View");
		System.out.println("5. Exit");
		System.out.println("Select one number betweekn 1-5 : ");
		i = input.nextInt();
		switch(i) {
		case 1 :
			System.out.println("Add Plant"); //�Ĺ� �߰� �޴�
			System.out.print("Plant ID :"); //�Ĺ� ID�Է�
			int plantID = input.nextInt();
			System.out.print("Plant Name :"); //�Ĺ� �̸� �Է�
			String plantName = input.next();
			break;
		
		case 2 : 
			System.out.println("Delet Plant"); //�Ĺ� ���� �޴�
			break;
		case 3 : 
			System.out.println("Edit Plant"); //�Ĺ� ���� �޴�
			break;
		case 4 : 
			System.out.println("View"); //�Ĺ� �����ֱ� �޴�
			System.out.print("Plant ID : ");
			int plantID2 = input.nextInt();
			
			/* �̷��� �߰��� ����
			 * �Ĺ� ���� �޴�
			 * 1�� �޴����� �Ĺ� ID ������ List�� ����
			 * 4�� �޴����� �Է��ϴ� �Ĺ� ID��
			 * 1�� �޴����� �Է��� ID�� ������ ����� �Ĺ� ������ ������
			 * */
			}
		}
	}
}
