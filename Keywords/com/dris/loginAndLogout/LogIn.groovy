package com.dris.loginAndLogout

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class LogIn {
	@Keyword
	def Login(){
		WebUI.setText(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Log in/input_User Name_UserName'),
				'rkadam')

		WebUI.delay(1)

		'Enter Password'
		WebUI.setEncryptedText(findTestObject('Object Repository/About/Test/Page_Log in/input_Password_Password'), 'dA240odRZCJNMpYSYS1EnA==')

		WebUI.delay(1)

		WebUI.click(findTestObject('Object Repository/Clinical Information/Report Builder/Page_Log in/input_Password_btn btn-primary btn-md'))
	}
}
