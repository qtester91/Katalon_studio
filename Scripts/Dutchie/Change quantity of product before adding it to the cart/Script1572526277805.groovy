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

WebUI.callTestCase(findTestCase('Dutchie/Open Blooming Deals dispensary'), [:], FailureHandling.STOP_ON_FAILURE)

//Select item from the list
WebUI.click(findTestObject('Dutchie/Dispensary page/Cannabis Nation Cherry Chem'))

WebUI.switchToDefaultContent()

//Change quantity from 1 to 10 items
WebUI.click(findTestObject('Dutchie/Product modal/SelectQuantity'))

WebUI.scrollToElement(findTestObject('Dutchie/Product modal/10 items'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Dutchie/Product modal/10 items'))

WebUI.delay(2)

//Add item to cart
WebUI.click(findTestObject('Dutchie/Product modal/AddToCart_xpath'))

WebUI.switchToDefaultContent()

//Select Pickup as delivery type
WebUI.click(findTestObject('Dutchie/Delivery-pickup modal/Pickup'))

//Verify that correct quantity/price is displayed
WebUI.verifyTextPresent('Qty: 10 - $72.00', false)

