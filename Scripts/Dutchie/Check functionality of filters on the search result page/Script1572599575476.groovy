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

not_run: WebUI.callTestCase(findTestCase('Dutchie/Open Dutchie homepage'), [:], FailureHandling.STOP_ON_FAILURE)

//Trigger search for dispensaries in Portland
WebUI.sendKeys(findTestObject('Dutchie/Homepage/searchBar'), 'Portland')

WebUI.scrollToElement(findTestObject('Dutchie/Homepage/FirstDispensaryInDropDown'), 2)

WebUI.click(findTestObject('Dutchie/Homepage/FirstDispensaryInDropDown'))

WebUI.waitForPageLoad(2)

//Mark 'Open for delivery' checkbox
WebUI.click(findTestObject('Dutchie/Search results/OpenForDelivery'))

//Verify that correct text is displayed on the page
WebUI.verifyMatch('We couldn\'t find any dispensaries!', 'We couldn\'t find any dispensaries!', false)

//Uncheck 'Open for delivery' checkbox 
WebUI.click(findTestObject('Dutchie/Search results/OpenForDelivery'))

WebUI.delay(5)

//Mark 'No delivery minimum' checkbox 
WebUI.click(findTestObject('Dutchie/Search results/NoDeliveryMinimum'))

//Verify that correct text is displayed on the page
WebUI.verifyMatch('We couldn\'t find any dispensaries!', 'We couldn\'t find any dispensaries!', false)

//Uncheck 'No delivery minimum' checkbox
WebUI.click(findTestObject('Dutchie/Search results/NoDeliveryMinimum'))

WebUI.delay(5)

//Mark 'Accept credit cards' checkbox
WebUI.click(findTestObject('Dutchie/Search results/AcceptsCreditCards'))

//Verify that dispensaries are listed on the page (text NOT present)
WebUI.verifyTextNotPresent('We couldn\'t find any dispensaries!', false, FailureHandling.STOP_ON_FAILURE)

//Uncheck 'Accept credit cards' checkbox
WebUI.click(findTestObject('Dutchie/Search results/AcceptsCreditCards'))

WebUI.delay(5)

//Mark 'Free delivery' checkbox
WebUI.click(findTestObject('Dutchie/Search results/FreeDelivery'))

WebUI.delay(2)

//Verify that correct dispensary is displayed on the page
WebUI.verifyMatch('Diem Delivery', 'Diem Delivery', false)

//Return to homepage
WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

WebUI.waitForPageLoad(3)

