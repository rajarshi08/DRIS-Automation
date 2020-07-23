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

WebUI.click(findTestObject('Patient Accounting/Page_AR Report/a_AR Report'))

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'AR Report', true)

WebUI.click(findTestObject('Patient Accounting/Page_AR Report/Transaction/span_Transaction Report'))

WebUI.click(findTestObject('Patient Accounting/Page_AR Report/Transaction/Transaction Report/a_Transactions'))

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_AR Report/Transaction/Transaction Report/div_Banner Name'))

WebUI.verifyMatch(BannerName, 'Transaction - Transaction Report', true)

WebUI.click(findTestObject('Patient Accounting/Page_AR Report/Transaction/Transaction Report/input_Filter Button'))

WebUI.delay(2)

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_AR Report/Transaction/Transaction Report/div_ResultGrid_Banner Name'))

WebUI.verifyMatch(BannerName, 'Transaction - Transaction Report Results', true)

String fileName = GlobalVariable.ScreenShotPath + '\\TransactionsReportUI.png'

println('+++++++++ fileName :' + fileName)

WebUI.takeScreenshot(fileName)

WebUI.click(findTestObject('Patient Accounting/Page_AR Report/Transaction/Transaction Report/a_Export Button'))

