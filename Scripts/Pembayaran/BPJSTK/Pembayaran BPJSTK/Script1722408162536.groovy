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

Mobile.tap(findTestObject('Pembayaran/BPJSTK/menu bpjstk (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\BPJSTK\\BPJSTK1.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Isi nomor KTP Manual'
Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/nomor ktp'), 0)

Mobile.setText(findTestObject('Pembayaran/BPJSTK/nomor ktp'), '3204092702940004', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Pembayaran/BPJSTK/button cek status (1)'), 0)

WebUI.delay(4)

Mobile.tapAtPosition(514, 1400)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/Button Lanjutkan 1'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/pilih bulan'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/6bulan'), 0)

'Isi Lokasi Daerah Manual'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/lokasi pekerjaan'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/aceh barat (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\BPJSTK\\BPJSTKfield.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/hitung iuran'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\BPJSTK\\BPJSTK2.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/Button Lanjutkan 1'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/1'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/4'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/7'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/2'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/5'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/8'), 0)

WebUI.delay(10)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\BPJSTK\\BPJSTK3resi.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

