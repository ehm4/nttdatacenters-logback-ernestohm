package com.nttdata.nttdatacenters_logback_ernestohm;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * Main method NTT.
 * 
 * @author ehm11
 *
 */
public class App {
	/** LOGGER */
	private static final Logger log = LoggerFactory.getLogger(App.class);

	/**
	 * Principal method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		log.info("Inicio del método");
		// List initialization.
		List<String> list = new ArrayList<String>();
		// Variable's generation.
		final String name = "Hola";
		for (int i = 0; i < 50000; i++) {
			log.debug("{}", name);
		}
		log.info("Final del método");
	}

	/**
	 * Method to know if it is blank or not
	 * 
	 * @param n
	 * @return String - indicates whether it is blank or not
	 */
	public static String EstaenBlanco(String n) {
		if (StringUtils.isNotBlank(n)) {
			// If it's not empty or full of spaces.
			return "No está en blanco";
		} else {
			// If it's empty or full of spaces.
			return "Está en blanco";
		}
	}
}
