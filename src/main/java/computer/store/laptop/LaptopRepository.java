package computer.store.laptop;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LaptopRepository extends CrudRepository<Laptop,Integer> {
	public Laptop findByModel(String model); 
	public List<Laptop> findByDiskSize(float diskSize);

}
