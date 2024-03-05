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

WebUI.mouseOver(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/b_PIM'))

WebUI.click(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/a_Employee List'))

x = WebUI.concatenate((([GlobalVariable.existingFirstName, ' ', GlobalVariable.existingSecondName]) as String[]), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/input_EmployeeName'), x)

WebUI.click(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/searchButton'))

WebUI.verifyElementPresent(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/a_employeeName', [('employeeFirstName') : GlobalVariable.existingFirstName
            , ('EmployeeSecondName') : GlobalVariable.existingSecondName]), 5)

WebUI.click(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/a_employeeName', [('employeeFirstName') : GlobalVariable.existingFirstName
            , ('employeeSecondName') : GlobalVariable.existingSecondName]))

WebUI.verifyElementPresent(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/h1_verifyEmployee', [('employee') : x]), 
    5)

WebUI.closeBrowser()

