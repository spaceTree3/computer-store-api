package computer.store.accesories;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accessory {
	@Id
	private int id;
	private String name;
	private String type;
	private float price;
	
	public Accessory() {}
	
	public Accessory(int id, String name, String type, float price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
