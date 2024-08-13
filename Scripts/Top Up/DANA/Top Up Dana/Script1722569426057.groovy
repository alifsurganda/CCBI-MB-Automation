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

Mobile.tap(findTestObject('Pembayaran/BPJS Kesehatan/Menu Transaksi'), 0)

Mobile.tap(findTestObject('E-Wallet/DANA/Menu Dana'), 0)

Mobile.tap(findTestObject('E-Wallet/DANA/Field Nomor Handphone'), 0)

Mobile.setText(findTestObject('E-Wallet/DANA/Field Nomor Handphone'), '081234567800', 0)

Mobile.tap(findTestObject('E-Wallet/DANA/Field Nominal'), 0)

Mobile.setText(findTestObject('E-Wallet/DANA/Field Nominal'), '10000', 0)

Mobile.tap(findTestObject('E-Wallet/DANA/Button Beli'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/Button Konfirmasi'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('E-Wallet/DANA/3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

