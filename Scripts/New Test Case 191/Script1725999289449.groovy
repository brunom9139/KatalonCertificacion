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

/*Open browser to the URL stored in G_AccountURL
*Log in using the credentials stored in G_Username and G_Password
*Update the shipping address using G_NewAddress
*Verify that the address is updated successfully
*Close the browser
*/
// Open browser to the URL stored in G_AccountURL
WebUI.openBrowser(GlobalVariable.G_AccountURL)

// Log in using the credentials stored in G_Username and G_Password
WebUI.setText(findTestObject('input_username'), GlobalVariable.G_Username)
WebUI.setText(findTestObject('input_password'), GlobalVariable.G_Password)
WebUI.click(findTestObject('button_login'))

// Update the shipping address using G_NewAddress
WebUI.click(findTestObject('link_edit_address'))
WebUI.setText(findTestObject('input_address'), GlobalVariable.G_NewAddress)
WebUI.click(findTestObject('button_save_address'))

// Verify that the address is updated successfully
WebUI.verifyElementPresent(findTestObject('label_updated_address'))

// Close the browser
WebUI.closeBrowser()