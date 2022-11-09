import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginStep {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to orangeHRM Homepage")
	def I_navigate_to_orangeHRM_homepage() {
		
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
	}

	@And("I enter username (.*) and password (.*)")
	def I_enter_valid_username_and_password(String username, String password) {
		
		WebUI.setText(findTestObject('Object Repository/Login/Valid_username/input_Username_username'), 'Admin')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Login/Valid_username/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')
	}

	@And("I click Log in button")
	def IClickLogInButton() {
		WebUI.click(findTestObject('Object Repository/Login/Valid_username/button_Login'))
	}
	
	@Then("I verify the image")
	def IVerifyTheImage () {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Valid_username/img'))
	}
}