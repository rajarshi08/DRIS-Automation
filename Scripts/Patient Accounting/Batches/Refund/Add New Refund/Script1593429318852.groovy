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

import org.openqa.selenium.WebElement as WebElement
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date


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

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Refund Receipt Grid/a_Refunds Tab'))

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Refunds/Refund Receipt Grid/span_Refund Receipt Grid_BannerName'))

WebUI.verifyMatch(BannerName, 'Refund Receipt', true)

List <WebElement> element_List =  WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Refunds/Refund Receipt Grid/a_Refund Receipt Grid_Column Header List'),2)

String columnHeaderName

for (WebElement element : element_List){
	
	columnHeaderName = element.getText()
	
	println('+++++++++++++columnHeaderName: '+columnHeaderName)
	
	if (columnHeaderName.equals('Refund Date')){
		
		WebUI.verifyMatch(columnHeaderName, 'Refund Date', true)
	}
	
	if (columnHeaderName.equals('Refund Type')){
		
		WebUI.verifyMatch(columnHeaderName, 'Refund Type', true)
	}
	
	if (columnHeaderName.equals('Batch #')){
		
		WebUI.verifyMatch(columnHeaderName, 'Batch #', true)
	}
	
	if (columnHeaderName.equals('Total Applied')){
		
		WebUI.verifyMatch(columnHeaderName, 'Total Applied', true)
	}
	
	if (columnHeaderName.equals('Post Status')){
		
		WebUI.verifyMatch(columnHeaderName, 'Post Status', true)
	}
		
}

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Refund Receipt Grid/a_New Refund Button'))

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/div_Refund Card_BannerName'))

WebUI.verifyMatch(BannerName, 'Refund', true)

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/div_Manual Refund Card_Banner Name'))

WebUI.verifyMatch(BannerName, 'Manual Refund', true)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/input_Manual Refund_Refund Date'), 2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/span_Refund Type_arrow'))


element_List =  WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/li_Refund Type_Dropdown List'),2)

String dropdownOption

for (WebElement element : element_List){
	
	dropdownOption = element.getText()
	
	println('+++++++++++++columnHeaderName: '+dropdownOption)
	
	if (dropdownOption.equals('Insurance')){
		
		WebUI.verifyMatch(dropdownOption, 'Insurance', true)
		element.click()
	}
	
	if (dropdownOption.equals('Patient Refund')){
		
		WebUI.verifyMatch(dropdownOption, 'Patient Refund', true)
	}
}	

element_List =  WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/label_Manual Refund Card_Lable List'),2)

String ManualRefundCard_Lable

for (WebElement element : element_List){
	
	ManualRefundCard_Lable = element.getText()
	
	println('+++++++++++++ManualRefundCard_Lable: '+ManualRefundCard_Lable)
	
	if (ManualRefundCard_Lable.equals('Refund Date')){
		
		WebUI.verifyMatch(ManualRefundCard_Lable, 'Refund Date', true)
		element.click()
	}
	
	if (ManualRefundCard_Lable.equals('Refund Type')){
		
		WebUI.verifyMatch(ManualRefundCard_Lable, 'Refund Type', true)
	}
}

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/button_Save  Search'))

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/div_Apply Refunds'))

WebUI.verifyMatch(BannerName, 'Apply Refunds', true)

String labelName

labelName = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/label_Account  Invoice Number'))

WebUI.verifyMatch(labelName, 'Account / Invoice Number', true)

WebUI.setText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/input_AccountInvoice Number'),
	GlobalVariable.InvoiceNumber)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/button_Search'))

WebUI.delay(2)

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/span_Search Results Grid_Banner Name'))

WebUI.verifyMatch(BannerName, 'Search Results', true)


element_List =  WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/a_Search Results Grid_Column List'),2)

for (WebElement element : element_List){
	
	columnHeaderName = element.getText()
	
	println('+++++++++++++columnHeaderName: '+columnHeaderName)
	
	if (columnHeaderName.equals('System')){
		
		WebUI.verifyMatch(columnHeaderName, 'System', true)
	}
	
	if (columnHeaderName.equals('Group')){
		
		WebUI.verifyMatch(columnHeaderName, 'Group', true)
	}
	
	if (columnHeaderName.equals('Patient Name')){
		
		WebUI.verifyMatch(columnHeaderName, 'Patient Name', true)
	}
	
	if (columnHeaderName.equals('Account Number')){
		
		WebUI.verifyMatch(columnHeaderName, 'Account Number', true)
	}
	
	if (columnHeaderName.equals('Invoice Number')){
		
		WebUI.verifyMatch(columnHeaderName, 'Invoice Number', true)
	}
	
	if (columnHeaderName.equals('Balance')){
		
		WebUI.verifyMatch(columnHeaderName, 'Balance', true)
	}
	
	if (columnHeaderName.equals('Service Date')){
		
		WebUI.verifyMatch(columnHeaderName, 'Service Date', true)
	}
	
	if (columnHeaderName.equals('Financial Class')){
		
		WebUI.verifyMatch(columnHeaderName, 'Financial Class', true)
	}
	
	if (columnHeaderName.equals('Current Ins Plan')){
		
		WebUI.verifyMatch(columnHeaderName, 'Current Ins Plan', true)
	}
		
}


WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/a_SearchResultsGrid_Link List',
	[('var') : '1']))



element_List =  WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/div_Payable To and Applied Refund_BannerName List'),2)

for (WebElement element : element_List){
	
	BannerName = element.getText()
	
	println('+++++++++++++BannerName: '+BannerName)
	
	if (BannerName.equals('Payable To')){
		
		WebUI.verifyMatch(BannerName, 'Payable To', true)
	}
	
	if (BannerName.equals('Applied Refund')){
		
		WebUI.verifyMatch(BannerName, 'Applied Refund', true)
	}
	
}

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/button_ADD'), 2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/button_ADD New Payer'))

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/div_Add New Payer_BannerName'))

WebUI.verifyMatch(BannerName, 'Add New Payer', true)


element_List =  WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/a_Add New Payer Grid_ColumnList'),2)

String time = java.time.LocalDateTime.now()

for (WebElement element : element_List){
	
	columnHeaderName = element.getText()
	
	println('+++++++++++++columnHeaderName: '+columnHeaderName)
	
	if (columnHeaderName.equals('Carrier Name')){
		
		WebUI.verifyMatch(columnHeaderName, 'Carrier Name', true)
		WebUI.setText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/input_Add New Payer Grid_Carrier Name'), 'Carr_'+time)
	}
	
	if (columnHeaderName.equals('Payer Address Line 1')){
		
		WebUI.verifyMatch(columnHeaderName, 'Payer Address Line 1', true)
		WebUI.setText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/input_Add New Payer Grid_AddressLine1'), 'Add1_'+time)
	}
	
	if (columnHeaderName.equals('Payer Address Line 2')){
		
		WebUI.verifyMatch(columnHeaderName, 'Payer Address Line 2', true)
		WebUI.setText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/input_Add New Payer Grid_AddressLine2'), 'Add2_'+time)
	}
	
	if (columnHeaderName.equals('Payer City')){
		
		WebUI.verifyMatch(columnHeaderName, 'Payer City', true)
		WebUI.setText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/input_Add New Payer Grid_City'), 'City_'+time)
	}
	
	if (columnHeaderName.equals('Payer State')){
		
		WebUI.verifyMatch(columnHeaderName, 'Payer State', true)
		WebUI.setText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/input_Add New Payer Grid_State'), 'AR')
	}
	
	if (columnHeaderName.equals('Payer Zip Code')){
		
		WebUI.verifyMatch(columnHeaderName, 'Payer Zip Code', true)
		WebUI.setText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/input_Add New Payer Grid_ZipCode'), '569864')
	}
	
	if (columnHeaderName.equals('Phone Number')){
		
		WebUI.verifyMatch(columnHeaderName, 'Phone Number', true)
		WebUI.setText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/input_Add New Payer Grid_PhoneNumber'), '98632545')
	}
	
}

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/a_Add New Payer Grid_Cancel Button'), 2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/a_Add New Payer Grid_Update Button'))

String validationMessage = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/div_New Payer Added Successfully'))

WebUI.verifyMatch(validationMessage, 'New Payer Added Successfully!', true)


element_List =  WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/a_PayableTo Grid_Column Header List'),2)


for (WebElement element : element_List){
	
	columnHeaderName = element.getText()
	
	println('+++++++++++++columnHeaderName: '+columnHeaderName)
	
	if (columnHeaderName.equals('Payable To')){
		
		WebUI.verifyMatch(columnHeaderName, 'Payable To', true)
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/span_PayableTo Grid_PayableToField_arrow'))
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/li_PayableTo Grid_PayableTo Dropdown_FirstElement'))
		WebUI.delay(2)
	}
	
	if (columnHeaderName.equals('AddressLine1')){
		
		WebUI.verifyMatch(columnHeaderName, 'AddressLine1', true)
	}
	
	if (columnHeaderName.equals('AddressLine2')){
		
		WebUI.verifyMatch(columnHeaderName, 'AddressLine2', true)
	}
	
	if (columnHeaderName.equals('City')){
		
		WebUI.verifyMatch(columnHeaderName, 'City', true)
	}
	
	if (columnHeaderName.equals('State')){
		
		WebUI.verifyMatch(columnHeaderName, 'State', true)
	}
	
	if (columnHeaderName.equals('ZipCode')){
		
		WebUI.verifyMatch(columnHeaderName, 'ZipCode', true)
	}
	
	if (columnHeaderName.equals('Refund Amount')){
		
		WebUI.verifyMatch(columnHeaderName, 'Refund Amount', true)
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/span_PayableTo Grid_Refund Amout_Increase value arrow'))
	}
	
	if (columnHeaderName.equals('Refund Reason')){
		
		WebUI.verifyMatch(columnHeaderName, 'Refund Reason', true)
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/span_PayableTo Grid_RefundReasonField_arrow'))
		WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/li_RefundReason Dropdown_FirstElement'))
		
	}
	
}

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/div_PayableTo_Cancel Button'), 2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/div_PayableTo_Update Button'))

List <WebElement> AppliedRefundGrid_ColumnHeaderList = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/div_AppliedRefund Grid_Column Header List'),2)

String AppliedRefundGrid_ColumnHeader

for(WebElement element : AppliedRefundGrid_ColumnHeaderList){
	
	AppliedRefundGrid_ColumnHeader = element.getText()
	
	println('+++++++++++AppliedRefundGrid_ColumnHeader : '+AppliedRefundGrid_ColumnHeader)
	
	if(AppliedRefundGrid_ColumnHeader.equals('System')){
		
		WebUI.verifyMatch(AppliedRefundGrid_ColumnHeader, 'System', true)
	}
	
	if(AppliedRefundGrid_ColumnHeader.equals('MRN')){
		
		WebUI.verifyMatch(AppliedRefundGrid_ColumnHeader, 'MRN', true)
	}
	
	if(AppliedRefundGrid_ColumnHeader.equals('InvoiceNumber')){
		
		WebUI.verifyMatch(AppliedRefundGrid_ColumnHeader, 'InvoiceNumber', true)
	}
	
	if(AppliedRefundGrid_ColumnHeader.equals('Pay Code')){
		
		WebUI.verifyMatch(AppliedRefundGrid_ColumnHeader, 'Pay Code', true)
	}
	
	if(AppliedRefundGrid_ColumnHeader.equals('Reason')){
		
		WebUI.verifyMatch(AppliedRefundGrid_ColumnHeader, 'Reason', true)
	}
	
	if(AppliedRefundGrid_ColumnHeader.equals('Payment')){
		
		WebUI.verifyMatch(AppliedRefundGrid_ColumnHeader, 'Payment', true)
	}
	
	if(AppliedRefundGrid_ColumnHeader.equals('Plan')){
		
		WebUI.verifyMatch(AppliedRefundGrid_ColumnHeader, 'Plan', true)
	}
	
}

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/span_Applied Refund Grid_Delete Button'), 2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Page_Refund Summary/Apply Refunds Card/a_Back Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Refunds/Refund Receipt Grid/input_Post Button'))
