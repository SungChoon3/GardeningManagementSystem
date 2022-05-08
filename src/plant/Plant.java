package plant;

import java.util.Scanner;

public abstract class Plant {	//abstract - Plant�� ��ü�� ���̻� �������� ����
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
}
