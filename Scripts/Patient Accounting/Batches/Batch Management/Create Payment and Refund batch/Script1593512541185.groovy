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

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_Batches'), 
    2)

String BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_Batches'))

WebUI.verifyMatch(BannerName, 'Batches', true)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Close Selected_Button'),2)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Push Selected_Button'),2)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Add new record_GLBatch-help_ICON'),2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Add new record_GLBatch-help_ICON'))

//boolean bool = WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_GL Batch Help_List'), 2)

List <WebElement> GLBatchHelp_List = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_GL Batch Help_List'),2)

String text

for(WebElement element : GLBatchHelp_List){
	
	text = element.getText()
	
	text = text.substring(0, text.indexOf(':'))
	
	println('++++++text :'+text+':++++++++')
	
	if (text.equals('GL Year Start Month :')){
		WebUI.verifyMatch(text, 'GL Year Start Month :', true)
	}
	
	if (text.equals('GL Month Start Date :')){
		WebUI.verifyMatch(text, 'GL Month Start Date :', true)
	}
	
	if (text.equals('Assign Window (Days) :')){
		WebUI.verifyMatch(text, 'Assign Window (Days) :', true)
	}
}

'Create Payment type batch'

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Add new record-Button'))

List <WebElement> ColumnHeader = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_ColumnHeader_List'),2)

String ColumnHeader_text

for(WebElement element : ColumnHeader){
	
	ColumnHeader_text = element.getText()
	
	println('+++++++++ColumnHeader_text :'+ ColumnHeader_text)
	
	if(ColumnHeader_text.contentEquals('Batch #')){
		
		WebUI.verifyMatch(ColumnHeader_text, 'Batch #', true)
		
	}
	
	if(ColumnHeader_text.contentEquals('Type')){
		
		WebUI.verifyMatch(ColumnHeader_text,'Type',true)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_Type Field_arrow'))
		
		String TypeDropdown_Payment_Text = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_Type Dropdown_Payment'))
		
		WebUI.verifyMatch(TypeDropdown_Payment_Text, 'Payment', true)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_Type Dropdown_Payment'))
		
	}
	
	if(ColumnHeader_text.contentEquals('CTRLTrans #')){
		
		WebUI.verifyMatch(ColumnHeader_text,'CTRLTrans #',true)
		
		//WebUI.click(findTestObject(''))
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_CTRLTrans_IncreaseValue_arrow'))
		
	}
	
	if(ColumnHeader_text.contentEquals('PAY Ctrl Amt')){
		
		WebUI.verifyMatch(ColumnHeader_text,'PAY Ctrl Amt',true)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_PAYCtrlAmt_IncreaseValue_arrow'))
	}
	
	if(ColumnHeader_text.contentEquals('Posted #')){
		
		WebUI.verifyMatch(ColumnHeader_text,'Posted #',true)
		
	}
	
	if(ColumnHeader_text.contentEquals('PAY Total')){
		
		WebUI.verifyMatch(ColumnHeader_text,'PAY Total',true)
		
	}
	
	if(ColumnHeader_text.contentEquals('ADJ Total')){
		
		WebUI.verifyMatch(ColumnHeader_text,'ADJ Total',true)
		
	}
	
	if(ColumnHeader_text.contentEquals('Total Amount')){
		
		WebUI.verifyMatch(ColumnHeader_text,'Total Amount',true)
		
	}
	
	if(ColumnHeader_text.contentEquals('PAY Applied Amt')){
		
		WebUI.verifyMatch(ColumnHeader_text,'PAY Applied Amt',true)
		
	}
	
	if(ColumnHeader_text.contentEquals('ADJ Applied Amt')){
		
		WebUI.verifyMatch(ColumnHeader_text,'ADJ Applied Amt',true)
		
	}
	
	if(ColumnHeader_text.contentEquals('Facility Location')){
		
		WebUI.verifyMatch(ColumnHeader_text,'Facility Location',true)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_FacilityLocation Field_arrow'))
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_FacilityLocation_dropdown_First Element'))
		
	}
	
	if(ColumnHeader_text.contentEquals('Deposit Date')){
		
		WebUI.verifyMatch(ColumnHeader_text,'Deposit Date',true)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_Deposit Date_Calendar Icon'))
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_DepositeDate_Date'))
	}
	
	if(ColumnHeader_text.contentEquals('Created Date')){
		
		WebUI.verifyMatch(ColumnHeader_text,'Created Date',true)
		
	}
	
	if(ColumnHeader_text.contentEquals('Closed Date')){
		
		WebUI.verifyMatch(ColumnHeader_text,'Closed Date',true)
		
	}
	
	if(ColumnHeader_text.contentEquals('GL Batch')){
		
		WebUI.verifyMatch(ColumnHeader_text,'GL Batch',true)
		
	}
	
	if(ColumnHeader_text.contentEquals('Status')){
		
		WebUI.verifyMatch(ColumnHeader_text,'Status',true)
		
	}
	
	if(ColumnHeader_text.contentEquals('Agency')){
		
		WebUI.verifyMatch(ColumnHeader_text,'Agency',true)
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_Agency Field_arrow'))
		
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_Agency Dropdown_First Element'))
		
	}
	
}

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Cancel_Button'), 2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Update_Button'))

WebUI.delay(2)

'Creating Refund Batch'

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Add new record-Button'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_Type Field_arrow'))

String TypeDropdown_Refund_Text = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_Type Dropdown_Refund'))

WebUI.verifyMatch(TypeDropdown_Refund_Text, 'Refund', true)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_Type Dropdown_Refund'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_CTRLTrans_IncreaseValue_arrow'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_PAYCtrlAmt_IncreaseValue_arrow'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_FacilityLocation Field_arrow'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_FacilityLocation_dropdown_First Element'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_Deposit Date_Calendar Icon'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_DepositeDate_Date'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_Agency Field_arrow'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_Agency Dropdown_First Element'))

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Cancel_Button'), 2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Update_Button'))
