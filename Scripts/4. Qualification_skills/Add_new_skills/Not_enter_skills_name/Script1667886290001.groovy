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

WebUI.click(findTestObject('Object Repository/4. Qualification_skills/Add_new_skills/Did_not_enter_skills_name/Page_OrangeHRM/button_Add'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSkills')

WebUI.setText(findTestObject('Object Repository/4. Qualification_skills/Add_new_skills/Did_not_enter_skills_name/Page_OrangeHRM/textarea_Description_oxd-textarea oxd-texta_fed1e5'), 
    'Test123')

WebUI.click(findTestObject('Object Repository/4. Qualification_skills/Add_new_skills/Did_not_enter_skills_name/Page_OrangeHRM/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/4. Qualification_skills/Add_new_skills/Did_not_enter_skills_name/Page_OrangeHRM/span_Required'))

