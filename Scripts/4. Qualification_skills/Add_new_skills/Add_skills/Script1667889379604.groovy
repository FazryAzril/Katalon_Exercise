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

CustomKeywords.'add_skills.add_skills.addSkills'()

WebUI.click(findTestObject('Object Repository/4. Qualification_skills/Add_new_skills/Added_new_name/button_Add'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSkills')

x = CustomKeywords.'utils.string.randomString'('abcdefghijklmnopqrstuvwxyz', 7)

WebUI.setText(findTestObject('Object Repository/4. Qualification_skills/Add_new_skills/Added_new_name/input_Name_oxd-input oxd-input--focus'), 
    x)

WebUI.setText(findTestObject('Object Repository/4. Qualification_skills/Add_new_skills/Added_new_name/textarea_Description_oxd-textarea oxd-texta_fed1e5'), 
    x)

WebUI.click(findTestObject('Object Repository/4. Qualification_skills/Add_new_skills/Added_new_name/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/4. Qualification_skills/Add_new_skills/Added_new_name/div_SuccessSuccessfully Saved'))

WebUI.verifyElementVisible(findTestObject('4. Qualification_skills/Add_new_skills/Added_new_name/div_NameDescriptionActionsCProgramming Lang_be61f9', 
        [('variable') : 'x']), FailureHandling.STOP_ON_FAILURE)

