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

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/transaksi'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

for (int i = 0; i < 2; i++) {
    if (Mobile.verifyElementExist(findTestObject('Object Repository/Pembelian'), 1, FailureHandling.OPTIONAL)) {
        break
    }
    
    Mobile.swipe(500, 1800, 500, 600)
}

Mobile.tap(findTestObject('Pembelian/Saldo PLN/Menu PLN Prabayar'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Saldo PLN\\SaldoPLN1.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/nomor pelanggan'), 0)

Mobile.setText(findTestObject('Pembelian/Saldo PLN/nomor pelanggan'), '535341464597', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Pembelian/Saldo PLN/200k'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/Button Selanjutnya 1'), 0)

Mobile.getText(findTestObject('Pembelian/Saldo PLN/id pelanggan tidakk valid'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Saldo PLN\\Invalid ID Pelanggan.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(514, 1400)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/nomor pelanggan'), 0)

Mobile.clearText(findTestObject('Pembelian/Saldo PLN/nomor pelanggan'), 0)

Mobile.setText(findTestObject('Pembelian/Saldo PLN/nomor pelanggan'), '14023699870', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/Button Selanjutnya 1'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/Ubah Rekening Sumber'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/tabungan3'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/1'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/4'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/7'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/2'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/5'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/8'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Pembelian/Saldo PLN/saldo kurang'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Saldo PLN\\Saldo Tidak Cukup.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(514, 1400)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/2'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/1'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/2'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/2'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/3'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/3'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Pembelian/Saldo PLN/invalid pin'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Saldo PLN\\Invalid PIN.png', 
    FailureHandling.STOP_ON_FAILURE)

