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

WebUI.click(findTestObject('Object Repository/5. Education_level/Edit/rename_education_name/Page_OrangeHRM/button_concat(Master, , s Degree)_oxd-icon-_56b9da'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveEducation/3')

WebUI.click(findTestObject('Object Repository/5. Education_level/Edit/rename_education_name/Page_OrangeHRM/div_Edit EducationLevel  Required Cancel  Save'))

WebUI.click(findTestObject('5. Education_level/Edit/rename_education_name/Page_OrangeHRM/input_Level_oxd-input oxd-input--focus'))

WebUI.sendKeys(findTestObject('5. Education_level/Edit/did_not_enter_education_name/Page_OrangeHRM/input_Level_oxd-input oxd-input--active'), Keys.chord(
        Keys.CONTROL,'a'))

WebUI.sendKeys(findTestObject('5. Education_level/Edit/did_not_enter_education_name/Page_OrangeHRM/input_Level_oxd-input oxd-input--active'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('5. Education_level/Edit/rename_education_name/Page_OrangeHRM/input_Level_oxd-input oxd-input--focus oxd-_4ebacc'), 
    'Test')

WebUI.click(findTestObject('Object Repository/5. Education_level/Edit/rename_education_name/Page_OrangeHRM/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/5. Education_level/Edit/rename_education_name/Page_OrangeHRM/div_SuccessSuccessfully Updated'))

