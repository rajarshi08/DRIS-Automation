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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.setText(findTestObject('Patient Accounting/Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Patient Accounting/duplicate/Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.delay(2)

WebUI.click(findTestObject('Patient Accounting/Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.delay(6)

WebUI.click(findTestObject('Patient Accounting/Page_DRIS Home Page/a_Patient Accounting'))

WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/Sub_ModuleBar_Links/a_AR Work Lists'))

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Work Lists', true)

WebUI.click(findTestObject('Patient Accounting/Page_Work Lists/a_Create New List'))

WebUI.delay(2)

page_Title = WebUI.getWindowTitle()

WebUI.verifyMatch(page_Title, 'AR Workdown Search', true)

Div_ARWKDNCard_Text = WebUI.getText(findTestObject('Patient Accounting/Page_AR Workdown Search/div_AR Workdown Search Card_Text'))

WebUI.verifyMatch(Div_ARWKDNCard_Text, 'AR Workdown Search', true)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/span_System_listbox'), 1)

WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown Search/span_System_listbox'))

WebUI.delay(2)

WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown Search/li_SystemDropdown_FirstOption'))

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/span_Department_listbox'), 1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/span_Division_listbox'), 1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/span_BillingArea_listbox'), 1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/span_FinancialClassTypeID_listbox'), 
    1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/span_AgencyID_listbox'), 1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/input_Start DOS_StartDate'), 1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/span_Insurance_listbox'), 1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/span_InOut_listbox'), 1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/span_CycleID_listbox'), 1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/span_CycleStepID_listbox'), 1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/span_Provider_listbox'), 1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/div_Reason Code_CARC_listbox'), 1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/div_Remark Code_RARC_listbox'), 1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/input_End DOS_EndDate'), 1)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_AR Workdown Search/input_IncludeAssigned_CheckBox'), 
    1)

WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown Search/input_IncludeAssigned_CheckBox'))

WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown Search/button_Search'))

/*AmountCount = WebUI.getText(findTestObject('Patient Accounting/Page_AR Workdown Search/a_AmountCount_Link'))

AmountCount = AmountCount.replace(System.getProperty("line.separator"), "")

WebElement_AmountCount = WebUI.getText(findTestObject('Patient Accounting/Page_AR Workdown Search/a_AmountCount_Link'))

println(AmountCount)

A = AmountCount.substring(AmountCount.indexOf("\$"), AmountCount.indexOf(".")+3)*/
List listElement = WebUI.findWebElements(findTestObject('Patient Accounting/Page_AR Workdown Search/a_AmountCount_Link'), 
    2)

println(listElement.size())

for (int i = 0; i < listElement.size(); i++) {
    WebElement ele = listElement.get(i)

    //WebUI.scrollToElement(ele, 2)
    String AmountCount = listElement.get(i).getText()

    WebUI.delay(1)

    String A = AmountCount.substring(AmountCount.indexOf('$'), AmountCount.indexOf('.') + 3)

    String B = '$0.00'

    println(((((i + ': >>>>>>>>A : \'') + A) + '\' >>>>>>>>> B : \'') + B) + '\'')

    if (!(A.equals(B))) {
        println('*****Inside of If Statement*****')

        WebUI.delay(2)

        listElement.get(i).click()

        println(AmountCount)

        break
    }
    
    println((i + ' : ') + A)

    println('++++++++++++++++++++++++')
}

String time = java.time.LocalDateTime.now()

String WorkListName = 'AR List' + time

WebUI.switchToWindowIndex(1)

page_Title = WebUI.getWindowTitle()

WebUI.verifyMatch(page_Title, 'AR Workdown', true)

boolean var = WebUI.verifyElementClickable(findTestObject('Patient Accounting/Page_AR Workdown/button_Create'), FailureHandling.STOP_ON_FAILURE)

String TotalCount = WebUI.getText(findTestObject('Patient Accounting/Page_AR Workdown/td_Total Count 2'))

println(('++++++++++++++ TotalCount :' + TotalCount) + '+++++++++++')

TotalCount = TotalCount.substring(13)

println('TotalCount:' + TotalCount)

String itemCount = TotalCount.substring(TotalCount.lastIndexOf(TotalCount))

if (var) {
    WebUI.setText(findTestObject('Patient Accounting/Page_AR Workdown/input_Workdown List (WL)_Name'), WorkListName)

    WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/input_Assignment'))

    WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/li_AssignmentUser'))

    WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/input_Agency'))

    WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/li_Agency'))

    WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/input_Cycle'))

    WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/li_Adjustments'))

    WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/input_CycleStep'))

    WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/li_CycleStepWrite Off'))

    WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/input_CycleTask'))

    WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/li_CycleTaskReview'))

    WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/button_Create'))
}

WebUI.verifyElementClickable(findTestObject('Patient Accounting/Page_AR Workdown/a_AccountLink'), FailureHandling.STOP_ON_FAILURE)

/*String CountAfterWLCreation = WebUI.getText(findTestObject('Patient Accounting/Page_AR Workdown/span_ARWorkdownDetailGrid_ItemCount'))

println(('+++++++++++++CountAfterWLCreation :' + CountAfterWLCreation) + '++++++++++++++++')

int k = CountAfterWLCreation.indexOf('f')

CountAfterWLCreation = CountAfterWLCreation.substring(i + 2, CountAfterWLCreation.indexOf('i') - 1)*/

List ARWorkdownDetailGrid_tr_list = WebUI.findWebElements(findTestObject('Patient Accounting/Page_AR Workdown/div_ARWorkdownDetailGrid_tr_list'), 2)

int size = ARWorkdownDetailGrid_tr_list.size()

String CountAfterWLCreation =size

println("CountAfterWLCreation :"+CountAfterWLCreation)

WebUI.verifyMatch(CountAfterWLCreation, TotalCount, true)

WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/a_AccountLink'))

WebUI.waitForPageLoad(10)

WebUI.back()

WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/a_InvoiceLink'))

WebUI.waitForPageLoad(10)

WebUI.back(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Patient Accounting/Page_AR Workdown/a_MRNLink'))

WebUI.waitForPageLoad(10)

WebUI.switchToWindowIndex(0)

