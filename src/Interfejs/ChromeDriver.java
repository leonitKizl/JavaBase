package Interfejs;

public class ChromeDriver implements Webdriver{

    @Override
    public void get() {
        System.out.println("Chrome - " + driver);
    }

    @Override
    public void findElementBy() {
        System.out.println("Find el in Chrome");

    }
}
