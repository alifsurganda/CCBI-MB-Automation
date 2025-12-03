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

Mobile.tap(findTestObject('Akun/akun'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Akun\\pin.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Akun/ubah pin'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Akun\\pin lama.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/7'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/9'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Akun\\pin baru.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/7'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/8'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Akun\\pin2.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/7'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Aktivasi/8'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Akun\\pin3.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Akun/tombol selesai'), 0, FailureHandling.CONTINUE_ON_FAILURE)

