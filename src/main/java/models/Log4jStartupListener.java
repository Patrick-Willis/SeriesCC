package main.java.models;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jStartupListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		// Cleanup code goes here
	}

	public void contextInitialized(ServletContextEvent sce) {
		Logger logger = null;
		ServletContext servletContext = sce.getServletContext();
		String log4jFile = servletContext.getInitParameter("log4jConfig.xml");
		DOMConfigurator.configure(log4jFile);
		logger = LogManager.getLogger(Log4jStartupListener.class.getName());
		logger.debug("Loaded: " + log4jFile);
	}

}
