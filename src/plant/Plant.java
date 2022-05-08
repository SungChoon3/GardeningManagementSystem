package plant;

import java.util.Scanner;

public abstract class Plant {	//abstract - Plant의 객체를 더이상 생성하지 않음
	//fields - 보안을 위해 protected로 변경
	protected PlantKind kind = PlantKind.Seedling; //디폴트는 묘목
	protected String name;
	protected int id;
	protected String type;
	protected String light;	
	public Plant() {//기본 생성자
		
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
