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

Mobile.startExistingApplication('com.mobile.ccbi.dev', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

Mobile.tap(findTestObject('QRIS/qris'), 0)

Mobile.tap(findTestObject('QRIS/button galeri'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('QRIS/qr code'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\QRIS\\qr gallery.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.tap(findTestObject('QRIS/nominal'), 0)

Mobile.setText(findTestObject('QRIS/nominal'), '20000', 0)

Mobile.tap(findTestObject('QRIS/tips'), 0)

Mobile.setText(findTestObject('QRIS/tips'), '200', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('QRIS/selanjutnya button1'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\QRIS\\qr konfirmasi.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('QRIS/konfirmasi'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/1'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/4'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/7'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/2'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/5'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/8'), 0)

WebUI.delay(10)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\QRIS\\qr resi.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

