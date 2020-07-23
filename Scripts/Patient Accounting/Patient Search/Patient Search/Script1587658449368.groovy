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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Log in/input_User Name_UserName'), 
    'rnalawade')

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Log in/input_Password_Password'), 
    'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.delay(2)

WebUI.click(findTestObject('Patient Accounting/Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.delay(6)

WebUI.click(findTestObject('Patient Accounting/Page_DRIS Home Page/a_Patient Accounting'))

WebUI.delay(2)

Title = WebUI.getWindowTitle()

WebUI.verifyMatch(Title, 'Patient Accounting Search', true)

WebUI.setText(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Search/input_Last Name_LastName'), 
    GlobalVariable.LastName)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Patient Accounting/Patient Search/Page_Search/button_Search'))

WebUI.delay(2)

var = WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Patient Accounting Search/div_Search ResultsSystemMRNEMPIPatient Name_a188e2'), 
    2)

if (var) {
    PatientName = WebUI.getText(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'))
	
	println("++++++++ PatientName : "+PatientName)
	
	//String A = AmountCount.substring(AmountCount.indexOf('$'), AmountCount.indexOf('.') + 3)
	
	String LastName = PatientName.substring(0, PatientName.indexOf(','))
	
	String FirstName = PatientName.substring(PatientName.indexOf(',')+2 )
	
	FirstName = FirstName.trim()
	
	println("++++++++ LastName : "+LastName+" +++++++++++ FirstName : "+FirstName)

    DOB = WebUI.getText(findTestObject('Patient Accounting/Page_Patient Accounting Search/td_551996'))

    MRN = WebUI.getText(findTestObject('Patient Accounting/Page_Patient Accounting Search/td_1'))

    SSN = WebUI.getText(findTestObject('Patient Accounting/Page_Patient Accounting Search/td_352-20-2047'))

    WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'))

    WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/span_Select Reason for Break the glass'))

    WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/li_Direct Patient Care'))

    WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/button_BTG'))

    AccountNumber = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/td_AccountsGrid_AccountNumberColumn_FirstElement'))

    WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/a_Visit Service_k-icon k-plus'))

    WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/a_Guarantor'))

    GuarantorID = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/div_434589'))

    GuarantorFirstName = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/div_Megan'))

    GuarantorLastName = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/div_Indigo'))

    WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/a_InvoicesTab'))

    WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/span_Column Settings'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/span_Filter_k-icon k-i-arrow-e'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Patient Accounting/Page_Account Summary/input_select_k-textbox'), AccountNumber)

    WebUI.click(findTestObject('Patient Accounting/Page_Account Summary/button_Filter'))

    WebUI.delay(10)

    InvoiceNumber = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/td_InvoiceGrid_InvoiceNumberColumn_FirstColumn'))
	
	Admit_Date = WebUI.getText(findTestObject('Patient Accounting/Page_Account Summary/td_InvoiceGrid_ServiceFromDateColumn_FirstColumn'))

    WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_Search'))

    'Enter Last Name'
    WebUI.setText(findTestObject('Patient Accounting/Page_Patient Accounting Search/input_Last Name_LastName'), LastName)

    WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/button_Search'))

    WebUI.delay(10)
	
	WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'),
		2)
	
	'Enter First Name'
	WebUI.setText(findTestObject('Patient Accounting/Page_Patient Accounting Search/input_First Name_FirstName'), FirstName)

	WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/button_Search'))

	WebUI.delay(10)
	
	WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'),
		2)

    'Enter DOB'
    WebUI.setText(findTestObject('Patient Accounting/Page_Patient Accounting Search/input_DOB_DOB'), DOB)

    WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/button_Search'))

    WebUI.delay(10)
	
	WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'),
		2)

    'Enter Account Number'
    WebUI.setText(findTestObject('Patient Accounting/Page_Patient Accounting Search/input_Account Number_AccountNumber'), 
        AccountNumber)

    WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/button_Search'))

    WebUI.delay(10)
	
	WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'),
		2)
	
	'Enter Invoice no'

    WebUI.setText(findTestObject('Patient Accounting/Page_Patient Accounting Search/input_Invoice Number_InvoiceNumber'), 
        InvoiceNumber)

    WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/button_Search'))

    WebUI.delay(10)
	
	WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'),
		2)
	
	'Enter Admit Date'
	
	WebUI.setText(findTestObject('Patient Accounting/Page_Patient Accounting Search/input_Admit Date_AdmitDate'),
		Admit_Date)

	WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/button_Search'))

	WebUI.delay(10)
	
	WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'),
		2)

    'Enter MRN'
    WebUI.setText(findTestObject('Patient Accounting/Page_Patient Accounting Search/input_MRNEMPI_MRN'), MRN)

    WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/button_Search'))

    WebUI.delay(10)
	
	WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'),
		2)

    'Enter SSN'
    WebUI.setText(findTestObject('Patient Accounting/Page_Patient Accounting Search/input_SSN_SSN'), SSN)

    WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/button_Search'))

    WebUI.delay(10)
	
	WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'),
		2)

    'Enter Guarantor ID'
    WebUI.setText(findTestObject('Patient Accounting/Page_Patient Accounting Search/input_Guarantor ID_GuarantorID'), GuarantorID)

    WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/button_Search'))

    WebUI.delay(10)
	
	WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'),
		2)

    'Enter Guarantor Last Name'
    WebUI.setText(findTestObject('Patient Accounting/Page_Patient Accounting Search/input_Guarantor Last Name_GuarantorLastName'), 
        GuarantorLastName)

    WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/button_Search'))

    WebUI.delay(10)
	
	WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'),
		2)

    'Enter Guarantor First Name'
    WebUI.setText(findTestObject('Patient Accounting/Page_Patient Accounting Search/input_Guarantor First Name_GuarantorFirstName'), 
        GuarantorFirstName)

    WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/button_Search'))

    WebUI.delay(10)
	
	WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_Patient Accounting Search/a_PatientLink of First Row'),
		2)

    println((((((((PatientName + ' ') + DOB) + ' ') + MRN) + ' ') + SSN) + ' ') + AccountNumber)
}

