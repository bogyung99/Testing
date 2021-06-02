import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverByChrome {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bogung\\Desktop\\테스팅\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        WebDriverWait w = new WebDriverWait(wd, 3000);

        wd.get("http://www.google.co.kr");
        wd.navigate().to("https://github.com/bogyung99");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        String url = wd.getCurrentUrl();

        System.out.println(url);

        int width = wd.manage().window().getSize().getWidth();
        int height = wd.manage().window().getSize().getHeight();
        wd.manage().window().setSize(new Dimension(1024, 768));
        wd.manage().window().fullscreen();
        wd.manage().window().maximize();


        wd.quit(); // 종료
    }
}
