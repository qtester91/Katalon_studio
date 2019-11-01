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

//Click to add one item from the list
WebUI.click(findTestObject('Dutchie/Dispensary page/CannabisNationItem'))

WebUI.switchToDefaultContent()

WebUI.delay(2)

//Add item to the cart
WebUI.click(findTestObject('Dutchie/Product modal/AddToCart_xpath'))

WebUI.switchToDefaultContent()

//Select delivery method
WebUI.click(findTestObject('Dutchie/Delivery-pickup modal/Pickup'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

//Add second item from the list
WebUI.click(findTestObject('Dutchie/Dispensary page/CannabisNationCherryChem'))

WebUI.switchToDefaultContent()

WebUI.delay(2)

//Add item to the cart
WebUI.click(findTestObject('Dutchie/Product modal/AddToCart_xpath'))

WebUI.delay(2)

//Add third item from the list
WebUI.click(findTestObject('Dutchie/Dispensary page/CannabisNationCherryPieOG'))

WebUI.switchToDefaultContent()

WebUI.delay(2)

//Add item to the cart 
WebUI.click(findTestObject('Dutchie/Product modal/AddToCart_xpath'))

//Open shopping cart
WebUI.click(findTestObject('Dutchie/Dispensary page/BasketContent'))

WebUI.switchToDefaultContent()

//Proceed to checkout
WebUI.click(findTestObject('Dutchie/Shopping cart modal/ProceedToCheckout'))

WebUI.waitForPageLoad(2)

//Verify that correct items are listed on checkout page
WebUI.verifyMatch('Cannabis Nation | ATF | 1g', 'Cannabis Nation | ATF | 1g', false)

WebUI.verifyMatch('Cannabis Nation | Cherry Chem | 1g', 'Cannabis Nation | Cherry Chem | 1g', false)

WebUI.verifyMatch('Cannabis Nation | Cherry Pie OG | 1g', 'Cannabis Nation | Cherry Pie OG | 1g', false)

//Insert personal details in order to complete order
WebUI.sendKeys(findTestObject('Dutchie/Checkout/FirstNameCheckout'), 'firstname')

WebUI.sendKeys(findTestObject('Dutchie/Checkout/LastNameCheckout'), 'lastname')

WebUI.sendKeys(findTestObject('Dutchie/Checkout/PhoneCheckout'), '(201) 677-4567')

WebUI.sendKeys(findTestObject('Dutchie/Checkout/BirthdateCheckout'), '05/25/1974')

//Place order
WebUI.click(findTestObject('Dutchie/Checkout/PlaceOrder'))

WebUI.switchToDefaultContent()

//Skip leaving email&password 
WebUI.click(findTestObject('Dutchie/Post-checkout modal/NoThanks'))

//Return to homepage
WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

WebUI.click(findTestObject('Dutchie/Homepage/BloomingDealsLink'))

