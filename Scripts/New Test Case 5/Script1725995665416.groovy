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

/*Open browser to the URL stored in G_ProfileURL
*Log in using the credentials stored in G_Username and G_Password
*Navigate to the profile settings page
*Update the profile information
*Verify that the profile is updated successfully
*Close the browser
*/
// Open browser to the URL stored in G_ProfileURL
WebUI.openBrowser(GlobalVariable.G_ProfileURL)

// Log in using the credentials stored in G_Username and G_Password
WebUI.setText(findTestObject('input_username'), GlobalVariable.G_Username)
WebUI.setText(findTestObject('input_password'), GlobalVariable.G_Password)
WebUI.click(findTestObject('button_login'))

// Navigate to the profile settings page
WebUI.click(findTestObject('link_profile_settings'))

// Update the profile information
WebUI.setText(findTestObject('input_first_name'), 'New First Name')
WebUI.setText(findTestObject('input_last_name'), 'New Last Name')
WebUI.setText(findTestObject('input_email'), 'newemail@example.com')
WebUI.click(findTestObject('button_save_profile'))

// Verify that the profile is updated successfully
WebUI.verifyElementPresent(findTestObject('label_success_message'))

// Close the browser
WebUI.closeBrowser()