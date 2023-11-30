
package sg.ntu.edu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	// SampleItem item = new SampleItem();

	@Autowired
	private SampleItem item;

	@Value("${server.port}")
	private String port;

	@GetMapping("/port")
	public String getPort() {
		return "Server port: " + port;
	}

	@GetMapping("/item")
	public SampleItem getItem() {
		item.setId(1);
		item.setName("Apple");
		item.setPrice(1.99);
		item.setDesc("A red apple");
		return item;
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}

	@GetMapping("/greet")
	public String greet(@RequestParam(defaultValue = "Bruce") String name,
			@RequestParam(defaultValue = "unknown") String role) {
		return "Hello " + name + "! You are a " + role + "!";
	}

	@GetMapping("/users/{id}")
	public String getUser(@PathVariable int id) {
		return "User ID: " + id;
	}

	@GetMapping("/products")
	public String getProductPage(@RequestParam(required = false) String search) {
		if (search != null) {
			return "You have searched for " + search;
		} else {
			return "This is the product page.";
		}

	}

	

}
