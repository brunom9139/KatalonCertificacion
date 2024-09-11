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

/*Open browser to the URL stored in G_DashboardURL
*Log in using the credentials stored in G_AdminUsername and G_AdminPassword
*Navigate to the user management page
*Add a new user with details stored in G_NewUser
*Verify that the new user is successfully added
*Close the browser
*/
// Open browser to the URL stored in G_DashboardURL
WebUI.openBrowser(GlobalVariable.G_DashboardURL)

// Log in using the credentials stored in G_AdminUsername and G_AdminPassword
WebUI.setText(findTestObject('Page_Login/input_Username'), GlobalVariable.G_AdminUsername)
WebUI.setText(findTestObject('Page_Login/input_Password'), GlobalVariable.G_AdminPassword)
WebUI.click(findTestObject('Page_Login/button_Login'))

// Navigate to the user management page
WebUI.click(findTestObject('Page_Dashboard/button_UserManagement'))

// Add a new user with details stored in G_NewUser
WebUI.click(findTestObject('Page_UserManagement/button_AddUser'))
WebUI.setText(findTestObject('Page_UserManagement/input_FirstName'), GlobalVariable.G_NewUser.firstName)
WebUI.setText(findTestObject('Page_UserManagement/input_LastName'), GlobalVariable.G_NewUser.lastName)
WebUI.setText(findTestObject('Page_UserManagement/input_Email'), GlobalVariable.G_NewUser.email)
WebUI.setText(findTestObject('Page_UserManagement/input_Username'), GlobalVariable.G_NewUser.username)
WebUI.setText(findTestObject('Page_UserManagement/input_Password'), GlobalVariable.G_NewUser.password)
WebUI.click(findTestObject('Page_UserManagement/button_Save'))

// Verify that the new user is successfully added
WebUI.verifyElementPresent(findTestObject('Page_UserManagement/label_NewUserConfirmation'))

// Close the browser
WebUI.closeBrowser()