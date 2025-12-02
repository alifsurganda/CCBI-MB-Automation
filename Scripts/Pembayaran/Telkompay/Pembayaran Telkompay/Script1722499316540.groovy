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

WebUI.delay(3)

Mobile.tap(findTestObject('Pembayaran/PDAM/transaksi'), 0)

WebUI.delay(3)

for (int i = 0; i < 2; i++) {
    if (Mobile.verifyElementExist(findTestObject('Object Repository/Pembelian'), 1, FailureHandling.OPTIONAL)) {
        break
    }
    
    Mobile.swipe(500, 1800, 500, 600)
}

Mobile.tap(findTestObject('Pembayaran/Telkompay/telkom'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\Telkompay\\Telkompay1.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Telkompay/Field ID Pelanggan'), 0)

Mobile.setText(findTestObject('Pembayaran/Telkompay/Field ID Pelanggan'), '127369366001', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Pembayaran/Telkompay/Button Selanjutnya'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\Telkompay\\Telkompay2.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Telkompay/Button Konfirmasi'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Telkompay/1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Telkompay/4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Telkompay/7'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Telkompay/2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Telkompay/5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Telkompay/8'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\Telkompay\\Telkompay3.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

