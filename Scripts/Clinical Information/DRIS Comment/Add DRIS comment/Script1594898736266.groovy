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
import org.openqa.selenium.WebElement as WebElement
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.maximizeWindow()

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Log in', true)

WebUI.setText(findTestObject('Clinical/Page_Log in/input_UserName Field'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Clinical/Page_Log in/input_Password Field'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Patient Accounting/Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_DRIS Home Page/span_Login Message'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'DRIS Home Page', true)

WebUI.click(findTestObject('Clinical/Page_DRIS Home Page/a_Clinical Module'))

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Search', true)

WebUI.setText(findTestObject('Clinical/Page_Search/input_Last Name'), GlobalVariable.LastName)

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Search/button_Clear'), 2)

WebUI.click(findTestObject('Clinical/Page_Search/button_Search'))

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Search/span_Search Results Grid Banner Name'), 2)

BannerName = WebUI.getText(findTestObject('Clinical/Page_Search/span_Search Results Grid Banner Name'))

WebUI.verifyMatch(BannerName, 'Search Results', true)

WebUI.click(findTestObject('Clinical/Page_Search/a_PatientLink of First Row'))

boolean bool = WebUI.verifyElementPresent(findTestObject('Clinical/Page_Search/button_Yes'), 2)

if (bool) {
    WebUI.click(findTestObject('Clinical/Page_Search/button_Yes'))
}

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Clinical Information/div_BTG Alert Message'), 2)

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Clinical Information/span_Select Reason for Break the glass'), 
    2)

WebUI.click(findTestObject('Clinical/Page_Clinical Information/span_Select Reason for Break the glass'))

WebUI.click(findTestObject('Clinical/Page_Clinical Information/li_BTG Reason_Investigation'))

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Clinical Information/button_BTG'), 2)

WebUI.click(findTestObject('Clinical/Page_Clinical Information/button_BTG'))

WebUI.click(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/a_DRIS Comments Tab'))

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Legal Hold Action/div_Legal Hold Action'), 
    2)

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Add Comment/div_Add Comment'), 
    2)

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/DRIS Comment History/div_DRIS Comment History'), 
    2)

WebUI.click(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Add Comment/div_Add Comment'))

BannerName = WebUI.getText(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Add Comment/div_Add Comment'))

WebUI.verifyMatch(BannerName, 'Add Comment', false)

label = WebUI.getText(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Add Comment/label_Clinical Component'))

WebUI.verifyMatch(label, 'Clinical Component', false)

label = WebUI.getText(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Add Comment/label_Comment'))

WebUI.verifyMatch(label, 'Comment', false)

WebUI.click(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Add Comment/span_Select Component'))

ComponentName = WebUI.getText(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Add Comment/li_Problem List'))

println('+++++++= ComponentName :' + ComponentName)

WebUI.click(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Add Comment/li_Problem List'))

String time = java.time.LocalDateTime.now()

String CommentText = 'Test' + time

println('+++++++++++ comment :' + CommentText)

WebUI.setText(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Add Comment/textarea_Comment_CommentText'), 
    CommentText)

WebUI.click(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Add Comment/button_Submit Comment'))

bool = WebUI.verifyElementPresent(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Add Comment/label_Comment Added Successfully'), 
    2)

if (bool) {
    confirmationMsg = WebUI.getText(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Add Comment/label_Comment Added Successfully'))

    WebUI.verifyMatch(confirmationMsg, 'Comment Added Successfully', false)
}

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/Add Comment/button_Clear'), 
    2)

CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('DRIS Comment - Add Comment')

WebUI.click(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/DRIS Comment History/div_DRIS Comment History'))

String cmtHisBannerName = WebUI.getText(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/DRIS Comment History/div_DRIS Comment History'))

println('+++++++++ cmtHisBannerName :' + cmtHisBannerName)

WebUI.verifyMatch(cmtHisBannerName, 'DRIS Comment History', false)

List<WebElement> columnHeader_List = WebUI.findWebElements(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/DRIS Comment History/a_Column Header List'), 
    2)

for (WebElement element : columnHeader_List) {
    String columnHeaderText = element.getText()

    println('+++++++++ columnHeaderText :' + columnHeaderText)

    if (columnHeaderText.contentEquals('Component/Document')) {
        WebUI.verifyMatch(columnHeaderText, 'Component/Document', false)

        continue
    }
    
    if (columnHeaderText.contentEquals('Comment Type')) {
        WebUI.verifyMatch(columnHeaderText, 'Comment Type', false)

        continue
    }
    
    if (columnHeaderText.contentEquals('Comment Text')) {
        WebUI.verifyMatch(columnHeaderText, 'Comment Text', false)

        WebUI.click(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/DRIS Comment History/a_Comment Text_Filter Icon'))

        WebUI.click(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/DRIS Comment History/input_select_k-textbox'))

        WebUI.setText(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/DRIS Comment History/input_select_k-textbox'), 
            CommentText)

        WebUI.click(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/DRIS Comment History/button_Filter - Copy'))

        continue
    }
    
    if (columnHeaderText.contentEquals('Patient Reported')) {
        WebUI.verifyMatch(columnHeaderText, 'Patient Reported', false)

        continue
    }
    
    if (columnHeaderText.contentEquals('Created By')) {
        WebUI.verifyMatch(columnHeaderText, 'Created By', false)

        continue
    }
    
    if (columnHeaderText.contentEquals('Created On')) {
        WebUI.verifyMatch(columnHeaderText, 'Created On', false)

        continue
    }
}

WebUI.click(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/DRIS Comment History/a_Created On_k-icon k-plus'))

CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('DRIS Comment - DRIS Comment History')

String cmntDetailscard_BannerName = WebUI.getText(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/DRIS Comment History/h6_Comment Details'))

WebUI.verifyMatch(cmntDetailscard_BannerName, 'Comment Details', false)

List<WebElement> cmntDetailscard_labelList = WebUI.findWebElements(findTestObject('Clinical/Page_Clinical Information/DRIS Comments/DRIS Comment History/label_Component Name'), 
    2)

for (WebElement cmntDetailscard_label : cmntDetailscard_labelList) {
    String cmntDetailscard_labelText = cmntDetailscard_label.getText()

    println('+++++++++++++++++ cmntDetailscard_labelText :' + cmntDetailscard_labelText)

    if (cmntDetailscard_labelText.contentEquals('Component Name')) {
        WebUI.verifyMatch(cmntDetailscard_labelText, 'Component Name', false)
    }
    
    if (cmntDetailscard_labelText.contentEquals('Comment Type')) {
        WebUI.verifyMatch(cmntDetailscard_labelText, 'Comment Type', false)
    }
    
    if (cmntDetailscard_labelText.contentEquals('Comment Text')) {
        WebUI.verifyMatch(cmntDetailscard_labelText, 'Comment Text', false)
    }
    
    if (cmntDetailscard_labelText.contentEquals('Patient Reported')) {
        WebUI.verifyMatch(cmntDetailscard_labelText, 'Patient Reported', false)
    }
    
    if (cmntDetailscard_labelText.contentEquals('Created By')) {
        WebUI.verifyMatch(cmntDetailscard_labelText, 'Created By', false)
    }
    
    if (cmntDetailscard_labelText.contentEquals('Created On')) {
        WebUI.verifyMatch(cmntDetailscard_labelText, 'Created On', false)
    }
}

WebUI.click(findTestObject('Page_DRS - Admin/a_Admin'))

WebUI.click(findTestObject('Page_DRS - Admin/a_Audit Logs Tab'))

WebUI.click(findTestObject('Page_DRS - Admin/Audit Logs/a_Chart Correction Log'))

WebUI.click(findTestObject('Page_DRS - Admin/Audit Logs/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Page_DRS - Admin/Audit Logs/input_select_k-textbox'))

WebUI.setText(findTestObject('Page_DRS - Admin/Audit Logs/input_select_k-textbox'), CommentText)

WebUI.click(findTestObject('Page_DRS - Admin/Audit Logs/button_Filter'))

String chartCorre_CommentText = WebUI.getText(findTestObject('Page_DRS - Admin/Audit Logs/td_Comment Text'))

println('+++++++++++++ chartCorre_CommentText :'+chartCorre_CommentText+' ++++++++++++++++++ CommentText :'+ CommentText)

WebUI.verifyMatch(chartCorre_CommentText, CommentText, false)

CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('DRIS Comment -Chart Correction UI')

