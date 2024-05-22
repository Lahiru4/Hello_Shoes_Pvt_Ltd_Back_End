package lk.ijse.gdse.aad_filal_projdet;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/shoe")
public class ShoeShopApplication {
	@GetMapping("/shopStart")
	public String start(){
		return "Start";
	}

	public static void main(String[] args) {
		SpringApplication.run(ShoeShopApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
