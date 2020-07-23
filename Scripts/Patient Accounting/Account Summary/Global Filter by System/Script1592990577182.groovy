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

WebUI.setText(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Search/input_Last Name_LastName'), 
    GlobalVariable.LastName)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Search/button_Search'))

WebUI.delay(10)

WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'))

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/span_Select Reason for Break the glass'))

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/li_Direct Patient Care'))

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/button_BTG'))

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/span_GlobalFilter_SystemField_Arrow'))

String SystemName = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/li_SystemGlobalFilter_DropdownList_FirstItem'))

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/li_SystemGlobalFilter_DropdownList_FirstItem'))

WebUI.delay(5)

AccGrid_System = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/td_AccountGrid_SystemColumn_FirstElement'))

WebUI.verifyMatch(AccGrid_System, SystemName, true)

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/a_InvoicesTab'))

InvGrid_System = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/td_InvoiceGrid_SystemColumn_FirstElement'))

WebUI.verifyMatch(InvGrid_System, SystemName, true)

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/a_ClaimsTab'))

ClaimsGrid_System = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/td_ClaimsGrid_SystemColumn_FirstElement'))

WebUI.verifyMatch(ClaimsGrid_System, SystemName, true)

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/a_StatementsTab'))

StmtGrid_System = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/td_StatementsGrid_SystemColumn_FirstElement'))

WebUI.verifyMatch(StmtGrid_System, SystemName, true)

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/a_DocumentsTab'))

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/a_Document Filter_Button'))

DocFltGrid_System = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/td_DocumentsGrid_SystemColumn_FirstElement'))

WebUI.verifyMatch(DocFltGrid_System, SystemName, true)

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/span_GlobalFilter_SystemField_Arrow'))

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/li_SystemGlobalFilter_DropdownList_All_option'))

WebUI.delay(2)

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/a_AccountsTab'))

PatientType = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/td_AccountGrid_PatientTypeColumn_FirstElement'))

WebUI.setText(findTestObject('Patient Accounting/Page_Account Summary/input_GlobalSearchField'), PatientType)

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/button_GlobalSearch'))

PatientType_AfterFilter = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/td_AccountGrid_PatientTypeColumn_FirstElement'))

WebUI.verifyMatch(PatientType_AfterFilter, PatientType, true)

WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/button_GlobalClear'))

Text_GlobalFilter = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/input_GlobalSearchField'))

WebUI.verifyMatch(Text_GlobalFilter, '', true)

GlobalFilterSystem_text = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/span_GlobalFilter_SystemField_Text'))

WebUI.verifyMatch(GlobalFilterSystem_text, 'All', true)

