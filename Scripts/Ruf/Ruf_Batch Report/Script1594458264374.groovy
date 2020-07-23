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

WebUI.click(findTestObject('Page_Patient Accounting Search/a_AR Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Batch'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Batch - Batch Report Results'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Trans Amt_k-icon k-plus'))

WebUI.rightClick(findTestObject('Page_AR Report/a_Export'))

WebUI.rightClick(findTestObject('Page_AR Report/a_Export'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Refresh'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Refund'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Type_k-icon k-filter'))

WebUI.setText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/input_select_k-textbox'), 'Closed')

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/button_Filter'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Trans Amt_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Batch Transactions'))

WebUI.closeBrowser()

