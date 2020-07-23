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

WebUI.click(findTestObject('Page_DRIS Home Page/a_Patient Accounting'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Patient Accounting Search/a_Batches'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Manual Posting'))

WebUI.click(findTestObject('Patient Accounting/duplicate/Page_Batches/span_Payment Receipt Grid_BannerName_Text'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Sequence'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Payment Date'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Payment Amount'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Total Applied'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Un-Applied'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Payment Type'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Check Number'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Note'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Post Status'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_EOB'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Print'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Payment Status'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Action'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_2'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_552020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_1000'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_000'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_1000'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_CHECK'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_070707'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_Unposted'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_1_2'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add New'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/input_Payment Date_PaymentDate'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/span_Increase valueDecrease value'))

WebUI.setText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/input_Payment Amount_PaymentAmount'), 
    '100')

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/span_--Select--'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/li_CASH'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/input_Check Number_ReferenceNumber'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/span_--Select--'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/li_20200624_rnalawade_104__Agency 2'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/input_Note_Note'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/div_Upload'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/div_Search Form'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/div_Payment'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/div_Search Patients'))

WebUI.setText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/input_Last Name_LastName'), 
    'g')

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/input_DOB_DOB'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/input_Account Number_AccountNumber'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/input_Admit Date_AdmitDate'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/input_First Name_FirstName'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/input_SSN_SSN'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/button_Search'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Add'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/div_Patients'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Delete'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/button_Save  Apply'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/div_Manual Payment Patients                _0f3640'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_System'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_MRN'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Last Name'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_First Name'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Middle Name'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_SSN'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Date Of Birth'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/td_Cerner'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_System_1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Invoice Number'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Service From Date'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Service Through Date'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Account Number'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Service Through Date'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Charges'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Balance'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_A000057_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Pay Code'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Payment1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/div_Loading_k-loading-image'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Adjustment1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/div_Loading_k-loading-image'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Adjustment2'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/div_Loading_k-loading-image'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Pay Code'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Adjustment3'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Plan'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Plan'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Edit'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/span_DRIS-SP Self-Pay Payment'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/span_Increase valueDecrease value'))

WebUI.setText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/input_select_ChargePayment1'), 
    '100')

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/span_select'))

WebUI.setText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/input_select_ChargePayment1'), 
    '100')

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/span_DRIS-CA Contractual Adjustment'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/span_Increase valueDecrease value'))

WebUI.setText(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/input_select_ChargeAdjustment1'), 
    '20')

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/li_Test'))

WebUI.click(findTestObject('Patient Accounting/duplicate/Page_Payment Receipt Summary/a_ChargesGrid_Update Button'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Payment Receipt Summary/a_Back'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_000'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_10000'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_10000'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/input_Unposted_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_PostAppliedPayment/div_Post Applied Payment                    Back'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_PostAppliedPayment/input_Test_btn btn-success'))

WebUI.closeBrowser()

