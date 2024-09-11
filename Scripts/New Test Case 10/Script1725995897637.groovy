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

/*Open browser to the URL stored in G_ProductPageURL
*Verify that the product name matches G_ProductName
*Verify that the product price matches G_ProductPrice
*Verify that the "Add to Cart" button is displayed
*Close the browser
*/
// Open browser to the URL stored in G_ProductPageURL
WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.G_ProductPageURL)

// Verify that the product name matches G_ProductName
WebUI.verifyElementText(findTestObject('Page_Product/name_Product'), GlobalVariable.G_ProductName)

// Verify that the product price matches G_ProductPrice
WebUI.verifyElementText(findTestObject('Page_Product/price_Product'), GlobalVariable.G_ProductPrice)

// Verify that the "Add to Cart" button is displayed
WebUI.verifyElementVisible(findTestObject('Page_Product/button_AddToCart'))

// Close the browser
WebUI.closeBrowser()