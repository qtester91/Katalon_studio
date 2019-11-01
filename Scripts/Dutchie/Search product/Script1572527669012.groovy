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

not_run: WebUI.callTestCase(findTestCase('Dutchie/Get Eugene dispensaries'), [:], FailureHandling.STOP_ON_FAILURE)

//Select Amazon Organics
WebUI.click(findTestObject('Dutchie/Search results/AmazonOrganics'))

WebUI.waitForPageLoad(2)

//Verify if search fields exist and insert product of interest
WebUI.verifyElementPresent(findTestObject('Dutchie/Dispensary page/SearchProduct'), 2)

WebUI.setText(findTestObject('Dutchie/Dispensary page/SearchProduct'), 'Alien Rock')

WebUI.delay(2)

//Verify that correct product is displayed on the list
WebUI.verifyMatch('ALIEN ROCK CANDY | WICKED KIND', 'ALIEN ROCK CANDY | WICKED KIND', false)

//Clear search
WebUI.click(findTestObject('Dutchie/Dispensary page/ClearSearch'))

//Return to homepage (logo needs to be used 2 times because it first returns user to search results)
WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Dutchie/Dispensary page/DutchieLogo'))

