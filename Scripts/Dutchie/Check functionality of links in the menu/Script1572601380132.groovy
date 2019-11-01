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

//Scroll to the part of the page where 'Chalice Farm' link is located

WebUI.scrollToElement(findTestObject('Dutchie/Homepage/ChaliceFarmLink'), 3)

//Click on 'Chalice Farm' link

WebUI.click(findTestObject('Dutchie/Homepage/ChaliceFarmLink'))

WebUI.waitForPageLoad(2)

//Verify if available filters in the menu open correct list of products

WebUI.click(findTestObject('Dutchie/Filters in the menu/Pre-Rolls'))

WebUI.verifyTextPresent('Pre-Rolls', false)

WebUI.click(findTestObject('Dutchie/Filters in the menu/Vaporizers'))

WebUI.verifyTextPresent('Vaporizers', false)

WebUI.click(findTestObject('Dutchie/Filters in the menu/Concentrates'))

WebUI.verifyTextPresent('Concentrates', false)

WebUI.click(findTestObject('Dutchie/Filters in the menu/Edibles'))

WebUI.verifyTextPresent('Edibles', false)

WebUI.click(findTestObject('Dutchie/Filters in the menu/Topicals'))

WebUI.verifyTextPresent('Topicals', false)

WebUI.click(findTestObject('Dutchie/Filters in the menu/Flower'))

WebUI.verifyTextPresent('Flower', false)

//Return to Dutchie homepage

WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

