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

WebUI.openBrowser('https://go.zahironline.com')

WebUI.setText(findTestObject('Login/Page_Zahir Online/input_Sign In_username'), 'sdet.zahir@gmail.com')

WebUI.setEncryptedText(findTestObject('Login/Page_Zahir Online/input_Sign In_password'), '1D7vslVqkzGtL7kcg2RSrA==')

WebUI.click(findTestObject('Login/Page_Zahir Online/button_Sign In'))

WebUI.setText(findTestObject('Login/Page_Zahir Online  List Company/input_Choose Company_q'), 'SDET_TEST')

WebUI.doubleClick(findTestObject('Login/Page_Zahir Online  List Company/div_SDET_TEST'))

//WebUI.click(findTestObject('Login/Page_Zahir Online  Dashboard/button_Data Store'))
WebUI.click(findTestObject('Login/Page_Zahir Online  Dashboard/button_account_circle'))

WebUI.click(findTestObject('Login/Page_Zahir Online  Dashboard/p_Logout'))

WebUI.closeBrowser()

