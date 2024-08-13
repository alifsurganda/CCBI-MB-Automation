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

Mobile.tap(findTestObject('Pembayaran/BPJSTK/Menu Transaksi'), 0)

Mobile.tap(findTestObject('Pembayaran/Pascabayar/Menu HP Pascabayar'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\Pascabayar\\Pascabayar1.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Pascabayar/Field Nomor Handphone'), 0)

Mobile.setText(findTestObject('Pembayaran/Pascabayar/Field Nomor Handphone'), '0856123456', 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\Pascabayar\\Pascabayar2.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Pascabayar/Button Selanjutnya'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\Pascabayar\\Pascabayar3.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Pascabayar/Button Konfirmasi'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Pascabayar/1'), 0)

Mobile.tap(findTestObject('Pembayaran/Pascabayar/1'), 0)

Mobile.tap(findTestObject('Pembayaran/Pascabayar/2'), 0)

Mobile.tap(findTestObject('Pembayaran/Pascabayar/2'), 0)

Mobile.tap(findTestObject('Pembayaran/Pascabayar/3'), 0)

Mobile.tap(findTestObject('Pembayaran/Pascabayar/3'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembayaran\\Pascabayar\\Pascabayar4.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Pembayaran/Button ke Beranda'), 0)

