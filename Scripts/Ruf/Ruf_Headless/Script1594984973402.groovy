import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.WebElement
import org.openqa.selenium.Capabilities

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.DesiredCapabilities;

import com.kms.katalon.core.webui.driver.DriverFactory

//System.setSytemProperty('webdriver.firefox.logfile', 'C:/temp/firefoxdriver.log')

//setProperty("", class)

//setProperty("webdriver.firefox.logfile", class)


//System.setProperty("webdriver.firefox.logfile", "D:\\Katalon_Studio_Windows_64-7.4.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe")

String path = DriverFactory.getGeckoDriverPath()

println(path)



/*System.setProperty("webdriver.gecko.driver","D:\\Katalon_Studio_Windows_64-7.4.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe" );
//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//capabilities.setCapability("marionette",true);
//WebDriver driver= new FirefoxDriver(capabilities);

File firefoxfile = new File('D:\\Katalon_Studio_Windows_64-7.4.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe') 

FirefoxBinary firefoxbinary = new FirefoxBinary(firefoxfile)

FirefoxOptions firefoxoptions = new FirefoxOptions()
firefoxoptions.setBinary(firefoxbinary)
firefoxoptions.setLogLevel(FirefoxDriverLogLevel.TRACE)

WebDriver driver = new FirefoxDriver(firefoxoptions)*/


System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Gecko\\geckodriver.exe");
DesiredCapabilities dc = new DesiredCapabilities();
dc.setCapability("marionatte", false);
FirefoxOptions opt = new FirefoxOptions();
opt.merge(dc);
FirefoxDriver driver =  new FirefoxDriver(opt);
driver.get("https://stackoverflow.com");
System.out.println("Application opened");
System.out.println("Page Title is : "+driver.getTitle());


//WebUI.openBrowser('')

/*WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.maximizeWindow()

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Log in', true)

WebUI.setText(findTestObject('Clinical/Page_Log in/input_UserName Field'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Clinical/Page_Log in/input_Password Field'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Patient Accounting/Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_DRIS Home Page/span_Close'))

WebUI.delay(10)

WebUI.click(findTestObject('Patient Accounting/Page_DRIS Home Page/a_Patient Accounting'))
*/
