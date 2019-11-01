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

WebUI.callTestCase(findTestCase('Dutchie/Open Dutchie homepage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dutchie/Homepage/Sign-up'))

WebUI.switchToDefaultContent()

WebUI.sendKeys(findTestObject('Dutchie/Sign-up/FirstNameSignUp'), 'Dave')

WebUI.sendKeys(findTestObject('Dutchie/Sign-up/LastNameSignUp'), 'Mathews')

WebUI.sendKeys(findTestObject('Dutchie/Sign-up/EmailSignUp'), 'qtester97+1101bl@gmail.com')

WebUI.sendKeys(findTestObject('Dutchie/Sign-up/PasswordSignUp'), 'validPassword')

WebUI.sendKeys(findTestObject('Dutchie/Sign-up/PhoneSignUp'), '(804) 677-7564')

WebUI.click(findTestObject('Dutchie/Sign-up/MonthSignUp'))

WebUI.click(findTestObject('Dutchie/Sign-up/MonthSignUp'))

WebUI.scrollToElement(findTestObject('Dutchie/Sign-up/8thMonth'), 2)

WebUI.click(findTestObject('Dutchie/Sign-up/8thMonth'))

WebUI.click(findTestObject('Dutchie/Sign-up/DaySignUp'))

WebUI.scrollToElement(findTestObject('Dutchie/Sign-up/10thDay'), 2)

WebUI.click(findTestObject('Dutchie/Sign-up/10thDay'))

WebUI.click(findTestObject('Dutchie/Sign-up/YearSignUp'))

WebUI.scrollToElement(findTestObject('Dutchie/Sign-up/1993Year'), 2)

WebUI.click(findTestObject('Dutchie/Sign-up/1993Year'))

WebUI.click(findTestObject('Dutchie/Sign-up/CreateMyAccount'))

