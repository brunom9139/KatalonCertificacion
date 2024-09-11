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

/*Open browser to the URL stored in G_EcommerceURL
*Search for the item using G_ItemName
*Select the item from the search results
*Add the item to the cart
*Verify that the cart contains the item
*Close the browser
*/
// Open browser to the URL stored in G_EcommerceURL
WebUI.openBrowser(GlobalVariable.G_EcommerceURL)

// Search for the item using G_ItemName
WebUI.setText(findTestObject('Page/input_SearchBar'), GlobalVariable.G_ItemName)

// Select the item from the search results
WebUI.click(findTestObject('Page/button_Search'))

// Add the item to the cart
WebUI.click(findTestObject('Page/button_AddToCart'))

// Verify that the cart contains the item
WebUI.verifyElementPresent(findTestObject('Page/text_CartItem'))

// Close the browser
WebUI.closeBrowser()