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

not_run: WebUI.callTestCase(findTestCase('Dutchie/Change weight of item before adding it to the cart'), [:], FailureHandling.STOP_ON_FAILURE)

//Open Shopping cart modala
WebUI.click(findTestObject('Dutchie/Dispensary page/BasketContent'))

WebUI.delay(2)

//Remove item added to the cart
WebUI.click(findTestObject('Dutchie/Shopping cart modal/RemoveIcon'))

//Verify that cart is empty
WebUI.verifyTextPresent('Your cart is empty', false)

//Close shopping cart modal
WebUI.click(findTestObject('Dutchie/Shopping cart modal/Close'))

WebUI.delay(2)

//Verify that shopping cart is empty
WebUI.verifyElementText(findTestObject('Dutchie/Dispensary page/EmptyCard'), '0')

//Return to the homepage (logo needs to be clicked 2 times because first click returns user to the search result page)
WebUI.click(findTestObject('Dutchie/Dispensary page/Dutchie logo'))

not_run: WebUI.waitForPageLoad(2)

not_run: WebUI.click(findTestObject('Dutchie/Dispensary page/Dutchie logo'))

