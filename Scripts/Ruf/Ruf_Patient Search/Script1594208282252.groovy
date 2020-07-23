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

WebUI.setText(findTestObject('Patient Accounting/duplicate/Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Patient Accounting/duplicate/Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Patient Accounting/duplicate/Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Patient Accounting/duplicate/Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Patient Accounting/duplicate/Page_DRIS Home Page/a_Patient Accounting'))

WebUI.setText(findTestObject('Patient Accounting/duplicate/Page_Patient Accounting Search/input_Last Name_LastName'), 'g')

WebUI.click(findTestObject('Patient Accounting/duplicate/Page_Patient Accounting Search/button_Search'))

WebUI.click(findTestObject('Patient Accounting/duplicate/Page_Patient Accounting Search/a_Garrett James'))

WebUI.click(findTestObject('Patient Accounting/duplicate/Page_Account Summary/span_Select Reason for Break the glass'))

WebUI.click(findTestObject('Patient Accounting/duplicate/Page_Account Summary/span_select'))

WebUI.click(findTestObject('Patient Accounting/duplicate/Page_Account Summary/li_Investigation'))

WebUI.click(findTestObject('Patient Accounting/duplicate/Page_Account Summary/button_BTG'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/span_Group_k-icon k-filter'))

WebUI.setText(findTestObject('Page_Account Summary/input_select_k-textbox'), 'A000053')

WebUI.click(findTestObject('Page_Account Summary/button_Filter'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Log in/input_Password_Password'), 
    'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_DRIS Home Page/a_Patient Accounting'))

WebUI.setText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Patient Accounting Search/input_Last Name_LastName'), 
    'g')

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Patient Accounting Search/button_Search'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Patient Accounting Search/a_Garrett James'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/span_Select Reason for Break the glass'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/li_Investigation'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/button_BTG'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/span_Group_k-icon k-filter'))

WebUI.setText(findTestObject('Page_Account Summary/input_select_k-textbox'), 'A000053')

WebUI.click(findTestObject('Page_Account Summary/button_Filter'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/a'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.setText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Log in/input_Password_Password'), 
    'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.sendKeys(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Log in/input_Password_Password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_DRIS Home Page/a_Patient Accounting'))

WebUI.setText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Patient Accounting Search/input_Last Name_LastName'), 
    'g')

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Patient Accounting Search/button_Search'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Patient Accounting Search/a_Garrett James'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/span_Select Reason for Break the glass'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/li_Record Review'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/button_BTG'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Account Summary/button_Export'))

WebUI.closeBrowser()

