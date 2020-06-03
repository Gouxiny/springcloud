package feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@Autowired
	private ApiService apiService;
	
	@RequestMapping("index0")
	public String index() {
		return apiService.index();
	}
	@RequestMapping("d")
	public String dindex() {
		return "ssss";
	}
}
