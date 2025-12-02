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

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/butoon transaksi'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

for (int i = 0; i < 8; i++) {
    if (Mobile.verifyElementExist(findTestObject('Object Repository/Pembelian'), 1, FailureHandling.OPTIONAL)) {
        break
    }
    
    Mobile.swipe(500, 1800, 500, 600)
}

Mobile.tap(findTestObject('Pembelian/Paket Data/Menu Pembelian Paket Data'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Pembelian/Paket Data/Field Nomor Handphone'), 0)

Mobile.setText(findTestObject('Pembelian/Paket Data/Field Nomor Handphone'), '0813', 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/Fiekd No HP 2'), 0)

Mobile.setText(findTestObject('Pembelian/Paket Data/Fiekd No HP 2'), '081365016401', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

for (int i = 0; i < 4; i++) {
    if (Mobile.verifyElementExist(findTestObject('Object Repository/PAKET DATA TSEL 100,000'), 1, FailureHandling.OPTIONAL)) {
        break
    }
    
    Mobile.swipe(500, 1800, 500, 600)
}

Mobile.tap(findTestObject('Pembelian/Paket Data/100k'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembelian/Paket Data/Button Selanjutnyaa'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/ubah rek'), 5)

Mobile.tap(findTestObject('Pembelian/Paket Data/tabungan 3'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Pembelian/Paket Data/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/1'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/4'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/7'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/2'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/5'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/8'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Pembelian/Paket Data/saldo kurang'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Paket Data\\Saldo Tidak Cukup.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(514, 1400)

Mobile.tap(findTestObject('Object Repository/Pembelian/Paket Data/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/2'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/1'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/2'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/2'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/3'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/3'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Pembelian/Paket Data/invalid pin'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Paket Data\\Invalid PIN.png', 
    FailureHandling.STOP_ON_FAILURE)

