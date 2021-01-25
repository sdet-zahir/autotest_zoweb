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

WebUI.setText(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online/input_Sign In_username'), 'sdet.zahir@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online/input_Sign In_password'), 
    '1D7vslVqkzGtL7kcg2RSrA==')

WebUI.click(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online/button_Sign In'))

WebUI.doubleClick(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online  List Company/div_SDET_ZAHIR'))

WebUI.click(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online  Dashboard/button_Data Store'))

WebUI.click(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online  Data Store/a_Product DataManage Product Data'))

WebUI.click(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online  Product Data/a_Create New'))

WebUI.setText(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online  Add Product/input_Product Name_field-name'), 
    'Shampo')

WebUI.click(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online  Add Product/button_Save'))

WebUI.click(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online  Add Product/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online  Product Data/svg_Active_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online  Product Data/li_Edit'))

WebUI.setText(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online  Edit Product/input_Product Name_field-name'), 
    'Shampo Men')

WebUI.click(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online  Edit Product/button_Save'))

WebUI.click(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online  Product Data/span_account_circle'))

WebUI.click(findTestObject('Object Repository/Master Data/Product/Page_Zahir Online  Product Data/p_Logout'))

