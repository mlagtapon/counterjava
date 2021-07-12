package mari.counter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class CounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}
	
}
