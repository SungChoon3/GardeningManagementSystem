package plant;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Plant implements PlantInput, Serializable {	//abstract - Plant�� ��ü�� ���̻� �������� ����
	/**
	 * 
	 */
	private static final long serialVersionUID = -7615534005171186016L;
	//fields - ������ ���� protected�� ����
	protected PlantKind kind = PlantKind.Seedling; //����Ʈ�� ����
	protected String name;
	protected int id;
	protected String type;
	protected String light;	
	public Plant() {//�⺻ ������
		
	}
	public Plant(PlantKind kind) {
		this.kind = kind;
	}
	public Plant(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public Plant(PlantKind kind, String name, int id, String type, String light) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.type = type;
		this.light = light;
	}
	//Getter, Setter
	public PlantKind getKind() {
		return kind;
	}
	public void setKind(PlantKind kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLight() {
		return light;
	}
	public void setLight(String light) {
		this.light = light;
	}
	public abstract void printInfo();
	
	public void setPlantID(Scanner input) {
		System.out.print("Plant ID : ");
		int id = input.nextInt();
		this.setId(id);
	}
	public void setPlantName(Scanner input) {
		System.out.print("Plant Name : ");
		String name = input.next();
		this.setName(name);
	}
	public void setPlantType(Scanner input) {
		System.out.print("Plant Type : ");
		String type = input.next();
		this.setType(type);
	}
	public void setPlantLight(Scanner input) {
		System.out.print("Plant Light : ");
		String light = input.next();
		this.setLight(light);
	}
	public String getKindString() {
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
		return pkind;
	}
}
