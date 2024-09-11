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

/*Open browser to the URL stored in G_BlogURL
*Search for the blog post using G_BlogTitle
*Click on the blog post from the search results
*Verify that the blog post content is displayed
*Close the browser
*/
// Open browser to the URL stored in G_BlogURL
WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.G_BlogURL)

// Search for the blog post using G_BlogTitle
WebUI.setText(findTestObject('Page/input_Search'), GlobalVariable.G_BlogTitle)
WebUI.sendKeys(findTestObject('Page/input_Search'), Keys.chord(Keys.ENTER))

// Click on the blog post from the search results
WebUI.click(findTestObject('Page/link_BlogPost'))

// Verify that the blog post content is displayed
WebUI.verifyElementPresent(findTestObject('Page/div_BlogContent'))

// Close the browser
WebUI.closeBrowser()