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

Mobile.tap(findTestObject('Pembayaran/BPJSTK/Menu Transaksi'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/Menu BPJSTK'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\BPJSTK\\BPJSTK1.png', FailureHandling.CONTINUE_ON_FAILURE)

'Isi nomor KTP Manual'
Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/Button Cek Status'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/Button Lanjutkan 1'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/Dropdown Pilih Bulan'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/1 Bulan'), 0)

'Isi Lokasi Daerah Manual'
Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/Button Hitung Iuran'), 0)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\BPJSTK\\BPJSTK2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/Button Lanjutkan 1'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/1'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/1'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/2'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/2'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/3'), 0)

Mobile.tap(findTestObject('Pembayaran/BPJSTK/3'), 0)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\BPJSTK\\BPJSTK3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Button ke Beranda'), 0)

