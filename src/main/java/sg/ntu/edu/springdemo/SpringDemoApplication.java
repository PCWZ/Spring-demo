package sg.ntu.edu.springdemo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
// @RestController
public class SpringDemoApplication {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(SpringDemoApplication.class); // Name this according to your class name

	public static void main(String[] args) {
		logger.info("🟢 Starting MySpringbootProjectApplication");
		logger.warn("🟠 Test Warning");
		logger.error("🔴 Error Warning");
		SpringApplication.run(SpringDemoApplication.class, args);
	}


	// @GetMapping("/hello")
	// public String hello() {
	// 	return "Hello World!";
	// }

	// // @GetMapping("/greet")
	// // public String greet(@RequestParam String name) {
	// // return "Hello " + name + "!";
	// // }

	// @GetMapping("/greet")
	// public String greet(@RequestParam(defaultValue = "Bruce") String name,
	// 		@RequestParam(defaultValue = "unknown") String role) {
	// 	return "Hello " + name + "! You are a " + role + "!";
	// }

	// @GetMapping("/users/{id}")
	// public String getUser(@PathVariable int id) {
	// 	return "User ID: " + id;
	// }

	// @GetMapping("/products")
	// public String getProductPage(@RequestParam(required = false) String search) {
	// 	if (search != null){
	// 		return "You have searched for " + search;
	// 	} else {
	// 		return "This is the product page.";
	// 	}
		
	// }

}
