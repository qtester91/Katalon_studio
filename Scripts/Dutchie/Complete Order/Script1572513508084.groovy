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

not_run: WebUI.callTestCase(findTestCase('Dutchie/Proceed to checkout'), [:], FailureHandling.STOP_ON_FAILURE)

//Fill personal data on Checkout page
WebUI.setText(findTestObject('Dutchie/Checkout/FirstNameCheckout'), 'name')

WebUI.setText(findTestObject('Dutchie/Checkout/LastNameCheckout'), 'lastname')

WebUI.sendKeys(findTestObject('Dutchie/Checkout/PhoneCheckout'), '(201) 677-8524')

WebUI.setText(findTestObject('Dutchie/Checkout/BirthdateCheckout'), '01/12/1980')

//Click on 'Place order' button
WebUI.click(findTestObject('Dutchie/Checkout/PlaceOrder'))

WebUI.switchToDefaultContent()

//Close pop-up without inserting email & password
WebUI.click(findTestObject('Dutchie/Post-checkout modal/NoThanks'))

