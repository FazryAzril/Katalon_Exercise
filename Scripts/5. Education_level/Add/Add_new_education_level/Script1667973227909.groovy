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

WebUI.callTestCase(findTestCase('Master/Master_education'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/5. Education_level/add_new_education_level/Add_new_education_level/button_Add'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveEducation')

x = CustomKeywords.'utils.string.randomString'('abcdefghijklmnopqrstuvwxyz', 5)

WebUI.setText(findTestObject('Object Repository/5. Education_level/add_new_education_level/Add_new_education_level/input_Level_oxd-input oxd-input--focus'), 
    x)

WebUI.click(findTestObject('Object Repository/5. Education_level/add_new_education_level/Add_new_education_level/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/5. Education_level/add_new_education_level/Add_new_education_level/div_SuccessSuccessfully Saved'))

WebUI.verifyElementVisible(findTestObject('5. Education_level/add_new_education_level/Add_new_education_level/div_LevelActionsBachelors DegreeCollege Und_5e1a59', 
        [('variable') : 'x']))

