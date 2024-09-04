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

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Menu Transaksi Transfer'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Menu Transfer Overbook'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Menu Transfer ke Penerima Baru'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Field Nomor Rekening'), 0)

Mobile.setText(findTestObject('Transfer/Transfer Antar Rekening/Field Nomor Rekening'), '1000010000015', 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button selanjut nya 1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/3'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/3'), 0)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Overbook\\Transfer1.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button simpan transaksi'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Button Selanjut nya 2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Field Nominal Transfer'), 0)

Mobile.setText(findTestObject('Transfer/Transfer Antar Rekening/Field Nominal Transfer'), '50000', 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button selanjut nya 1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Dropdown Kategori'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Utilitas'), 0)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Overbook\\Transfer2.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/3'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/3'), 0)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Overbook\\Transfer3.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button kembali 1'), 0)

