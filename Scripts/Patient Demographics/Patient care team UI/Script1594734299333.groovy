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

PatientName = WebUI.getText(findTestObject('Clinical/Page_Search/a_PatientLink of First Row'))

WebUI.click(findTestObject('Clinical/Page_Search/a_PatientLink of First Row'))

boolean bool = WebUI.verifyElementPresent(findTestObject('Clinical/Page_Search/button_Yes'), 2)

if (bool) {
    WebUI.click(findTestObject('Clinical/Page_Search/button_Yes'))
}

WebUI.delay(5)

WebUI.click(findTestObject('Clinical/Sub Module Bar/a_Patient Demographics'))

WebUI.click(findTestObject('Clinical/Page_Patient Demographics/Care Team/a_Care Team'))

BannerName = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Care Team/span_Care Team Tab_Banner Name'))

WebUI.verifyMatch(BannerName, 'Care Team', true)

List<WebElement> columnHeader_List = WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/Care Team/a_Column Header List'), 
    2)

for (WebElement element : columnHeader_List) {
    String columnHeader = element.getText()

    println('++++++++++++ columnHeader :' + columnHeader)

    if (columnHeader.contentEquals('System')) {
        WebUI.verifyMatch(columnHeader, 'System', true)

        continue
    }
    
    if (columnHeader.contentEquals('Role')) {
        WebUI.verifyMatch(columnHeader, 'Role', true)

        continue
    }
    
    if (columnHeader.contentEquals('Name')) {
        WebUI.verifyMatch(columnHeader, 'Name', true)

        continue
    }
    
    if (columnHeader.contentEquals('BeginDate')) {
        WebUI.verifyMatch(columnHeader, 'BeginDate', true)

        continue
    }
    
    if (columnHeader.contentEquals('EndDate')) {
        WebUI.verifyMatch(columnHeader, 'EndDate', true)

        continue
    }
    
    if (columnHeader.contentEquals('Status')) {
        WebUI.verifyMatch(columnHeader, 'Status', true)

        continue
    }
    
    if (columnHeader.contentEquals('Fax Number')) {
        WebUI.verifyMatch(columnHeader, 'Fax Number', true)

        continue
    }
    
    if (columnHeader.contentEquals('Pager Number')) {
        WebUI.verifyMatch(columnHeader, 'Pager Number', true)

        continue
    }
    
    if (columnHeader.contentEquals('Email Address')) {
        WebUI.verifyMatch(columnHeader, 'Email Address', true)

        continue
    }
    
    if (columnHeader.contentEquals('Location')) {
        WebUI.verifyMatch(columnHeader, 'Location', true)

        continue
    }
    
    if (columnHeader.contentEquals('Phone Number')) {
        WebUI.verifyMatch(columnHeader, 'Phone Number', true)

        continue
    }
}

CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Patient Demographocs - Care Team')

WebUI.click(findTestObject('Clinical/Page_Patient Demographics/Care Team/button_Export'))

