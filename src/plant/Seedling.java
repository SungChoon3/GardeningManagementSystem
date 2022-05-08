package plant;

import java.util.Scanner;

public class Seedling extends Plant implements PlantInput {
	public Seedling(PlantKind kind) {
		super(kind);
	}
	public void getUserInfo(Scanner input) {
		System.out.print("Plant ID :");
		int id = input.nextInt();
		this.setId(id);
		System.out.print("Plant Name :");
		String name = input.next();
		this.setName(name);
		System.out.print("Plant Type :");
		String type = input.next();
		this.setType(type);
		System.out.print("Plant Light :");
		String light = input.next();
		this.setLight(light);
	}
	public void printInfo() {
		String pkind = "none";
		switch(this.kind) {
		case Seedling : 
			pkind = "Seedling";
			break;
		case Cuttings : 
			pkind = "Cuttings";
			break;
		case Seed : 
			pkind = "Seed";
			break;
		default : 
			
		}
		System.out.println("kind: " + pkind + " name: "+ name + " id: " + id 
				+ " type: " + type + " light: " + light);
	}

}
