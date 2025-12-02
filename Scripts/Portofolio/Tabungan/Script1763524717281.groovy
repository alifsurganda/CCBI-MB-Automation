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

Mobile.delay(1)

Mobile.tap(findTestObject('Portofolio/Tabungan/Rekening Saya'), 0)

Mobile.tapAndHold(findTestObject('Portofolio/Tabungan/android.widget.ImageView (1)'), 1, 5)

Mobile.tap(findTestObject('Portofolio/Tabungan/android.widget.ImageView (2)'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Portofolio\\tabungan.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

WebUI.delay(10)

Mobile.tap(findTestObject('Portofolio/Deposito/loan'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Portofolio\\loan.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Portofolio/Deposito/detail loan'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Portofolio\\detail loan.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

WebUI.delay(10)

Mobile.tap(findTestObject('Portofolio/Deposito/deposit'), 0)

Mobile.tap(findTestObject('Portofolio/Deposito/deposit2'), 0)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Portofolio\\deposito.png', 
    FailureHandling.STOP_ON_FAILURE)

