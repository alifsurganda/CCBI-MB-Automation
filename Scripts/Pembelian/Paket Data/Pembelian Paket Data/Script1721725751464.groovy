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

Mobile.startExistingApplication('com.dwidasa.product.mobilebanking_v3_staging')

Mobile.tap(findTestObject('Pembelian/Paket Data/Menu Transaksi'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Paket Data\\PaketData1.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembelian/Paket Data/Menu Pembelian Paket Data'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Paket Data\\PaketData2.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Pembelian/Paket Data/Field Nomor Handphone'), 0)

Mobile.setText(findTestObject('Pembelian/Paket Data/Field Nomor Handphone'), '0812', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Pembelian/Paket Data/Pulsa 20K'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Paket Data\\PaketData3.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembelian/Paket Data/Button Selanjutnyaa'), 0)

Mobile.tap(findTestObject('Object Repository/Pembelian/Paket Data/Pilih Kategori'), 0)

Mobile.tap(findTestObject('Object Repository/Pembelian/Paket Data/Kategori Top Up'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Paket Data\\PaketData4.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Pembelian/Paket Data/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/1'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/1'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/2'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/2'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/3'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/3'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Paket Data\\PaketData5.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Pembelian/Paket Data/Transaksi Gagal Text'), 0)

