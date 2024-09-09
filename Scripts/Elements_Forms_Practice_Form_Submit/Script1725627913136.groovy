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
import org.aspectj.apache.bcel.classfile.LocalVariable as LocalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.click(findTestObject('Object Repository/Elements/Page_DEMOQA/h5_Forms'))

WebUI.click(findTestObject('Object Repository/Elements/Page_DEMOQA/span_Practice Form'))

WebUI.setText(findTestObject('Object Repository/Elements/Page_DEMOQA/input_First Name_firstName'), Nombre)

WebUI.setText(findTestObject('Object Repository/Elements/Page_DEMOQA/input_Last Name_lastName'), Apellido)

WebUI.setText(findTestObject('Object Repository/Elements/Page_DEMOQA/input_Email_userEmail'), Email)

WebUI.click(findTestObject('Object Repository/Elements/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/Elements/Page_DEMOQA/input_(10 Digits)_userNumber'), Numero)

WebUI.setText(findTestObject('Object Repository/Elements/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), '06 Sep 2024')

WebUI.click(findTestObject('Object Repository/Elements/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.click(findTestObject('Object Repository/Elements/Page_DEMOQA/div_17'))

WebUI.click(findTestObject('Object Repository/Elements/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Elements/Page_DEMOQA/input_Subjects_subjectsInput'), Subjet)

WebUI.click(findTestObject('Object Repository/Elements/Page_DEMOQA/div_Hindi'))

WebUI.click(findTestObject('Object Repository/Elements/Page_DEMOQA/label_Sports'))

WebUI.click(findTestObject('Object Repository/Elements/Page_DEMOQA/button_Submit'))

WebUI.click(findTestObject('Object Repository/Elements/Page_DEMOQA/button_Close'))

WebUI.closeBrowser()

