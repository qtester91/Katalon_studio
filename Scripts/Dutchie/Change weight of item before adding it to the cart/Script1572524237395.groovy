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

not_run: WebUI.callTestCase(findTestCase('Dutchie/Open Oregrown from the search results'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dutchie/Dispensary page/AnimalMintsEvansCreek'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Dutchie/Product modal/Weight'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Dutchie/Product modal/WeightOneOunce'), 2)

WebUI.click(findTestObject('Dutchie/Product modal/WeightOneOunce'))

WebUI.click(findTestObject('Dutchie/Product modal/AddToCart_xpath'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Dutchie/Delivery-pickup modal/Pickup'))

WebUI.waitForPageLoad(2)

WebUI.verifyTextPresent('Qty: 1 - $167.50', false)

WebUI.callTestCase(findTestCase('Dutchie/Remove item from basket'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

