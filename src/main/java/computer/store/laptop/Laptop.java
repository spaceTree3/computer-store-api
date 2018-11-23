package computer.store.laptop;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="Laptop")
@Entity
public class Laptop {
	@Id
	private int id;
	private String model;
	private float displaySize;
	private String operatingSystem;
	private String cpuModel;
	private float memorySize;
	private float diskSize; //in GB
	private float price;
	
	public Laptop() {}
	
	public Laptop(int id, String model, float displaySize, String operatingSystem, String cpuModel,
			float memorySize, float diskSize,float price) {
		super();
		this.id = id;
		this.model = model;
		this.displaySize = displaySize;
		this.operatingSystem = operatingSystem;
		this.cpuModel = cpuModel;
		this.memorySize = memorySize;
		this.diskSize = diskSize;
		this.price=price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(float displaySize) {
		this.displaySize = displaySize;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getCpuModel() {
		return cpuModel;
	}
	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}
	public float getMemorySize() {
		return memorySize;
	}
	public void setMemorySize(float memorySize) {
		this.memorySize = memorySize;
	}
	public float getDiskSize() {
		return diskSize;
	}
	public void setDiskSize(float diskSize) {
		this.diskSize = diskSize;
	}
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	

}
