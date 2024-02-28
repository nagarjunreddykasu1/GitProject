package steps;

import io.cucumber.java.en.Given;

public class Login {
	
	public void setup() {
		System.out.println("setup method");
	}
	
	@Given("I launch the application in chrome browser")
	public void launchApp() {
		System.out.println("application is launched");
	}

}
