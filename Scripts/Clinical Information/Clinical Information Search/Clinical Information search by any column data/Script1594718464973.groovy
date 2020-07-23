import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.WebElement as WebElement
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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.maximizeWindow()

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Log in', true)

WebUI.setText(findTestObject('Clinical/Page_Log in/input_UserName Field'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Clinical/Page_Log in/input_Password Field'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Patient Accounting/Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_DRIS Home Page/span_Login Message'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'DRIS Home Page', true)

WebUI.click(findTestObject('Clinical/Page_DRIS Home Page/a_Clinical Module'))

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Search', true)

WebUI.setText(findTestObject('Clinical/Page_Search/input_Last Name'), GlobalVariable.LastName)

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Search/button_Clear'), 2)

WebUI.click(findTestObject('Clinical/Page_Search/button_Search'))

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Search/span_Search Results Grid Banner Name'), 2)

BannerName = WebUI.getText(findTestObject('Clinical/Page_Search/span_Search Results Grid Banner Name'))

WebUI.verifyMatch(BannerName, 'Search Results', true)

WebUI.click(findTestObject('Clinical/Page_Search/a_PatientLink of First Row'))

boolean bool = WebUI.verifyElementPresent(findTestObject('Clinical/Page_Search/button_Yes'), 2)

if (bool) {
    WebUI.click(findTestObject('Clinical/Page_Search/button_Yes'))
}

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Clinical Information/div_BTG Alert Message'), 2)

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Clinical Information/span_Select Reason for Break the glass'), 
    2)

WebUI.click(findTestObject('Clinical/Page_Clinical Information/span_Select Reason for Break the glass'))

WebUI.click(findTestObject('Clinical/Page_Clinical Information/li_BTG Reason_Investigation'))

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Clinical Information/button_BTG'), 2)

WebUI.click(findTestObject('Clinical/Page_Clinical Information/button_BTG'))

bool = WebUI.verifyElementPresent(findTestObject('Clinical/Page_Clinical Information/div_System Label'), 2)

if (bool) {
    String label = WebUI.getText(findTestObject('Clinical/Page_Clinical Information/div_System Label'))

    WebUI.verifyMatch(label, 'System', true)
}

WebUI.click(findTestObject('Clinical/Page_Clinical Information/span_System'))

String systemName = WebUI.getText(findTestObject('Clinical/Page_Clinical Information/li_Cerner'))

WebUI.click(findTestObject('Clinical/Page_Clinical Information/li_Cerner'))

CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Clinical Information search- SystemSearch')

List<WebElement> systemColumn_list = WebUI.findWebElements(findTestObject('Clinical/Page_Clinical Information/Problem List/td_System Column'), 
    2)

for (WebElement element : systemColumn_list) {
    String sysName = element.getText()

    println('+++++++++ sysName :' + sysName)

    if (sysName.contentEquals(systemName)) {
        WebUI.verifyMatch(sysName, systemName, true)
    }
}

WebUI.click(findTestObject('Clinical/Page_Clinical Information/span_System'))

WebUI.click(findTestObject('Clinical/Page_Clinical Information/div_System Dropdown_All'))

WebUI.delay(5)

severityText = WebUI.getText(findTestObject('Clinical/Page_Clinical Information/Problem List/td_Severity Column'))

WebUI.setText(findTestObject('Clinical/Page_Clinical Information/input_Global Search'), severityText)

WebUI.click(findTestObject('Clinical/Page_Clinical Information/button_Search'))

CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Clinical Information search- Search')

severityTextAF = WebUI.getText(findTestObject('Clinical/Page_Clinical Information/Problem List/td_Severity Column'))

WebUI.verifyMatch(severityText, severityTextAF, true)

WebUI.click(findTestObject('Clinical/Page_Clinical Information/button_Clear'))

CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Clinical Information search- Clear')

