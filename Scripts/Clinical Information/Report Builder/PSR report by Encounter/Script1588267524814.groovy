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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
//import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Dimension as Dimension

WebUI.openBrowser('')

'Application Launch'
WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login')

WebUI.maximizeWindow()

'Verify Log in Page Title '
assert WebUI.getWindowTitle() == 'Log in'

assert WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Log in/Log_in_Banner'), 2, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.dris.loginAndLogout.LogIn.Login'()

not_run: CustomKeywords.'loginAndLogout.LogIn.Login'()

//WebUI.setText(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Log in/input_User Name_UserName'), 
//    'rkadam')
//
//WebUI.delay(1)
//
//'Enter Password'
//WebUI.setEncryptedText(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Log in/input_Password_Password'), 
//    'lQ7Lhlvb+R47HPw+AJwSpQ==')
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Log in/input_Password_btn btn-primary btn-md'))
'Enter User Name'
WebUI.delay(10)

WebDriver Driver = DriverFactory.getWebDriver()

'Verify Home Page Title '
assert WebUI.getWindowTitle() == 'DRIS Home Page'

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Search/a_Clinical'))

WebUI.delay(1)

assert WebUI.getWindowTitle() == 'Search'

assert WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Search/Page_Search_Link'), 2, 
    FailureHandling.CONTINUE_ON_FAILURE)

assert WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Search/a_Clinical'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

String sLastName = findTestData('Input Data/Input').getValue(2, 2)

System.out.println('Value is= ' + sLastName)

WebUI.setText(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Search/input_Last Name_LastName'), 
    sLastName)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Search/button_Search'))

WebUI.delay(3)

assert WebUI.getText(findTestObject('Clinical Information/Report Builder/Page_Search/a_Garrett James M'), FailureHandling.CONTINUE_ON_FAILURE) == 
'Garrett, James M'

WebUI.delay(2)

//String sGridMRN_EMPI = WebUI.getText(findTestObject('Clinical Information/Report Builder/Page_Search/MRN_EMPI_value'))
//
//System.out.println('Value is: ' + sGridMRN_EMPI)
//
//WebUI.setText(findTestObject('Clinical Information/Report Builder/Page_Search/input_MRNEMPI_MRN'), sGridMRN_EMPI)
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Search/button_Search'))
//
//assert WebUI.getText(findTestObject('Clinical Information/Report Builder/Page_Search/a_Garrett James M'), FailureHandling.CONTINUE_ON_FAILURE) == 
//'Garrett, James M'
WebUI.click(findTestObject('Clinical Information/Report Builder/Page_Search/Expand_Record_Icon'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Clinical Information/Report Builder/Page_Search/MRN_value_Grid'), 2)

WebUI.delay(2)

String sMRN_EMPI = WebUI.getText(findTestObject('Clinical Information/Report Builder/Page_Search/MRN_value_Grid'))

System.out.println('Value is= ' + sMRN_EMPI)

WebUI.setText(findTestObject('Clinical Information/Report Builder/Page_Search/input_MRNEMPI_MRN'), sMRN_EMPI)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Search/button_Search'))

assert WebUI.getText(findTestObject('Clinical Information/Report Builder/Page_Search/a_Garrett James M'), FailureHandling.CONTINUE_ON_FAILURE) == 
'Garrett, James M'

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Search/a_Garrett James M'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Search/button_Yes'))

WebUI.delay(3)

WebUI.click(findTestObject('Clinical Information/Report Builder/Page_Search/Patient_Demographics_Link'))

WebUI.delay(3)

//String sDOB = '05-05-1996'
//System.out.println('Value is= ' + sDOB)
String sGridDOB = WebUI.getText(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/DOB'))

System.out.println('Value is: ' + sGridDOB)

Driver.navigate().back()

WebUI.delay(2)

Driver.navigate().back()

WebUI.setText(findTestObject('Clinical Information/Report Builder/Page_Search/input_DOB_DOB'), sGridDOB)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Search/button_Search'))

WebUI.delay(3)

assert WebUI.getText(findTestObject('Clinical Information/Report Builder/Page_Search/a_Garrett James M'), FailureHandling.CONTINUE_ON_FAILURE) == 
'Garrett, James M'

String sSSN = findTestData('Input Data/Input').getValue(4, 2)

System.out.println('Value is= ' + sSSN)

WebUI.setText(findTestObject('Clinical Information/Report Builder/Page_Search/input_SSN_SSN'), sSSN)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Search/button_Search'))

assert WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Search/Search_Results_Banner'), 
    2, FailureHandling.CONTINUE_ON_FAILURE)

assert WebUI.getText(findTestObject('Clinical Information/Report Builder/Page_Search/a_Garrett James M'), FailureHandling.CONTINUE_ON_FAILURE) == 
'Garrett, James M'

not_run: WebUI.click(findTestObject('Clinical Information/Report Builder/Page_Search/button_Clear'))

not_run: WebUI.delay(2)

not_run: String sSystem = findTestData('Input Data/Input').getValue(3, 2)

not_run: System.out.println('Value is= ' + sSystem)

not_run: WebUI.click(findTestObject('Clinical Information/Report Builder/Page_Search/System_Input'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2)

not_run: Driver.findElement(By.xpath(('//*[@id="Systems_listbox"]/li[text()=\'' + sSystem) + '\']')).click()

not_run: WebUI.click(findTestObject('Clinical Information/Report Builder/Page_Search/button_Search'))

//WebUI.click(findTestObject('Clinical Information/Report Builder/Page_Search/Selected_System'))
WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Search/a_Garrett James M'))
//
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Search/a_Garrett James M'))

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Search/Sensetive_Patient_Access_Confirm'), 
    2, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('Clinical Information/Report Builder/Page_Search/button_No'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Search/a_Garrett James M'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Search/button_Yes'))

    WebUI.delay(3)
} else {
    assert WebUI.getWindowTitle() == 'Clinical Information'
}

assert WebUI.getWindowTitle() == 'Clinical Information'

assert WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/span_Problem List'), 
    2, FailureHandling.CONTINUE_ON_FAILURE)

assert WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/span_Garrett James M (Male)'), 
    2, FailureHandling.CONTINUE_ON_FAILURE)

assert WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Some records are hidden from view pleas_ca84f8'), 
    2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/span_select_BTG_Reason'))

WebUI.delay(1)

String sReasonForBTG = findTestData('Input Data/Input').getValue(5, 2)

Driver.findElement(By.xpath(('//*[@id="bhreasonlist_listbox"]/li[text()=\'' + sReasonForBTG) + '\']')).click()

//WebUI.click(findTestObject('Page_Clinical Information/li_Billing'))
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/span_Billing'), 
    2)

WebUI.delay(1)

WebUI.click(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/button_BTG'))

WebUI.delay(3)

assert WebUI.verifyElementNotVisible(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Some records are hidden from view pleas_ca84f8'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/a_Encounters                               _50f129'))

WebUI.delay(1)

assert WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/span_Encounters'), 
    2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/span_Encounter Date_k-icon k-filter'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/span_Contains'))

WebUI.delay(3)

WebUI.click(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/li_Is equal to'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_select_k-textbox'), 
    '3000000')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/button_Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Attending Provider_encounterCheckbox_4'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_ProblemList_Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Allegies_Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Medication_Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Reconsi_Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_immuniza_Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Vitals - Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Procudure _Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Orders - Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Results - Count'), 
    3)

not_run: WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_PatientHistry - Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Document_Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Assesment - Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Transfusion - Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Health - Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_HomeHealth - Count'), 
    3)

WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Transplant_Count'), 
    3)

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/a_Report Builder'))

WebUI.delay(3)

assert WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Patient Summary Report'), 
    2, FailureHandling.CONTINUE_ON_FAILURE)

assert WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Unlinked Component Date Range'), 
    2, FailureHandling.CONTINUE_ON_FAILURE)

assert WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_Report Configuration'), 
    2, FailureHandling.CONTINUE_ON_FAILURE)

assert WebUI.verifyElementPresent(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/div_ROI Request Details'), 
    2, FailureHandling.CONTINUE_ON_FAILURE)

//Driver.manage().window().setSize(new Dimension(1920, 1200))
//Driver.get('chrome://settings/appearance')
///((Driver) as JavascriptExecutor).executeScript('chrome.settingsPrivate.setDefaultZoom(0.9);')
//Driver.navigate().back()
//WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/a_Report Builder'))
//WebUI.delay(3)
WebUI.setText(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/span_select_unlink_from_date'), 
    '5/03/2020')

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/a_26'))

not_run: WebUI.delay(1)

WebUI.setText(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/span_select_unlink_to_date'), 
    '4/26/2020')

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/a_30'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/button_Set Date Range'))

WebUI.delay(1)

Test = WebUI.verifyElementChecked(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Unlinked in Date Range_VitalUnlinked'), 
    2)

System.out.println('Value is: ' + Test)

WebUI.verifyElementChecked(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Unlinked in Date Range_Reconciliation_f029c1'), 
    2)

WebUI.verifyElementChecked(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Unlinked in Date Range_ProblemlistUnlinked'), 
    2)

WebUI.verifyElementChecked(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Unlinked in Date Range_PatientHisotry_fb93b7'), 
    2)

WebUI.verifyElementChecked(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Unlinked in Date Range_AllergyUnlinked'), 
    2)

WebUI.verifyElementChecked(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Unlinked in Date Range_MedicationUnlinked'), 
    2)

WebUI.verifyElementChecked(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Unlinked in Date Range_ImmunizationUnlinked'), 
    2)

not_run: WebUI.verifyElementChecked(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Unlinked in Date Range_OrderUnlinked'), 
    2)

WebUI.verifyElementChecked(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Unlinked in Date Range_ProcedureUnlinked'), 
    2)

not_run: WebUI.verifyElementChecked(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Unlinked in Date Range_ResultUnlinked'), 
    2)

not_run: WebUI.verifyElementChecked(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Unlinked in Date Range_DocumentUnlinked'), 
    2)

WebUI.verifyElementChecked(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Unlinked in Date Range_HealthUnlinked'), 
    2)

WebUI.verifyElementChecked(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Unlinked in Date Range_TransfusionUnlinked'), 
    2)

not_run: WebUI.verifyElementChecked(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/input_Orders_Checkbox'), 
    2)

not_run: WebUI.verifyElementChecked(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/input_Results_Checkbox'), 
    2)

not_run: WebUI.verifyElementChecked(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/input_Document_Checkbox'), 
    2)

WebUI.click(findTestObject('Clinical Information/Report Builder/Page_Clinical Information/input_Vitals_Checkbox'))

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/div_No Unlinked_input-group-text'))

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/div_No Unlinked_input-group-text'))

not_run: WebUI.setText(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/input_Entity Receiving PHI_EntityReceivingPHI'), 
    '12')

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/button_Create PSR'))

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/button_Print LMR'))

WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Clinical Information/button_Log Off'))

WebUI.closeBrowser()

