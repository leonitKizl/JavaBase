package Interfejs;

public class FirefoxDriver implements Webdriver {

    @Override
    public void get() {
        System.out.println("Firefox - " + driver);

    }

    @Override
    public void findElementBy() {
        System.out.println("Finf el in firefox");

    }
}
