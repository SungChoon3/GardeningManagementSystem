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
				addPlant(); //1���Լ�ȣ��
				break;
			case 2 : 
				deletePlant();//2���Լ�ȣ��
				break;
			case 3 : 
				editPlant();//3���Լ�ȣ��
				break;
			case 4 : 
				View();//4���Լ�ȣ��
				/* �̷��� �߰��� ����
				 * �Ĺ� ���� �޴�
				 * 1�� �޴����� �Ĺ� ID ������ List�� ����
				 * 4�� �޴����� �Է��ϴ� �Ĺ� ID��
				 * 1�� �޴����� �Է��� ID�� ������ ����� �Ĺ� ������ ������
				 * */
			}
		}

	}

	public static void addPlant() {//1�� �޴� �Լ�
		Scanner input = new Scanner(System.in);
		System.out.println("Add Plant"); //�Ĺ� �߰� �޴�
		System.out.print("Plant ID :"); //�Ĺ� ID�Է�
		int plantID = input.nextInt();
		System.out.print("Plant Name :"); //�Ĺ� �̸� �Է�
		String plantName = input.next();
		System.out.print("Plant Type :"); //�Ĺ� ���� �Է�
		String plantType = input.next();
		System.out.print("Plant Light :"); //�Ĺ� �̸� �Է�
		String plantLight = input.next();
		
		System.out.println(plantID +" "+ plantName +" "+ plantType +" "+ plantLight+"\n");
	}
	public static void deletePlant() {
		System.out.println("Delet Plant"); //�Ĺ� ���� �޴�
	}
	public static void editPlant() {
		System.out.println("Edit Plant"); //�Ĺ� ���� �޴�
	}
	public static void View() {
		System.out.println("View"); //�Ĺ� �����ֱ� �޴�
		System.out.print("Plant ID : ");
		//int plantID2 = input.nextInt();

	}
}
