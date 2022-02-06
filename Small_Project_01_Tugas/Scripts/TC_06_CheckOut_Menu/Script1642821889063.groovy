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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/Buy_now_button'))

WebUI.verifyElementPresent(findTestObject('HomePage/Verify_CheckOut_Menu'), 0)

WebUI.click(findTestObject('CheckOut_Menu/Input_Midtrans_Pillow'))

WebUI.setText(findTestObject('CheckOut_Menu/Input_Midtrans_Pillow'), '20000')

WebUI.verifyElementText(findTestObject('CheckOut_Menu/verify_harga_MidtransPillow'), '20,000')

WebUI.setText(findTestObject('CheckOut_Menu/Input_name'), GlobalVariable.name)

WebUI.setText(findTestObject('CheckOut_Menu/Input_email'), GlobalVariable.email)

WebUI.setText(findTestObject('CheckOut_Menu/Input_phone_number'), GlobalVariable.Phone_Number)

WebUI.setText(findTestObject('CheckOut_Menu/Input_city'), GlobalVariable.city)

WebUI.setText(findTestObject('CheckOut_Menu/Input_address'), GlobalVariable.Address)

WebUI.setText(findTestObject('CheckOut_Menu/Input_postal_code'), GlobalVariable.postal_code)

WebUI.click(findTestObject('CheckOut_Menu/Check_out_button'))

WebUI.closeBrowser()

