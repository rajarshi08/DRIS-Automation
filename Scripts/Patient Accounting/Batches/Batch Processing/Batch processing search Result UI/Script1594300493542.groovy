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

WebUI.setText(findTestObject('Patient Accounting/Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Patient Accounting/Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Patient Accounting/Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_DRIS Home Page/span_Login Message'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'DRIS Home Page', true)

WebUI.click(findTestObject('Patient Accounting/Page_DRIS Home Page/a_Patient Accounting'))

WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/Sub_ModuleBar_Links/a_Batches'))

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Batches', true)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Processing/a_Batch Processing'), 2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/a_Batch Processing'))

String text = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Batch Processing/a_Batch Processing'))

WebUI.verifyMatch(text, 'Batch Processing', true)

List <WebElement> label_List = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Batch Processing/label_Label List'),2)


int size = label_List.size()

for (int i = 0; i< label_List.size(); i++){
	
	String label = label_List.get(i).getText()
	
	println('+++++++++++++ label :'+ label)
	
	if (label.contentEquals('System')){
		
		WebUI.verifyMatch(label, 'System', true)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/span_System Field'))
		
		WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_System Dropdown List'), 2)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_System Dropdown List'))
		
		continue
	}
	
	if (label.contentEquals('Facility')){
		
		WebUI.verifyMatch(label, 'Facility', true)
			
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/span_Facility Field'))
		
		WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_Facility Dropdown List'), 2)
		
		//WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_Facility Dropdown List'))
		
		continue
	}
	
	if (label.contentEquals('Financial Class')){
		
		WebUI.verifyMatch(label, 'Financial Class', true)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/span_FinancialClass Field'))
		
		WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_FinancialClass Dropdown List'), 2)
		
		//WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_FinancialClass Dropdown List'))
		
		continue
	}
	
	if (label.contentEquals('Agency')){
		
		WebUI.verifyMatch(label, 'Agency', true)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/span_Agency Field'))
		
		WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_Agency Dropdown List'), 2)
		
		//WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_Agency Dropdown List'))
		
		continue
	}
	
	
	if (label.contentEquals('Agent Code')){
		
		WebUI.verifyMatch(label, 'Agent Code', true)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/input_AgentCode Field'))
		
		WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_AgentCode Dropdown'), 2)
		
		//WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_AgentCode Dropdown'))
		
		continue
	}
	
	if (label.contentEquals('Cycle')){
		
		WebUI.verifyMatch(label, 'Cycle', true)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/span_Cycle Field'))
		
		WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_Cycle Dropdown List'), 2)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_Cycle Dropdown List'))
		
		continue
	}
	
	
	
	if (label.contentEquals('Cycle Step')){
		
		WebUI.verifyMatch(label, 'Cycle Step', true)
		
		WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Processing/input_CycleStep Field'), 2)
		
		continue
	}
	
	
	if (label.contentEquals('Bad Debt')){
		
		WebUI.verifyMatch(label, 'Bad Debt', true)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/span_BadDebt Field'))
		
		WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_BadDebt Dropdown List'), 2)
		
		//WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_BadDebt Dropdown List'))
		
		continue
	}
	
	
	
	if (label.contentEquals('Max Amount')){
		
		WebUI.verifyMatch(label, 'Max Amount', true)
		
		WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Processing/input_MaxAmount Field'), 2)
		
		continue
	}
	
	if (label.contentEquals('Current Plan')){
		
		WebUI.verifyMatch(label, 'Current Plan', true)
		
		//WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/input_CurrentPlan Field'))
		
		//WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_CurrentPlan Dropdown'), 2)
		
		//WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/li_CurrentPlan Dropdown'))
		
		continue
	}
	
}


WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Processing/button_Search'), 2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Processing/button_Search'))

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Processing/button_Clear'), 2)

String time = java.time.LocalDateTime.now()

WebUI.takeScreenshot('D:\\katalonScreenshots\\BatchProcessingSearchResultgrid.png')

//WebUI.takeScreenshot('D:\\katalonScreenshots\\'+time+'\\BatchProcessingSearchResultgrid.png')

//WebUI.takeScreenshot('C:\\Users\\rahul.nalawade\\git\\DRIS-Automation\\Data Files\\'+time+'.png')



