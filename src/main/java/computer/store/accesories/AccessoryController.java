package computer.store.accesories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //requestBody included
public class AccessoryController {
	@Autowired
	private AccessoryService accessoryService;
	
	@RequestMapping(method=RequestMethod.POST,value="/accessories")
	public void addAccessory(@RequestBody Accessory accessory) {
		this.accessoryService.addAccessory(accessory);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/accessories")
	public List<Accessory> getAllAccessories(){
		return this.accessoryService.getAllAccessories();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/accessories/search-by",params="id")
	public Accessory getAccessoryById(@RequestParam(value="id") int id) {
		return this.accessoryService.getAccessoryById(id);
	}
	@RequestMapping(method=RequestMethod.GET,value="/accessories/search-by",params="name")
	public Accessory getAccessoryByName(@RequestParam(value="name") String name) {
		return this.accessoryService.getAccessoryByName(name);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/accessories/search-by",params="type")
	public List<Accessory> getAllAccessoryByType(@RequestParam(value="type") String type){
		return this.accessoryService.getAllAccessoryByType(type);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/accessories/{id}")
	public void updateAccessory(@RequestBody Accessory accessory, @PathVariable int id) {
		this.accessoryService.updateAccessory(accessory,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/accessories/{id}")
	public void deleteAccessory(@PathVariable int id) {
		this.accessoryService.deleteAccessory(id);
	}
}
