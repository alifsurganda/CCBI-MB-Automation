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

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/butoon transaksi'), 0)

Mobile.tap(findTestObject('Transfer/SKN RTGS/Transfer SKN RTGS'), 0)

Mobile.verifyElementExist(findTestObject('Transfer/SKN RTGS/transfer SKNrtgs'), 0)

Mobile.tap(findTestObject('Transfer/SKN RTGS/tambah rekening tujuan'), 0)

Mobile.tap(findTestObject('Transfer/SKN RTGS/pilih bank'), 0)

Mobile.tap(findTestObject('Transfer/SKN RTGS/bri'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Field Nomor Rekening (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Transfer/Transfer Antar Bank/Isi Nomor Rekening'), '12345667890', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transfer/SKN RTGS/input nama'), 0)

Mobile.setText(findTestObject('Transfer/SKN RTGS/input nama'), 'NARUTO', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transfer/SKN RTGS/input email'), 0)

Mobile.setText(findTestObject('Transfer/SKN RTGS/input email'), 'naruto@gmail,com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transfer/SKN RTGS/input alamat'), 0)

Mobile.setText(findTestObject('Transfer/SKN RTGS/input alamat'), 'Konohagakure', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transfer/SKN RTGS/pilih jenis'), 0)

Mobile.tap(findTestObject('Transfer/SKN RTGS/perorangan'), 0)

for (int i = 0; i < 8; i++) {
    if (Mobile.verifyElementExist(findTestObject('Object Repository/WNI'), 1, FailureHandling.OPTIONAL)) {
        break
    }
    
    Mobile.swipe(500, 1800, 500, 600)
}

Mobile.tap(findTestObject('Transfer/SKN RTGS/pilih kota'), 0)

WebUI.delay(1)

Mobile.tap(findTestObject('Transfer/SKN RTGS/search jakarta'), 0)

Mobile.setText(findTestObject('Transfer/SKN RTGS/search jakarta'), 'jakarta', 0)

Mobile.tap(findTestObject('Transfer/SKN RTGS/jakarta'), 0)

Mobile.tap(findTestObject('Transfer/SKN RTGS/button pilih kota'), 0)

Mobile.tap(findTestObject('Transfer/SKN RTGS/pilih cabang'), 0)

Mobile.tap(findTestObject('Transfer/SKN RTGS/kantor pusat'), 0)

Mobile.tap(findTestObject('Transfer/SKN RTGS/button tambah rek'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer RTGS\\tambah tujuan.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/SKN RTGS/button tambahkan'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/4'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/7'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/5'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/8'), 0)

Mobile.tap(findTestObject('Transfer/SKN RTGS/lanjutkan transfer'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/Ubah Rekening Sumber'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Rekening/tabungan 3'), 0)

Mobile.tap(findTestObject('Transfer/SKN RTGS/nominal'), 0)

Mobile.setText(findTestObject('Transfer/SKN RTGS/nominal'), '100005000', 0)

Mobile.hideKeyboard()

WebUI.delay(2)

Mobile.tapAtPosition(514, 1400)

WebUI.delay(2)

Mobile.tap(findTestObject('Transfer/SKN RTGS/RTGS'), 0)

Mobile.tap(findTestObject('Transfer/SKN RTGS/konfirmasi'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer RTGS\\konfirmasi transfer.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transfer/SKN RTGS/button konfirmasi 2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/1'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/4'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/7'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/2'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/5'), 0)

Mobile.tap(findTestObject('Transfer/Transfer Antar Bank/8'), 0)

Mobile.delay(15, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\dwida\\Documents\\Project Alif\\CCBI\\Katalon\\Automation Mobile Banking V3 DSI\\Screenshoot\\Transfer\\Transfer RTGS\\resi.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

