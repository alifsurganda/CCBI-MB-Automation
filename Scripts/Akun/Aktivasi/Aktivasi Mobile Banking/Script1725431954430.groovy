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

Mobile.startExistingApplication('com.dwidasa.product.mobilebanking_v3')

Mobile.tap(findTestObject('Aktivasi/Button Selanjutnya'), 0)

Mobile.tap(findTestObject('Aktivasi/Button Aktivasi'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Aktivasi\\Aktivasi1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/Field User ID'), 0)

Mobile.setText(findTestObject('Aktivasi/Field User ID'), 'MELI33670888', 0)

Mobile.tap(findTestObject('Aktivasi/Field Kode Aktivasi'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Aktivasi/Field Kode Aktivasi'), '960445', 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/Button Selanjutnya 2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/Button Kirim SMS'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Aktivasi/Button Selanjutnya 3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/Field Password'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Aktivasi/Field Password'), 'Rsyt1908@', 0)

Mobile.tap(findTestObject('Aktivasi/Field Konfirmasi Password'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Aktivasi/Field Konfirmasi Password'), 'Rsyt1908@', 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Aktivasi\\Aktivasi1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Aktivasi/Button Selanjutnya 4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Aktivasi\\Aktivasi1.png', FailureHandling.CONTINUE_ON_FAILURE)

