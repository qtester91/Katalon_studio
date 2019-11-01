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

//Scroll to the sectioon where Eugene dispensary link is located and click on the link
WebUI.scrollToElement(findTestObject('Dutchie/Homepage/EugeneLink'), 2)

WebUI.click(findTestObject('Dutchie/Homepage/EugeneLink'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Dutchie/Search results/OpenForDelivery'))

WebUI.delay(2)

//Check all 4 checkboxes on the page
WebUI.click(findTestObject('Dutchie/Search results/FreeDelivery'))

WebUI.delay(2)

WebUI.click(findTestObject('Dutchie/Search results/NoDeliveryMinimum'))

WebUI.delay(2)

WebUI.click(findTestObject('Dutchie/Search results/AcceptsCreditCards'))

WebUI.delay(2)

//Verify that correct dispensary is dispayed in the search results
WebUI.verifyMatch('Amazon Organics', 'Amazon Organics', false)

//Deselect all filters in the search results
WebUI.click(findTestObject('Dutchie/Search results/ClearAll'))

WebUI.delay(2)

//Verify that correct number of dispensaries is displayed in the search results
WebUI.verifyMatch('Dispensaries (19)', 'Dispensaries (19)', false)

//Return to homepage (second click on Dutchie logo is needed because first click opens search results)
WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

WebUI.delay(2)

WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

