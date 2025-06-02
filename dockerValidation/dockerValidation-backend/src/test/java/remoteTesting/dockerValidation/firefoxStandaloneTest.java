package remoteTesting.dockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class firefoxStandaloneTest {

		@SuppressWarnings("deprecation")
		public static void main (String[] args) throws MalformedURLException {
			
			//Remote Web driver port: 4444
			//DesiredCapabilities cap = DesiredCapabilities.chrome(); // run the chrome browser or Firefox()
			//ChromeOptions options = new ChromeOptions();
			FirefoxOptions options = new FirefoxOptions();

			URL ur = new URL("http://localhost:4444/wd/hub"); //which port our test cases need to run
			
			RemoteWebDriver driver = new RemoteWebDriver (ur, options);
			// to land on a web page
			
			driver.get("https://www.mozilla.org");
			System.out.println(driver.getTitle());
			
			// If we want to use the firefox container we can use similar way and if 4444 is in use , take another port available or stop the running one to reuse again
			
		}

}
