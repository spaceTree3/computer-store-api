package computer.store.accesories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessoryService {
	@Autowired
	private AccessoryRepository accessoryRepository;

	public AccessoryRepository getAccessoryRepository() {
		return accessoryRepository;
	}

	public void setAccessoryRepository(AccessoryRepository accessoryRepository) {
		this.accessoryRepository = accessoryRepository;
	}
	
	public void addAccessory(Accessory accessory) {
		this.getAccessoryRepository().save(accessory);
	}
	
	public List<Accessory> getAllAccessories(){
		List<Accessory> accessories = new ArrayList<Accessory>();
		this.getAccessoryRepository().findAll().forEach(accessories::add);
		return accessories;
	}
	
	public Accessory getAccessoryById(int id) {
		return this.getAccessoryRepository().findById(id).get();
	}
	
	public Accessory getAccessoryByName(String name) {
		return this.getAccessoryRepository().findAccessoryByName(name);
	}
	
	public List<Accessory> getAllAccessoryByType(String type){
		return this.getAccessoryRepository().findAllAccessoryByType(type);
	}
	
	public void updateAccessory(Accessory accessory,int id) {
		this.getAccessoryRepository().save(accessory);
	}
	
	public void deleteAccessory(int id) {
		this.getAccessoryRepository().deleteById(id);
	}

}
