import java.util.ArrayList;
import java.util.Scanner;

public class PlantManager {
	Plant plant;
	Scanner input;
	//String[] list = {"", "", "", ""};
	ArrayList<String> list = new ArrayList<String>();//�Ŀ� �Ĺ����� ������ ����Ʈ...
	ArrayList<String> values = new ArrayList<String>();//�ѽĹ��� ������ ��� �� ����Ʈ...
	PlantManager(Scanner input){
		this.input = input;
	}
	public void addPlant() {//1�� �޴� �Լ�
		plant = new Plant();//�⺻ ������
		System.out.println("Add Plant"); //�Ĺ� �߰� �޴�
		System.out.print("Plant ID :"); //�Ĺ� ID�Է�
		plant.id = input.nextInt();//int plantID = input.nextInt();
		String id = Integer.toString(plant.id);
		System.out.print("Plant Name :"); //�Ĺ� �̸� �Է�
		plant.name = input.next();//String plantName = input.next();
		String name = plant.name;
		System.out.print("Plant Type :"); //�Ĺ� ���� �Է�
		plant.type = input.next();//String plantType = input.next();
		String type = plant.type;
		System.out.print("Plant Light :"); //�Ĺ� �̸� �Է�
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
		System.out.println("#Delet Plant#"); //�Ĺ� ���� �޴�
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
		System.out.println("#Edit Plant#"); //�Ĺ� ���� �޴�
		System.out.print("Plant ID: ");
		int plantID = input.nextInt();
		if(plant.id == plantID) {
			System.out.println("the plant to be edited is " + plantID);
		}
	}
	public void View() {
		System.out.println("View"); //�Ĺ� �����ֱ� �޴�
		System.out.print("Plant ID : ");
		int plantID = input.nextInt();
		if(plant.id == plantID) {
			plant.printInfo();
		}

	}
}
