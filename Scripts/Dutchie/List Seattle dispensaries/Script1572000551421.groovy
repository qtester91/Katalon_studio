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

//Verify that search bar is displayed
WebUI.verifyElementPresent(findTestObject('Dutchie/Homepage/searchBar'), 5)

//Insert 'Seattle' in search bar
WebUI.sendKeys(findTestObject('Dutchie/Homepage/searchBar'), 'Seattle')

WebUI.delay(2)

//Navigate and select first item on the list
WebUI.scrollToElement(findTestObject('Dutchie/Homepage/FirstDispensaryInDropDown'), 2)

WebUI.click(findTestObject('Dutchie/Homepage/FirstDispensaryInDropDown'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Dutchie/Search results/Seattle,WA'), 2)

WebUI.verifyTextPresent('Dispensaries ', false)

WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

