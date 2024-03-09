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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://craferia.com/home-decor/')

WebUI.waitForPageLoad(30)

WebUI.mouseOver(findTestObject('Object Repository/Home Decor/Page_Buy Home Decor Items of Handicrafts an_da8078/a_Home Decor  Items  Gifts'))

WebUI.click(findTestObject('Object Repository/Home Decor/Page_Buy Home Decor Items of Handicrafts an_da8078/a_Home Accents'))

WebUI.verifyElementText(findTestObject('Object Repository/Home Decor/Page_Decorative Home Accents, Home Decor Ac_c4ffa5/h1_Home Accents'), 
    'Home Accents')

WebUI.verifyElementVisible(findTestObject('Object Repository/Home Decor/Page_Decorative Home Accents, Home Decor Ac_c4ffa5/img_attachment-woocommerce_thumbnail size-w_8f6098'))

WebUI.closeBrowser()

