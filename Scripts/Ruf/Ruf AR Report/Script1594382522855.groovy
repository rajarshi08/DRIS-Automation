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

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Patient Accounting Search/a_AR Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Transaction Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Prepay'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Friday July 10 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/input_select_openprepayarbutton'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Prepay'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/div_Transaction - Prepay Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Export'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Friday July 10 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/input_Post Start Date_TrStartDate'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/input_Post End Date_TrEndDate'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/input_select_transbutton'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Export'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Transaction - Transaction Report Results'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Prepay'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Transaction - Prepay Report Results'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Prepay'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Guarantor ID'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Last Bill Date'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Last Payment'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Balance'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/div_Transaction - Prepay Report            _2bd6c4'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Adjustment'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/div_Transaction - Adjustment Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Friday July 10 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Friday July 10 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/input_select_Criteria'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Transaction - Adjustment Report Results'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Generate Report'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Export'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.setText(findTestObject('Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Page_DRIS Home Page/a_Patient Accounting'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Patient Accounting Search/a_AR Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Transaction Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Prepay'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Friday July 10 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/input_select_openprepayarbutton'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Prepay'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/div_Transaction - Prepay Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Export'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Friday July 10 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/input_Post Start Date_TrStartDate'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/input_Post End Date_TrEndDate'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/input_select_transbutton'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Export'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Transaction - Transaction Report Results'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Prepay'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Transaction - Prepay Report Results'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Prepay'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Guarantor ID'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Last Bill Date'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Last Payment'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Balance'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/div_Transaction - Prepay Report            _2bd6c4'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Adjustment'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/div_Transaction - Adjustment Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Friday July 10 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Friday July 10 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/input_select_Criteria'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Transaction - Adjustment Report Results'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Generate Report'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Export'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.setText(findTestObject('Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Page_DRIS Home Page/a_Patient Accounting'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Patient Accounting Search/a_AR Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Transaction Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Payment'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/div_Transaction - Payment Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Saturday July 11 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/input_select_Criteria'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Transaction - Payment Report Results'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Generate Report_1'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Export'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Write-Off'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/div_Transaction - Write Off Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Saturday July 11 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/button_Search'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/button_Clear'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Transaction - Write Off Report Results'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Export'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/label_Facility'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/label_Cycle Step'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/label_Start Date'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/label_End Date'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/label_Financial Class'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/label_System'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/label_Cycle Name'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Credit Reports'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/div_Credit - Credit Report'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/input_select_CriteriaCredit'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/span_Credit - Credit Report Results'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Report/a_Export'))

WebUI.closeBrowser()

