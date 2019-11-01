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

//Click on one of the items from the list
WebUI.click(findTestObject('Dutchie/Dispensary page/BensonArborRoadDawg'))

WebUI.switchToDefaultContent()

WebUI.delay(2)

//Add item to cart
WebUI.click(findTestObject('Dutchie/Product modal/AddToCart_xpath'))

WebUI.switchToDefaultContent()

//Verify that pop-up shows correct message (that dispensary is closed at the moment)
WebUI.verifyMatch('Sorry, TJ\'s on Willamette is closed!', 'Sorry, TJ\'s on Willamette is closed!', false)

WebUI.click(findTestObject('Dutchie/Post-checkout modal/GotItButton'))

//Verify that cart is empty
WebUI.verifyElementText(findTestObject('Dutchie/Dispensary page/EmptyCart'), '0')

//Return to homepage
not_run: WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

