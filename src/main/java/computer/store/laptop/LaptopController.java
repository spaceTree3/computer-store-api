package computer.store.laptop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
	@Autowired
	private LaptopService service;

	public LaptopService getService() {
		return service;
	}
	
	public void setService(LaptopService service) {
		this.service = service;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/laptops")
	public List<Laptop>getAllLaptops(){
		return this.getService().getAllLaptops();
	}
	
	@RequestMapping(method=RequestMethod.GET,value = "/laptops/search-by", params = "id")
	public Laptop getLaptopById(@RequestParam(value="id") int id) {
		return this.getService().getLaptopById(id);
	}
	
	/* 
	- Using id/{id} -	
	@RequestMapping(method=RequestMethod.GET,value="/laptops/id/{id}")
	public Laptop getLaptopById(@PathVariable int id) {
		return this.getService().getLaptopById(id);
	}
	
	- Using model/{model} -
	@RequestMapping(method=RequestMethod.GET,value="/laptops/model/{model}")
	public Laptop getLaptopByModel(@PathVariable String model) {
		return this.getService().getLaptopByModel(model);
	}
	*/
	
	@RequestMapping(method=RequestMethod.GET,value = "/laptops/search-by", params = "model")
	public Laptop getLaptopByModel(@RequestParam(value="model") String model) {
		return this.getService().getLaptopByModel(model);
	}
	
	/* conflict if used laptops/{id} and without params in RequestMapping Annotation	
	@RequestMapping(method=RequestMethod.GET)
	public Laptop getLaptopByModel(@RequestParam(value="model") String model) {
		return this.getService().getLaptopByModel(model);
	}
	
	*/
	
	@RequestMapping(method=RequestMethod.GET,value="laptops/search-by",params="diskSize")
	public List<Laptop> getLaptopByDiskSize(@RequestParam(value="diskSize") float diskSize) {
		return this.getService().getLaptopByDiskSize(diskSize);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/laptops")
	public void addLaptop(@RequestBody Laptop laptop) {
		this.getService().addLaptop(laptop);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value = "/laptops", params = "id")
	public void updateLaptopWithId(@RequestBody Laptop laptop, @RequestParam(value="id") int id) {
		this.getService().updateLaptopWithId(laptop, id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value = "/laptops", params = "model")
	public void updateLaptopWithModel(@RequestBody Laptop laptop, @RequestParam(value="model") String model) {
		this.getService().updateLaptopWithModel(laptop, model);
	}

	
	/*
	@RequestMapping(method=RequestMethod.PUT,value="laptops/{id}")
	public void updateLaptopWithId(@RequestBody Laptop laptop, @PathVariable int id) {
		this.getService().updateLaptopWithId(laptop, id);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void updateLaptopWithModel(@RequestBody Laptop laptop, @RequestParam(value="model") String model) {
		this.getService().updateLaptopWithModel(laptop, model);
	}
	*/

	
	@RequestMapping(method=RequestMethod.DELETE,value="laptops/{id}")
	public void deleteLaptop(@PathVariable int id) {
		this.getService().deleteLaptop(id);
	}

}
