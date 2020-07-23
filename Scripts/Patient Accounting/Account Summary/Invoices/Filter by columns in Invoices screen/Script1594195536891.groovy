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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

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
	
	WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/span_Select Reason for Break the glass'))
	
	WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/li_Direct Patient Care'))
	
	WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/button_BTG'))
	
	WebUI.delay(2)
	
	List<WebElement> FilterIcon_List = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Account Summary/Accouts Tab/div_FilterIcon_List'),2)
	
	List <WebElement> ColumnHeaderName_List = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Account Summary/Accouts Tab/div_Column Header Name_List'),2)
	
	int size = ColumnHeaderName_List.size()
	
	for (int i = 0;i<size;i++){
		
		//WebElement columnsName, filter
		
		String columnsName = ColumnHeaderName_List.get(i).getText()
		
		WebElement ele = FilterIcon_List.get(i)
		
		println('++++++++ columnsName :'+columnsName)
		
		if (columnsName.contentEquals('System')){
			//FilterIcon_List.get(i).click()
			ele.click()
		}
		
		if (columnsName.contentEquals('Group')){
			FilterIcon_List.get(i).click()
		}
		
		if (columnsName.contentEquals('Account Number')){
			FilterIcon_List.get(i).click()
			break
		}
		
		WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/button_GlobalClear'))
		
		WebUI.delay(2)
	}
	
	
}
