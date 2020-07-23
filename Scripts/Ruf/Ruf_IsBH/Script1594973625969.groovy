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

WebUI.click(findTestObject('Page_DRIS Home Page/a_Clinical'))

WebUI.setText(findTestObject('Page_Search/input_Last Name_LastName'), 'g')

WebUI.click(findTestObject('Page_Search/button_Search'))

WebUI.click(findTestObject('Page_Search/a_Garrett James M'))

WebUI.click(findTestObject('Page_Search/button_Yes'))

WebUI.click(findTestObject('Page_Clinical Information/div_Some records are hidden from view pleas_ca84f8'))

WebUI.click(findTestObject('Page_Clinical Information/span_Select Reason for Break the glass'))

WebUI.click(findTestObject('Page_Clinical Information/li_Billing'))

WebUI.click(findTestObject('Page_Clinical Information/span_select'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/span_Billing'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/li_Other'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/input_select_txtOtherReasonbox'), 
    'sdv')

WebUI.click(findTestObject('Page_Clinical Information/button_BTG'))

WebUI.click(findTestObject('Page_Clinical Information/a_Encounters                               _50f129'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_Allscripts_eCare'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/span_1 - 15 of 18 items'))

WebUI.closeBrowser()

