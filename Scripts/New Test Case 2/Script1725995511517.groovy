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

/*Open browser to the URL stored in G_LoginURL
*Click the login button
*Fill in the username and password fields based on the variables
*Click the login button
*Verify that the dashboard page is displayed
*Close the browser
*/
// Open browser to the URL stored in G_LoginURL
WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.G_LoginURL)

// Click the login button
WebUI.click(findTestObject('Page_Login/button_Login'))

// Fill in the username and password fields based on the variables
WebUI.setText(findTestObject('Page_Login/input_Username'), GlobalVariable.username)
WebUI.setEncryptedText(findTestObject('Page_Login/input_Password'), GlobalVariable.password)

// Click the login button
WebUI.click(findTestObject('Page_Login/button_Login'))

// Verify that the dashboard page is displayed
WebUI.verifyElementVisible(findTestObject('Page_Dashboard/div_Dashboard'))

// Close the browser
WebUI.closeBrowser()