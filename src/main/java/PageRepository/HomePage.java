package PageRepository;

import org.openqa.selenium.WebDriver;

import utility.AbstractComponent;
//import utility.LogUtils;

public class HomePage extends AbstractComponent  {
	WebDriver driver;
	int a=5;

	int conflict =0;
	 
	
	
	public HomePage(WebDriver driver) {
        super(driver);
		this.driver=driver;
		//LogUtils.info("homepage login");
		//
		//
	}

	
	

	
	

}
