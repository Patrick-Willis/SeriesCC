package main.java.controllers;

import main.java.models.MediaCollection;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author Patrick
 * Handles requests for the application home page.
 */
@Controller
public class InitialController {
	
	
	private static final Logger LOG = Logger.getLogger(InitialController.class);
	private MediaCollection myMedia = new MediaCollection();
	
	@RequestMapping(value="/")
	public String home(){
		LOG.info("Using the initial controller");
		myMedia.populateSeries();
		return "WEB-INF/views/home.jsp";
	}
}
