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

WebUI.click(findTestObject('Page_Clinical Information/span_select'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/li_Direct Patient Care'))

WebUI.click(findTestObject('Page_Clinical Information/button_BTG'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_DRIS Comments                            _afbcd9'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_Add Comment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/span_Select Component'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/li_Problem List'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/textarea_Comment_CommentText'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/button_Submit Comment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Comment Added Successfully'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Comment'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Clinical Component'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_Add Comment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_DRIS Comment History'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_ComponentDocument'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Comment Type'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Created On_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/h6_Comment Details'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Component Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Comment Type'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Patient Reported'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Created On'))

WebUI.rightClick(findTestObject('Page_Clinical Information/button_Clear'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_Legal Hold Action'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Admin'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/a_Chart Correction Log'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Chart Correction Log'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/label_Garrett James'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/input_select_k-textbox'), 'Problem List')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/button_Filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/td_Problem List'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/a_ComponentDocument'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/a_Patient Name'))

WebUI.closeBrowser()

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

WebUI.click(findTestObject('Page_Clinical Information/span_select'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/li_Direct Patient Care'))

WebUI.click(findTestObject('Page_Clinical Information/button_BTG'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_DRIS Comments                            _afbcd9'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_Add Comment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/span_Select Component'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/li_Problem List'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/textarea_Comment_CommentText'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/button_Submit Comment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Comment Added Successfully'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Comment'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Clinical Component'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_Add Comment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_DRIS Comment History'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_ComponentDocument'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Comment Type'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Created On_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/h6_Comment Details'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Component Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Comment Type'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Patient Reported'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Created On'))

WebUI.rightClick(findTestObject('Page_Clinical Information/button_Clear'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_Legal Hold Action'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Admin'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/a_Chart Correction Log'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Chart Correction Log'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/label_Garrett James'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/input_select_k-textbox'), 'Problem List')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/button_Filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/td_Problem List'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/a_ComponentDocument'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/a_Patient Name'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.setText(findTestObject('Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Page_DRIS Home Page/a_Clinical'))

WebUI.setText(findTestObject('Page_Search/input_Last Name_LastName'), 'g')

WebUI.click(findTestObject('Page_Search/button_Search'))

WebUI.click(findTestObject('Page_Search/a_Garrett James M'))

WebUI.click(findTestObject('Page_Search/button_Yes'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_DRIS Comments                            _afbcd9'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_DRIS Comment History'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/span_Comment Type_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_Test2020-07-16T210215975'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_Test2020-07-16T210215975'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/span_Comment Type_k-icon k-filter'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/input_select_k-textbox'), 'Test2020-07-16T21:02:15.975')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/button_Filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Created On_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_Problem List'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_Test2020-07-16T210215975'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_NA'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_7162020 113229 AM'))

WebUI.closeBrowser()

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

WebUI.click(findTestObject('Page_Clinical Information/span_select'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/li_Direct Patient Care'))

WebUI.click(findTestObject('Page_Clinical Information/button_BTG'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_DRIS Comments                            _afbcd9'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_Add Comment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/span_Select Component'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/li_Problem List'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/textarea_Comment_CommentText'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/button_Submit Comment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Comment Added Successfully'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Comment'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Clinical Component'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_Add Comment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_DRIS Comment History'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_ComponentDocument'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Comment Type'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Created On_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/h6_Comment Details'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Component Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Comment Type'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Patient Reported'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Created On'))

WebUI.rightClick(findTestObject('Page_Clinical Information/button_Clear'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_Legal Hold Action'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Admin'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/a_Chart Correction Log'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Chart Correction Log'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/label_Garrett James'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/input_select_k-textbox'), 'Problem List')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/button_Filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/td_Problem List'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/a_ComponentDocument'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/a_Patient Name'))

WebUI.closeBrowser()

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

WebUI.click(findTestObject('Page_Clinical Information/span_select'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/li_Direct Patient Care'))

WebUI.click(findTestObject('Page_Clinical Information/button_BTG'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_DRIS Comments                            _afbcd9'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_Add Comment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/span_Select Component'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/li_Problem List'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/textarea_Comment_CommentText'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/button_Submit Comment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Comment Added Successfully'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Comment'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Clinical Component'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_Add Comment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_DRIS Comment History'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_ComponentDocument'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Comment Type'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Created On_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/h6_Comment Details'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Component Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Comment Type'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Patient Reported'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/label_Created On'))

WebUI.rightClick(findTestObject('Page_Clinical Information/button_Clear'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_Legal Hold Action'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Admin'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/a_Chart Correction Log'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Chart Correction Log'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/label_Garrett James'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/input_select_k-textbox'), 'Problem List')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/button_Filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/td_Problem List'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/a_ComponentDocument'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/a_Patient Name'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.setText(findTestObject('Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Page_DRIS Home Page/a_Clinical'))

WebUI.setText(findTestObject('Page_Search/input_Last Name_LastName'), 'g')

WebUI.click(findTestObject('Page_Search/button_Search'))

WebUI.click(findTestObject('Page_Search/a_Garrett James M'))

WebUI.click(findTestObject('Page_Search/button_Yes'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_DRIS Comments                            _afbcd9'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/div_DRIS Comment History'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/span_Comment Type_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_Test2020-07-16T210215975'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_Test2020-07-16T210215975'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/span_Comment Type_k-icon k-filter'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/input_select_k-textbox'), 'Test2020-07-16T21:02:15.975')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/button_Filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Created On_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_Problem List'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_Test2020-07-16T210215975'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_NA'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/td_7162020 113229 AM'))

WebUI.closeBrowser()

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

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Admin'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Clinical Information'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Clinical Information/a_Admin'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/a_Chart Correction Log'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/input_select_k-textbox'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/td_Test2020-07-16T212943895'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/td_Test2020-07-16T212943895'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/td_Test2020-07-16T212943895'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/span_Export_k-icon k-filter'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/input_select_k-textbox'), 'Test2020-07-16T21:29:43.895')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_DRS -/button_Filter'))

WebUI.closeBrowser()

