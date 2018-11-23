package computer.store.accesories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AccessoryRepository extends CrudRepository<Accessory,Integer>{
	public Accessory findAccessoryByName(String name);
	public List<Accessory> findAllAccessoryByType(String type);

}
