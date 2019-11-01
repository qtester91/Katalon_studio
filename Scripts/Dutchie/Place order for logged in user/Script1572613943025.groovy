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

not_run: WebUI.callTestCase(findTestCase('Dutchie/Login to Dutchie'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dutchie/Homepage/AmazonOrganics'))

WebUI.click(findTestObject('Dutchie/Dispensary page/BERNIE_MAC_WICKED_KIND'))

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('Dutchie/Product modal/AddToCart_xpath'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Dutchie/Delivery-pickup modal/Pickup'))

WebUI.click(findTestObject('Dutchie/Dispensary page/CB_DIESEL_WISELY_ORGANICS'))

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('Dutchie/Product modal/AddToCart_xpath'))

WebUI.click(findTestObject('Dutchie/Dispensary page/COOKIE_DAWG_WICKED_KIND'))

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('Dutchie/Product modal/AddToCart_xpath'))

WebUI.click(findTestObject('Dutchie/Dispensary page/BasketContent'))

WebUI.click(findTestObject('Dutchie/Shopping cart modal/ProceedToCheckout'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Dutchie/Checkout/PlaceOrder'))

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.verifyMatch('Thank you for your order!', 'Thank you for your order!', false)

