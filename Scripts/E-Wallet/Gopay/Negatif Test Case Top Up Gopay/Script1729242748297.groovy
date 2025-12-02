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

Mobile.tap(findTestObject('E-Wallet/Gopay/Menu Gopay'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/Gopay/dari favorit'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/nominal'), 0)

Mobile.setText(findTestObject('E-Wallet/DANA/nominal'), '1000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('E-Wallet/DANA/button beli (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.getText(findTestObject('E-Wallet/DANA/transaksi kuran min'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\E-Wallet\\Gopay\\Transaksi Minimum.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(514, 1400)

Mobile.tap(findTestObject('E-Wallet/DANA/nominal'), 0)

Mobile.clearText(findTestObject('E-Wallet/DANA/nominal'), 0)

Mobile.setText(findTestObject('E-Wallet/DANA/nominal'), '71000000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('E-Wallet/DANA/button beli (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2)

Mobile.getText(findTestObject('E-Wallet/DANA/tansaksi melebihi max'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\E-Wallet\\Gopay\\Transaksi Maksimum.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(514, 1400)

Mobile.tap(findTestObject('E-Wallet/DANA/nominal'), 0)

Mobile.clearText(findTestObject('E-Wallet/DANA/nominal'), 0)

Mobile.setText(findTestObject('E-Wallet/DANA/nominal'), '75000000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('E-Wallet/DANA/button beli (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('E-Wallet/DANA/saldo kurang'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\E-Wallet\\Gopay\\Saldo Tidak Cukup.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(514, 1400)

Mobile.tap(findTestObject('E-Wallet/DANA/nominal'), 0)

Mobile.clearText(findTestObject('E-Wallet/DANA/nominal'), 0)

Mobile.setText(findTestObject('E-Wallet/DANA/nominal'), '10000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('E-Wallet/DANA/button beli (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.tap(findTestObject('E-Wallet/DANA/button konfirmasi (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

Mobile.getText(findTestObject('E-Wallet/DANA/invalid pin'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\E-Wallet\\Gopay\\Invalid PIN.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

