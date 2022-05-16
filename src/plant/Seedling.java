package plant;

import java.util.Scanner;

public class Seedling extends Plant {
	public Seedling(PlantKind kind) {
		super(kind);
	}
	public void getUserInfo(Scanner input) {
		setPlantID(input);
		setPlantName(input);
		setPlantType(input);
		setPlantLight(input);
	}
	public void printInfo() {
		String pkind = getKindString();
		System.out.println("kind: " + pkind + " name: "+ name + " id: " + id 
				+ " type: " + type + " light: " + light);
	}
}
