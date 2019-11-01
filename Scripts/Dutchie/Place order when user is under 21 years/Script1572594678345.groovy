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

not_run: WebUI.callTestCase(findTestCase('Dutchie/Open Blooming Deals dispensary'), [:], FailureHandling.STOP_ON_FAILURE)

//Select one item from the list
WebUI.click(findTestObject('Dutchie/Dispensary page/CannabisNationItem'))

WebUI.switchToDefaultContent()

WebUI.delay(2)

//Add item to the cart
WebUI.click(findTestObject('Dutchie/Product modal/AddToCart_xpath'))

WebUI.switchToDefaultContent()

//Select pickup as delivery method
WebUI.click(findTestObject('Dutchie/Delivery-pickup modal/Pickup'))

WebUI.delay(2)

//Open shopping cart modal
WebUI.click(findTestObject('Dutchie/Dispensary page/BasketContent'))

//Proceed to checkout
WebUI.click(findTestObject('Dutchie/Shopping cart modal/ProceedToCheckout'))

WebUI.delay(2)

//Fill all personal data and set age to be below 21 years
WebUI.sendKeys(findTestObject('Dutchie/Checkout/FirstNameCheckout'), 'firstname')

WebUI.sendKeys(findTestObject('Dutchie/Checkout/LastNameCheckout'), 'lastname')

WebUI.sendKeys(findTestObject('Dutchie/Checkout/PhoneCheckout'), '(804) 677-3648')

WebUI.sendKeys(findTestObject('Dutchie/Checkout/BirthdateCheckout'), '10/02/2003')

//Place order
WebUI.click(findTestObject('Dutchie/Checkout/PlaceOrder'))

//Verify that correct message gets displayed (that user needs to be at least 21 years old)
WebUI.verifyMatch('You must be at least 21 to order.', 'You must be at least 21 to order.', false)

//Remove item from the checkout page
WebUI.click(findTestObject('Dutchie/Checkout/RemoveItemOnCheckoutPage'))

WebUI.switchToDefaultContent()

WebUI.delay(2)

//Verify that text in the pop-up window informs user that cart is empty
WebUI.verifyMatch('There are no more items in your cart', 'There are no more items in your cart', false)

//Click on the button to close pop-up
WebUI.click(findTestObject('Dutchie/Post-checkout modal/KeepShopping'))

//Return to homepage
WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

