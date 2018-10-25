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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.canva.com/')

WebUI.click(findTestObject('Page_Mag-sign in - Google Accounts/Page_Collaborate  Create Amazing Gr/button_Log in_header__form__su'))

WebUI.click(findTestObject('Object Repository/Page_Collaborate  Create Amazing Gr/button_Log in with Google'))

WebUI.switchToWindowTitle('Mag-sign in - Google Accounts')

WebUI.setText(findTestObject('Page_Mag-sign in - Google Accounts/Page_Mag-sign in - Google Accounts/input_Canva_identifier'), 
    'stratpoint.test34@gmail.com')

WebUI.click(findTestObject('Page_Mag-sign in - Google Accounts/Page_Mag-sign in - Google Accounts/content_Susunod'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mag-sign in - Google Accounts/input_Masyadong maraming pagta'), 
    'aW025bOsndfKFFbHb3Fj9w==')

WebUI.click(findTestObject('Object Repository/Page_Mag-sign in - Google Accounts/span_Susunod'))

WebUI.closeBrowser()

