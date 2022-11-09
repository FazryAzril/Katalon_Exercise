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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('Master/Master_Create_user'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('New_user/Create_user_admin/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-down-fill _93b898'))

WebUI.setText(findTestObject('Object Repository/New_user/Unregistered_User/Page_OrangeHRM/input'), GlobalVariable.Admin_username)

WebUI.click(findTestObject('New_user/Create_user_admin/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-down-fill _93b898'))

WebUI.click(findTestObject('Object Repository/New_user/Unregistered_User/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/New_user/Unregistered_User/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    RandomStringUtils.random(4, 'abcdefghijklmnopqrstuvwxyz'))

WebUI.setEncryptedText(findTestObject('New_user/Create_user_admin/Page_OrangeHRM/Password'), 'R2dZ4hvJ2ujAhQXmywBE/Q==')

WebUI.setEncryptedText(findTestObject('New_user/Create_user_admin/Page_OrangeHRM/Confirm Password'), 'R2dZ4hvJ2ujAhQXmywBE/Q==')

WebUI.click(findTestObject('Object Repository/New_user/Unregistered_User/Page_OrangeHRM/button_Save'))

WebUI.verifyElementText(findTestObject('New_user/Unregistered_User/Page_OrangeHRM/span_Should be least 5 characters'), 'Should be least 5 characters')

