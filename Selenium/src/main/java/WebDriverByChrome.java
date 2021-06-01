import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverByChrome {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bogung\\Desktop\\테스팅\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("http://www.google.co.kr");
        wd.navigate().to("https://github.com/bogyung99");
        wd.navigate().back();

        wd.quit(); // 종료
    }
}
