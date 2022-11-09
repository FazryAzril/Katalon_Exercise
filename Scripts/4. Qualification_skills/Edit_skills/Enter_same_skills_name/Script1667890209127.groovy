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

WebUI.callTestCase(findTestCase('Master/Master_Add_skills'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/4. Qualification_skills/Edit_skills/User_did_not_enter_skills_name/Page_OrangeHRM/button_Productivity Tools_oxd-icon-button o_2e3ad1'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSkills/10')

WebUI.doubleClick(findTestObject('Object Repository/4. Qualification_skills/Edit_skills/User_did_not_enter_skills_name/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('Object Repository/4. Qualification_skills/Edit_skills/User_did_not_enter_skills_name/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/4. Qualification_skills/Edit_skills/User_did_not_enter_skills_name/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus oxd-i_ad7396'), 
    '')

WebUI.click(findTestObject('Object Repository/4. Qualification_skills/Edit_skills/User_did_not_enter_skills_name/Page_OrangeHRM/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/4. Qualification_skills/Edit_skills/User_did_not_enter_skills_name/Page_OrangeHRM/span_Required'))

