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

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Menu Transfer Overbook'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Menu Transfer ke Penerima Baru'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Field Nomor Rekening'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('Transfer/Transfer Antar Rekening/Field Nomor Rekening'), '2000002197', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button selanjutnya'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Overbook\\transfer1.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Button Selanjut nya 2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/4'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/7'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/5'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/8'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/nominal'), 0)

Mobile.setText(findTestObject('Transfer/Transfer Antar Rekening/nominal'), '50000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button selanjutnya'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Overbook\\transfer2.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/4'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/7'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/5'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/8'), 0)

WebUI.delay(15)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Overbook\\transfer3.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

