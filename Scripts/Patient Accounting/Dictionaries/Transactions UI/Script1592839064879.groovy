import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.junit.After as After
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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver

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

WebUI.click(findTestObject('Patient Accounting/Page_Patient Accounting Search/Sub_ModuleBar_Links/a_Dictionaries'))

WebUI.click(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/a_TransactionsTab'))

BannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/span_TransactionsGridBannerName'))

WebUI.verifyMatch(BannerName, 'Transactions', true)

TransactionCode = WebUI.getText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/a_TransactionCodeColumn_Text'))

WebUI.verifyMatch(TransactionCode, 'Transaction Code', true)

List listElement = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/a_TransactionGridColumn_List'), 
    2)

List list_FilterIcon = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/span_TransactionsGridFilterIcon_List'), 
    2)

size = listElement.size()

WebUI.verifyEqual(size, 7, FailureHandling.CONTINUE_ON_FAILURE)

int j = 1

int k = 1

for (int i = 0; i < size; i++) {
    String text = listElement.get(i).getText()

    println(('**********Text : ' + text) + ' ***************')

    if (text.equals('Transaction Code')) {
        String TransactionCode = WebUI.getText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/td_TransactionsCodeColumn_Text'))

        list_FilterIcon.get(i).click()

        /* WebUI.setText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/input_FilterTextbox', [('‘Var’') : j]), 
            TransactionCode)

        WebUI.click(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/button_Filter', [('var') : k]))*/
        'Locating Input field of filter'
        List input_FilterTextbox_List = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/input_FilterTextbox'), 
            2)

        TestObject to = input_FilterTextbox_List.get(i)

        WebUI.setText(to, TransactionCode)
    }
    
    if (text.equals('Provider Code')) {
        String ProviderCode = WebUI.getText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/td_ProviderCodeColumn_Text'))

        list_FilterIcon.get(i).click()

        /*WebUI.setText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/input_FilterTextbox', [('‘Var’') : ((i*2)-1)]), 
            ProviderCode)

        WebUI.click(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/button_Filter', [('var') : (i+1)]))*/
        'Locating Input field of filter'
        List input_FilterTextbox_List = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/input_FilterTextbox'), 
            2)

        TestObject to = input_FilterTextbox_List.get((i * 2) - 1)

        WebUI.setText(to, TransactionCode)

        List button_filter_List = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/button_Filter'), 
            2)

        TestObject obj = button_filter_List.get(i)

        WebUI.click(obj)
    }
}

/*for (int i = 0; i < size; i++) {
    
	
	
	String text = listElement.get(i).getText()

    switch (text) {
        case 'Transaction Code':
            println(('**********Text : ' + text) + ' ***************')

            String TransactionCode = WebUI.getText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/td_TransactionsCodeColumn_Text'))
			list_FilterIcon.get(i).click()		
			
			List list_FilterTextBox = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/input_FilterTextbox',[(‘Var’) : j]),
				2)
			
			Filter_size = list_FilterTextBox.size()
			
			WebElement ele =  list_FilterTextBox.get(j)
			
			
			WebUI.setText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/input_FilterTextbox',['Var':j]), TransactionCode)
			
			WebUI.click(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/button_Filter',['var':k]))
			
			WebUI.delay(2)
			//WebUI.setText(ele, TransactionCode)
			println("+++++++++"+j)
			j=j+2
			println("+++++++++"+j)
			k=k+1
			

            continue
        case 'Provider Code':
            println(('**********Text : ' + text) + ' ***************')

            String ProviderCode = WebUI.getText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/td_ProviderCodeColumn_Text'))
			list_FilterIcon.get(i).click()
			
			List list_FilterTextBox = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/input_FilterTextbox'),
				2)
			
			Filter_size = list_FilterTextBox.size()
			
			WebUI.setText(list_FilterTextBox.get(j), TransactionCode)
			
			WebUI.delay(2)
			
			println("++++++"+j)
			
			WebUI.setText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/input_FilterTextbox',['Var':j]), ProviderCode)
			
			println("++++++"+j)
			
			WebUI.click(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/button_Filter',['var':k]))
			
			WebUI.delay(2)
			
			j=j+2
			
			

            continue
        case 'Short Description':
            println(('**********Text : ' + text) + ' ***************')

            ShortDescription = WebUI.getText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/td_ShortDescriptionColumn_Text'))
			list_FilterIcon.get(i).click()
			
			List list_FilterTextBox = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/input_FilterTextbox'),
				2)
			
			Filter_size = list_FilterTextBox.size()
			
			WebUI.setText(list_FilterTextBox.get(j), TransactionCode)
			j=j+2

            continue
        case 'ST':
            println(('**********Text : ' + text) + ' ***************')

            ST = WebUI.getText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/td_STColumn_Text'))
			list_FilterIcon.get(i).click()
			
			List list_FilterTextBox = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/input_FilterTextbox'),
				2)
			
			Filter_size = list_FilterTextBox.size()
			
			WebUI.setText(list_FilterTextBox.get(j), TransactionCode)
			j=j+2

            continue
        case 'Transaction Class':
            println(('**********Text : ' + text) + ' ***************')

            TransactionClass = WebUI.getText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/td_TransactionClass_Text'))
			list_FilterIcon.get(i).click()
			
			List list_FilterTextBox = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/input_FilterTextbox'),
				2)
			
			Filter_size = list_FilterTextBox.size()
			
			WebUI.setText(list_FilterTextBox.get(j), TransactionCode)
			j=j+2

            continue
        case 'Service Group':
            println(('**********Text : ' + text) + ' ***************')

            ServiceGroup = WebUI.getText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/td_ServiceGroup_text'))
			list_FilterIcon.get(i).click()
			
			List list_FilterTextBox = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/input_FilterTextbox'),
				2)
			
			Filter_size = list_FilterTextBox.size()
			
			WebUI.setText(list_FilterTextBox.get(j), TransactionCode)
			j=j+2

            continue
        case 'Default POS':
            println(('**********Text : ' + text) + ' ***************')

            DefaultPOS = WebUI.getText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/td_DefaultPOS_Text'))
			list_FilterIcon.get(i).click()
			
			List list_FilterTextBox = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/input_FilterTextbox'),
				2)
			
			Filter_size = list_FilterTextBox.size()
			
			WebUI.setText(list_FilterTextBox.get(j), TransactionCode)
			j=j+2

            continue
    }
}*/
WebUI.click(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/a_ArrowToExpandRecord'))

WebUI.click(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/a_DetailsTab'))

listElement = WebUI.findWebElements(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/div_DetailsCard_List'), 
    2)

size = listElement.size()

WebUI.verifyEqual(size, 4, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/a_Plan GroupTab'))

PlanGroupBannerName = WebUI.getText(findTestObject('Patient Accounting/Page_Dictionaries/TransactionsTab/span_PlanGroupBannerName'))

WebUI.verifyEqual(PlanGroupBannerName, 'Plan Group')

