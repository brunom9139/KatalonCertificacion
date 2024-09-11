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

/*Open browser to the URL stored in G_ShopURL
*Search for the product using G_ProductName
*Click on the product in the search results
*Add the product to the cart
*Verify that the product is in the cart
*Close the browser
*/
// Open browser to the URL stored in G_ShopURL
WebUI.openBrowser(GlobalVariable.G_ShopURL)

// Search for the product using G_ProductName
WebUI.setText(findTestObject('Page/input_SearchBar'), GlobalVariable.G_ProductName)
WebUI.sendKeys(findTestObject('Page/input_SearchBar'), Keys.chord(Keys.ENTER))

// Click on the product in the search results
WebUI.click(findTestObject('Page/link_Product'))

// Add the product to the cart
WebUI.click(findTestObject('Page/button_AddToCart'))

// Verify that the product is in the cart
WebUI.verifyElementPresent(findTestObject('Page/text_ProductInCart'))

// Close the browser
WebUI.closeBrowser()