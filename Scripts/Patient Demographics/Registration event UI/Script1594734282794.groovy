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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://citihc5.citi-us.com/DRISDEV/Account/Login?ReturnUrl=%2FDRISDEV%2F')

WebUI.maximizeWindow()

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Log in', true)

WebUI.setText(findTestObject('Clinical/Page_Log in/input_UserName Field'), 'rnalawade')

WebUI.setEncryptedText(findTestObject('Clinical/Page_Log in/input_Password Field'), 'Zwp7BDSIi+g2x7dGC9gVUw==')

WebUI.click(findTestObject('Patient Accounting/Page_Log in/input_Password_btn btn-primary btn-md'))

WebUI.verifyElementPresent(findTestObject('Patient Accounting/Page_DRIS Home Page/span_Login Message'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'DRIS Home Page', true)

WebUI.click(findTestObject('Clinical/Page_DRIS Home Page/a_Clinical Module'))

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Search', true)

WebUI.setText(findTestObject('Clinical/Page_Search/input_Last Name'), GlobalVariable.LastName)

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Search/button_Clear'), 2)

WebUI.click(findTestObject('Clinical/Page_Search/button_Search'))

WebUI.verifyElementPresent(findTestObject('Clinical/Page_Search/span_Search Results Grid Banner Name'), 2)

BannerName = WebUI.getText(findTestObject('Clinical/Page_Search/span_Search Results Grid Banner Name'))

WebUI.verifyMatch(BannerName, 'Search Results', true)

PatientName = WebUI.getText(findTestObject('Clinical/Page_Search/a_PatientLink of First Row'))

WebUI.click(findTestObject('Clinical/Page_Search/a_PatientLink of First Row'))

boolean bool = WebUI.verifyElementPresent(findTestObject('Clinical/Page_Search/button_Yes'), 2)

if (bool) {
    WebUI.click(findTestObject('Clinical/Page_Search/button_Yes'))
}

WebUI.delay(5)

WebUI.click(findTestObject('Clinical/Sub Module Bar/a_Patient Demographics'))

WebUI.click(findTestObject('Clinical/Page_Patient Demographics/Registration/a_Registration'))

BannerName = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/span_Registration Grid_ Banner Name'))

WebUI.verifyMatch(BannerName, 'Registration', false)

List<WebElement> columnHeader_List = WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/Registration/a_Column Header List'), 
    2)

for (WebElement element : columnHeader_List) {
    String columnHeaderName = element.getText()

    println('+++++++ columnHeaderName :' + columnHeaderName)

    if (columnHeaderName.contentEquals('System')) {
        WebUI.verifyMatch(columnHeaderName, 'System', false)

        continue
    }
    
    if (columnHeaderName.contentEquals('Last Updated Registration Date')) {
        WebUI.verifyMatch(columnHeaderName, 'Last Updated Registration Date', false)

        continue
    }
    
    if (columnHeaderName.contentEquals('Last Name')) {
        WebUI.verifyMatch(columnHeaderName, 'Last Name', false)

        continue
    }
    
    if (columnHeaderName.contentEquals('First Name')) {
        WebUI.verifyMatch(columnHeaderName, 'First Name', false)

        continue
    }
    
    if (columnHeaderName.contentEquals('Middle Name')) {
        WebUI.verifyMatch(columnHeaderName, 'Middle Name', false)

        continue
    }
    
    if (columnHeaderName.contentEquals('DOB')) {
        WebUI.verifyMatch(columnHeaderName, 'DOB', false)

        continue
    }
    
    if (columnHeaderName.contentEquals('Address Line 1')) {
        WebUI.verifyMatch(columnHeaderName, 'Address Line 1', false)

        continue
    }
    
    if (columnHeaderName.contentEquals('Sex')) {
        WebUI.verifyMatch(columnHeaderName, 'Sex', false)

        continue
    }
    
    if (columnHeaderName.contentEquals('SSN')) {
        WebUI.verifyMatch(columnHeaderName, 'SSN', false)

        continue
    }
    
    if (columnHeaderName.contentEquals('MRN')) {
        WebUI.verifyMatch(columnHeaderName, 'MRN', false)

        continue
    }
    
    if (columnHeaderName.contentEquals('Previous MRN')) {
        WebUI.verifyMatch(columnHeaderName, 'Previous MRN', false)

        continue
    }
    
    if (columnHeaderName.contentEquals('Location')) {
        WebUI.verifyMatch(columnHeaderName, 'Location', false)

        continue
    }
}

CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Registration Grid')

WebUI.click(findTestObject('Clinical/Page_Patient Demographics/Registration/button_Export'))

WebUI.click(findTestObject('Clinical/Page_Patient Demographics/Registration/a_Arrow of First Row'))

List<WebElement> tab_List = WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/Registration/a_Tab List'), 
    2)

for (WebElement element : tab_List) {
    String tabName = element.getText()

    println('+++++++ tabName :' + tabName)

    if (tabName.contentEquals('General Info')) {
        WebUI.verifyMatch(tabName, 'General Info', false)

        element.click()
		
		CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Registration Grid- General Info')

        String text = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/General Info/h6_Contact Information'))

        WebUI.verifyMatch(text, 'Contact Information', false)

        text = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/General Info/div_PatientName'))

        WebUI.verifyMatch(text, PatientName, false)
		
		List <WebElement> label_list = WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/Registration/General Info/label_Contact Information_Label List'),
			2)
		for(WebElement element1 : label_list){
			String label = element1.getText()
			
			println('+++++++++ label :'+label)
			
			
			if(label.contentEquals('DOB')){
				WebUI.verifyMatch(label, 'DOB', false)
				continue
			}
			
			if(label.contentEquals('SSN')){
				WebUI.verifyMatch(label, 'SSN', false)
				continue
			}
			
			if(label.contentEquals('Sex')){
				WebUI.verifyMatch(label, 'Sex', false)
				continue
			}
			
			if(label.contentEquals('Gender Identity')){
				WebUI.verifyMatch(label, 'Gender Identity', false)
				continue
			}
			
			if(label.contentEquals('MRN')){
				WebUI.verifyMatch(label, 'MRN', false)
				continue
			}
			
			if(label.contentEquals('Previous MRN')){
				WebUI.verifyMatch(label, 'Previous MRN', false)
				continue
			}
			
			if(label.contentEquals('System Patient ID')){
				WebUI.verifyMatch(label, 'System Patient ID', false)
				continue
			}
			
			if(label.contentEquals('System')){
				WebUI.verifyMatch(label, 'System', false)
				continue
			}
			
		}
		
		
		text = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/General Info/h6_Secondary Information'))
		WebUI.verifyMatch(text, 'Secondary Information', false)
		
		List<WebElement> secInfoLabel_List = WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/Registration/General Info/label_Secondary Information_Organ Donor')
			,2)
		
		for(WebElement element2 : secInfoLabel_List){
			
			String label = element2.getText()
			
			println('++++++++++++ label :'+ label)
			
			if(label.contentEquals('Race')){
				WebUI.verifyMatch(label, 'Race', false)
				continue
			}
			
			if(label.contentEquals('Ethnicity')){
				WebUI.verifyMatch(label, 'Ethnicity', false)
				continue
			}
			
			if(label.contentEquals('Religion')){
				WebUI.verifyMatch(label, 'Religion', false)
				continue
			}
			
			if(label.contentEquals('Date Of Death')){
				WebUI.verifyMatch(label, 'Date Of Death', false)
				continue
			}
			
			if(label.contentEquals('Deceased')){
				WebUI.verifyMatch(label, 'Deceased', false)
				continue
			}
			
			if(label.contentEquals('Cause Of Death')){
				WebUI.verifyMatch(label, 'Cause Of Death', false)
				continue
			}
			
			if(label.contentEquals('Multi-Discipline Patient')){
				WebUI.verifyMatch(label, 'Multi-Discipline Patient', false)
				continue
			}
			
			if(label.contentEquals('Organ Donor')){
				WebUI.verifyMatch(label, 'Organ Donor', false)
				continue
			}
			
			if(label.contentEquals('Veteran Status')){
				WebUI.verifyMatch(label, 'Veteran Status', false)
				continue
			}
			
			if(label.contentEquals('VIP')){
				WebUI.verifyMatch(label, 'VIP', false)
				continue
			}
			
			if(label.contentEquals('VIP Description')){
				WebUI.verifyMatch(label, 'VIP Description', false)
				continue
			}
			
			if(label.contentEquals('Marital Status')){
				WebUI.verifyMatch(label, 'Marital Status', false)
				continue
			}
			
			if(label.contentEquals('Exempt from Reporting')){
				WebUI.verifyMatch(label, 'Exempt from Reporting', false)
				continue
			}
			
			if(label.contentEquals('Maiden Name')){
				WebUI.verifyMatch(label, 'Maiden Name', false)
				continue
			}
			
			if(label.contentEquals('Patient Status')){
				WebUI.verifyMatch(label, 'Patient Status', false)
				continue
			}
			
			if(label.contentEquals('Privacy Notify Date')){
				WebUI.verifyMatch(label, 'Privacy Notify Date', false)
				continue
			}
			
			if(label.contentEquals('Preferred Language')){
				WebUI.verifyMatch(label, 'Preferred Language', false)
				continue
			}
			
			if(label.contentEquals('Preferred Communication')){
				WebUI.verifyMatch(label, 'Preferred Communication', false)
				continue
			}
			
			if(label.contentEquals('Other Patient Name')){
				WebUI.verifyMatch(label, 'Other Patient Name', false)
				continue
			}
			
			if(label.contentEquals('Mother\'s First Name')){
				WebUI.verifyMatch(label, 'Mother\'s First Name', false)
				continue
			}
			
			if(label.contentEquals('Mother\'s Maiden Name')){
				WebUI.verifyMatch(label, 'Mother\'s Maiden Name', false)
				continue
			}
			
			if(label.contentEquals('Initial Eval Date')){
				WebUI.verifyMatch(label, 'Initial Eval Date', false)
				continue
			}
			
			if(label.contentEquals('Birthplace')){
				WebUI.verifyMatch(label, 'Birthplace', false)
				continue
			}
			
		}
		
        continue
    }
    
    if (tabName.contentEquals('Relations')) {
        WebUI.verifyMatch(tabName, 'Relations', false)

        element.click()
		
		CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Registration Grid- Relations')
		
		String BannerName = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Relation/span_Patient Relations'))
        WebUI.verifyMatch(BannerName, 'Patient Relations', false)
		
		List <WebElement> PatRel_ColumnHeaderList = WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/Registration/Relation/th_Patients Relation Grid_Column Header List'),
			2)
		
		for(WebElement PatRel_element : PatRel_ColumnHeaderList ){
			String columnHeader = PatRel_element.getText()
			
			println('++++++++ columnHeader :'+columnHeader)
			
			if(columnHeader.contentEquals('Title')){
				WebUI.verifyMatch(columnHeader, 'Title', false)
				continue
			}
			
			if(columnHeader.contentEquals('Name')){
				WebUI.verifyMatch(columnHeader, 'Name', false)
				continue
			}
			
			if(columnHeader.contentEquals('Preferred Name')){
				WebUI.verifyMatch(columnHeader, 'Preferred Name', false)
				continue
			}
			if(columnHeader.contentEquals('Date of Birth')){
				WebUI.verifyMatch(columnHeader, 'Date of Birth', false)
				continue
			}
			if(columnHeader.contentEquals('SSN')){
				WebUI.verifyMatch(columnHeader, 'SSN', false)
				continue
			}
			if(columnHeader.contentEquals('Gender')){
				WebUI.verifyMatch(columnHeader, 'Gender', false)
				continue
			}
			if(columnHeader.contentEquals('Phone')){
				WebUI.verifyMatch(columnHeader, 'Phone', false)
				continue
			}
			if(columnHeader.contentEquals('Address')){
				WebUI.verifyMatch(columnHeader, 'Address', false)
				continue
			}
			if(columnHeader.contentEquals('Education Level')){
				WebUI.verifyMatch(columnHeader, 'Education Level', false)
				continue
			}
			if(columnHeader.contentEquals('Agent')){
				WebUI.verifyMatch(columnHeader, 'Agent', false)
				continue
			}
			if(columnHeader.contentEquals('Support Person')){
				WebUI.verifyMatch(columnHeader, 'Support Person', false)
				continue
			}
			if(columnHeader.contentEquals('Next of Kin')){
				WebUI.verifyMatch(columnHeader, 'Next of Kin', false)
				continue
			}
			if(columnHeader.contentEquals('EmergencyContact')){
				WebUI.verifyMatch(columnHeader, 'EmergencyContact', false)
				continue
			}
			if(columnHeader.contentEquals('Guardian')){
				WebUI.verifyMatch(columnHeader, 'Guardian', false)
				continue
			}
			
		}
		
		continue
    }
    
    if (tabName.contentEquals('Employment')) {
        WebUI.verifyMatch(tabName, 'Employment', false)

        element.click()
		
		CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Registration Grid- Employment')
		
		String cardHeader = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Employment/h6_Employer Contact Information'))
		WebUI.verifyMatch(cardHeader, 'Employer Contact Information', false)
		
		cardHeader = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Employment/h6_Employment Details'))
		WebUI.verifyMatch(cardHeader, 'Employment Details', false)
		
		List<WebElement> empDetailLabel_list = WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/Registration/Employment/label_Employment Detail_Label List'),
			2)
		
		for(WebElement empDetailLabel :  empDetailLabel_list){
			String label = empDetailLabel.getText()
			
			println('++++++++++++ label'+label)
			
			if(label.contentEquals('Occupation')){
				WebUI.verifyMatch(label, 'Occupation', false)
				continue
			}
			
			if(label.contentEquals('Department')){
				WebUI.verifyMatch(label, 'Department', false)
				continue
			}
			
			if(label.contentEquals('Employment Status')){
				WebUI.verifyMatch(label, 'Employment Status', false)
				continue
			}
			
			if(label.contentEquals('Contact')){
				WebUI.verifyMatch(label, 'Contact', false)
				continue
			}
			
			if(label.contentEquals('Employment Begin Date')){
				WebUI.verifyMatch(label, 'Employment Begin Date', false)
				continue
			}
			
			if(label.contentEquals('Employment End Date')){
				WebUI.verifyMatch(label, 'Employment End Date', false)
				continue
			}
			
			if(label.contentEquals('Date Disabled')){
				WebUI.verifyMatch(label, 'Date Disabled', false)
				continue
			}
			
			if(label.contentEquals('Date Retired')){
				WebUI.verifyMatch(label, 'Date Retired', false)
				continue
			}
			
		}
		
        continue
    }
    
    if (tabName.contentEquals('Guarantor')) {
        WebUI.verifyMatch(tabName, 'Guarantor', false)

        element.click()
		
		CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Registration Grid- Guarantor')
		
		String GuarantorDetailsCard_Header = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Guarantor/h6_Guarantor Details'))
		WebUI.verifyMatch(GuarantorDetailsCard_Header, 'Guarantor Details', false)
		
		String GuarantorEmp_Header = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Guarantor/h6_Guarantor Employer'))
		WebUI.verifyMatch(GuarantorEmp_Header, 'Guarantor Employer', false)
		
		String GuarantorDetailsCard_text
		GuarantorDetailsCard_text = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Guarantor/h9_Primary Address'))
		WebUI.verifyMatch(GuarantorDetailsCard_text, 'Primary Address', false)
		
		GuarantorDetailsCard_text = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Guarantor/h9_Alternate Address'))
		WebUI.verifyMatch(GuarantorDetailsCard_text, 'Alternate Address', false)
		
		List<WebElement> GuarantorLabel_list = WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/Registration/Guarantor/label_Guarantor Label_List'),
			2)
		
		for( WebElement GuarantorLabel: GuarantorLabel_list){
			String label = GuarantorLabel.getText()
			
			if(label.contentEquals('DOB')){
				WebUI.verifyMatch(label, 'DOB', false)
				continue
			}
			
			if(label.contentEquals('Patient Relation')){
				WebUI.verifyMatch(label, 'Patient Relation', false)
				continue
			}
			
			if(label.contentEquals('Guarantor SSN')){
				WebUI.verifyMatch(label, 'Guarantor SSN', false)
				continue
			}
			
			if(label.contentEquals('Gender')){
				WebUI.verifyMatch(label, 'Gender', false)
				continue
			}
			
			if(label.contentEquals('Employment Occupation')){
				WebUI.verifyMatch(label, 'Employment Occupation', false)
				continue
			}
			
			if(label.contentEquals('Employment status')){
				WebUI.verifyMatch(label, 'Employment status', false)
				continue
			}
			
		}
		
        continue
    }
    
    if (tabName.contentEquals('Emergency Contact')) {
        WebUI.verifyMatch(tabName, 'Emergency Contact', false)
		
        element.click()
		
		CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Registration Grid- Emergency Contact')
		
		String emrgContInfo_text = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Emergency Contact/h6_Emergency Contact Information'))
		WebUI.verifyMatch(emrgContInfo_text, 'Emergency Contact Information', false)
		
		emrgContInfo_text = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Emergency Contact/h6_Secondary Contact Information'))
		WebUI.verifyMatch(emrgContInfo_text, 'Secondary Contact Information', false)
		
		List<WebElement> Label_list = WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/Registration/Emergency Contact/label_Label List'),
			 2)
		
		for(WebElement label : Label_list){
			
			String label_text = label.getText()
			
			if(label_text.contentEquals('Relation')){
				WebUI.verifyMatch(label_text, 'Relation', false)
				continue
			}
			
			if(label_text.contentEquals('SSN')){
				WebUI.verifyMatch(label_text, 'SSN', false)
				continue
			}
			
			if(label_text.contentEquals('DOB')){
				WebUI.verifyMatch(label_text, 'DOB', false)
				continue
			}
			
			if(label_text.contentEquals('Gender')){
				WebUI.verifyMatch(label_text, 'Gender', false)
				continue
			}
			
		}
		
        continue
    }
    
    if (tabName.contentEquals('Provider')) {
        WebUI.verifyMatch(tabName, 'Provider', false)
		
        element.click()
		
		CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Registration Grid- Provider')
		
		String cardHeader =  WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Provider/h6_Primary Care Provider'))
		WebUI.verifyMatch(cardHeader, 'Primary Care Provider', false)
        
		cardHeader = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Provider/h6_Secondary Care Provider'))
		WebUI.verifyMatch(cardHeader, 'Secondary Care Provider', false)
		
		cardHeader = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Provider/h6_Preferred Provider'))
		WebUI.verifyMatch(cardHeader, 'Preferred Provider', false)
		
		continue
    }
    
    if (tabName.contentEquals('Insurance')) {
        WebUI.verifyMatch(tabName, 'Insurance', false)
		
        element.click()
		
		CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Registration Grid- Insurance')
		
		String BannerName = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Insurance/span_Insurance Details'))
		WebUI.verifyMatch(BannerName, 'Insurance Details', false)
		
		List<WebElement> columnHeader_list = WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/Registration/Insurance/a_Column Header List'),
			2)
		
		for(WebElement columnHeader : columnHeader_list){
			
			String columnHeader_text = columnHeader.getText()
			
			println('++++++++ columnHeader_text'+ columnHeader_text)
			
			if(columnHeader_text.contentEquals('Priority')){
				WebUI.verifyMatch(columnHeader_text, 'Priority', false)
			}
			
			if(columnHeader_text.contentEquals('Carrier Name')){
				WebUI.verifyMatch(columnHeader_text, 'Carrier Name', false)
			}
			
			if(columnHeader_text.contentEquals('Plan Name')){
				WebUI.verifyMatch(columnHeader_text, 'Plan Name', false)
			}
			
			if(columnHeader_text.contentEquals('Plan Number')){
				WebUI.verifyMatch(columnHeader_text, 'Plan Number', false)
			}
			
			if(columnHeader_text.contentEquals('Financial Class')){
				WebUI.verifyMatch(columnHeader_text, 'Financial Class', false)
			}
			
			if(columnHeader_text.contentEquals('Subscriber Name')){
				WebUI.verifyMatch(columnHeader_text, 'Subscriber Name', false)
			}
			
			if(columnHeader_text.contentEquals('Subscriber Number')){
				WebUI.verifyMatch(columnHeader_text, 'Subscriber Number', false)
			}
			
		}
		
        continue
    }
    
    if (tabName.contentEquals('Referral History')) {
        WebUI.verifyMatch(tabName, 'Referral History', false)
        element.click()
        
		CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Registration Grid- Referral History')
		
		String BannerName = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Referral History/span_Referral History'))
		WebUI.verifyMatch(BannerName, 'Referral History', false)
		
		List<WebElement> columnHeader_list =  WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/Registration/Referral History/td_Column List'),
			2)
		
		for(WebElement columnHeader : columnHeader_list){
			String columnHeader_text = columnHeader.getText()
			
			println('+++++++++++ columnHeader_text :'+columnHeader_text)
			
			if(columnHeader_text.contentEquals('Date Referred')){
				WebUI.verifyMatch(columnHeader_text, 'Date Referred', false)
				continue
			}
			
			if(columnHeader_text.contentEquals('Referred From')){
				WebUI.verifyMatch(columnHeader_text, 'Referred From', false)
				continue
			}
			
			if(columnHeader_text.contentEquals('Referred to Provider')){
				WebUI.verifyMatch(columnHeader_text, 'Referred to Provider', false)
				continue
			}
			
			if(columnHeader_text.contentEquals('Reason')){
				WebUI.verifyMatch(columnHeader_text, 'Reason', false)
				continue
			}
			
			if(columnHeader_text.contentEquals('Appointment Date and Time')){
				WebUI.verifyMatch(columnHeader_text, 'Appointment Date and Time', false)
				continue
			}
			
			if(columnHeader_text.contentEquals('Category')){
				WebUI.verifyMatch(columnHeader_text, 'Category', false)
				continue
			}
			
			if(columnHeader_text.contentEquals('Status')){
				WebUI.verifyMatch(columnHeader_text, 'Status', false)
				continue
			}
			
		}
		
		continue
    }
    
    if (tabName.contentEquals('Legacy Identifiers')) {
        WebUI.verifyMatch(tabName, 'Legacy Identifiers', false)
		
        element.click()
		
		CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Registration Grid- Legacy Identifiers')
		
		String BannerName = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Legacy Identifiers/span_Legacy Identifiers'))
        WebUI.verifyMatch(BannerName, 'Legacy Identifiers', false)
		
		List<WebElement> columnHeader_list = WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/Registration/Legacy Identifiers/th_Column Header List'),
			2)
		
		for(WebElement columnHeader : columnHeader_list){
			
			String columnHeader_text = columnHeader.getText()
			
			if(columnHeader_text.contentEquals('ID Type')){
				
				WebUI.verifyMatch(columnHeader_text, 'ID Type', false)
				continue
			}
			
			
			if(columnHeader_text.contentEquals('ID')){
				
				WebUI.verifyMatch(columnHeader_text, 'ID', false)
				continue
			}
			
			
			if(columnHeader_text.contentEquals('Start Date')){
				
				WebUI.verifyMatch(columnHeader_text, 'Start Date', false)
				continue
			}
			
			if(columnHeader_text.contentEquals('Stop Date')){
				
				WebUI.verifyMatch(columnHeader_text, 'Stop Date', false)
				continue
			}
			
			if(columnHeader_text.contentEquals('Issuing Organization ID')){
				
				WebUI.verifyMatch(columnHeader_text, 'Issuing Organization ID', false)
				continue
			}
			
		}
		
		continue
    }
    
    if (tabName.contentEquals('Pharmacies')) {
        WebUI.verifyMatch(tabName, 'Pharmacies', false)
        
		element.click()
        
		CustomKeywords.'com.dris.LoginMessage.captuteScreenshot'('Registration Grid- Pharmacies')
		
		String Pharmacies_BannerName = WebUI.getText(findTestObject('Clinical/Page_Patient Demographics/Registration/Pharmacies/span_Patient Pharmacies Grid_Banner Name'))
		WebUI.verifyMatch(Pharmacies_BannerName, 'Patient Pharmacies', false)
		
		List<WebElement> PharmaciescolumnHeader_List = WebUI.findWebElements(findTestObject('Clinical/Page_Patient Demographics/Registration/Pharmacies/a_Column Header_List'),
			2)
		
		for(WebElement columnHeader : PharmaciescolumnHeader_List){
			
			String colHeader = columnHeader.getText()
			
			if(colHeader.contentEquals('Name')){
				WebUI.verifyMatch(colHeader, 'Name', false)
				continue
			}
			
			if(colHeader.contentEquals('Address')){
				WebUI.verifyMatch(colHeader, 'Address', false)
				continue
			}
			
			if(colHeader.contentEquals('City')){
				WebUI.verifyMatch(colHeader, 'City', false)
				continue
			}
			
			if(colHeader.contentEquals('State')){
				WebUI.verifyMatch(colHeader, 'State', false)
				continue
			}
			
			if(colHeader.contentEquals('Zip Code')){
				WebUI.verifyMatch(colHeader, 'Zip Code', false)
				continue
			}
			
			if(colHeader.contentEquals('Phone')){
				WebUI.verifyMatch(colHeader, 'Phone', false)
				continue
			}
			
			if(colHeader.contentEquals('Fax')){
				WebUI.verifyMatch(colHeader, 'Fax', false)
				continue
			}
			
		}
		
		continue
    }
}

