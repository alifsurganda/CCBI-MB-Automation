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

Mobile.tap(findTestObject('Online on Boarding/Button Selanjutnya'), 0)

Mobile.tap(findTestObject('Online on Boarding/Button Daftar'), 0)

Mobile.tap(findTestObject('Online on Boarding/Button Belum'), 0)

Mobile.tap(findTestObject('Online on Boarding/Button Buat Rekening Baru'), 0)

Mobile.tap(findTestObject('Online on Boarding/Button Mulai'), 0)

Mobile.tap(findTestObject('Online on Boarding/Pilih Jenis Tabungan'), 0)

Mobile.tap(findTestObject('Online on Boarding/Button Pilih Produk'), 0)

Mobile.tap(findTestObject('Online on Boarding/Button Setuju'), 0)

Mobile.tap(findTestObject('Online on Boarding/Field Nomor Handphone'), 0)

Mobile.setText(findTestObject('Online on Boarding/Field Nomor Handphone'), '085156781919', 0)

Mobile.tap(findTestObject('Online on Boarding/Field Email'), 0)

Mobile.setText(findTestObject('Online on Boarding/Field Email'), 'mametmeta1908@gmail.com', 0)

Mobile.tap(findTestObject('Online on Boarding/Button Selanjutnya 2'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

