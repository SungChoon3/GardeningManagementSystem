package plant;

import java.util.Scanner;

public class Seed extends Plant {
	protected String seedingMethod;	
	public Seed(PlantKind kind) {
		super(kind);
	}
	public String getSeedingMethod() {
		return seedingMethod;
	}

	public void setSeedingMethod(String seedingMethod) {
		this.seedingMethod = seedingMethod;
	}

	public void getUserInfo(Scanner input) {
		setPlantID(input);
		setPlantName(input);
		setPlantType(input);
		setPlantLightwithYN(input);
		
		char ans = 'x';
		while(ans != 'y' && ans != 'Y' && ans != 'n' && ans != 'N') {
			System.out.print("Do you need Transplanting? (Y/N) : ");//옮겨심기가 필요한지 묻기
			ans = input.next().charAt(0);
			if (ans == 'Y' || ans =='y') {
				this.setSeedingMethod("Transplanting");
				break;
			}
			else if (ans == 'N' || ans =='n') {
				this.setSeedingMethod("Direct Seeding");
				break;
			}
			else {
			}
		}
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
				+ " type: " + type + " light: " + light + " seedingMethod: " + seedingMethod);
	}
}
