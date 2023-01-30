package RunnerClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass;
import com.pom.BookHotel;
import com.pom.LoginPage;
import com.pom.SearchHotelPage;
import com.pom.SelectingHotel;

public class baseDemoRunner extends  BaseClass{
	public static WebDriver driver; 
	public static LoginPage le=new LoginPage(driver);
	public static SearchHotelPage sh=new SearchHotelPage(driver);
	public static SelectingHotel st=new SelectingHotel(driver);
	public static BookHotel bt=new BookHotel(driver);
		public static void main(String[] args) {
			driver=browserLaunch("chrome");
			getUrl("https://adactinhotelapp.com/");
			inputValueElement(le.getUsername() ,"naveenamtech1");
			inputValueElement(le.getPwd(), "Veenasingle@123");
			clickOnElement(le.getLog());
		
			SearchHotelPage sh=new SearchHotelPage(driver);
			dropDown(sh.getLocation(),"New York",5);
			dropDown(sh.getHtl(),"Hotel Cornice",3);
			dropDown(sh.getRoomtype(),"Double", 1);
			dropDown(sh.getRoomnos(), "2", 1);
		inputValueElement(sh.getDp(), "23/01/2023");
		inputValueElement(sh.getDp2(), "24/01/2023");
		dropDown(sh.getAdc(), "adult_room", 1);
		dropDown(sh.getChild(), "child_room", 1);
			clickOnElement(sh.getSub());
			
			SelectingHotel st=new SelectingHotel(driver);
			radioButton(st.getSelect());
			clickOnElement(st.getCt());
			
			BookHotel bt=new BookHotel(driver);
			inputValueElement(bt.getFn(), "Naveena");
			inputValueElement(bt.getFt(),"mathiv");
			inputValueElement(bt.getAdr(),"4/30A,mayiladuthurai");
			inputValueElement(bt.getCct(), "4329 3879 3787 3678");
			dropDown(bt.getCt(),"VISA", 0);
			dropDown(bt.getCt3(), "cc_exp_month",1);
			dropDown(bt.getCt4(), "cc_exp_year", 12);
			inputValueElement(bt.getCt5(),"213");
			clickOnElement(bt.getC6());
		
			
			
	
			WebElement fn = driver.findElement(By.id("first_name"));
			fn.sendKeys("naveena");
		
			WebElement ft = driver.findElement(By.id("last_name"));
			ft.sendKeys("mathiv");
			
			
			WebElement ad = driver.findElement(By.id("address"));
			ad.sendKeys("4/30A,mayiladuthurai");
			
			WebElement cd = driver.findElement(By.id("cc_num"));
			cd.sendKeys("4329 3879 3787 3678");
			
			WebElement cc = driver.findElement(By.id("cc_type"));
			Select s9 = new Select(cc);
			s9.selectByValue("VISA");
			
			WebElement cm = driver.findElement(By.id("cc_exp_month"));
			Select s11 = new Select(cm);
			s11.selectByValue("6");
			
			WebElement yr = driver.findElement(By.id("cc_exp_year"));
			Select s12 = new Select(yr);
			s12.selectByValue("2022");
			
			WebElement cv = driver.findElement(By.id("cc_cvv"));
			cv.sendKeys("351");
			
			WebElement yn = driver.findElement(By.id("book_now"));
			yn.click();
			Thread.sleep(3000);
			TakesScreenshot ts= (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File ds=new File("C:\\Users\\Lenovo\\eclipse-workspace\\naviselenium\\screenshots\\Adact.png");
				FileUtils.copyFile(src, ds);	
			//WebElement wn = driver.findElement(By.id("my_itinerary"));
			//wn.click();*/
		    driver.close();
		}

		private static void dropDown(WebElement location, String type, int i) {
			// TODO Auto-generated method stub
			
		}
	}


