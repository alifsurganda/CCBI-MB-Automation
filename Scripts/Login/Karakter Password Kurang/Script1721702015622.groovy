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

Mobile.startExistingApplication('com.dwidasa.product.mobilebanking_v3')

Mobile.tap(findTestObject('Object Repository/Login/Field Password'), 0)

Mobile.setText(findTestObject('Login/Field Password'), 'Rsyt19', 0)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\LoginValid1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login/Hide Button'), 0)

Mobile.tap(findTestObject('Object Repository/Login/Button Masuk'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\LoginValid2.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyEqual('Password tidak boleh kurang dari 8 digit', 'Password tidak boleh kurang dari 8 digit')

