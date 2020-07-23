import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.WebElement

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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Log in/input_User Name_UserName'), 
    'rnalawade')

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Log in/input_Password_Password'), 
    'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.delay(2)

WebUI.click(findTestObject('Patient Accounting/Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.delay(6)

WebUI.click(findTestObject('Patient Accounting/Page_DRIS Home Page/a_Patient Accounting'))

WebUI.delay(2)

Title = WebUI.getWindowTitle()

WebUI.verifyMatch(Title, 'Patient Accounting Search', true)

WebUI.setText(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Search/input_Last Name_LastName'), 
    GlobalVariable.LastName)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Search/button_Search'))

WebUI.delay(2)

var = WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Patient Accounting Search/div_Search ResultsSystemMRNEMPIPatient Name_a188e2'), 
    2)

if (var) {
	PatientName = WebUI.getText(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'))
	
	println("++++++++ PatientName : "+PatientName)
	
	WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'))
	
	Title = WebUI.getWindowTitle()
	
	WebUI.verifyMatch(Title, 'Account Summary', true)
	
	WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/span_Select Reason for Break the glass'))
	
	WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/li_Direct Patient Care'))
	
	WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/button_BTG'))
	
	WebUI.delay(2)
	
	String BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/Accouts Tab/span_BannerName'))
	
	WebUI.verifyMatch(BannerName, 'Accounts', true)
	
	WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Account Summary/Accouts Tab/button_Export'), 2)
	
	List <WebElement> ColumnHeaderName_List = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Account Summary/Accouts Tab/div_Column Header Name_List'),2)
	
	for(WebElement element : ColumnHeaderName_List){
		
		String ColumnHeaderName_text = element.getText()
		
		println('+++++++ ColumnHeaderName_text :'+ ColumnHeaderName_text)
		
		if (ColumnHeaderName_text.contentEquals('System')){
			
			WebUI.verifyMatch(ColumnHeaderName_text, 'System', true)
			
			continue
		}
		
		if (ColumnHeaderName_text.contentEquals('Group')){
			
			WebUI.verifyMatch(ColumnHeaderName_text, 'Group', true)
			continue
		}
		
		if (ColumnHeaderName_text.contentEquals('Account Number')){
			
			WebUI.verifyMatch(ColumnHeaderName_text, 'Account Number', true)
			continue
		}
		
		if (ColumnHeaderName_text.contentEquals('Admit Date')){
			
			WebUI.verifyMatch(ColumnHeaderName_text, 'Admit Date', true)
			continue
		}
		
		if (ColumnHeaderName_text.contentEquals('Discharge Date')){
			
			WebUI.verifyMatch(ColumnHeaderName_text, 'Discharge Date', true)
			continue
		}
		
		if (ColumnHeaderName_text.contentEquals('Charge')){
			
			WebUI.verifyMatch(ColumnHeaderName_text, 'Charge', true)
			continue
		}
		
		if (ColumnHeaderName_text.contentEquals('Balance')){
			
			WebUI.verifyMatch(ColumnHeaderName_text, 'Balance', true)
			continue
		}
		
		if (ColumnHeaderName_text.contentEquals('Last Statement Balance')){
			
			WebUI.verifyMatch(ColumnHeaderName_text, 'Last Statement Balance', true)
			continue
		}
		
		if (ColumnHeaderName_text.contentEquals('Patient Type')){
			
			WebUI.verifyMatch(ColumnHeaderName_text, 'Patient Type', true)
			continue
		}
		
		if (ColumnHeaderName_text.contentEquals('FC')){
			
			WebUI.verifyMatch(ColumnHeaderName_text, 'FC', true)
			continue
		}
		
		if (ColumnHeaderName_text.contentEquals('Visit Service')){
			
			WebUI.verifyMatch(ColumnHeaderName_text, 'Visit Service', true)
			continue
		}
		
	}
}

