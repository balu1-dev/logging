package in.balu.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.balu.service.MsgService;
@RestController
public class MsgRestController {
	@Autowired
	private MsgService service;
	@GetMapping("/welcome")
	public String getMsg() {
		return service.getWelcome();
	}
}
