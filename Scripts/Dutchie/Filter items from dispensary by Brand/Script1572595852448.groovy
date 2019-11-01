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

not_run: WebUI.callTestCase(findTestCase('Dutchie/Open TJs Willamette dispensary'), [:], FailureHandling.STOP_ON_FAILURE)

//Click on Brand drop-down
WebUI.click(findTestObject('Dutchie/Dispensary page/BrandDropDown'))

WebUI.delay(2)

//Scroll to Claim 52 brand and click on it
WebUI.scrollToElement(findTestObject('Dutchie/Dispensary page/Claim52BrandType'), 2)

WebUI.click(findTestObject('Dutchie/Dispensary page/Claim52BrandType'))

WebUI.delay(2)

//Select item listed for this brand
WebUI.click(findTestObject('Dutchie/Dispensary page/TJsX_Claim52RESTASH_JAR'))

WebUI.switchToDefaultContent()

WebUI.delay(2)

//Add item to cart
WebUI.click(findTestObject('Dutchie/Product modal/AddToCart_xpath'))

WebUI.switchToDefaultContent()

//Close window that opens (dispensary is closed at the moment and purchase cannot be completed)
WebUI.click(findTestObject('Dutchie/Post-checkout modal/GotItButton'))

//Return to homepage (logo needs to be clicked 2 times in order to return to homepage)
WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

