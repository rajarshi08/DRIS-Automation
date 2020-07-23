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

/*String Td_PayTotalText = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/td_Batches Grid_All element of First Row', 
        [('var') : '7']))

println('+++++++++Td_PayTotalText :'+Td_PayTotalText)

if (Td_PayTotalText != '$0.00'){
	
	println('+++++++++Td_PayTotalText :'+Td_PayTotalText)
	
	
}	
*/

/*'clicking on Filter Icon of Type column'
WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Filter Icons',[('var') : 3]))

'clicking on -Select Value field'

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_Filter_TypeSelection_Arrow'))

'clicking on Payment Option'

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_Payment_Type'))*/


int size=15
String count
for(i=1;i<=size;i++){
	
	count = i
	
	String Td_PayTotal_text = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/td_Batches Grid_All elements of PayTotal Column',
		[('var') : count]))
	
	String Td_PayCntrAmt_text = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/td_Batches Grid_All elements of PayCNTRAmt Column',
		[('var') : count]))
	
	
	String Td_Type_text  = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/td_Batches Grid_All elements of Type Column',
		[('var') : count]))
	
	println('+++++++'+i+' ++++++++'+Td_PayTotal_text+','+Td_PayCntrAmt_text+','+Td_Type_text)
	
	
	
	if (Td_Type_text.contentEquals('Payment')){
	
		if (Td_PayTotal_text == Td_PayCntrAmt_text){
			
			WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Batches Grid Edit_Button of First Row',
				[('var') : count]))
			
			WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_Status_arrow'))
			
			WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_Status_Closed'))
			
			WebUI.delay(2)
			
			WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Update_Button'))
			
			break
			
		}
	}
	
}


