package Interfejs;

import HomeWorkExeption.LessThan18Exeption;

public class WebDriverTest {



    private static Webdriver getDriver(String name) throws LessThan18Exeption {
        if (name.equals("chrome")){
            return new ChromeDriver();
        }else if (name.equals("firefox")){
            return new FirefoxDriver();
        }else {
            throw new LessThan18Exeption("Webdriver doesnt exist");
        }
    }

    public static void main(String[] args) throws LessThan18Exeption {
        Webdriver driver = getDriver("chrome");
        driver.get();
        driver.findElementBy();

        Webdriver secDriver = getDriver("firefox");
        secDriver.get();
        secDriver.findElementBy();
    }
}
