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

Mobile.tap(findTestObject('Pembelian/Saldo PLN/Menu PLN Prabayar'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Saldo PLN\\SaldoPLN1.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/Field ID'), 0)

Mobile.setText(findTestObject('Pembelian/Saldo PLN/Field ID'), '14023699870', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Pembelian/Saldo PLN/Saldo 100K'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/Button Selanjutnya 1'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Saldo PLN\\SaldoPLN2.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/1'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/1'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/2'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/2'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/3'), 0)

Mobile.tap(findTestObject('Pembelian/Saldo PLN/3'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Saldo PLN\\SaldoPLN3.png', 
    FailureHandling.STOP_ON_FAILURE)

