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

WebUI.setText(findTestObject('Clinical/Duplicate/Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Clinical/Duplicate/Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.sendKeys(findTestObject('Clinical/Duplicate/Page_Log in/input_Password_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Clinical/Duplicate/Page_DRIS Home Page/a_Clinical Module'))

WebUI.setText(findTestObject('Clinical/Duplicate/Page_Search/input_Last Name_LastName'), 'g')

WebUI.click(findTestObject('Clinical/Duplicate/Page_Search/button_Search'))

WebUI.rightClick(findTestObject('Clinical/Duplicate/Page_Search/input_First Name_FirstName'))

WebUI.rightClick(findTestObject('Clinical/Duplicate/Page_Search/input_Middle Name_MiddleName'))

WebUI.rightClick(findTestObject('Clinical/Duplicate/Page_Search/input_DOB_DOB'))

WebUI.rightClick(findTestObject('Clinical/Duplicate/Page_Search/input_MRNEMPI_MRN'))

WebUI.rightClick(findTestObject('Clinical/Duplicate/Page_Search/input_SSN_SSN'))

WebUI.rightClick(findTestObject('Clinical/Duplicate/Page_Search/input_Encounter Number_EncounterNumber'))

WebUI.rightClick(findTestObject('Clinical/Duplicate/Page_Search/button_Clear'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Search/span_Search Results'))

WebUI.rightClick(findTestObject('Clinical/Duplicate/Page_Search/a_System'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Search/td_1'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Search/a_Garrett James M'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Search/span_Confirmation'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Search/p_Please confirm if you want to access the _56826c'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Search/p_Are you sure you want to continue'))

WebUI.rightClick(findTestObject('Clinical/Duplicate/Page_Search/button_X'))

WebUI.rightClick(findTestObject('Clinical/Duplicate/Page_Search/button_No'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Search/button_Yes'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Clinical Information/a_Patient Demographics'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Registration'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Location_k-icon k-plus'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/h6_Primary Information'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/label_DOB'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/div_551996'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/label_SSN'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/div_352-20-2047'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/label_MRN'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/div_1000'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Location_k-icon k-plus'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/td_Garrett'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/td_James'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/td_M'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/td_551996'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/td_352-20-2047'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/td_1000'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/td_Cerner'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/span_Registration'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Search'))

WebUI.setText(findTestObject('Clinical/Duplicate/Page_Search/input_Last Name_LastName'), 'g')

WebUI.click(findTestObject('Clinical/Duplicate/Page_Search/button_Search'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Search/a_Garrett James M'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Search/button_Yes'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Clinical Information/a_Encounters                               _50f129'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Clinical Information/td_2000000'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Clinical Information/span_Select Reason for Break the glass'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Clinical Information/li_Investigation'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Clinical Information/button_BTG'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Clinical Information/td_4000000'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Clinical Information/a_Patient Demographics'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Registration'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Location_k-icon k-plus'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Care Team'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Registration'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Relations'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Employment'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Guarantor'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Emergency Contact'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Provider'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Insurance'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Referral History'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Legacy Identifiers'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Pharmacies'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Legacy Identifiers'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Referral History'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Insurance'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Provider'))

WebUI.click(findTestObject('Clinical/Duplicate/Page_Patient Demographics/a_Emergency Contact'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Object Repository/Clinical/Duplicate/Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.sendKeys(findTestObject('Object Repository/Clinical/Duplicate/Page_Log in/input_Password_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRIS Home Page/a_Clinical Module'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/input_Last Name_LastName'), 'g')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/button_Search'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/input_First Name_FirstName'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/input_Middle Name_MiddleName'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/input_DOB_DOB'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/input_MRNEMPI_MRN'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/input_SSN_SSN'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/input_Encounter Number_EncounterNumber'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/button_Clear'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/span_Search Results'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/a_System'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/td_1'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/a_Garrett James M'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/span_Confirmation'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/p_Please confirm if you want to access the _56826c'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/p_Are you sure you want to continue'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/button_X'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/button_No'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/button_Yes'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Patient Demographics'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Registration'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Location_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Primary Information'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_DOB'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_551996'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_SSN'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_352-20-2047'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_MRN'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_1000'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Location_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/td_Garrett'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/td_James'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/td_M'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/td_551996'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/td_352-20-2047'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/td_1000'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/td_Cerner'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Registration'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Search'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/input_Last Name_LastName'), 'g')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/button_Search'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/a_Garrett James M'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/button_Yes'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Encounters                               _50f129'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_2000000'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/span_Select Reason for Break the glass'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/li_Investigation'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/button_BTG'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_4000000'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Patient Demographics'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Registration'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Location_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Care Team'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Registration'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Relations'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Employment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Guarantor'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Emergency Contact'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Provider'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Insurance'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Referral History'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Legacy Identifiers'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Pharmacies'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Legacy Identifiers'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Referral History'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Insurance'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Provider'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Emergency Contact'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Object Repository/Clinical/Duplicate/Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRIS Home Page/a_Clinical Module'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/div_System_k-multiselect-wrap k-floatwrap'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Search/li_Allscripts_eCare'))

WebUI.closeBrowser()

