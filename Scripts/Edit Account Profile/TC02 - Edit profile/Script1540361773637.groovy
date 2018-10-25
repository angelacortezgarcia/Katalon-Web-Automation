import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login via username/TC01 - Enter uname and pword'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_All Your Designs  Canva/span_Gela garcia'))

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_All Your Designs  Canva/a_Account settings'))

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Your account settings  Canva/a_Profile'))

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Your account settings  Canva/input_Name_textInput'), 'Gela garcia test')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Your account settings  Canva/input_Username_textInput'), 
    'agarcia148360')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Your account settings  Canva/input_Website_textInput'), 
    'https://www.google.com')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Your account settings  Canva/button_Save changes'))

WebUI.closeBrowser()

