import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Master/Master_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/2. Employment_Status/Add_employment_status/Add_new_employment_status/a_Admin'))

WebUI.click(findTestObject('Object Repository/2. Employment_Status/Add_employment_status/Add_new_employment_status/i_Job_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/2. Employment_Status/Add_employment_status/Add_new_employment_status/li_Employment Status'))

WebUI.click(findTestObject('Object Repository/2. Employment_Status/Add_employment_status/Add_new_employment_status/i_Add_oxd-icon bi-plus oxd-button-icon'))

y = CustomKeywords.'utils.string.randomString'('abcdefghijklmnopqrstuvwxyz0123456789', 5)

KeywordUtil.logInfo(y)

WebUI.setText(findTestObject('Object Repository/2. Employment_Status/Add_employment_status/Add_new_employment_status/input_Name_oxd-input oxd-input--focus'), 
    y)

WebUI.click(findTestObject('Object Repository/2. Employment_Status/Add_employment_status/Add_new_employment_status/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2. Employment_Status/Add_employment_status/Add_new_employment_status/div_SuccessSuccessfully Saved'))

WebUI.verifyElementVisible(findTestObject('2. Employment_Status/Add_employment_status/Add_new_employment_status/div_Employment StatusActionsEmployedFreelan_0dad04', 
        [('status_work') : y]), FailureHandling.STOP_ON_FAILURE)

