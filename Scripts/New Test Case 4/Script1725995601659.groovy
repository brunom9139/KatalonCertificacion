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

/*Open browser to the URL stored in G_RegistrationURL
*Fill in the registration form with the values stored in G_Username, G_Email, and G_Password
*Click the register button
*Verify that the registration confirmation message is displayed
*Close the browser
*/
// Open browser to the URL stored in G_RegistrationURL
WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.G_RegistrationURL)

// Fill in the registration form with the values stored in G_Username, G_Email, and G_Password
WebUI.setText(findTestObject('input_Username'), GlobalVariable.G_Username)
WebUI.setText(findTestObject('input_Email'), GlobalVariable.G_Email)
WebUI.setText(findTestObject('input_Password'), GlobalVariable.G_Password)

// Click the register button
WebUI.click(findTestObject('button_Register'))

// Verify that the registration confirmation message is displayed
WebUI.verifyElementPresent(findTestObject('text_RegistrationConfirmationMessage'))

// Close the browser
WebUI.closeBrowser()