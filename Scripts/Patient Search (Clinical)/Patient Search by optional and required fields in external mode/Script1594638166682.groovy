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
import org.openqa.selenium.Keys as Keys

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

WebUI.click(findTestObject('Clinical/Page_Clinical Information/span_Select Reason for Break the glass'))

WebUI.click(findTestObject('Clinical/Page_Clinical Information/li_BTG Reason_Investigation'))

WebUI.click(findTestObject('Clinical/Page_Clinical Information/button_BTG'))

WebUI.delay(2)

WebUI.click(findTestObject('Clinical/Page_Clinical Information/Encounters/a_Encounters Tab'))

String EncounterNumber = WebUI.getText(findTestObject('Clinical/Page_Clinical Information/Encounters/td_First Encounter Number'))

println('+++++++++++ EncounterNumber :' + EncounterNumber)

WebUI.click(findTestObject('Clinical/Sub Module Bar/a_Patient Demographics'))

WebUI.click(findTestObject('Clinical/Page_Patient Demographics/Registration/a_Registration'))

BannerName = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/span_Registration Grid_ Banner Name'))

WebUI.verifyMatch(BannerName, 'Registration', true)

String LastName = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/td_Last Name'))

String FirstName = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/td_First Name'))

MiddleName = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/td_Middle Name'))

String MRN = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/td_MRN'))

String System = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/td_System'))

String SSN = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/td_SSN'))

String DOB = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/td_DOB'))

println((((((((((('+++++ Last Name :' + LastName) + '+++++++ FirstName :') + FirstName) + '++++MRN :') + MRN) + '+++++++ System :') + 
    System) + '++++++ SSN :') + SSN) + '+++++ DOB :') + DOB)

WebUI.click(findTestObject('Clinical/Sub Module Bar/a_Search'))

WebUI.setText(findTestObject('Clinical/Page_Search/input_Last Name'), LastName)

WebUI.setText(findTestObject('Clinical/Page_Search/input_First Name'), FirstName)

WebUI.setText(findTestObject('Clinical/Page_Search/input_Middle Name'), MiddleName)

WebUI.setText(findTestObject('Clinical/Page_Search/input_DOB'), DOB)

WebUI.setText(findTestObject('Clinical/Page_Search/input_MRNEMPI'), MRN)

WebUI.setText(findTestObject('Clinical/Page_Search/input_SSN'), SSN)

WebUI.setText(findTestObject('Clinical/Page_Search/input_Encounter Number'), EncounterNumber)

WebUI.click(findTestObject('Clinical/Page_Search/input_System Multiselect Field'))

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Search/li_System_First Option'), 2)

WebUI.click(findTestObject('Clinical/Page_Search/li_System_First Option'))

//WebUI.sendKeys(findTestObject('Clinical/Page_Search/input_System Multiselect Field'), Keys.chord(Keys.ARROW_DOWN))

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Search/button_Clear'), 2)

WebUI.click(findTestObject('Clinical/Page_Search/button_Search'))

List<WebElement> columnHeader_list = WebUI.findWebElements(findTestObject('Clinical/Page_Search/a_Search Result Grid_Column Header List'), 
    2)

for (WebElement element : columnHeader_list) {
    String columnHeader_text = element.getText()

    println('++++ columnHeader_text :' + columnHeader_text)

    if (columnHeader_text.contentEquals('System')) {
        WebUI.verifyMatch(columnHeader_text, 'System', true)

        continue
    }
    
    if (columnHeader_text.contentEquals('MRN/EMPI')) {
        WebUI.verifyMatch(columnHeader_text, 'MRN/EMPI', true)

        continue
    }
    
    if (columnHeader_text.contentEquals('Patient Name')) {
        WebUI.verifyMatch(columnHeader_text, 'Patient Name', true)

        continue
    }
    
    if (columnHeader_text.contentEquals('DOB')) {
        WebUI.verifyMatch(columnHeader_text, 'DOB', true)

        continue
    }
    
    if (columnHeader_text.contentEquals('SSN')) {
        WebUI.verifyMatch(columnHeader_text, 'SSN', true)

        continue
    }
    
    if (columnHeader_text.contentEquals('Gender')) {
        WebUI.verifyMatch(columnHeader_text, 'Gender', true)

        continue
    }
    
    if (columnHeader_text.contentEquals('Phone')) {
        WebUI.verifyMatch(columnHeader_text, 'Phone', true)

        continue
    }
    
    if (columnHeader_text.contentEquals('Zipcode')) {
        WebUI.verifyMatch(columnHeader_text, 'Zipcode', true)

        continue
    }
    
    if (columnHeader_text.contentEquals('Historical MRN Match')) {
        WebUI.verifyMatch(columnHeader_text, 'Historical MRN Match', true)

        continue
    }
}

CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Clinical Patient Search')

