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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('PROJECT WEB/common/Login/Positive/login-with-valid-credential'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('PROJECT WEB/Pay Grade/b_Admin'))

WebUI.mouseOver(findTestObject('PROJECT WEB/Pay Grade/Job'))

WebUI.click(findTestObject('PROJECT WEB/Pay Grade/Pay Grades'))

WebUI.click(findTestObject('PROJECT WEB/Pay Grade/a_Grade 10'))

WebUI.click(findTestObject('PROJECT WEB/Pay Grade/a_Malaysian Ringgit'))

WebUI.doubleClick(findTestObject('PROJECT WEB/Pay Grade/maximumSalary'))

WebUI.setText(findTestObject('PROJECT WEB/Pay Grade/maximumSalary'), '11000')

WebUI.click(findTestObject('PROJECT WEB/Pay Grade/saveCurrencyButton'))

WebUI.verifyElementPresent(findTestObject('PROJECT WEB/Pay Grade/verifySucessfullyEditCurrency'), 5)

WebUI.closeBrowser()
