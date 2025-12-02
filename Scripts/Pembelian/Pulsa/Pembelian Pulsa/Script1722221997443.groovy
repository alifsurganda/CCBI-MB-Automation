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

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/transaksi'), 0)

WebUI.delay(3)

for (int i = 0; i < 8; i++) {
    if (Mobile.verifyElementExist(findTestObject('Object Repository/Pembelian'), 1, FailureHandling.OPTIONAL)) {
        break
    }
    
    Mobile.swipe(500, 1800, 500, 600)
}

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/pembelian pulsa'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Pulsa\\Pulsa3.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/xl pulsa'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/25k'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/button selanjutnya5'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/kategori'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/kategori pembelian'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Pulsa\\Pulsa2.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/1'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/4'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/7'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/2'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/5'), 0)

Mobile.tap(findTestObject('Pembelian/Paket Data/8'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Pembelian\\Pulsa\\Pulsa1.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

