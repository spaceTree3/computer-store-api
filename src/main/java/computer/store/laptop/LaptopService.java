package computer.store.laptop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
	@Autowired
	private LaptopRepository laptopRepository;
	
	public LaptopRepository getLaptopRepository() {
		return laptopRepository;
	}
	
	public void setLaptopRepository(LaptopRepository laptopRepository) {
		this.laptopRepository = laptopRepository;
	}
	
	public void addLaptop(Laptop laptop) {
		this.getLaptopRepository().save(laptop);
	}
	
	public List<Laptop>getAllLaptops(){
		List<Laptop> laptops=new ArrayList<Laptop>();
		this.getLaptopRepository().findAll().forEach(laptops::add);
		return laptops;
	}
	
	public Laptop getLaptopById(int id) {
		return this.getLaptopRepository().findById(id).get();
	}
	
	public Laptop getLaptopByModel(String model) {
		return this.getLaptopRepository().findByModel(model);
	}
	
	public List<Laptop> getLaptopByDiskSize(float diskSize) {
		return this.getLaptopRepository().findByDiskSize(diskSize);
	}
		
	public void updateLaptopWithId(Laptop laptop, int id) {
		this.getLaptopRepository().save(laptop);
	}
	
	public void updateLaptopWithModel(Laptop laptop, String model) {
		this.getLaptopRepository().save(laptop);
	}

	
	public void deleteLaptop(int id) {
		this.getLaptopRepository().deleteById(id);
	}
	

}
