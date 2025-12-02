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

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/butoon transaksi'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Menu Transfer Overbook'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Menu Transfer ke Penerima Baru'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Field Nomor Rekening'), 0)

Mobile.setText(findTestObject('Transfer/Transfer Antar Rekening/Field Nomor Rekening'), '115', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button selanjutnya'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Overbook\\norek salah.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(514, 1400)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Field Nomor Rekening'), 0)

Mobile.checkElement(findTestObject('Transfer/Transfer Antar Rekening/Field Nomor Rekening'), 0)

Mobile.clearText(findTestObject('Transfer/Transfer Antar Rekening/Field Nomor Rekening'), 0)

Mobile.setText(findTestObject('Transfer/Transfer Antar Rekening/Field Nomor Rekening'), '2000008551', 0)

Mobile.hideKeyboard()

WebUI.delay(4)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button selanjutnya'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button selanjutnya'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/4'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/7'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/5'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/8'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Ubah Rekening Sumber'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/tabungan 3'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/nominal'), 0)

Mobile.setText(findTestObject('Transfer/Transfer Antar Rekening/nominal'), '1', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button selanjutnya'), 0)

Mobile.getText(findTestObject('Transfer/Transfer Antar Rekening/alert transaksi kurang dari bata minimal'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Overbook\\transaksi kurang dari minimal.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(514, 1400)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/nominal'), 0)

Mobile.clearText(findTestObject('Transfer/Transfer Antar Rekening/nominal'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Transfer/Transfer Antar Rekening/nominal'), '300000000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button selanjutnya'), 0)

Mobile.getText(findTestObject('Transfer/Transfer Antar Rekening/transaksi melebihi batas maksimal'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Overbook\\transaksi melebih maksimum.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(514, 1400)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Ubah Rekening Sumber'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/tabungan 2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/nominal'), 0)

Mobile.clearText(findTestObject('Transfer/Transfer Antar Rekening/nominal'), 0)

Mobile.setText(findTestObject('Transfer/Transfer Antar Rekening/nominal'), '15000000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button selanjutnya'), 0)

Mobile.getText(findTestObject('Transfer/Transfer Antar Rekening/saldo tidak cukup'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Overbook\\saldo kurang.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(514, 1400)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/nominal'), 0)

Mobile.clearText(findTestObject('Transfer/Transfer Antar Rekening/nominal'), 0)

Mobile.setText(findTestObject('Transfer/Transfer Antar Rekening/nominal'), '10000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button selanjutnya'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/3'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/3'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Overbook\\invalid pin.png', 
    FailureHandling.STOP_ON_FAILURE)

