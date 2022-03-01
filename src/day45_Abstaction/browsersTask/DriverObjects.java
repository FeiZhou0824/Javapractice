package day45_Abstaction.browsersTask;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver chrome = new ChromeDriver();
        FireFoxDriver fireFox = new FireFoxDriver();
        EdgeDriver edge = new EdgeDriver();
        SafariDriver safari = new SafariDriver();
        OperaDriver opera = new OperaDriver();

        chrome.close();
        chrome.findElement("By tagName: h3");
        chrome.get("https:// www.google.com");
        chrome.getTitle();
        chrome.executeScript("JavaScript");



    }




}
