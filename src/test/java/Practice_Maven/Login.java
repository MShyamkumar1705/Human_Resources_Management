package Practice_Maven;

import org.testng.annotations.Test;

public class Login {
	@Test
	public void loginApplicationn() {
	
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
				
	}

}
