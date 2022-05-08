package plant;

import java.util.Scanner;

public interface PlantInput {
	public void getUserInfo(Scanner input) ;
	public int getId();
	public void setId(int id);
	public void setName(String name);
	public void setType(String type);
	public void setLight(String light);
	public void printInfo();
}
