package manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		PlantManager plantmanager = getObject("plantmanager.ser");
		if(plantmanager == null) {//plantmanager에 객체가 없는 일이 없도록
			plantmanager = new PlantManager(input);
		}			
		WindowFrame frame = new WindowFrame(plantmanager);
		selectMenu(input, plantmanager);
		putObject(plantmanager, "plantmanager.ser");
	}
	public static void selectMenu(Scanner input, PlantManager plantmanager) {
		int i = 0;

		while(i != 5) { //5.exit이 아닐 때
			try {
				showMenu();
				i = input.nextInt();
				switch(i) {
				case 1 :
					plantmanager.addPlant(); //1번함수호출
					logger.log("add plant");
					break;
				case 2 : 
					plantmanager.deletePlant();//2번함수호출
					logger.log("delete plant");
					break;
				case 3 : 
					plantmanager.editPlant();//3번함수호출
					logger.log("edit plant");
					break;
				case 4 : 
					plantmanager.viewPlants();//4번함수호출
					logger.log("view a list of plants");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please input Integer 1-5");
				if(input.hasNext()) {
					input.next();
				}
				i = 0;
			}
		}
	}
	public static void showMenu() {
		System.out.println("1. Add Plant");
		System.out.println("2. Delete Plant");
		System.out.println("3. Edit Plant");
		System.out.println("4. View");
		System.out.println("5. Exit");
		System.out.print("Select one number betweekn 1-5 : ");
	}
	public static PlantManager getObject(String filename) {
		PlantManager plantmanager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			plantmanager = (PlantManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return plantmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return plantmanager;
	}
	public static void putObject(PlantManager plantmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(plantmanager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
