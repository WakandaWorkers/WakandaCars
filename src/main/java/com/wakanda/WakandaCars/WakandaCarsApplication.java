package com.wakanda.WakandaCars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WakandaCarsApplication extends SpringBootServletInitializer {
	private static final Logger logger = LoggerFactory.getLogger(WakandaCarsApplication.class);

	public static void main(String[] args) {
		info(logger);
		SpringApplication.run(WakandaCarsApplication.class, args);
	}

	/**
	 * Creates a nice banner string for this application.
	 */
	private static void info(Logger log) {
		log.info(" _    _         _                       _          _    _               _                     \n"
				+ "| |  | |       | |                     | |        | |  | |             | |                    \n"
				+ "| |  | |  __ _ | | __  __ _  _ __    __| |  __ _  | |  | |  ___   _ __ | | __  ___  _ __  ___ \n"
				+ "| |/\\| | / _` || |/ / / _` || '_ \\  / _` | / _` | | |/\\| | / _ \\ | '__|| |/ / / _ \\| '__|/ __|\n"
				+ "\\  /\\  /| (_| ||   < | (_| || | | || (_| || (_| | \\  /\\  /| (_) || |   |   < |  __/| |   \\__ \\\n"
				+ " \\/  \\/  \\__,_||_|\\_\\ \\__,_||_| |_| \\__,_| \\__,_|  \\/  \\/  \\___/ |_|   |_|\\_\\ \\___||_|   |___/"
				+ "	Coding Challenge...");
	}

}
