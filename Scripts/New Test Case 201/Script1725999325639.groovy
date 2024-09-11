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

/*Open browser to the URL stored in G_TravelURL
*Log in using the credentials stored in G_Username and G_Password
*Search for flights from G_Origin to G_Destination
*Select the flight and confirm the booking
*Verify that the booking confirmation is displayed
*Close the browser
*/
// Open browser to the URL stored in G_TravelURL
WebUI.openBrowser('G_TravelURL')

// Log in using the credentials stored in G_Username and G_Password
WebUI.setText(findTestObject('Page_Login/input_Username'), GlobalVariable.G_Username)
WebUI.setEncryptedText(findTestObject('Page_Login/input_Password'), GlobalVariable.G_Password)
WebUI.click(findTestObject('Page_Login/button_Login'))

// Search for flights from G_Origin to G_Destination
WebUI.setText(findTestObject('Page_FlightSearch/input_Origin'), GlobalVariable.G_Origin)
WebUI.setText(findTestObject('Page_FlightSearch/input_Destination'), GlobalVariable.G_Destination)
WebUI.click(findTestObject('Page_FlightSearch/button_Search'))

// Select the flight and confirm the booking
WebUI.click(findTestObject('Page_FlightResults/button_SelectFlight'))
WebUI.click(findTestObject('Page_Booking/button_ConfirmBooking'))

// Verify that the booking confirmation is displayed
WebUI.verifyElementPresent(findTestObject('Page_BookingConfirmation/text_BookingConfirmationMessage'))

// Close the browser
WebUI.closeBrowser()