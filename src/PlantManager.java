import java.util.ArrayList;
import java.util.Scanner;

public class PlantManager {
	Plant plant;
	Scanner input;
	//String[] list = {"", "", "", ""};
	ArrayList<String> list = new ArrayList<String>();//후에 식물들을 저장할 리스트...
	ArrayList<String> values = new ArrayList<String>();//한식물의 정보를 묶어서 새 리스트...
	PlantManager(Scanner input){
		this.input = input;
	}
	public void addPlant() {//1번 메뉴 함수
		plant = new Plant();//기본 생성자
		System.out.println("Add Plant"); //식물 추가 메뉴
		System.out.print("Plant ID :"); //식물 ID입력
		plant.id = input.nextInt();//int plantID = input.nextInt();
		String id = Integer.toString(plant.id);
		System.out.print("Plant Name :"); //식물 이름 입력
		plant.name = input.next();//String plantName = input.next();
		String name = plant.name;
		System.out.print("Plant Type :"); //식물 종류 입력
		plant.type = input.next();//String plantType = input.next();
		String type = plant.type;
		System.out.print("Plant Light :"); //식물 이름 입력
		plant.light = input.next();//String plantLight = input.next();
		String light = plant.light;
		
		list.add(Integer.toString(plant.id));
		list.add(plant.name);
		list.add(plant.type);
		list.add(plant.light);
		System.out.println(plant.id +" "+ plant.name +" "+ plant.type +" "+ plant.light+"\n");
		values.addAll(list);
	}
	public void deletePlant() {
		System.out.println("#Delet Plant#"); //식물 삭제 메뉴
		System.out.print("Plant ID: ");
		int plantID = input.nextInt();
		if(plant == null) {
			System.out.println("the plant has not been registered");
			return;
		}
		if(plant.id == plantID) {
			plant = null;
			System.out.println("the plant is deleted");
		}
	}
	public void editPlant() {
		System.out.println("#Edit Plant#"); //식물 변경 메뉴
		System.out.print("Plant ID: ");
		int plantID = input.nextInt();
		if(plant.id == plantID) {
			System.out.println("the plant to be edited is " + plantID);
		}
	}
	public void View() {
		System.out.println("View"); //식물 보여주기 메뉴
		System.out.print("Plant ID : ");
		int plantID = input.nextInt();
		if(plant.id == plantID) {
			plant.printInfo();
		}

	}
}
