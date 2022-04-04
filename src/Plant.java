
public class Plant {

	//fields
	String name;
	int id;
	String type;
	String light;
	
	public Plant() {//기본 생성자
		
	}
	public Plant(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public Plant(String name, int id, String type, String light) {
		this.name = name;
		this.id = id;
		this.type = type;
		this.light = light;
	}
	
	public void printInfo() {
		System.out.println("name: "+ name + " id: " + id 
				+ " type: " + type + "light: " + light);
	}
}
