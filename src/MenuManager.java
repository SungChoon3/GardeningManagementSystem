import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PlantManager plantmanager = new PlantManager(input);
		int i = 0;
		
		while(i != 5) { //5.exit이 아닐 때
			System.out.println("1. Add Plant");
			System.out.println("2. Delete Plant");
			System.out.println("3. Edit Plant");
			System.out.println("4. View");
			System.out.println("5. Exit");
			System.out.print("Select one number betweekn 1-5 : ");
			i = input.nextInt();
			switch(i) {
			case 1 :
				plantmanager.addPlant(); //1번함수호출
				break;
			case 2 : 
				plantmanager.deletePlant();//2번함수호출
				break;
			case 3 : 
				plantmanager.editPlant();//3번함수호출
				break;
			case 4 : 
				plantmanager.viewPlants();//4번함수호출
			}
		}
	}
}
