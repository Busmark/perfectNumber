package se.oshu.perfectnumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PerfectnumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerfectnumberApplication.class, args);
	}

	@GetMapping("/is_perfect_number")
	public String hello() {
		return "hello Oscar!";
	}
}
