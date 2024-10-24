package in.balu.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MsgService {
	private Logger logger =  LoggerFactory.getLogger(MsgService.class);
	public String getWelcome() {
		logger.info("getWelcomeMsg() - started...");
		String msg = "Welcome to Logging";
		logger.info("getWelcomeMsg() - ended...");
		return msg;
	}
}
