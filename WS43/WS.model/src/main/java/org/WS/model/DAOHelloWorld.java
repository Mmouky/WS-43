package org.WS.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {

	private static String FileName = "HelloWorld.txt";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;

	private DAOHelloWorld() {
		readFile();
	}

	public static DAOHelloWorld getInstance() {
		if (instance == null) {
			return new DAOHelloWorld();
		} else {
			return instance;
		}
	}

	public static void setInstance(DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}

	private void readFile() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(FileName));
			try {
				String line = br.readLine();
				String msg = "";
				while (line != null) {
					msg += line;
					line = br.readLine();
				}
				br.close();
				this.helloWorldMessage = msg;
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

}
