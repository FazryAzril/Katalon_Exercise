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

WebUI.click(findTestObject('1.User_Management/Add_New_account/Create_user_admin/Page_OrangeHRM/Dropwdown_1'))

WebUI.click(findTestObject('Page_OrangeHRM/Page_OrangeHRM/span_Admin'))

WebUI.setText(findTestObject('Object Repository/1.User_Management/Add_New_account/Create_user_admin/Page_OrangeHRM/input'), 
    'John  Smith')

WebUI.click(findTestObject('Object Repository/1.User_Management/Add_New_account/Create_user_admin/Page_OrangeHRM/Dropwdown_2'))

WebUI.verifyElementText(findTestObject('Object Repository/1.User_Management/Add_New_account/Create_user_admin/Page_OrangeHRM/div_Enabled'), 
    'Enabled')

WebUI.click(findTestObject('Object Repository/1.User_Management/Add_New_account/Create_user_admin/Page_OrangeHRM/div_Enabled'))

WebUI.click(findTestObject('1.User_Management/Add_New_account/Create_user_admin/Page_OrangeHRM/Username_div'))

y = CustomKeywords.'utils.string.randomString'('abcdefghijklmnopqrstuvwxyz', 5)

WebUI.setText(findTestObject('1.User_Management/Add_New_account/Create_user_admin/Page_OrangeHRM/Username_Input'), y)

WebUI.setEncryptedText(findTestObject('Object Repository/1.User_Management/Add_New_account/Create_user_admin/Page_OrangeHRM/Password_Input'), 
    'TxG0S2S+VkIKkWMkFey6Uw==')

WebUI.setEncryptedText(findTestObject('Object Repository/1.User_Management/Add_New_account/Create_user_admin/Page_OrangeHRM/Confirm_Password_Input'), 
    'TxG0S2S+VkIKkWMkFey6Uw==')

WebUI.click(findTestObject('1.User_Management/Add_New_account/Create_user_admin/Page_OrangeHRM/button_Save'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers')

