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

/*Open browser to the URL stored in G_SupportURL
*Navigate to the "Contact Us" page
*Fill in the contact form using G_Name, G_Email, and G_Message
*Submit the form
*Verify that the confirmation message is displayed
*Close the browser
*/
// Open browser to the URL stored in G_SupportURL
WebUI.openBrowser(GlobalVariable.G_SupportURL)

// Navigate to the "Contact Us" page
WebUI.navigateToUrl('https://www.example.com/contact-us')

// Fill in the contact form using G_Name, G_Email, and G_Message
WebUI.setText(findTestObject('Page_Contact Us/input_Name'), GlobalVariable.G_Name)
WebUI.setText(findTestObject('Page_Contact Us/input_Email'), GlobalVariable.G_Email)
WebUI.setText(findTestObject('Page_Contact Us/textarea_Message'), GlobalVariable.G_Message)

// Submit the form
WebUI.click(findTestObject('Page_Contact Us/button_Submit'))

// Verify that the confirmation message is displayed
WebUI.verifyElementVisible(findTestObject('Page_Contact Us/text_ConfirmationMessage'))

// Close the browser
WebUI.closeBrowser()