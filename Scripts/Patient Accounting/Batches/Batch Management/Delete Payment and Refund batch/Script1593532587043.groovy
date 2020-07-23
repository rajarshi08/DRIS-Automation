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

'Create Payment type batch'
WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Add new record-Button'))


WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_Type Field_arrow'))

String TypeDropdown_Payment_Text = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_Type Dropdown_Payment'))

WebUI.verifyMatch(TypeDropdown_Payment_Text, 'Payment', true)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_Type Dropdown_Payment'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Update_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Delete_Button'))

WebUI.acceptAlert()


'Creating Refund Batch'

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Add new record-Button'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/span_Type Field_arrow'))

String TypeDropdown_Refund_Text = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_Type Dropdown_Refund'))

WebUI.verifyMatch(TypeDropdown_Refund_Text, 'Refund', true)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/li_Type Dropdown_Refund'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Update_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Batch Management/Batches Grid/a_Delete_Button'))

WebUI.acceptAlert()


