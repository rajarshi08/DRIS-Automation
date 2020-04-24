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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.setText(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Log in/input_User Name_UserName'), 
    'rkadam')

WebUI.setEncryptedText(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Log in/input_Password_Password'), 
    '2sK9z7vq6vmegYeH3oBnSE20ZEcIdZAS')

WebUI.sendKeys(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Log in/input_Password_Password'), 
    Keys.chord(Keys.ENTER))

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Search/Patient')

WebUI.setText(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Search/input_Last Name_LastName'), 
    'g')

WebUI.click(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Search/button_Search'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Search/a_Garrett James M'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Search/button_Yes'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Clinical Information/span_Problem List'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Clinical Information/button_Log Off'))

WebUI.closeBrowser()

