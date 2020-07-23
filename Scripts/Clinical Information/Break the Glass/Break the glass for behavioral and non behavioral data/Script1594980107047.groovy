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

List<WebElement> btgReason_list = WebUI.findWebElements(findTestObject('Clinical/Page_Clinical Information/li_BTG Reason List'),
	2)

for (WebElement btgReason : btgReason_list){
	
	String  btgReason_text = btgReason.getText()
	
	println('+++++++++++++ btgReason_text :'+btgReason_text)
	
	if(btgReason_text.contentEquals('Billing')){
		WebUI.verifyMatch(btgReason_text, 'Billing', false)
		continue
	}
	
	if(btgReason_text.contentEquals('Direct Patient Care')){
		WebUI.verifyMatch(btgReason_text, 'Direct Patient Care', false)
		continue
	}
	
	if(btgReason_text.contentEquals('Investigation')){
		WebUI.verifyMatch(btgReason_text, 'Investigation', false)
		continue
	}
	
	if(btgReason_text.contentEquals('Record Review')){
		WebUI.verifyMatch(btgReason_text, 'Record Review', false)
		continue
	}
	
	if(btgReason_text.contentEquals('Scheduling')){
		WebUI.verifyMatch(btgReason_text, 'Scheduling', false)
		continue
	}
	
	if(btgReason_text.contentEquals('Release of Information')){
		WebUI.verifyMatch(btgReason_text, 'Release of Information', false)
		continue
	}
	
	if(btgReason_text.contentEquals('Other')){
		WebUI.verifyMatch(btgReason_text, 'Other', false)
		continue
	}
}


WebUI.click(findTestObject('Clinical/Page_Clinical Information/li_BTG Reason_Investigation'))

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Clinical Information/button_BTG'), 2)

WebUI.click(findTestObject('Clinical/Page_Clinical Information/button_BTG'))

