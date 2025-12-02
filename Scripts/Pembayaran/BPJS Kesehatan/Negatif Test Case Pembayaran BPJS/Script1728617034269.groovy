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

WebUI.delay(3)

for (int i = 0; i < 2; i++) {
    if (Mobile.verifyElementExist(findTestObject('Object Repository/Pembelian'), 1, FailureHandling.OPTIONAL)) {
        break
    }
    
    Mobile.swipe(500, 1800, 500, 600)
}

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/Menu BPJS Kesehatan'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\BPJS\\bpjs.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/Field ID BPJS'), 0)

Mobile.setText(findTestObject('Pembayaran/BPJS Kesehatan/Field ID BPJS'), '123456', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/Dropdown Bulan'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/Bulan 2'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/Button Selanjutnya'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Pembayaran/BPJS Kesehatan/id pelanggan tidak valid'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\BPJS\\Invalid ID BPJS.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(514, 1400)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/Field ID BPJS'), 0)

Mobile.clearText(findTestObject('Pembayaran/BPJS Kesehatan/Field ID BPJS'), 0)

Mobile.setText(findTestObject('Pembayaran/BPJS Kesehatan/Field ID BPJS'), '888880011683000001', 0)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/Button Selanjutnya'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/Ubah Rekening Sumber'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembelian/Paket Data/tabungan 3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/1'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/4'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/7'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/2'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/5'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/8'), 0)

Mobile.getText(findTestObject('Pembayaran/BPJS Kesehatan/saldo tidak cukup'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\BPJS\\Saldo Tidak Mencukupi.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(514, 1400)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/2'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/1'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/2'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/2'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/3'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/3'), 0)

Mobile.getText(findTestObject('Pembayaran/BPJS Kesehatan/invalid pin'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\BPJS\\Invalid PIN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

