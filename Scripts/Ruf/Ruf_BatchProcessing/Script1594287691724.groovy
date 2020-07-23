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

WebUI.click(findTestObject('Page_Patient Accounting Search/a_Batches'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Batch Processing'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_--Select--'))

WebUI.rightClick(findTestObject('Page_Batches/span_select'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_--Select--'))

WebUI.rightClick(findTestObject('Page_Batches/span_select'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_--Select--'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_--Select--'))

WebUI.rightClick(findTestObject('Page_Batches/span_select'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_--Select--'))

WebUI.rightClick(findTestObject('Page_Batches/span_select'))

WebUI.rightClick(findTestObject('Page_Batches/span_Increase value'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_--Select--'))

WebUI.rightClick(findTestObject('Page_Batches/span_select'))

WebUI.rightClick(findTestObject('Page_Batches/span_Increase value'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/button_Search'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/button_Clear'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/button_Search'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/div_Search Results--Select Batch--selectBat_5b9bfd'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Search Results'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_--Select Batch--'))

WebUI.click(findTestObject('Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_--Select Paycode--'))

WebUI.click(findTestObject('Page_Batches/span_select'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Post'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Export'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Generate Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_--Select Agency--'))

WebUI.rightClick(findTestObject('Page_Batches/li_Agency 1'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Update Agency'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_System'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Facility'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Group'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Account'))

WebUI.click(findTestObject('Page_Batches/span_select'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_20200624_rnalawade_104'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_--Select Paycode--'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_DRIS-CC'))

WebUI.closeBrowser()

