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

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/Menu Transaksi'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/Menu Pulsa Isi Ulang'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/Pulsa XL'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/Pulsa 100K XL'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/Button Selanjutnya 1'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/Dropdown Kategori'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/Top-up'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/1'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/1'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/2'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/2'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/3'), 0)

Mobile.tap(findTestObject('Pembelian/Pulsa Isi Ulang/3'), 0)

