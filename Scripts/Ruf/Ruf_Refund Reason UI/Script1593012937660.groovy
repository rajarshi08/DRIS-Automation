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

WebUI.setText(findTestObject('Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Page_DRIS Home Page/a_Patient Accounting'))

WebUI.click(findTestObject('Page_Patient Accounting Search/input_Last Name_LastName'))

WebUI.click(findTestObject('Page_Patient Accounting Search/a_Dictionaries'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/a_Refund Reason'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/span_Refund Reason'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/a_Add new record'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/input_Is Active_Name'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/input_Is Active_IsActive'))

WebUI.setText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/input_Is Active_Name'), 'test')

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/a_Update'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/a_Export'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/a_Refund Reason_1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/a_Is Active'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/span_'))

WebUI.click(findTestObject('Patient Accounting/duplicate/Page_Dictionaries/a_Edit_Button'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/a_Update'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/td_Claim Paid By Auto Insurance'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/span_Add new record_k-icon k-filter'))

WebUI.click(findTestObject('Page_Dictionaries/input_select_k-textbox'))

WebUI.click(findTestObject('Page_Dictionaries/button_Filter'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/span_Add new record_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/input_is true_filters0value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/input_is true_filters0value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/input_is true_filters0value'))

WebUI.click(findTestObject('Page_Dictionaries/button_Filter'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/span_Refund Reason_k-icon k-filter'))

WebUI.click(findTestObject('Page_Dictionaries/button_Clear'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Dictionaries/span_Add new record_k-icon k-filter'))

WebUI.click(findTestObject('Page_Dictionaries/button_Clear'))

WebUI.closeBrowser()

