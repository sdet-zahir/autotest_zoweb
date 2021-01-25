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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://go.zahironline.com/auth')

WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/Registration/Page_Zahir Online  Signup/input_Create Account_email'), 'mailnyatori@mailinator.com')

WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online  Signup/button_Create Account'))

WebUI.setText(findTestObject('Object Repository/Registration/Page_Zahir Online  Complete Profile/input_Phone_full_name'), 
    'mailnyatori')

WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online  Complete Profile/div_Phone_selected-flag'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online  Complete Profile/li_Indonesia62'))

WebUI.setText(findTestObject('Object Repository/Registration/Page_Zahir Online  Complete Profile/input_Phone_material-phone-numer-field colo_4551fa'), 
    '+62 812211122311')

WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online  Complete Profile/div_Select Your Occupations'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online  Complete Profile/div_Entrepreneur (Wiraswasta)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Registration/Page_Zahir Online  Complete Profile/input_Entrepreneur (Wiraswasta)_password'), 
    '/w1kD+5vMvA7nrbALpT4trkwgmu0w8Bh')

WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online  Complete Profile/button_Create Account'))

WebUI.setText(findTestObject('Object Repository/Registration/Page_Zahir Online  Create Company/input_Tell us about your business_name'), 
    'company-mailnyatori')

WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online  Create Company/div_Choose Bussiness Type'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online  Create Company/div_CafeCoffee Shop'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online  Create Company/input_Use Referral Code_jss118'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online  Create Company/button_Save'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online  Signup Success/button_GET STARTED'))

WebUI.closeBrowser()
//WebUI.click(findTestObject('Registration/Page_Zahir Online  Gettingstarted/p_Ill contact later'))
//
//WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online  Dashboard/button_account_circle'))
//
//WebUI.click(findTestObject('Object Repository/Registration/Page_Zahir Online  Dashboard/li_Logout'))

