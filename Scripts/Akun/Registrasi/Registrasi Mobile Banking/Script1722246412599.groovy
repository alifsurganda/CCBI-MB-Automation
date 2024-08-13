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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Registrasi/Button Selanjutnya 1'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Registrasi/Button Daftar Mobile Banking'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi2.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Registrasi/button sudah punya rekening'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi3.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Registrasi/button sudah punya atm'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi4.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Registrasi/button registrasi'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi5.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Registrasi/Field Nomor Rekening'), 0)

Mobile.setText(findTestObject('Akun/Registrasi/Field Nomor Rekening'), '1000010000016', 0)

Mobile.tap(findTestObject('Akun/Registrasi/Field PIN ATM'), 0)

Mobile.setText(findTestObject('Akun/Registrasi/Field PIN ATM'), '123456', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi6.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Registrasi/Button selanjutnya 2'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi7.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Registrasi/button kirim sms'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi8.png', FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Akun/Registrasi/Button Selanjutnya 1'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi9.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Registrasi/Field Password 1'), 0)

Mobile.setText(findTestObject('Akun/Registrasi/Field Password 1'), 'Rsyt1908@', 0)

Mobile.tap(findTestObject('Akun/Registrasi/Field Konfirmasi Password'), 0)

Mobile.setText(findTestObject('Akun/Registrasi/Field Konfirmasi Password'), 'Rsyt1908@', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi10.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Registrasi/Button Selanjutnya 4'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi11.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Registrasi/1'), 0)

Mobile.tap(findTestObject('Akun/Registrasi/1'), 0)

Mobile.tap(findTestObject('Akun/Registrasi/2'), 0)

Mobile.tap(findTestObject('Akun/Registrasi/2'), 0)

Mobile.tap(findTestObject('Akun/Registrasi/3'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi12.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Registrasi/3'), 0)

Mobile.tap(findTestObject('Akun/Registrasi/1'), 0)

Mobile.tap(findTestObject('Akun/Registrasi/1'), 0)

Mobile.tap(findTestObject('Akun/Registrasi/2'), 0)

Mobile.tap(findTestObject('Akun/Registrasi/2'), 0)

Mobile.tap(findTestObject('Akun/Registrasi/3'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi13.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Registrasi/3'), 0)

Mobile.verifyElementExist(findTestObject('Akun/Registrasi/Button Masuk Registrasi'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Registrasi\\Registrasi14.png', FailureHandling.STOP_ON_FAILURE)

