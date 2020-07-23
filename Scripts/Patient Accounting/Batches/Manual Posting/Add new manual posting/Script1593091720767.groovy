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

WebUI.setText(findTestObject('Patient Accounting/Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Patient Accounting/Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Patient Accounting/Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_DRIS Home Page/span_Login Message'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'DRIS Home Page', true)

WebUI.click(findTestObject('Patient Accounting/Page_DRIS Home Page/a_Patient Accounting'))

WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/Sub_ModuleBar_Links/a_Batches'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Manual Posting Page/a_Manual Posting_Tab'))

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Batches', true)

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Manual Posting Page/span_Payment Receipt Grid_BannerName_Text'))

WebUI.verifyMatch(BannerName, 'Payment Receipt', true)

List PaymentReceiptGridColumnList = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Manual Posting Page/PaymentReceiptGrid_ColumnList'), 
    2)

int size = PaymentReceiptGridColumnList.size()

for (int i; i < size; i++) {
    WebElement ele = PaymentReceiptGridColumnList.get(i)

    String text = ele.getText()

    println('+++++++ text : ' + text)

    if (text.equals('Sequence')) {
        WebUI.verifyMatch(text, 'Sequence', true)
    }
    
    if (text.equals('Payment Date')) {
        WebUI.verifyMatch(text, 'Payment Date', true)
    }
    
    if (text.equals('Payment Amount')) {
        WebUI.verifyMatch(text, 'Payment Amount', true)
    }
    
    if (text.equals('Total Applied')) {
        WebUI.verifyMatch(text, 'Total Applied', true)
    }
    
    if (text.equals('Un-Applied')) {
        WebUI.verifyMatch(text, 'Un-Applied', true)
    }
    
    if (text.equals('Payment Type')) {
        WebUI.verifyMatch(text, 'Payment Type', true)
    }
    
    if (text.equals('Check Number')) {
        WebUI.verifyMatch(text, 'Check Number', true)
    }
    
    if (text.equals('Note')) {
        WebUI.verifyMatch(text, 'Note', true)
    }
    
    if (text.equals('Post Status')) {
        WebUI.verifyMatch(text, 'Post Status', true)
    }
    
    if (text.equals('EOB')) {
        WebUI.verifyMatch(text, 'EOB', true)
    }
    
    if (text.equals('Print')) {
        WebUI.verifyMatch(text, 'Print', true)
    }
    
    if (text.equals('Payment Date')) {
        WebUI.verifyMatch(text, 'Payment Date', true)
    }
    
    if (text.equals('Payment Status')) {
        WebUI.verifyMatch(text, 'Payment Status', true)
    }
    
    if (text.equals('Action')) {
        WebUI.verifyMatch(text, 'Action', true)
    }
}

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Manual Posting Page/a_Add New Button'))

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Payment Receipt Summary', true)

WebUI.waitForPageLoad(60)

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/div_PaymentCard_BannerName'))

WebUI.verifyMatch(BannerName, 'Payment', true)

//String strDate = java.time.LocalDate.now()
/*Date date = new Date()
SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy")
String strDate= formatter.format(date)

println("+++++++strDate :"+strDate)

PaymentDate = WebUI.getAttribute(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/input_Payment Date_PaymentDate'), 
    'Value')

println("+++++++PaymentDate :"+PaymentDate)*/
//PaymentDate = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/input_Payment Date_PaymentDate'))
/*WebUI.verifyMatch(PaymentDate, strDate, true)*/
WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_Payment Amount_UpArrow'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_Payment Type'))

List PaymentType_li_List = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/li_PaymentType_List'), 
    2)

size = PaymentType_li_List.size()

for (int i; i < size; i++) {
    WebElement ele = PaymentType_li_List.get(i)

    String text = ele.getText()

    println('+++++++ text : ' + text)

    if (text.equals('CASH')) {
        WebUI.verifyMatch(text, 'CASH', true)
    }
    
    if (text.equals('CHECK')) {
        WebUI.verifyMatch(text, 'CHECK', true)
    }
    
    if (text.equals('CREDIT')) {
        WebUI.verifyMatch(text, 'CREDIT', true)
    }
    
    if (text.equals('EFT')) {
        WebUI.verifyMatch(text, 'EFT', true)

        ele.click()
    }
}

WebUI.setText(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/input_Check Number_ReferenceNumber'), 
    'QATEAM')

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_BatchID'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/li_BatchID_Dropdown_FirstElement'))

WebUI.setText(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/input_Note_Note'), 
    'QATEAM_NOTE')

WebUI.setText(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/input_Last Name_LastName'), 
    GlobalVariable.LastName)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/button_Search'))

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/a_Add_Button'))

List PaymentReceiptPageCard_list = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/div_PaymentCard_CardList'), 
    2)

size = PaymentReceiptPageCard_list.size()

for (int i; i < size; i++) {
    WebElement ele = PaymentReceiptPageCard_list.get(i)

    String text = ele.getText()

    println('+++++++ text : ' + text)

    if (text.equals('Search Form')) {
        WebUI.verifyMatch(text, 'Search Form', true)
    }
    
    if (text.equals('Upload')) {
        WebUI.verifyMatch(text, 'Upload', true)
    }
    
    if (text.equals('Search Patients')) {
        WebUI.verifyMatch(text, 'Search Patients', true)
    }
    
    if (text.equals('Patients')) {
        WebUI.verifyMatch(text, 'Patients', true)
    }
    
    if (text.equals('Save Payment Save & Apply Back')) {
        WebUI.verifyMatch(text, 'Save Payment Save & Apply Back', true)
    }
}

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/button_Save  Apply'))

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/div_Manual Payment Patients'))

BannerName = BannerName.substring(0, BannerName.indexOf('s') + 1)

WebUI.verifyMatch(BannerName, 'Manual Payment Patients', true)

List ManualPaymentPatientGrid_ColumnList = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/ManualPaymentPatientGrid_ColumnList'), 
    2)

size = ManualPaymentPatientGrid_ColumnList.size()

String MPPGrid_columnName

WebElement ele1

for (i = 0; i < size; i++) {
    ele1 = ManualPaymentPatientGrid_ColumnList.get(i)

    MPPGrid_columnName = ele1.getAttribute('data-title')

    if (MPPGrid_columnName.equals('System')) {
        WebUI.verifyMatch(MPPGrid_columnName, 'System', true)
    }
    
    if (MPPGrid_columnName.equals('MRN')) {
        WebUI.verifyMatch(MPPGrid_columnName, 'MRN', true)
    }
    
    if (MPPGrid_columnName.equals('Last Name ')) {
        WebUI.verifyMatch(MPPGrid_columnName, 'Last Name ', true)
    }
    
    if (MPPGrid_columnName.equals('First Name ')) {
        WebUI.verifyMatch(MPPGrid_columnName, 'First Name ', true)
    }
    
    if (MPPGrid_columnName.equals('Middle Name')) {
        WebUI.verifyMatch(MPPGrid_columnName, 'Middle Name', true)
    }
    
    if (MPPGrid_columnName.equals('SSN')) {
        WebUI.verifyMatch(MPPGrid_columnName, 'SSN', true)
    }
    
    if (MPPGrid_columnName.equals('Date Of Birth')) {
        WebUI.verifyMatch(MPPGrid_columnName, 'Date Of Birth', true)
    }
}

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/td_ManualPaymentPatientGrid_SystemColumn_FirstElement'))

WebUI.delay(2)

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/div_OpenInvoice_BannerName'))

WebUI.verifyMatch(BannerName, 'Open Invoice', true)

'+++++++++++++++++++++++++++++++++++++++'
List OpenInvoiceGrid_ColumnList = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/OpenInvoiceGrid_columnList'), 
    2)

size = OpenInvoiceGrid_ColumnList.size()

String OpenInvoiceGrid_columnName

for (i = 1; i < size; i++) {
    ele1 = OpenInvoiceGrid_ColumnList.get(i)

    OpenInvoiceGrid_columnName = ele1.getAttribute('data-title')

    if (OpenInvoiceGrid_columnName.equals('System')) {
        WebUI.verifyMatch(OpenInvoiceGrid_columnName, 'System', true)
    }
    
    if (OpenInvoiceGrid_columnName.equals('Invoice Number')) {
        WebUI.verifyMatch(OpenInvoiceGrid_columnName, 'Invoice Number', true)
    }
    
    if (OpenInvoiceGrid_columnName.equals('Service From Date')) {
        WebUI.verifyMatch(OpenInvoiceGrid_columnName, 'Service From Date', true)
    }
    
    if (OpenInvoiceGrid_columnName.equals('Service Through Date')) {
        WebUI.verifyMatch(OpenInvoiceGrid_columnName, 'Service Through Date', true)
    }
    
    if (OpenInvoiceGrid_columnName.equals('Account Number')) {
        WebUI.verifyMatch(OpenInvoiceGrid_columnName, 'Account Number', true)
    }
    
    if (OpenInvoiceGrid_columnName.equals('Service Through Date')) {
        WebUI.verifyMatch(OpenInvoiceGrid_columnName, 'Service Through Date', true)
    }
    
    if (OpenInvoiceGrid_columnName.equals('Charges')) {
        WebUI.verifyMatch(OpenInvoiceGrid_columnName, 'Charges', true)
    }
    
    if (OpenInvoiceGrid_columnName.equals('Balance')) {
        WebUI.verifyMatch(OpenInvoiceGrid_columnName, 'Balance', true)
    }
}

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/a_OpenInvoiceGrid_arrow_FirstRow'))

WebUI.delay(1)

'++++++++++++++++++++++++++++'
List OpenInvoiceGrid_TabList = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/a_OpenInvoiceGrid_TabList'), 
    2)

size = OpenInvoiceGrid_TabList.size()

String OpenInvoiceGrid_TabName

for (i = 0; i < size; i++) {
    ele1 = OpenInvoiceGrid_TabList.get(i)

    OpenInvoiceGrid_TabName = ele1.getText()

    if (OpenInvoiceGrid_TabName.equals('Charges')) {
        WebUI.verifyMatch(OpenInvoiceGrid_TabName, 'Charges', true)
    }
    
    if (OpenInvoiceGrid_TabName.equals('Applied Payments')) {
        WebUI.verifyMatch(OpenInvoiceGrid_TabName, 'Applied Payments', true)
    }
}

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/a_ChargesTab_Edit Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_ChargeGrid_arrow List', 
        [('var') : '9']))

//WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_DRIS-SP Self-Pay Payment'))
'Storing Payment1_PayCodeList list'
List Payment1_PayCodeList = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_DRIS-SP Self-Pay Payment'), 
    2)

/*size = element.size()
String PayCode

for(WebElement x:element){
	PayCode = x.getText()
	println("+++++++Paycode :"+PayCode)
	
	x.click()
	
'click on up arrow - span_Payment1_PayCode_arrow'
WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_ChargeGrid_arrow List',
	[('var') : '11']))

'Click on Plan to get plan list'
WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_ChargeGrid_arrow List',
	[('var') : '24']))

'Plan selection pending'

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/li_ChargesGrid_PlanList_First Element'))


'Click on update button'
WebUI.click(findTestObject("Patient Accounting/duplicate/Page_Payment Receipt Summary/a_ChargesGrid_Update Button"))


WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_ChargeGrid_arrow List',
	[('var') : '9']))

}*/
//WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_CHGGrid_Payment1_arrow', 
//      [('var1') : 'ChargePayment1']))
'Clicking on first element of Payment Paycode list'
Payment1_PayCodeList.get(0).click()

'click on up arrow of payment1 - span_Payment1_PayCode_arrow'
WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_ChargeGrid_arrow List', 
        [('var') : '11']))

//WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_ChargeGrid_arrow List',[('var'):'12']))
'Clicking on arrow of Paycode-Adjustment1'
WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_ChargeGrid_arrow List', 
        [('var') : '12']))

'Storing Elements of Adjustment1_PayCodeList'
List Adjustment1_PayCodeList = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_DRIS-SP Self-Pay Payment'), 
    2)

'Clicking on first element of Adjustment1 Paycode list'
Adjustment1_PayCodeList.get(0).click()

'click on up arrow of Adjustment1 - span_Payment1_PayCode_arrow'
WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_ChargeGrid_arrow List', 
        [('var') : '14']))

'Click on Plan to get plan list'
WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/span_ChargeGrid_arrow List', 
        [('var') : '24']))

'Selecting First element of Plan list'
WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/li_ChargesGrid_PlanList_First Element'))

'Click on update button'
WebUI.click(findTestObject('Patient Accounting/duplicate/Page_Payment Receipt Summary/a_ChargesGrid_Update Button'))

'Clicking on Back button'
WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_Payment Receipt Summary/a_Back'))

WebUI.delay(2)

'Clicking on Post button'
WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Manual Posting Page/input_Post and Apply Button'))

WebUI.delay(2)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'PostAppliedPayment', true)

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_PostAppliedPayment/div_Post Applied Payment Grid_Banner Name'))

println('++++++++BannerName : '+BannerName)

BannerName = BannerName.substring(BannerName.indexOf('Post'), (BannerName.indexOf('Payment')+7))

WebUI.verifyMatch(BannerName, 'Post Applied Payment', true)

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_PostAppliedPayment/div_Post Applied Payment Grid_Back Button'), 2)

WebUI.click(findTestObject('Patient Accounting/Page_Batches/Manual Posting/Page_PostAppliedPayment/input_PostAll_Button'))

