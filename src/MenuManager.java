import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		int i = 0;
		Scanner input = new Scanner(System.in);

		while(i != 5) { //5.exit이 아닐 때
			System.out.println("1. Add Plant");
			System.out.println("2. Delete Plant");
			System.out.println("3. Edit Plant");
			System.out.println("4. View");
			System.out.println("5. Exit");
			System.out.println("Select one number betweekn 1-5 : ");
			i = input.nextInt();
			switch(i) {
			case 1 :
				addPlant(); //1번함수호출
				break;
			case 2 : 
				deletePlant();//2번함수호출
				break;
			case 3 : 
				editPlant();//3번함수호출
				break;
			case 4 : 
				View();//4번함수호출
				/* 이렇게 추가할 예정
				 * 식물 내역 메뉴
				 * 1번 메뉴에서 식물 ID 정보를 List에 저장
				 * 4번 메뉴에서 입력하는 식물 ID와
				 * 1번 메뉴에서 입력한 ID가 동일한 경우의 식물 정보를 보여줌
				 * */
			}
		}

	}

	public static void addPlant() {//1번 메뉴 함수
		Scanner input = new Scanner(System.in);
		System.out.println("Add Plant"); //식물 추가 메뉴
		System.out.print("Plant ID :"); //식물 ID입력
		int plantID = input.nextInt();
		System.out.print("Plant Name :"); //식물 이름 입력
		String plantName = input.next();
		System.out.print("Plant Type :"); //식물 종류 입력
		String plantType = input.next();
		System.out.print("Plant Light :"); //식물 이름 입력
		String plantLight = input.next();
		
		System.out.println(plantID +" "+ plantName +" "+ plantType +" "+ plantLight+"\n");
	}
	public static void deletePlant() {
		System.out.println("Delet Plant"); //식물 삭제 메뉴
	}
	public static void editPlant() {
		System.out.println("Edit Plant"); //식물 변경 메뉴
	}
	public static void View() {
		System.out.println("View"); //식물 보여주기 메뉴
		System.out.print("Plant ID : ");
		//int plantID2 = input.nextInt();

	}
}
