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

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nama Bank (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Isi Nama Bank'), 'BRI', 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Bank  BRI'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nomor Rekening (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Isi Nomor Rekening'), '12345667890', 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Button Tambah Rekening (1)'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/3'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/3'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Button Simpan Nomor Rekening'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Button Lanjutkan'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/Ubah Rekening Sumber'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/Tabungan ABC 1000010000146'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nominal'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nominal'), '100000', 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/Button Selanjutnya'), 0)

Mobile.getText(findTestObject('Transfer/Transfer Antar Bank/Alert Silahkan pilih layanan'), 0)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Antar Bank\\Layanan Transfer Tidak dipilih.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button ok alert'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Pilih Jenis Transaksi'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/Transfer Online'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nominal'), 0)

Mobile.clearText(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nominal'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nominal'), '1000', 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/Button Selanjutnya'), 0)

Mobile.getText(findTestObject('Transfer/Transfer Antar Bank/Alert Nilai transaksi kurang dari batas minimum'), 0)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Antar Bank\\Transaksi Kurang dari Minimum.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button ok alert'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nominal'), 0)

Mobile.clearText(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nominal'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nominal'), '1500000000', 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/Button Selanjutnya'), 0)

Mobile.getText(findTestObject('Transfer/Transfer Antar Bank/Alert Nilai transaksi melebihi batas maximum'), 0)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Antar Bank\\Transaksi Lebih dari Maksimum.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button ok alert'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nominal'), 0)

Mobile.clearText(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nominal'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nominal'), '100000', 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/Button Selanjutnya'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/3'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/3'), 0)

Mobile.getText(findTestObject('Transfer/Transfer Antar Bank/Alert Saldo tidak mencukupi (44)'), 0)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Antar Bank\\Saldo Tidak Cukup.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button ok alert'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/Button Konfirmasi'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/3'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/3'), 0)

Mobile.getText(findTestObject('Transfer/Transfer Antar Bank/Alert Invalid Pin (49)'), 0)

Mobile.takeScreenshot('D:\\Product\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer Antar Bank\\Invalid PIN.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/button ok alert'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

