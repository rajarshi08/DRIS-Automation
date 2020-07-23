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

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Patient Accounting Search/a_AR Summary'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/div_MedicaidCommercialMedicareWorkers CompS_be8ce8'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/div_Jul2019Aug2019Sep2019Oct2019Nov2019Dec2_d7953c'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/label_Month'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/label_Month'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/label_Quarter'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/label_HalfYear'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/label_Year'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/div_Jul2018 - Jun2019Jul2019 - Jun202001000_f02394'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/div_AR BalancejQuery(function()jQuery(workQ_5b61cb'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/div_AR BalancejQuery(function()jQuery(workQ_5b61cb'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/a_Work Queue'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/a_User Name'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/a_System'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/a_FC'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/a_Account'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/a_Invoice'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/a_Agency'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/a_Cycle'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/a_Cycle Step'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/a_Cycle Task'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/a_Balance'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/a_Days In AR'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/a_Followup Date'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_AR Summary/span_Refresh'))

WebUI.closeBrowser()

