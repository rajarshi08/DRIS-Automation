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

WebUI.click(findTestObject('Page_Batches/a_Refunds'))

WebUI.click(findTestObject('Page_Batches/a_New Refund'))

WebUI.click(findTestObject('Page_Refund Summary/span_--Select--'))

WebUI.click(findTestObject('Page_Refund Summary/li_Insurance'))

WebUI.click(findTestObject('Page_Refund Summary/button_Save  Search'))

WebUI.setText(findTestObject('Page_Refund Summary/input_Account  Invoice Number_AccountNumber'), '125001')

WebUI.click(findTestObject('Page_Refund Summary/button_Search'))

WebUI.click(findTestObject('Page_Refund Summary/a_Current Ins Plan_k-icon k-plus'))

WebUI.click(findTestObject('Page_Refund Summary/button_ADD New Payer'))

WebUI.setText(findTestObject('Page_Refund Summary/input_Is For Refund Receipt_Name'), 'asfadad')

WebUI.doubleClick(findTestObject('Page_Refund Summary/input_Is For Refund Receipt_Name'))

WebUI.setText(findTestObject('Page_Refund Summary/input_Is For Refund Receipt_Name'), 'asfadad')

WebUI.setText(findTestObject('Page_Refund Summary/input_Is For Refund Receipt_AddressLine1'), 'asfadad')

WebUI.setText(findTestObject('Page_Refund Summary/input_Is For Refund Receipt_AddressLine2'), 'asfadad')

WebUI.setText(findTestObject('Page_Refund Summary/input_Is For Refund Receipt_City'), 'asfadad')

WebUI.setText(findTestObject('Page_Refund Summary/input_Is For Refund Receipt_State'), 'asfadad')

WebUI.setText(findTestObject('Page_Refund Summary/input_Is For Refund Receipt_ZipCode'), 'asfadad')

WebUI.setText(findTestObject('Page_Refund Summary/input_Is For Refund Receipt_PhoneNumber'), 'asfadad')

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Update'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Cancel'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Phone Number'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Payer Zip Code'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Payer State'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Payer City'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Payer Address Line 2'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Payer Address Line 1'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Carrier Name'))

WebUI.click(findTestObject('Page_Refund Summary/a_Update'))

WebUI.click(findTestObject('Page_Refund Summary/div_New Payer Added Successfully'))

WebUI.click(findTestObject('Page_Refund Summary/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Refund Summary/li_asfadad asfadad'))

WebUI.click(findTestObject('Page_Refund Summary/span_Increase value'))

WebUI.click(findTestObject('Page_Refund Summary/span_select'))

WebUI.click(findTestObject('Page_Refund Summary/li_Claim Paid By Auto Insurance'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Cancel'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Refund Reason'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Refund Amount'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_ZipCode'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_State'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_City'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_AddressLine2'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_AddressLine1'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Payable To'))

WebUI.click(findTestObject('Page_Refund Summary/a_Update'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Refund Summary/span_asfadad_k-icon k-delete'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Plan'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Payment'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Refund Summary/a_Reason'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_Pay Code'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_InvoiceNumber'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_MRN'))

WebUI.rightClick(findTestObject('Page_Refund Summary/a_System'))

WebUI.click(findTestObject('Page_Refund Summary/a_Back'))

WebUI.rightClick(findTestObject('Page_Batches/input_Unposted_btn btn-primary'))

WebUI.rightClick(findTestObject('Page_Batches/input_Unposted_btn btn-primary'))

WebUI.rightClick(findTestObject('Page_Batches/a_Delete'))

WebUI.click(findTestObject('Page_Batches/span_Total Applied_k-icon k-filter'))

WebUI.rightClick(findTestObject('Page_Batches/input_Unposted_filters0value'))

WebUI.rightClick(findTestObject('Page_Batches/input_Unposted_filters0value'))

WebUI.closeBrowser()

