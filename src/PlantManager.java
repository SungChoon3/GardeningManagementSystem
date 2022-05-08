import java.util.ArrayList;
import java.util.Scanner;

import plant.CuttingsPlant;
import plant.Plant;
import plant.PlantInput;
import plant.PlantKind;
import plant.Seed;
import plant.Seedling;

public class PlantManager {
	ArrayList<PlantInput> plants = new ArrayList<PlantInput>();
	Scanner input;
	PlantManager(Scanner input){//생성자
		this.input = input;
	}
	public void addPlant() {//1번 메뉴 함수
		System.out.println("#Add Plant#"); //식물 추가 메뉴
		int kind = 0;
		PlantInput plantInput;
		while(kind != 1 && kind != 2 && kind != 3) {
			System.out.println("1 for Seedling");
			System.out.println("2 for Cuttings");
			System.out.println("3 for Seed");
			System.out.print("Select Plant Kind Number between 1-3 : ");
			kind = input.nextInt();
			if(kind == 1) { 
				plantInput = new Seedling(PlantKind.Seedling);
				plantInput.getUserInfo(input);
				plants.add(plantInput);
				break;
			}
			else if(kind == 2){
				plantInput = new CuttingsPlant(PlantKind.Cuttings);
				plantInput.getUserInfo(input);
				plants.add(plantInput);
				break;
			}
			else if(kind == 3) {
				plantInput = new Seed(PlantKind.Seed);
				plantInput.getUserInfo(input);
				plants.add(plantInput);
				break;
			}
			else {
				System.out.print("Select Plant Kind Number between 1-3 : ");
			}	
		}
	}
	public void deletePlant() {
		System.out.println("#Delet Plant#"); //식물 삭제 메뉴
		System.out.print("Plant ID: ");
		int plantID = input.nextInt();
		int index = -1;//array에서 인덱스 못찾으면
		for (int i=0;i<plants.size();i++) {
			if(plants.get(i).getId() == plantID) {
				index = i;
				break;
			}
		}
		if(index >= 0) {//인덱스를 찾으면
			plants.remove(index);//해당 인덱스에 해당하는 거 지우기
			System.out.println("the plant " + plantID + " is deleted");
		}
		else {
			System.out.println("the plant has not been registered");
			return;
		}
	}
	public void editPlant() {
		System.out.println("#Edit Plant#"); //식물 변경 메뉴
		System.out.print("Plant ID: ");
		int plantID = input.nextInt();
		for (int i = 0; i<plants.size(); i++) {
			PlantInput plantInput = plants.get(i);
			if(plantInput.getId() == plantID) {
				int n = -1;
				while(n != 5) {
					System.out.println("===============\n" + "Edit Plant Info");
					System.out.println("1. Edit Plant ID");
					System.out.println("2. Edit Plant Name");
					System.out.println("3. Edit Plant Type");
					System.out.println("4. Edit Plant Light");
					System.out.println("5. EXIT");
					System.out.print("Select one number between 1-5 : ");

					n = input.nextInt();
					if(n == 1) {//edit ID
						System.out.print("Plant ID : ");
						int id = input.nextInt();
						plantInput.setId(id);
					}
					else if(n == 2) {//edit Name
						System.out.print("Plant Name : ");
						String name = input.next();
						plantInput.setName(name);
					}
					else if(n == 3) {//edit type
						System.out.print("Plant Type : ");
						String type = input.next();
						plantInput.setType(type);
					}
					else if(n == 4) {//edit light
						System.out.print("Plant Light : ");
						String light = input.next();
						plantInput.setLight(light);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	public void viewPlants() {
		System.out.println("# of registered plants" + plants.size());
		for(int i = 0; i<plants.size(); i++) {
			plants.get(i).printInfo();
		}
	}
}
