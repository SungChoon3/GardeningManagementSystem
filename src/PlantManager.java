import java.util.ArrayList;
import java.util.Scanner;

import plant.CuttingsPlant;
import plant.Plant;
import plant.PlantKind;
import plant.Seed;

public class PlantManager {
	ArrayList<Plant> plants = new ArrayList<Plant>();
	Scanner input;
	PlantManager(Scanner input){//������
		this.input = input;
	}
	public void addPlant() {//1�� �޴� �Լ�
		System.out.println("#Add Plant#"); //�Ĺ� �߰� �޴�
		int kind = 0;
		Plant plant;
		while(kind != 1 && kind != 2 && kind != 3) {
			System.out.println("1 for Seedling");
			System.out.println("2 for Cuttings");
			System.out.println("3 for Seed");
			System.out.print("Select Plant Kind Number between 1-3 : ");
			kind = input.nextInt();
			if(kind == 1) { 
				plant = new Plant(PlantKind.Seedling);
				plant.getUserInfo(input);
				plants.add(plant);
				break;
			}
			else if(kind == 2){
				plant = new CuttingsPlant(PlantKind.Cuttings);
				plant.getUserInfo(input);
				plants.add(plant);
				break;
			}
			else if(kind == 3) {
				plant = new Seed(PlantKind.Seed);
				plant.getUserInfo(input);
				plants.add(plant);
				break;
			}
			else {
				System.out.print("Select Plant Kind Number between 1-3 : ");
			}	
		}
	}
	public void deletePlant() {
		System.out.println("#Delet Plant#"); //�Ĺ� ���� �޴�
		System.out.print("Plant ID: ");
		int plantID = input.nextInt();
		int index = -1;//array���� �ε��� ��ã����
		for (int i=0;i<plants.size();i++) {
			if(plants.get(i).getId() == plantID) {
				index = i;
				break;
			}
		}
		if(index >= 0) {//�ε����� ã����
			plants.remove(index);//�ش� �ε����� �ش��ϴ� �� �����
			System.out.println("the plant " + plantID + " is deleted");
		}
		else {
			System.out.println("the plant has not been registered");
			return;
		}
	}
	public void editPlant() {
		System.out.println("#Edit Plant#"); //�Ĺ� ���� �޴�
		System.out.print("Plant ID: ");
		int plantID = input.nextInt();
		for (int i = 0; i<plants.size(); i++) {
			Plant plant = plants.get(i);
			if(plant.getId() == plantID) {
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
						plant.setId(id);
					}
					else if(n == 2) {//edit Name
						System.out.print("Plant Name : ");
						String name = input.next();
						plant.setName(name);
					}
					else if(n == 3) {//edit type
						System.out.print("Plant Type : ");
						String type = input.next();
						plant.setType(type);
					}
					else if(n == 4) {//edit light
						System.out.print("Plant Light : ");
						String light = input.next();
						plant.setLight(light);
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
