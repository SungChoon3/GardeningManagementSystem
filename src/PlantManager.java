import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import plant.CuttingsPlant;
import plant.PlantInput;
import plant.PlantKind;
import plant.Seed;
import plant.Seedling;

public class PlantManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2875167375512744775L;
	
	ArrayList<PlantInput> plants = new ArrayList<PlantInput>();
	transient Scanner input; //�����ϰ� ���� ���� ��ĳ��
	PlantManager(Scanner input){//������
		this.input = input;
	}
	public void addPlant() {//1�� �޴� �Լ�
		System.out.println("#Add Plant#"); //�Ĺ� �߰� �޴�
		int kind = 0;
		PlantInput plantInput;
		while(kind != 1 && kind != 2 && kind != 3) {
			try {
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
			catch(InputMismatchException e) {
				System.out.println("Please input Integer 1-3");
				if(input.hasNext()) {
					input.next();
				}
				kind = 0;
			}
		}
	}
	public void deletePlant() {
		System.out.println("#Delet Plant#"); //�Ĺ� ���� �޴�
		System.out.print("Plant ID: ");
		int plantID = input.nextInt();
		int index = findIndex(plantID);//method�� ����
		removeFromPlants(index, plantID);
	}
	public int findIndex(int plantID) {
		int index = -1;//array���� �ε��� ��ã����
		for (int i=0;i<plants.size();i++) {
			if(plants.get(i).getId() == plantID) {
				index = i;
				break;
			}
		}
		return index;
	}
	public int removeFromPlants(int index, int plantID) {
		if(index >= 0) {//�ε����� ã����
			plants.remove(index);//�ش� �ε����� �ش��ϴ� �� �����
			System.out.println("the plant " + plantID + " is deleted");
			return 1;
		}
		else {
			System.out.println("the plant has not been registered");
			return -1;
		}
	}
	public void editPlant() {
		System.out.println("#Edit Plant#"); //�Ĺ� ���� �޴�
		System.out.print("Plant ID: ");
		int plantID = input.nextInt();
		for (int i = 0; i<plants.size(); i++) {
			PlantInput plantInput = plants.get(i);
			if(plantInput.getId() == plantID) {
				int n = -1;
				while(n != 5) {
					showEditMenu();//method�� ����ϰ�
					n = input.nextInt();
					switch(n) {
					case 1 : //edit ID
						plantInput.setPlantID(input);
						break;
					case 2 : //edit Name
						plantInput.setPlantName(input);
						break;
					case 3 : //edit type
						plantInput.setPlantType(input);
						break;
					case 4 : //edit light
						plantInput.setPlantLight(input);
						break;
					default : 
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

	public void showEditMenu() {
		System.out.println("===============\n" + "Edit Plant Info");
		System.out.println("1. Edit Plant ID");
		System.out.println("2. Edit Plant Name");
		System.out.println("3. Edit Plant Type");
		System.out.println("4. Edit Plant Light");
		System.out.println("5. EXIT");
		System.out.print("Select one number between 1-5 : ");
	}
}
