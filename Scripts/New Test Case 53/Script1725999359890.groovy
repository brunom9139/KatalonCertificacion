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

/*Open browser to the URL stored in G_JobPortalURL
*Search for jobs using the criteria stored in G_JobCriteria
*Apply for a job using details stored in G_ApplicationDetails
*Verify that the application submission confirmation is displayed
*Close the browser
*/
// Open browser to the URL stored in G_JobPortalURL
WebUI.openBrowser(GlobalVariable.G_JobPortalURL)

// Search for jobs using the criteria stored in G_JobCriteria
WebUI.setText(findTestObject('input_search_job'), GlobalVariable.G_JobCriteria)
WebUI.click(findTestObject('button_search'))

// Apply for a job using details stored in G_ApplicationDetails
WebUI.click(findTestObject('button_apply_job'))
WebUI.setText(findTestObject('input_name'), GlobalVariable.G_ApplicationDetails.name)
WebUI.setText(findTestObject('input_email'), GlobalVariable.G_ApplicationDetails.email)
WebUI.setText(findTestObject('input_resume'), GlobalVariable.G_ApplicationDetails.resume)
WebUI.click(findTestObject('button_submit_application'))

// Verify that the application submission confirmation is displayed
WebUI.verifyElementPresent(findTestObject('text_confirmation_message'))

// Close the browser
WebUI.closeBrowser()