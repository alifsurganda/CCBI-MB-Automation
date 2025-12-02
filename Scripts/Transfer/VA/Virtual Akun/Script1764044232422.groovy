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

WebUI.callTestCase(findTestCase('Login/Login Valid'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(540, 1472)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/butoon transaksi'), 0)

Mobile.tap(findTestObject('Transfer/VA/Menu VA'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/VA/verify tf VA'), 0)

Mobile.tap(findTestObject('Transfer/VA/input nomor'), 0)

Mobile.setText(findTestObject('Transfer/VA/input nomor'), '0000522222222222', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/VA/button selanjutnya'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/VA/verify tf VA'), 0)

Mobile.tap(findTestObject('Transfer/VA/input nominal'), 0)

Mobile.setText(findTestObject('Transfer/VA/input nominal'), '15000', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/VA/button selanjutnya'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\VA\\konfirmasi va.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/VA/button transfer'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/4'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/7'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/5'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/8'), 0)

Mobile.delay(15, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\VA\\resi va.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

