package org.WS.main;

import org.WS.controller.Controller;
import org.WS.model.Model;
import org.WS.view.View;

public class Main {

	public static void main(String[] args) {
		View view = new View();
		Model model = new Model();
		Controller ctrl = new Controller(view, model);
		ctrl.run();
	}

}
