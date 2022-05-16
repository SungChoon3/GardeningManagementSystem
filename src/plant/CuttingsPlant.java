package plant;

import java.util.Scanner;

public class CuttingsPlant extends Plant {
	public CuttingsPlant(PlantKind kind) {
		super(kind);
	}

	public void getUserInfo(Scanner input) {
		setPlantID(input);
		setPlantName(input);
		setPlantType(input);
		setPlantLightwithYN(input);
	}
	public void setPlantLightwithYN(Scanner input) {
		char ans = 'x';
		while(ans != 'y' && ans != 'Y' && ans != 'n' && ans != 'N') {
			System.out.print("Do you need sunlight? (Y/N) : ");
			ans = input.next().charAt(0);
			if (ans == 'Y' || ans =='y') {
				setPlantLight(input);
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
		String pkind = getKindString();
		System.out.println("kind: " + pkind + " name: "+ name + " id: " + id 
				+ " type: " + type + " light: " + light);
	}

}
