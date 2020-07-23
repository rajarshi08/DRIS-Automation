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

WebUI.click(findTestObject('Page_Patient Accounting Search/a_Batches'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Batches'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Close Selected'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Push Selected'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record_GLBatch-help'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_GL Year Start Month  October'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/input_Add new record_selectAllBatches'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/input_Agency_hfID_241'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Batch'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Type'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_GL Batch_k-grid-filter k-state-active'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_GL Batch_k-icon k-filter'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Open'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Payment'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Alfie'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Tuesday June 30 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_June 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Agency 1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Update'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Refund'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value_1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Alfie'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Tuesday June 30 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_June 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Open'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Agency 1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Update'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Edit'))

WebUI.rightClick(findTestObject('Page_Batches/a_Delete'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.setText(findTestObject('Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Page_DRIS Home Page/a_Patient Accounting'))

WebUI.click(findTestObject('Page_Patient Accounting Search/a_Batches'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Batches'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Close Selected'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Push Selected'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record_GLBatch-help'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_GL Year Start Month  October'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/input_Add new record_selectAllBatches'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/input_Agency_hfID_241'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Batch'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Type'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_GL Batch_k-grid-filter k-state-active'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_GL Batch_k-icon k-filter'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Open'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Payment'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Alfie'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Tuesday June 30 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_June 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Agency 1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Update'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Refund'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value_1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Alfie'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Tuesday June 30 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_June 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Open'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Agency 1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Update'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Edit'))

WebUI.rightClick(findTestObject('Page_Batches/a_Delete'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.setText(findTestObject('Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Page_DRIS Home Page/a_Patient Accounting'))

WebUI.click(findTestObject('Page_Patient Accounting Search/a_Batches'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_20200701_rnalawade_130'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_Refund'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_0'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_0'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_000'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Edit'))

WebUI.doubleClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Update'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Delete'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.setText(findTestObject('Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Page_DRIS Home Page/a_Patient Accounting'))

WebUI.click(findTestObject('Page_Patient Accounting Search/a_Batches'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Batches'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Close Selected'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Push Selected'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record_GLBatch-help'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_GL Year Start Month  October'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/input_Add new record_selectAllBatches'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/input_Agency_hfID_241'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Batch'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Type'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_GL Batch_k-grid-filter k-state-active'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_GL Batch_k-icon k-filter'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Open'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Payment'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Alfie'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Tuesday June 30 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_June 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Agency 1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Update'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Refund'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value_1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Alfie'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Tuesday June 30 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_June 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Open'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Agency 1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Update'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Edit'))

WebUI.rightClick(findTestObject('Page_Batches/a_Delete'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.setText(findTestObject('Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Page_DRIS Home Page/a_Patient Accounting'))

WebUI.click(findTestObject('Page_Patient Accounting Search/a_Batches'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Batches'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Close Selected'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Push Selected'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record_GLBatch-help'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_GL Year Start Month  October'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/input_Add new record_selectAllBatches'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/input_Agency_hfID_241'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Batch'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Type'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_GL Batch_k-grid-filter k-state-active'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_GL Batch_k-icon k-filter'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Open'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Payment'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Alfie'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Tuesday June 30 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_June 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Agency 1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Update'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Refund'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_Increase value_1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Alfie'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Tuesday June 30 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_June 2020'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Open'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Agency 1'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Update'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Edit'))

WebUI.rightClick(findTestObject('Page_Batches/a_Delete'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.setText(findTestObject('Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Page_DRIS Home Page/a_Patient Accounting'))

WebUI.click(findTestObject('Page_Patient Accounting Search/a_Batches'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_20200701_rnalawade_130'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_Refund'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_0'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_0'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/td_000'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Edit'))

WebUI.doubleClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Update'))

WebUI.rightClick(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Delete'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.setText(findTestObject('Page_Log in/input_User Name_UserName'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Page_Log in/input_Password_Password'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.click(findTestObject('Page_DRIS Home Page/span_Close'))

WebUI.click(findTestObject('Page_DRIS Home Page/a_Patient Accounting'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Patient Accounting Search/div_AR Summary                             _46881b'))

WebUI.click(findTestObject('Page_Patient Accounting Search/a_Batches'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Add new record'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/span_select'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/li_Payment'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Update'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Delete'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Delete'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Delete'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Delete'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Delete'))

WebUI.click(findTestObject('Object Repository/Patient Accounting/duplicate/Page_Batches/a_Delete'))

WebUI.closeBrowser()

