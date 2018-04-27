package org.WS.view;

import org.WS.contract.IView;

public class View implements IView{

	public void displayMessage(String message) {
		System.out.println(message);
	}

}
