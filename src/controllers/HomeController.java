package controllers;

import view.HomeView;

public class HomeController {
	
	private HomeView hv;
	
	public HomeController() {
		hv = new HomeView();
	}
	
	public void home()
	{
		hv.home();
	}

}