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

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRIS Home Page/a_Clinical'))

WebUI.setText(findTestObject('Page_Search/input_Last Name_LastName'), 'g')

WebUI.click(findTestObject('Page_Search/button_Search'))

WebUI.click(findTestObject('Page_Search/a_Garrett James M'))

WebUI.click(findTestObject('Page_Search/button_Yes'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_Some records are hidden from view pleas_ca84f8'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_System'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/span_All'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/li_Cerner'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/span_select'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_All'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/input_select_form-control grid-keyword-search'))

WebUI.click(findTestObject('Page_Clinical Information/span_Select Reason for Break the glass'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/li_Billing'))

WebUI.doubleClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_Mild'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_Mild'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/input_select_form-control grid-keyword-search'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/input_select_form-control grid-keyword-search'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/input_select_form-control grid-keyword-search'), 
    'Mild')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/button_Search'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_Mild'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/button_Clear'))

WebUI.closeBrowser()

