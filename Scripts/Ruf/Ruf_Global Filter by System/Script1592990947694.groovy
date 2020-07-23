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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Page_DRIS Home Page/a_Patient Accounting'))

WebUI.setText(findTestObject('Page_Patient Accounting Search/input_Last Name_LastName'), 'g')

WebUI.click(findTestObject('Page_Patient Accounting Search/button_Search'))

WebUI.click(findTestObject('Page_Patient Accounting Search/a_Garrett James'))

WebUI.click(findTestObject('Page_Account Summary/span_Select Reason for Break the glass'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/li_Investigation'))

WebUI.click(findTestObject('Page_Account Summary/button_BTG'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/li_Cerner'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_System'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/td_Cerner'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_Invoices                                 _4972b6'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_System_1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/td_Cerner'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_Claims                                   _1ada58'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_System_1_2'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/td_Cerner'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_Statements                               _d76308'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_System_1_2_3'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/td_Cerner'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_Documents                                _fca521'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_Document Filter'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_System_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/td_Cerner'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_Accounts                                 _f3d744'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/div_2'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/input_select_form-control grid-keyword-search'))

WebUI.doubleClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/td_Outpatient'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/td_Outpatient'))

WebUI.setText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/input_select_form-control grid-keyword-search'), 
    'Outpatient')

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/button_Search'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_System_k-grid-filter k-state-active'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_System_k-grid-filter k-state-active'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_System_k-grid-filter k-state-active'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a_System_k-grid-filter k-state-active'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/button_Clear'))

WebUI.click(findTestObject('Page_Account Summary/span_Select Reason for Break the glass'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/li_Investigation'))

WebUI.click(findTestObject('Page_Account Summary/button_BTG'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/input_select_form-control grid-keyword-search'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/span_All'))

WebUI.closeBrowser()

