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

WebUI.click(findTestObject('Page_Clinical Information/a_Patient Demographics'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_MPI'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Patient Information'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Garrett James M                        _6087fc'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Garrett James M'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_123 Main St B50'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Falls Church VA 22043'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_(128) 448-4103 (H)'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Patient Status'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Marital Status'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Sex'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Date of Death'))

WebUI.click(findTestObject('Page_Patient Demographics/label_DOB'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Language'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Race'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Ethnicity'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Religion'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Last Updated Date'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Registration'))

WebUI.click(findTestObject('Page_Patient Demographics/span_Registration'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Export'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_System'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/input'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Export_k-icon k-filter_1'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Clear'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/input_select_k-input'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_select'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Tuesday July 14 2020'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Export_k-icon k-filter_1'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Clear'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Export_k-icon k-filter'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/input_select_k-input'), 'g')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Filter'))

WebUI.click(findTestObject('Page_Patient Demographics/td_Garrett'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Export_k-icon k-filter_1'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Clear'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Location_k-icon k-plus'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Relations'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Employment'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Guarantor'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Emergency Contact'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Provider'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Insurance'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Referral History'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Legacy Identifiers'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Pharmacies'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Care Team'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Care Team'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Export'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Role_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/input_select_k-input'))

WebUI.doubleClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/td_Dylan'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Role_k-icon k-filter'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/input_select_k-input'), 'Dylan')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Role_k-icon k-filter_1'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Clear'))

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

WebUI.click(findTestObject('Page_Clinical Information/a_Patient Demographics'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_MPI'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Patient Information'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Garrett James M                        _6087fc'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Garrett James M'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_123 Main St B50'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Falls Church VA 22043'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_(128) 448-4103 (H)'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Patient Status'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Marital Status'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Sex'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Date of Death'))

WebUI.click(findTestObject('Page_Patient Demographics/label_DOB'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Language'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Race'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Ethnicity'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Religion'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Last Updated Date'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Registration'))

WebUI.click(findTestObject('Page_Patient Demographics/span_Registration'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Export'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_System'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/input'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Export_k-icon k-filter_1'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Clear'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Export_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/input_select_k-input'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_select'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Tuesday July 14 2020'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Export_k-icon k-filter_1'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Clear'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Export_k-icon k-filter'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/input_select_k-input'), 'g')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Filter'))

WebUI.click(findTestObject('Page_Patient Demographics/td_Garrett'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Export_k-icon k-filter_1'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Clear'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Location_k-icon k-plus'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Relations'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Employment'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Guarantor'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Emergency Contact'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Provider'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Insurance'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Referral History'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Legacy Identifiers'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Pharmacies'))

WebUI.click(findTestObject('Page_Patient Demographics/a_Care Team'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Care Team'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Export'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Role_k-icon k-filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/input_select_k-input'))

WebUI.doubleClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/td_Dylan'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Role_k-icon k-filter'))

WebUI.setText(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/input_select_k-input'), 'Dylan')

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Filter'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Role_k-icon k-filter_1'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/button_Clear'))

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

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Registration'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Location_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_General Info'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Contact Information                    _628dc4'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Contact Information'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Garrett James M_1'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Primary Information                    _6220f6'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Primary Information'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_DOB'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_SSN'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Sex'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Gender Identity'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_MRN'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Previous MRN'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_System Patient ID'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_System'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Secondary Information                  _9d46b4'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Secondary Information'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Race'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Ethnicity'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Religion'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Date of Death'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Deceased'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Cause Of Death'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Multi-Discipline Patient'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Organ Donor'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Veteran Status'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_VIP'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_VIP Description'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Marital Status'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Exempt from Reporting'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Maiden Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Patient Status'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Privacy Notify Date'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Preferred Language'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Preferred Communication'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Other Patient Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Mothers First Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Mothers Maiden Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Initial Eval Date'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Birthplace'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Relations'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Patient Relations'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/th_Title'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Employment'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Employer Contact Information           _ddee60'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Employer Contact Information'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Employment Details                     _ff60b8'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Employment Details'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Occupation'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Department'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Employment Status'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Contact'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Employment Begin Date'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Employment End Date'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Date Disabled'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Date Retired'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Guarantor'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Guarantor Details                      _ac2b96'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Guarantor Details'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h9_Primary Address'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Jeff Jeff M'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h9_Alternate Address'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_DOB'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Patient Relation'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Guarantor SSN'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Gender'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Guarantor Employer                     _ee878f'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Guarantor Employer'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Employment Occupation'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Employment status (1)'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Emergency Contact'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Emergency Contact Information          _fcfe4f'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Emergency Contact Information'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Relation'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_SSN'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_DOB'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Gender'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Secondary Contact Information          _91e5dc'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Secondary Contact Information'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Provider'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Primary Care Provider                  _c3757c'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Primary Care Provider'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Secondary Care Provider                _f44064'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Secondary Care Provider'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Preferred Provider                     _a06f30'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Preferred Provider'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Insurance'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Insurance Details'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Priority'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Location_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Insurance Details                      _46e015'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Insurance Details'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Authorization Number'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Verified By'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Override Insurance Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Carrier Address Line 1'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Carrier Address Line 2'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Financial Class Status'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Verified Date'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Authorization Date'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Additional Details                     _c63866'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Additional Details'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Group Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Referral Number'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Visit Limitations'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Group Number'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Facility Taxonomy Code'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Financial Limitations'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Subscriber                             _25763f'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Subscriber'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Relation'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Gender'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_BD'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Subscriber Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Address Line 2'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Employer                               _34b925'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Employer'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Name'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Address Line 1'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Referral History'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Referral History'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Date Referred_k-callout k-callout-s'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/th_Referred From'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Location_k-icon k-plus'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/div_Referral Details                       _12d2b1'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/h6_Referral Details'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Visit-ID'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Visit Date'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Description'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Expiration Date'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/label_Discharge Date'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Diagnosis Codes'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/th_DXDetails'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/th_ICD9'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/th_ICD10'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Legacy Identifiers'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/th_ID Type'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Legacy Identifiers'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/th_ID'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/th_Start Date'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/th_Issuing Organization ID'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/th_Stop Date'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Pharmacies'))

WebUI.click(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/span_Patient Pharmacies'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Name_1'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_City'))

WebUI.rightClick(findTestObject('Object Repository/Clinical/Duplicate/Page_Patient Demographics/a_Zip Code'))

WebUI.closeBrowser()

WebUI.acceptAlert()

