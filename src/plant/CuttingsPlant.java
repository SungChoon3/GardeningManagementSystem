package plant;

import java.util.Scanner;

public class CuttingsPlant extends Plant implements PlantInput {
	public CuttingsPlant(PlantKind kind) {
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
		char ans = 'x';
		while(ans != 'y' && ans != 'Y' && ans != 'n' && ans != 'N') {
			System.out.print("Do you need sunlight? (Y/N) : ");
			ans = input.next().charAt(0);
			if (ans == 'Y' || ans =='y') {
				System.out.print("Plant Light :");
				String light = input.next();
				this.setLight(light);
				break;
			}
			else if (ans == 'N' || ans =='n') {
				this.setLight("");
				break;
			}
			else {
			}
		}
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
