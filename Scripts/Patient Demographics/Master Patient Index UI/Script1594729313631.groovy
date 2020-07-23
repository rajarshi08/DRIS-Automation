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

WebUI.click(findTestObject('Clinical/Page_Patient Demographics/MPI/a_MPI'))

BannerName = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/MPI/div_Patient Information'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(BannerName, 'Patient Information', true)

MPI_PatientName = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/MPI/div_Patient Name'))

WebUI.verifyMatch(PatientName, MPI_PatientName, true)

List<WebElement> allLabel_list = WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/MPI/label_All label List'), 
    2)

for (WebElement element : allLabel_list) {
    String label = element.getText()

    println('++++++++++ label :' + label)

    if (label.contentEquals('DOB')) {
        WebUI.verifyMatch(label, 'DOB', true)
		continue
    }
    
    if (label.contentEquals('Date of Death')) {
        WebUI.verifyMatch(label, 'Date of Death', true)
		continue
    }
    
    if (label.contentEquals('Sex')) {
        WebUI.verifyMatch(label, 'Sex', true)
		continue
    }
    
    if (label.contentEquals('Marital Status')) {
        WebUI.verifyMatch(label, 'Marital Status', true)
		continue
    }
    
    if (label.contentEquals('Patient Status')) {
        WebUI.verifyMatch(label, 'Patient Status', true)
		continue
    }
    
    if (label.contentEquals('Language')) {
        WebUI.verifyMatch(label, 'Language', true)
		continue
    }
    
    if (label.contentEquals('Race')) {
        WebUI.verifyMatch(label, 'Race', true)
		continue
    }
    
    if (label.contentEquals('Ethnicity')) {
        WebUI.verifyMatch(label, 'Ethnicity', true)
		continue
    }
    
    if (label.contentEquals('Religion')) {
        WebUI.verifyMatch(label, 'Religion', true)
		continue
    }
    
    if (label.contentEquals('Last Updated Date')) {
        WebUI.verifyMatch(label, 'Last Updated Date', true)
		continue
    }
}

CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Patient Demographics - MPI Tab')

